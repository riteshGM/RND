package com.appname.collections;

import java.util.ArrayList;

public class SetValueExample {

    public static void main(String[] args) {
        ArrayList<String> animalsArrayList = new ArrayList<String>();

        animalsArrayList.add("Lion");
        animalsArrayList.add("Tiger");
        animalsArrayList.add("Camel");
        animalsArrayList.add("Giraffee");
        animalsArrayList.add("Deer");
        animalsArrayList.add("Bear");
        animalsArrayList.add("Cheetah");
        animalsArrayList.add("Hyena");

        System.out.println("Initial ArrayList is : " + animalsArrayList);// Printing the arraylist
        animalsArrayList.set(6, "Leopard"); //Setting animal - leopard at position 6 (or) Replacing Cheetah by Leopard at position 6
        System.out.println("ArrayList after setting/replacing element at position 6 is : " + animalsArrayList);
    }
}
