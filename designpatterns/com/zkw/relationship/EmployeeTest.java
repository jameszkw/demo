package com.zkw.relationship;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class EmployeeTest {

    public static Employee getEmployee(){
        return Employee.NULL;
    }

    public static void main(String[] args) {
        Employee employee = getEmployee();
        System.out.println(employee.equals(Employee.NULL));
    }
}
