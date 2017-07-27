package com.zkw.annotationdemo.gentablepro;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/5/5 0005.
 */
public class TableCreator {
    private static String getConstraints(Constraints con){
        String constraints="";
        if (!con.allowNull())
            constraints=" NOT NULL";
        if (!con.primaryKey())
            constraints=" PRIMARY KEY";
        if (!con.unique())
            constraints=" UNIQUE";
        return constraints;
    }
    public static void main(String[] args) throws Exception{
        if(args.length<1){
            System.out.println("arguments: annotated classes");
            System.exit(0);
        }
        for (String className:args){
            Class<?> cl=Class.forName(className);
            DBTable dbTable=cl.getAnnotation(DBTable.class);
            if(dbTable==null){
                System.out.println("No DBTable annotation in class "+className);
                continue;
            }
            String tableName=dbTable.name();
            //if the name is empty, use the Class name
            if (tableName.length()<1){
                tableName=cl.getName().toUpperCase();
            }
            List<String> columnDefs=new ArrayList<String>();
            for (Field field:cl.getDeclaredFields()){
                String columnName=null;
                Annotation[] anns=field.getDeclaredAnnotations();
                if (anns.length<1){
                    continue;
                }
                if (anns[0] instanceof SQLInteger){
                    SQLInteger sInt=(SQLInteger)anns[0];
                    //use field name if name not specified
                    if (sInt.name().length()<1){
                        columnName=field.getName().toUpperCase();
                    } else {
                        className=sInt.name();
                    }
                    columnDefs.add(className+" INT"+getConstraints(sInt.constraints()));
                }
                if (anns[0] instanceof SQLString){
                    SQLString sString=(SQLString)anns[0];
                    //use field name if name not specified
                    if (sString.name().length()<1){
                        columnName=field.getName().toUpperCase();
                    } else {
                        className=sString.name();
                    }
                    columnDefs.add(className+" VARCHAR("+sString.value()+")"+getConstraints(sString.constraints()));
                }
                StringBuilder createCommand=new StringBuilder("CREATE TABLE "+tableName+"(");
                for (String columnDef:columnDefs)
                    createCommand.append("\n    "+columnDef+",");
                //remove trailing comma
                String tableCreate=createCommand.substring(0,createCommand.length()-1)+");";
                System.out.println("Table Creation SQL for "+className+" is :\n"+tableCreate);
            }
        }
    }
}
