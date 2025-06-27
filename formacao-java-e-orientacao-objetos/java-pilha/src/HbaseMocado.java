import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class HbaseMocado {
    public static void main(String[] args) {
        HashMap<String, String> hbase = new HashMap<String, String>(0);
        hbase.put("a0", "8888888888");
        hbase.put("a1", "Amigo da onca");


        for (var item : hbase.entrySet()) {
            System.out.println(item.getKey() + "-" + item.getValue());
        }


    }
}
