package com.zkw.nio.buffer;

import java.nio.IntBuffer;

public class BufferMethod {
	private void bufferTest() {
		IntBuffer buf = IntBuffer.allocate(48);
		buf.put(1);
		buf.put(2);
		buf.put(3);
		buf.flip();
		System.out.println(buf.get());
//		buf.rewind();
		buf.mark();
		System.out.println(buf.get());
		buf.reset();
		System.out.println(buf.get());
		
		buf.compact();
//		buf.clear();
		buf.put(4);
		buf.flip();
		System.out.println(buf.get());
		System.out.println(buf.get());
//		System.out.println(buf.get());
	}

	public static void main(String[] args) {
		BufferMethod test = new BufferMethod();
		test.bufferTest();
	}
}
