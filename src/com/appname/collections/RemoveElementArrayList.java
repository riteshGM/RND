package com.appname.collections;

import java.util.ArrayList;

public class RemoveElementArrayList {

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

        System.out.println("Initial ArrayList is : " + animalsArrayList);//Printing initial arraylist
        animalsArrayList.remove(3); //Removing element at position 3
        System.out.println("ArrayList after removal is : " + animalsArrayList);//Printing arraylist after removing element at position 3 - Giraffee

    }
}
