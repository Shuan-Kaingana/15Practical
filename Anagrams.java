// AI Assistance: Claude (claude.ai) was used to help structure this solution.

import java.io.*;
import java.util.*;

public class Anagrams{
    public static void main(String[]args){
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    // Clean up: strip punctuation but leave apostrophes
                    w = w.replaceAll("[.,;:_!\\-]+$", ""); // strip trailing punctuation
                    w = w.replaceAll("^[.,;:_!\\-]+", ""); // strip leading punctuation
                    w = w.toLowerCase();

                    if (w.isEmpty()) continue;

                    String key = makeSignature(w);

                    if (!D.containsKey(key)) {
                        List<String> list = new ArrayList<>();
                        list.add(w);
                        D.put(key, list);
                    } else {
                        List<String> list = D.get(key);
                        if (!list.contains(w)) { // avoid duplicates
                            list.add(w);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        

    }
    public static String makeSignature(String word){
        
        return word;
    }
}