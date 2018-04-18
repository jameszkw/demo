package com.zkw.serialise;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @todo serialise and deserialise use java Api
 * @author user
 *
 */
public class JavaSerialise {
	
	private static void serialiser() throws IOException, ClassNotFoundException {
		Persion persion = new Persion();
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(bao);
		out.writeObject(persion);
		byte[] persionByte = bao.toByteArray();
		System.out.println(persionByte);
		deserialiser(persionByte);
	}
	
	private static void deserialiser(byte[] byteObject) throws IOException, ClassNotFoundException{
		ByteArrayInputStream is = new ByteArrayInputStream(byteObject);
		ObjectInputStream input = new ObjectInputStream(is);
		Persion person = (Persion)input.readObject();
		System.out.println(person);
	}

	public static void main(String[] args) {
		try {
			serialiser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
