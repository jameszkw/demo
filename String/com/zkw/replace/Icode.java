package com.zkw.replace;

/**
 * @ClassName: Icode
 * @Description: 生成邀请码
 * @author James.zhang
 * @date 2015年10月21日 下午3:17:10
 *
 */
public class Icode {
	private void getInviteCodeByMobile(Long mobile){
//		System.out.println(Long.toString(mobile, 32));
		String str = Long.toString(mobile, 32);
		str = str.toUpperCase();
		str = str.replaceAll("I", "W");
		str = str.replaceAll("L", "X");
		str = str.replaceAll("O", "Y");
		str = str.replaceAll("S", "Z");
		System.out.println(mobile+":"+str);
	}
	
	private void generator(){
		Long[] mobiles = {18709999901l,18709999902l,18709999903l,18709999904l,18709999905l,18709999906l,18709999907l,18709999908l,18709999909l,18709999910l};
		for(Long mobile:mobiles){
			getInviteCodeByMobile(mobile);
		}
	}
	
	public static void main(String[] args) {
		Icode icode = new Icode();
		icode.generator();
	}
}
