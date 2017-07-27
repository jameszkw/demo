package com.zkw.enumtest;

import java.util.EnumSet;

public class enumSet {
	enum ALPH {M,D,F,A,E,G,W,S};  
    
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        EnumSet<ALPH> all = EnumSet.allOf(ALPH.class);  
        EnumSet<ALPH> none = EnumSet.noneOf(ALPH.class);  
        EnumSet<ALPH> range = EnumSet.range(ALPH.A, ALPH.G);  
        EnumSet<ALPH> some = EnumSet.of(ALPH.D,ALPH.F);  
          
        //System.out.println(all+"\n"+none+"\n"+range+"\n"+some);  
          
        for(ALPH a : all){  
            System.out.println(a);  
        }  
          
        if(all.contains(ALPH.A)){  
            System.out.println("sure");  
        }  
    }  
}
