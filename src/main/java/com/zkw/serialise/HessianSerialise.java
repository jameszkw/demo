package com.zkw.serialise;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;

/**
 * @todo serialise and deserialse use Hessian
 * @author user
 *
 */
public class HessianSerialise {
	private static void serialiser() throws IOException {
		Persion persion = new Persion();
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		HessianOutput ho = new HessianOutput(bo);
		ho.writeObject(persion);
		byte[] persionByte = bo.toByteArray();
		System.out.println(persionByte);
		deserialiser(persionByte);
	}

	private static void deserialiser(byte[] byteObject) throws IOException {
		ByteArrayInputStream bai = new ByteArrayInputStream(byteObject);
		HessianInput hi = new HessianInput(bai);
		Persion persion = (Persion)hi.readObject();
		System.out.println(persion);
	}

	public static void main(String[] args) {
		try {
			serialiser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
