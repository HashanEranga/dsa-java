package com.hashan.dsa.algorithms.searching.binary_search;

import com.hashan.dsa.algorithms.searching.ISearch;
import com.hashan.dsa.algorithms.sorting.ISort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch implements ISearch {

    @Autowired
    ISort sortingAlgo;

    @Override
    public int search(int[] arr, int key) {
        int[] sortArr = sortingAlgo.sort(arr);
        int start = 0;
        int end = sortArr.length;
        int mid;
        while(start != end){
            mid = (start+end)/2;
            if(sortArr[mid] == key) return mid;
            if(key < sortArr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
