package com.zkw.asm.demo.generator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class Generator {
    private ClassWriter genFirst() {
        ClassWriter cw = new ClassWriter(0);
        cw.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, "AsmExample", null, "java/lang/Object", null);

        cw.visitEnd();
        return cw;
    }

    private static ClassWriter genAnnotation() {
        ClassWriter cw = new ClassWriter(0);
        AnnotationVisitor av;
        cw.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC + Opcodes.ACC_ANNOTATION + Opcodes.ACC_ABSTRACT
                               + Opcodes.ACC_INTERFACE, "java/lang/Deprecated", null, "java/lang/Object",
                 new String[] {"java/lang/annotation/Annotation"});
        {
            av = cw.visitAnnotation("Ljava/lang/annotation/Documented;", true);
            av.visitEnd();
        }
        {
            av = cw.visitAnnotation("Ljava/lang/annotation/Retention;", true);
            av.visitEnum("value", "Ljava/lang/annotation/RetentionPolicy;", "RUNTIME");
            av.visitEnd();
        }
        cw.visitEnd();
        return cw;
    }

    private void genClassFile(ClassWriter cw) {
        byte[] code = cw.toByteArray();
        try {
            FileOutputStream fos = new FileOutputStream("AsmExample.class");
            fos.write(code);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Generator generator = new Generator();
        generator.genClassFile(genAnnotation());
    }

}
