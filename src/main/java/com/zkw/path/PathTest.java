package com.zkw.path;

/**
 * @Description: TODO
 * @author James.zhang
 * @date 2014-8-27 下午6:01:45
 *
 */
public class PathTest {
	public static void main(String[] args) {
		PathTest pathTest = new PathTest();
//		pathTest.getClass().getClassLoader().getResource("/").getPath();
		System.out.println(pathTest.getClass());
		System.out.println(pathTest.getClass().getClassLoader());
		System.out.println(pathTest.getClass().getClassLoader().getResource("/"));
		System.out.println(pathTest.getClass().getClassLoader().getResource("").getPath());
		System.out.println(System.getProperty("user.dir"));
	}
}
