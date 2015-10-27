package com.zkw.asm.demo.guide;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

/**
 * @ClassName: GeneratingClass
 * @Description: TODO(describe what to do this class)
 * @author James.zhang
 * @date 2015年10月27日 下午7:27:35
 *
 */
public class GeneratingClass {
	private void gen(){
		ClassWriter cw = new ClassWriter(0);
		cw.visit(Opcodes.V1_5,  Opcodes.ACC_PUBLIC +Opcodes.ACC_ABSTRACT + Opcodes.ACC_INTERFACE, "/com/zkw/asm/demo/guide/Comparable", null, "java/lang/Object", new String[] { "/com/zkw/asm/demo/guide/A" });
		cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "LESS", "I", null, new Integer(-1)).visitEnd();
		cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "EQUAL", "I", null, new Integer(0)).visitEnd();
		cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_FINAL + Opcodes.ACC_STATIC, "GREATER", "I", null, new Integer(1)).visitEnd();
		cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_ABSTRACT, "compareTo", "(Ljava/lang/Object;)I", null, null);
		cw.visitEnd();
		byte[] b = cw.toByteArray();
	}
}
