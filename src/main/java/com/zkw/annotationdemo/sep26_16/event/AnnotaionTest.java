package com.zkw.annotationdemo.sep26_16.event;

import javax.swing.*;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
public class AnnotaionTest {
    private JFrame frame = new JFrame("使用注释绑定事件监听器");
    //使用Annotation为ok按钮绑定监听器
    @ActionListenerFor(listener = OKListener.class)
    private JButton btnOK = new JButton("确定");
    @ActionListenerFor(listener = CancelListener.class)
    private JButton btnCancel = new JButton("取消");

    public void init(){
        JPanel panel = new JPanel();
        panel.add(btnOK);
        panel.add(btnCancel);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        ActionListenerInstaller.processAnnotations(this);
    }

    public static void main(String[]args) {
        new AnnotaionTest().init();
    }
}
