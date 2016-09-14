package com.zkw.httpclient.sso;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * Created by Administrator on 2016/8/4 0004.
 */
public class SSO {

    private SSO()
    {
        // static-only access
    }

    public static String getTicket(final String server, final String username,
                                   final String password, final String service)
    {
        notNull(server, "server must not be null");
        notNull(username, "username must not be null");
        notNull(password, "password must not be null");
        notNull(service, "service must not be null");

        return getServiceTicket(server, getTicketGrantingTicket(server, username,
                password), service);
    }

    private static String getServiceTicket(final String server,
                                           final String ticketGrantingTicket, final String service)
    {
        if (ticketGrantingTicket == null)
            return null;

        final HttpClient client = new HttpClient();

        final PostMethod post = new PostMethod(server + "/" + ticketGrantingTicket);

        post.setRequestBody(new NameValuePair[] { new NameValuePair("service",
                service) });

        try
        {
            client.executeMethod(post);

            final String response = post.getResponseBodyAsString();

            switch (post.getStatusCode())
            {
                case 200:
                    return response;

                default:
                    System.out.println("Invalid response code (" + post.getStatusCode()
                            + ") from CAS server!");
                    System.out.println("Response (1k): "
                            + response.substring(0, Math.min(1024, response.length())));
                    break;
            }
        }

        catch (final IOException e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
            post.releaseConnection();
        }

        return null;
    }

    private static String getTicketGrantingTicket(final String server,
                                                  final String username, final String password)
    {
        final HttpClient client = new HttpClient();

        final PostMethod post = new PostMethod(server);

        post.setRequestBody(new NameValuePair[] {
                new NameValuePair("username", username),
                new NameValuePair("password", password) });

        try
        {
            client.executeMethod(post);

            final String response = post.getResponseBodyAsString();

            switch (post.getStatusCode())
            {
                case 201:
                {
                    final Matcher matcher = Pattern.compile(".*action=\".*/(.*?)\".*")
                            .matcher(response);

                    if (matcher.matches())
                        return matcher.group(1);

                    System.out.println("Successful ticket granting request, but no ticket found!");
                    System.out.println("Response (1k): "
                            + response.substring(0, Math.min(1024, response.length())));
                    break;
                }

                default:
                    System.out.println("Invalid response code (" + post.getStatusCode()
                            + ") from CAS server!");
                    System.out.println("Response (1k): "
                            + response/*.substring(0, Math.min(1024, response.length()))*/);
                    break;
            }
        }

        catch (final IOException e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
            post.releaseConnection();
        }

        return null;
    }

    private static void notNull(final Object object, final String message)
    {
        if (object == null)
            throw new IllegalArgumentException(message);
    }

    public static void main(final String[] args)
    {
//        final String server = "https://localhost:8443/cas/login";
//        final String username = "admin";
//        final String password = "123456";
//        final String service = "http://localhost:9001/tshow";

        //http://192.168.31.12:8034/cas/login?service=http%3A%2F%2Flocalhost%3A8040%2Facctmerchant%2Fwithdraw%2Ftest
        final String server = "http://192.168.31.12:8034/cas/login";
        final String username = "admin";
        final String password = "admin";
        final String service = "http://localhost:8080/acctmerchant/withdraw/test";

//        System.out.println(getTicket(server, username, password, service));
        getTicketGrantingTicket(server,username, password);
    }
}
