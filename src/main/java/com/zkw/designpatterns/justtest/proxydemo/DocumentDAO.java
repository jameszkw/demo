package com.zkw.designpatterns.justtest.proxydemo;

/**
 * Created by Administrator on 2016/6/16 0016.
 */
//具体DocumentDAO类：真实主题角色
public class DocumentDAO implements AbstractDocumentDAO {
    public Boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("D001")) {
            System.out.println("删除ID为" + documentId + "的文档信息成功！");
            return true;
        }
        else {
            System.out.println("删除ID为" + documentId + "的文档信息失败！");
            return false;
        }
    }
}
