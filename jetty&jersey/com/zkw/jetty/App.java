package com.zkw.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.zkw.jersey.EntryPoint;
import com.zkw.rpc.jetty.server.MainServer;

public class App {
	private void launchJetty(){
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
 
        Server jettyServer = new Server(8080);
        jettyServer.setHandler(context);
 
        ServletHolder jerseyServlet = context.addServlet(
             org.glassfish.jersey.servlet.ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);
 
        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter(
           "jersey.config.server.provider.classnames",
           EntryPoint.class.getCanonicalName());
 
        try {
            jettyServer.start();
            jettyServer.join();
        } catch(Exception e){
        	e.printStackTrace();
        } finally {
            jettyServer.destroy();
        }
    }
	
	public static void main(String[] args) {
		App app = new App();
		app.launchJetty();
	}
}
