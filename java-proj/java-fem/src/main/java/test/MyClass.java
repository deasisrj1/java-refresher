package test;

import java.util.Map;
import java.util.HashMap;


public class MyClass {

    private Map<String, Integer> map;

    public MyClass() {
        map = new HashMap<>();
        map.put("foo", 1);
        map.put("bar", 3);

    }


    public int getValue(String input, int numRetries) throws Exception {
        System.out.println("Executing: " + numRetries);
        try {
            return map.get(input);
        }
        catch (Exception e) {
                System.out.println(e.getMessage());
            if (numRetries > 3) {
                throw e;
            }
            return getValue(input, numRetries + 1);
        }
    }
}