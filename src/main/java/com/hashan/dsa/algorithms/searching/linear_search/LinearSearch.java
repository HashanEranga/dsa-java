package com.hashan.dsa.algorithms.searching.linear_search;

import com.hashan.dsa.algorithms.searching.ISearch;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LinearSearch implements ISearch {
    @Override
    public int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]) return i;
        }
        return -1;
    }
}
