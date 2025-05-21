import java.util.LinkedHashMap;
import java.util.Map;

public class LinkdedHashMapDemo {

    public static class LRUCache<K, V> extends LinkedHashMap<K, V> {

        private int capacity;

        public LRUCache(int capacity) {
            super(capacity, 0.45f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> l1 = new LRUCache<>(3);
        l1.put(3, "Dishant");
        l1.put(4, "Reyna");
        l1.put(5, "jett");
        l1.get(3);
        l1.put(6, "yoru");
        System.out.println(l1);

    }
}
