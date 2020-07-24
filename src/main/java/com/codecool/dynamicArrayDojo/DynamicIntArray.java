package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

// put your code here!
public class DynamicIntArray {
    private int sizeOfArray;
    private int[] array;
    private int index;

    public DynamicIntArray(){
        this.sizeOfArray = 10;
        this.array = new int[sizeOfArray];
        this.index = 0;
    }

    public DynamicIntArray(int sizeOfArray){
        this.sizeOfArray = sizeOfArray;
        this.array = new int[sizeOfArray];
        this.index = 0;
    }

    public void add(int number){

    }

    public void remove(int indexOfNumber){

    }

    public void insert(int elementsToReplace, int newElements){

    }

    @Override
    public String toString() {
        return "Implement me plz.. Pretty plz..";
    }
}
