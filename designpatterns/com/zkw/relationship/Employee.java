package com.zkw.relationship;

import java.util.Date;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public interface Employee {
    public boolean isTimeToPay(Date payDate);
    public void pay();

    public static final Employee NULL = new Employee() {
        public boolean isTimeToPay(Date payDate) {
            return false;
        }

        public void pay() {

        }
    };
}
