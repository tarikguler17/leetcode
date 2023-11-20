import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static final Map<String, Integer> SYMBOL_VALUES_MAP = new HashMap<>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};


    public int romanToInt(String s) {

        int total = 0;
        int prevValue = 0;

        String[] split = s.split("");

        for (int i = split.length - 1; i >= 0; i--) {
            int currentValue = SYMBOL_VALUES_MAP.get(split[i]);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }
        return total;
    }
}
