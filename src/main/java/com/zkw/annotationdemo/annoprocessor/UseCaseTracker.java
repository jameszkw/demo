package com.zkw.annotationdemo.annoprocessor;

import com.zkw.annotationdemo.grammar.UseCase;
import com.zkw.annotationdemo.grammar.UseCaseMain;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases,Class<?> cl){
        for (Method m:cl.getDeclaredMethods()){
            UseCase uc=m.getAnnotation(UseCase.class);
            if (uc!=null){
                System.out.println("Found Use Case: "+uc.id()+" "+uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i:useCases){
            System.out.println("Warning: Missing use case- "+i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases=new ArrayList<Integer>();
        Collections.addAll(useCases,47,48,49,50);
        trackUseCases(useCases, UseCaseMain.class);
    }
}
