package com.soranet.controllers.algorithms;

import com.soranet.model.CustomerModel;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author thapa
 */
public class MergeSort {

    // Main method to sort a list of CustomerModel objects by name
    public List<CustomerModel> sortByName(List<CustomerModel> customerList) {
        // Base case: if the list has 1 or 0 elements, it is already sorted
        if (customerList.size() <= 1) {
            return customerList;
        }

        // Find the middle point to divide the list into two halves
        int mid = customerList.size() / 2;

        // Split the list into left and right halves
        List<CustomerModel> left = new ArrayList<>(customerList.subList(0, mid));
        List<CustomerModel> right = new ArrayList<>(customerList.subList(mid, customerList.size()));

        // Recursively sort both halves
        left = sortByName(left);
        right = sortByName(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Helper method to merge two sorted lists
    private List<CustomerModel> merge(List<CustomerModel> left, List<CustomerModel> right) {
        List<CustomerModel> mergedList = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;

        // Compare elements from both lists and add the smaller one to the merged list
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).getName().compareToIgnoreCase(right.get(rightIndex).getName()) <= 0) {
                mergedList.add(left.get(leftIndex));
                leftIndex++;
            } else {
                mergedList.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        // Add any remaining elements from the left list
        while (leftIndex < left.size()) {
            mergedList.add(left.get(leftIndex));
            leftIndex++;
        }

        // Add any remaining elements from the right list
        while (rightIndex < right.size()) {
            mergedList.add(right.get(rightIndex));
            rightIndex++;
        }

        return mergedList;
    }
}