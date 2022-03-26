package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array={15,28,24,36,49,17,25,32};
    int sum=0;
    int average;
    int i=0;
    while (i< array.length) {
        sum+=array[i];
        i++;
    }
    average=sum/ array.length;
        System.out.println("Mijin arjeq " + average);
    }
}
