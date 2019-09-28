package com.gmail.liftiwan1996;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fibonachi fib = new Fibonachi();
        fib.addFibNumber(0,1);
        fib.printList(fib.getList());
    }
}
