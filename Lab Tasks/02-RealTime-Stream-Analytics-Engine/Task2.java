import java.util.*;
import java.util.stream.*;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int temp = sc.nextInt();

            // Filter temperatures greater than 50
            if (temp > 50) {
                map.computeIfAbsent(id, k -> new ArrayList<>()).add(temp);
            }
        }

        // Compute average and sort in descending order
        map.entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<>(
                        e.getKey(),
                        e.getValue().stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0)))
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        sc.close();
    }
}