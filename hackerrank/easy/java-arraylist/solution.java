import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of lines (n)
        int n = sc.nextInt();
        
        // Use an ArrayList of ArrayLists to store the 2D dynamic structure
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // Number of integers in the current line
            ArrayList<Integer> currentLine = new ArrayList<>();
            
            for (int j = 0; j < d; j++) {
                currentLine.add(sc.nextInt());
            }
            
            lines.add(currentLine);
        }
        
        // Read the number of queries (q)
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // 1-based line index
            int y = sc.nextInt(); // 1-based position index
            
            // Convert 1-based indexing to 0-based indexing for Java ArrayLists
            int lineIndex = x - 1;
            int elementIndex = y - 1;
            
            try {
                // Check if the line exists and the element index is within range
                if (lineIndex < lines.size() && elementIndex < lines.get(lineIndex).size()) {
                    System.out.println(lines.get(lineIndex).get(elementIndex));
                } else {
                    System.out.println("ERROR!");
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
