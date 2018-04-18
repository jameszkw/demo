package com.zkw.file.csv;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author James
 * @create 2017-08-08 下午 4:35
 **/

public class CsvDemo {

    public static void writeByteArrayToFile(File file, byte[] data, boolean append) throws IOException {
        OutputStream out = null;
        try {
            out = openOutputStream(file, append);
            out.write(data);
            out.close(); // don't swallow close Exception if copy completes normally
        } finally {
            IOUtils.closeQuietly(out);
        }
    }

    public static FileOutputStream openOutputStream(File file, boolean append) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (file.canWrite() == false) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        } else {
            File parent = file.getParentFile();
            if (parent != null) {
                if (!parent.mkdirs() && !parent.isDirectory()) {
                    throw new IOException("Directory '" + parent + "' could not be created");
                }
            }
        }
        return new FileOutputStream(file, append);
    }


    public static void main(String[] args) {
        try {
            writeByteArrayToFile(new File("D://test.csv"),"string,123".getBytes(),false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
