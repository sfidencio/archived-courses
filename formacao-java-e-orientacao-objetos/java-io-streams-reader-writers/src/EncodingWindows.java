import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodingWindows {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ABCDefGhªºXzA@_+ÇÀ";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.codePointAt(i)); //unicode - tabela padrao
        }
        ///https://unicode-table.com/pt/
        Charset charset = Charset.defaultCharset();
        //Charset charset1 = Charset.forName("ISO-8859-1");
        System.out.println(charset.displayName());
        //System.out.println(charset1.displayName());

        //byte[] bytes = s.getBytes("windows-1252"); //Windows-1252 e compativel com ISO-8859-1
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8); //Se mudar para utf-8, os acentos nao vai funcionar no iso-8859-1 e windows1252
        //byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes.length);

        //Transformando string em bytes
        //String strToBytes = new String(bytes);
        String strToBytes2 = new String(bytes,Charset.forName("UTF-8"));
        String strToBytes3 = new String(bytes,Charset.forName("windows-1252"));
        String strToBytes4 = new String(bytes,Charset.forName("ISO-8859-1"));
        //System.out.println(strToBytes + " UTF");
        System.out.println(strToBytes2  + " - UTF-8 => " + bytes.length);
        System.out.println(strToBytes3  + " - windows-1252 => " + bytes.length);
        System.out.println(strToBytes4  + " - ISO-8859-1 => " + bytes.length);


    }
}
