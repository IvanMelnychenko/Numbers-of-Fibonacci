package com.gmail.liftiwan1996;

import java.util.ArrayList;

public class Fibonachi {
    private ArrayList<Integer> list = new ArrayList<>();

    public Fibonachi() {
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public ArrayList<Integer> addFibNumber(int num1, int num2) {
        list.add(num1);
        list.add(num2);
        for (int i = 1; i < 31; i++) {
            int sum = list.get(i) + list.get(i - 1);
            list.add(sum);
        }
        return list;
    }

    public void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    }
}
