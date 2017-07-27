package com.zkw.designpatterns.justtest.cglibdemo1;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * Created by Administrator on 2016/6/17 0017.
 */
public class TableDAOFactory {
    private static TableDAO tDao = new TableDAO();
    public static TableDAO getInstance(){
        return tDao;
    }

    /**
     * 代理的实例生成
     * @param authProxy
     * @return
     */
    public static TableDAO getAuthInstance(AuthProxy authProxy){
        Enhancer en = new Enhancer();
        //进行代理
        en.setSuperclass(TableDAO.class);
        en.setCallback(authProxy);
        //生成代理实例
        return (TableDAO)en.create();
    }

    /**
     * 过滤器的实例生成
     * @param authProxy
     * @return
     */
    public static TableDAO getAuthInstanceByFilter(AuthProxy authProxy){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(TableDAO.class);
        enhancer.setCallbacks(new Callback[]{authProxy, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new AuthProxyFilter());
        return (TableDAO)enhancer.create();
    }

}
