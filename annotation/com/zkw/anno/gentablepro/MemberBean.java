package com.zkw.anno.gentablepro;

/**
 * Created by Administrator on 2016/5/4 0004.
 * 定义bean,可通过此bean生成数据库表
 */
@DBTable(name = "MEMBER")
public class MemberBean {
    @SQLString(name = "zhang") String firstName;
    @SQLString(name = "kewu") String lastName;
    @SQLInteger(30) Integer age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
