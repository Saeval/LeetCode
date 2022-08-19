import java.util.ArrayList;
import java.util.HashMap;

public class E12_IntegerToRoman {

    private final HashMap<Integer, Character> alphabet = new HashMap<>();
    private final HashMap<Integer, String> exceptions = new HashMap<>();
    ArrayList<Integer> keyList;

    public E12_IntegerToRoman(){
        alphabet.put(1, 'I');
        alphabet.put(5, 'V');
        alphabet.put(10, 'X');
        alphabet.put(50, 'L');
        alphabet.put(100, 'C');
        alphabet.put(500, 'D');
        alphabet.put(1000, 'M');

        exceptions.put(4, "IV");
        exceptions.put(9, "IX");
        exceptions.put(40, "XL");
        exceptions.put(90, "XC");
        exceptions.put(400, "CD");
        exceptions.put(900, "CM");

        keyList = new ArrayList<>(alphabet.keySet());
        keyList.addAll(exceptions.keySet());
        keyList.sort(Integer::compareTo);
    }

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            var upperLimit = findUpperLimit(num);
            result.append(upperLimit.getValue());
            num -= upperLimit.getKey();
        }

        return result.toString();
    }

    private KeyValuePair<Integer, String> findUpperLimit(int num) {
        KeyValuePair<Integer, String> result = null;

        for (var key : keyList) {
            if (key > num) break;

            if (alphabet.containsKey(key)) result = new KeyValuePair<>(key, alphabet.get(key).toString());
            else result = new KeyValuePair<>(key, exceptions.get(key));
        }

        return result;
    }

    private static class KeyValuePair<K, V> {
        private K key;
        private V value;

        public KeyValuePair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
