import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private final Map<String, Integer> map = new HashMap<>();

    public Map<String, Integer> getMap() {
        return map;
    }

    public void addToMap(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueFromMap = map.get((key));
            if (valueFromMap == value) {
                throw new IllegalArgumentException("Такой объект (ключ+значение) уже существует");
            } else {
                map.put(key,value);
            }
        }
    }
        @Override
        public String toString() {
            return "Элементы: " + map;
        }

}
