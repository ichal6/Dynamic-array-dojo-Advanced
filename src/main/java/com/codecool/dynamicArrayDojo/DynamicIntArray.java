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

        if(index >= sizeOfArray) {
            increaseArray();
        }
        array[index] = number;

        index++;
    }

    public void remove(int indexOfNumber){

    }

    public void insert(int elementsToReplace, int newElements){

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < index; i++){
            builder.append(' ');
            builder.append(array[i]);
        }
        return builder.toString();
    }

    private void increaseArray(){
        this.array = Arrays.copyOf(array, sizeOfArray*2);
    }
}
