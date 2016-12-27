package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyMixer<Integer> mixer = new MyMixer<>(1,2,3,4);
        Integer[] shuffle =mixer.shuffle();
        System.out.println(Arrays.toString(shuffle));



        MyMixer<String> mixer1 = new MyMixer<>("cnh0","cnh1","cnh2","cnh3");
        String[] shuffle1 =mixer1.shuffle();
        System.out.println(Arrays.toString(shuffle1));



    }
}
