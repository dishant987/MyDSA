import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(24, "Di6shant");
        map.put(18, "Nice");
        map.put(22, "Nice");
        map.put(3, null);
        map.put(null, null);
        System.out.println(map.get(24).hashCode());
    }
}
