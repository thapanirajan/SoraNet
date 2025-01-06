/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soranet.controllers.algorithms;

import com.soranet.model.InternetModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thapa
 */
public class SelectionSort {

    List<InternetModel> internetSortList;

    public SelectionSort() {
        internetSortList = new ArrayList<>();
    }

    public List<InternetModel> sortByPrice(List<InternetModel> internetList, boolean isDesc) {
        internetSortList.clear();
        internetSortList.addAll(internetList);

        if (internetSortList == null || internetSortList.isEmpty()) {
            throw new IllegalArgumentException("internetlist cannot be empty");
        }

        for (int i = 0; i < internetSortList.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < internetSortList.size(); j++) {
                if (isDesc) {
                    if (internetSortList.get(j).getPrice() > internetSortList.get(minIndex).getPrice()) {
                        minIndex = j;
                    }
                } else {
                    if (internetSortList.get(j).getPrice() < internetSortList.get(minIndex).getPrice()) {
                        minIndex = j;
                    }
                }
            }

            InternetModel temp = internetSortList.get(minIndex);
            internetSortList.set(minIndex, internetSortList.get(i));
            internetSortList.set(i, temp);
        }
        return internetSortList;
    }

}
