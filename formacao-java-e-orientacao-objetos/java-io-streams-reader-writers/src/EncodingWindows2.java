import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodingWindows2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Charset windows_1252 = Charset.forName("windows-1252");
        String s = new String("ABCDefGhªºXzA@_+ÇÀ".getBytes(windows_1252),windows_1252);

        System.out.println(s);
        String s2 = new String(s.getBytes(Charset.forName("UTF-8")));
        System.out.println(s2);
    }
}
