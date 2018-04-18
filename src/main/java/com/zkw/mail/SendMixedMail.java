package com.zkw.mail;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;

/**
 * java mail 发送复杂邮件,包括两个附件,html消息,html中嵌入两张图片
 * 还包括发送alternative邮件的源码.
 * @author:
 *
 */
public class SendMixedMail {
    //以下属性根据自己情况设置.
    private static String protocol="smtp";
    private static String to="james.zhang@yunzhihui.com";
    private static String from="905119621@qq.com";
    private static String body="<html><body><a href='http://www.csdn.net'>I love you! csdn </a><img src='cid:img1'/><img src='cid:img2'/></body></html>";
    private static String subject="mail test";
    private static String server="smtp.qq.com";
    private static String username="905119621@qq.com";//from mail name
    private static String password="zhangkewuopzkw58";//from mail password
    
    public static void main(String[] args) throws Exception, MessagingException {
        Properties prop=new Properties();
        prop.setProperty("mail.transport.protocol",protocol);
//        prop.put("mail.smtp.host", "10.0.1.110");
        prop.setProperty("mail.smtp.auth","true");
        
//        Session session=Session.getInstance(prop,new Authenticator(){//用户连接认证
//            public PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(username,password);
//            }
//        });
        
        Session session = Session.getDefaultInstance(prop, null);
        session.setDebug(true);//开启调试
        
        MimeMessage message=new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
        message.setSubject("标题");
        message.setSentDate(new Date());
        //message.setText(body);//发送纯文本消息
        //message.setContent(getAlternativeMultipart());//发送alternative邮件
        message.setContent(getMultipart());//发送复杂文本消息
        message.saveChanges();//保存消息
        
        Transport trans=session.getTransport();
        trans.connect(server,username,password);
//        trans.connect();
        trans.sendMessage(message,message.getRecipients(Message.RecipientType.TO));//发送
        trans.close();
//        Transport.send(message);
    }
    /**
     * 获得复杂邮件Multipart对象
     * @return
     * @throws MessagingException
     * @throws IOException 
     */
    private static Multipart getMultipart() throws MessagingException, IOException {
        
        Multipart multi=new MimeMultipart("mixed");//混合MIME消息
        
        multi.addBodyPart(createContent());
//        multi.addBodyPart(createAttachment(new File("D:/test1.exe")));//嵌入附件
//        multi.addBodyPart(createAttachment(new File("D:/test2.jpg")));
        
        return multi;
        
    }
    /**
     * 创建正文
     * @return
     * @throws MessagingException
     * @throws IOException 
     */
    private static BodyPart createContent() throws MessagingException, IOException {
        BodyPart content=new MimeBodyPart();
        Multipart relate=new MimeMultipart("related");//组合MIME消息
        relate.addBodyPart(createHtmlBody());
        
        relate.addBodyPart(createImagePart(new File("E:\\work\\documents\\mailMsg\\img\\blog.png"), "img1"));//嵌入图片
        relate.addBodyPart(createImagePart(new File("E:\\work\\documents\\mailMsg\\img\\head_mail.png"), "img2"));
        
        content.setContent(relate);
        return content;
    }
    
    /**
     * 创建图片
     * @param file
     * @param name
     * @return
     * @throws MessagingException
     */
    private static BodyPart createImagePart(File file,String name) throws MessagingException {
        MimeBodyPart image=new MimeBodyPart();
        
        DataSource ds=new FileDataSource(file);
        image.setDataHandler(new DataHandler(ds));
        image.setFileName(name);
        image.setContentID(name);
        
        return image;
    }
    /**
     * 创建html消息
     * @return
     * @throws MessagingException
     * @throws IOException 
     */
    private static BodyPart createHtmlBody() throws MessagingException, IOException {
        BodyPart html=new MimeBodyPart();
        String contentHtml = FileUtils.readFileToString(new File("./emailTemplate.html"));
        contentHtml = contentHtml.replaceAll("111111111111111111111111", "我是一只猪");
        html.setContent(contentHtml, "text/html;charset=gbk");
        return html;
    }
    /**
     * 创建附件
     * @param file
     * @return
     * @throws MessagingException
     */
    private static BodyPart createAttachment(File file) throws MessagingException {
        BodyPart attach=new MimeBodyPart();
        DataSource ds=new FileDataSource(file);

        attach.setDataHandler(new DataHandler(ds));
        attach.setFileName(ds.getName());

        return attach;
    }
    /**
     * 获取alternative邮件
     * @return
     * @throws MessagingException
     */
    private static Multipart getAlternativeMultipart() throws MessagingException {

        Multipart alternative=new MimeMultipart("alternative");//二选一消息
        
        BodyPart text=new MimeBodyPart();
        text.setContent("请浏览HTML", "text/plain;charset=gbk");
        alternative.addBodyPart(text);
        
        BodyPart html=new MimeBodyPart();
        html.setContent(body, "text/html;charset=gbk");
        alternative.addBodyPart(html);

        return alternative;
    }
}