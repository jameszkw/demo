package com.zkw.annotationdemo.sep26_16.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2016/9/26 0026.
 */
public class OKListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "单击了确认按钮");
    }
}
