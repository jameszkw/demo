package com.zkw.designpatterns.justtest.proxydemo;

/**
 * Created by Administrator on 2016/6/16 0016.
 */
public class ClientMain {
    public static void main(String[] args) {
        AbstractUserDAO userDAO = CGLibProxy.getInstance().getProxy(UserDAO.class);
        userDAO.findUserById("张无忌");

        AbstractDocumentDAO documentDAO=CGLibProxy.getInstance().getProxy(DocumentDAO.class);
        documentDAO.deleteDocumentById("D002");
    }
}
