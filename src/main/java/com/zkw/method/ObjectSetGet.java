package com.zkw.method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/18 0018.
 */
public class ObjectSetGet {
    private void set(){
        List<Model> models = new ArrayList<Model>();

        int i=0;
        while (i<2){
            Model model = new Model();
            model.setDoub(i);
            models.add(model);
            i++;
        }
        System.out.println(models);
        for (Model model1:models){
            System.out.println(model1.getDoub());
        }
    }
    public static void main(String[] args) {
        ObjectSetGet objectSetGet = new ObjectSetGet();
        objectSetGet.set();
    }

    class Model{
        String str;
        int i;
        double doub;

        public double getDoub() {
            return doub;
        }

        public void setDoub(double doub) {
            this.doub = doub;
        }

        public int getI() {

            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public String getStr() {

            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
}
