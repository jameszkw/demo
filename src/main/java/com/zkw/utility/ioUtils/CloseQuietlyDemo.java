package com.zkw.utility.ioUtils;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Administrator on 2016/7/4 0004.
 */
public class CloseQuietlyDemo {
    void createZipFileOfDirectory(File srcDir, File zipOutput) throws IOException {
        if ( !srcDir.exists() || !srcDir.isDirectory() ) {
            throw new IllegalArgumentException(srcDir.getAbsolutePath() + " is not a directory!");
        }

        if ( zipOutput.exists() && !zipOutput.isFile() ) {
            throw new IllegalArgumentException(zipOutput.getAbsolutePath() + " exists but is not a file!");
        }

        ZipOutputStream zipOutputStream = null;
        String baseName = srcDir.getAbsolutePath() + File.pathSeparator;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(zipOutput));
            addDirToZip(srcDir, zipOutputStream, baseName);

        } finally {
            IOUtils.closeQuietly(zipOutputStream);
        }


    }

    private static void addDirToZip(File dir, ZipOutputStream zip, String baseName) throws IOException {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                addDirToZip(file, zip, baseName);

            } else {
                String entryName = file.getAbsolutePath().substring(
                        baseName.length());
                ZipEntry zipEntry = new ZipEntry(entryName);
                zip.putNextEntry(zipEntry);

                FileInputStream fileInput = new FileInputStream(file);
                try {
                    IOUtils.copy(fileInput, zip);
                    zip.closeEntry();

                } finally {
                    IOUtils.closeQuietly(fileInput);
                }
            }
        }
    }

    private static File copyArchive(final URI eclipseArchive) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new BufferedInputStream(eclipseArchive.toURL().openStream());
            final File tempFile = File.createTempFile( "eclipse", ".zip" );
            out = new BufferedOutputStream( new FileOutputStream( tempFile ) );
            IOUtils.copy( in, out );
            return tempFile;
        } catch (final Exception e) {
            throw new RuntimeException("Cannot unpack Eclipse", e);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }

    private void toStringdemo(){
        InputStream in = null;
        try {
            in = new URL( "http://jakarta.apache.org" ).openStream();
            System.out.println( IOUtils.toString( in ) );
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly( in );
        }
    }

    public static void main(String[] args) {
        CloseQuietlyDemo demo=new CloseQuietlyDemo();
        demo.toStringdemo();
    }
}
