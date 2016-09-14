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
    public static void main(String[] args) {
        test();
    }
}
