import java.io.File;

/**
 * Created by Administrator on 2016/6/20 0020.
 */
public class JustTest {
    public static void main(String[] args) {
        String se=String.valueOf(File.separatorChar);
        System.out.println(se);
        char c=(char)-1;
        System.out.println("ddd"+c+"ddd");

        String str="\\";
        System.out.println(str.indexOf(se));
    }
}
