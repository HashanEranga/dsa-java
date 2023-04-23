package com.hashan.dsa.algorithms.searching;

public interface ISearch {
    int search(int[] arr, int key);
    default String result(int value){
        if(value != -1) return "Key is found in the index : " + value;
        return "Key is not found";
    }
}
