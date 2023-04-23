package com.hashan.dsa.algorithms.sorting.bubbleSort;

import com.hashan.dsa.algorithms.sorting.ISort;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements ISort {
    @Override
    public int[] sort(int[] arr) {
        // TODO: Implement the bubble sort algorithm
        return arr;
    }
}
