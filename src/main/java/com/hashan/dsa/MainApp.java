package com.hashan.dsa;

import com.hashan.dsa.algorithms.searching.ISearch;
import com.hashan.dsa.algorithms.searching.binary_search.BinarySearch;
import com.hashan.dsa.algorithms.searching.linear_search.LinearSearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MainApp.class, args);

        int[] arr = new int[]{1,2,3,4,5,6};

        ISearch searchAlgoLin = appContext.getBean(LinearSearch.class);
        System.out.println("Return value : " + searchAlgoLin.search(arr, 6));
        System.out.println(searchAlgoLin.result(searchAlgoLin.search(arr, 6)));

        ISearch searchAlgoBin = appContext.getBean(BinarySearch.class);
        System.out.println("Return value : " + searchAlgoBin.search(arr, 6));
        System.out.println(searchAlgoBin.result(searchAlgoBin.search(arr, 6)));
    }
}
