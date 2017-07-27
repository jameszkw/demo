package com.zkw.xml.xpp3;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2016/11/10 0010.
 */
public class Xpp3Demo {
    private static void test() {
        XmlPullParserFactory factory;
        try {
            factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();
            long start = System.currentTimeMillis();
            xpp.setInput(new FileInputStream("D:\\workspacemine\\demo\\pom.xml"), "utf-8");
            int eventType = xpp.getEventType();
            while (true) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        System.out.println("Start of Document");
                        break;
                    case XmlPullParser.START_TAG:
                        System.out.println("Start of Tag: " + xpp.getName());
                        if(xpp.getAttributeCount() > 0){
                            for(int i=0;i<xpp.getAttributeCount();i++){
                                System.out.println(xpp.getAttributeName(i) + " = " + xpp.getAttributeValue(i));
                            }
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        System.out.println("END_TAG: " + xpp.getName());
                        break;
                    case XmlPullParser.TEXT:
                        System.out.println("Text: " + xpp.getText());
                        break;
                }
                if (eventType == XmlPullParser.END_DOCUMENT)
                    break;
                eventType = xpp.next();
            }
            System.out.println("XPP3耗时："+(System.currentTimeMillis() - start)+" ms");
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test();
    }
}
