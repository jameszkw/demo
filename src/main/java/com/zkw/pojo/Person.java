package com.zkw.pojo;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-04-14 下午 3:55
 **/

public class Person {
    private String  name;
    private Integer age;
    private String  mN;

    /**
     * @return the mN
     */
    public String getmN() {
        return mN;
    }

    /**
     * @param mN the mN to set
     */
    public void setmN(String mN) {
        this.mN = mN;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mN='" + mN + '\'' +
                '}';
    }
}
