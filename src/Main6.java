import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Gamma", 3);
        map.put("Omega", 24);
        map.put("Alpha", 1);
        map.forEach((s, integer) -> {
            System.out.println(s + "=" + integer);
        });
    }
}