import com.zkw.java.justtest.WithDraw;

import java.io.File;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class JustTest {
    private static void test(){
        WithDraw withDraw = new WithDraw();
        withDraw.setAccountid(null);
        System.out.println(withDraw.getAccountid());
    }
    private static void test2(String... strs){

    }
    public static void main(String[] args) {
        test();
        String str1 = "1";
        String[] str2 = new String[2];
        test2(str1);
    }
}
