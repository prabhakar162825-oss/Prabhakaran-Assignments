package com.index.pack;

import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2));
        int element = 2;

        list.removeIf(n -> n == element);

        System.out.println(list);
    }
}
