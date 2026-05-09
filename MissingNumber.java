package INTERVIEW;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {

        int N = 10;
        int[] arr = {1,2,4,6,7,9};

        Set<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        System.out.println("Missing Numbers are :");

        for(int i = 1; i <= N; i++) {
            if(!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
