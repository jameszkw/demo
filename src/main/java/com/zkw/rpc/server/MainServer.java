package com.zkw.rpc.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.zkw.rpc.jersey.EntryPoint;

public class MainServer {
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
		MainServer app = new MainServer();
		app.launchJetty();
	}
}
