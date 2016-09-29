package com.zkw.classtest;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/9/21 0021.
 */
public class Utils {

    public static boolean nullSafeEquals(Object o1, Object o2) {
        if(o1 == o2) {
            return true;
        } else if(o1 != null && o2 != null) {
            if(o1.equals(o2)) {
                return true;
            } else {
                if(o1.getClass().isArray() && o2.getClass().isArray()) {
                    if(o1 instanceof Object[] && o2 instanceof Object[]) {
                        return Arrays.equals((Object[])((Object[])o1), (Object[])((Object[])o2));
                    }

                    if(o1 instanceof boolean[] && o2 instanceof boolean[]) {
                        return Arrays.equals((boolean[])((boolean[])o1), (boolean[])((boolean[])o2));
                    }

                    if(o1 instanceof byte[] && o2 instanceof byte[]) {
                        return Arrays.equals((byte[])((byte[])o1), (byte[])((byte[])o2));
                    }

                    if(o1 instanceof char[] && o2 instanceof char[]) {
                        return Arrays.equals((char[])((char[])o1), (char[])((char[])o2));
                    }

                    if(o1 instanceof double[] && o2 instanceof double[]) {
                        return Arrays.equals((double[])((double[])o1), (double[])((double[])o2));
                    }

                    if(o1 instanceof float[] && o2 instanceof float[]) {
                        return Arrays.equals((float[])((float[])o1), (float[])((float[])o2));
                    }

                    if(o1 instanceof int[] && o2 instanceof int[]) {
                        return Arrays.equals((int[])((int[])o1), (int[])((int[])o2));
                    }

                    if(o1 instanceof long[] && o2 instanceof long[]) {
                        return Arrays.equals((long[])((long[])o1), (long[])((long[])o2));
                    }

                    if(o1 instanceof short[] && o2 instanceof short[]) {
                        return Arrays.equals((short[])((short[])o1), (short[])((short[])o2));
                    }
                }

                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Object o1 = null;
        Object o2 = new Object();
        System.out.println(nullSafeEquals(o1,o2));
    }
}
