package Queues;

import java.util.Queue;
import java.util.LinkedList;

public class NonRepeatingChar {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];// 'a' -> 'z'
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            queue.add(ch);
            freq[ch - 'a']++;

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.remove();
            }

            if (queue.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxbx";
        printNonRepeating(str);
    }
}
