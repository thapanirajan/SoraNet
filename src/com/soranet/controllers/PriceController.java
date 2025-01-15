package com.soranet.controllers;

import com.soranet.model.InternetModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thapa
 */
public class PriceController {

    private final List<InternetModel> internetList;

    public PriceController() {
        internetList = new ArrayList<>();
        getTotalIncome();
        displayPlans();
    }

    public boolean addPlan(String name, String speed, int price) {
        for (InternetModel plans : internetList) {
            if (name.equals(plans.getName())) {
                return false;
            }
        }
        InternetModel newPlan = new InternetModel(name, speed, price);
        internetList.add(newPlan);
        return true;
    }

    public boolean updatePlan(String name, String speed, int price) {
        for (InternetModel plan : internetList) {
            if (plan.getName().equals(name)) {
                plan.setName(name);
                plan.setPrice(price);
                plan.setSpeed(speed);
                return true;
            }
        }
        return false;
    }

    public boolean deletePlan(String name) {
        return internetList.removeIf(price -> price.getName().equals(name));
    }

    public int planSize() {
        return internetList.size();
    }

    public List<InternetModel> getAllPlan() {
        return internetList;
    }

    public final int getTotalIncome() {
        List<InternetModel> PricingList = getAllPlan();
        int totalIncome = 0;
        for (InternetModel price : PricingList) {
            totalIncome = totalIncome + price.getPrice();
        }
        System.out.println(totalIncome);
        return totalIncome;
    }

    public final void displayPlans() {
//        addPlan("None", "", 0);
        addPlan("Basic Plan", "50 Mbps", 500);
        addPlan("Standard Plan", "150 Mbps", 1500);
        addPlan("Premium Plan", "250 Mbps", 2500);
        addPlan("Family Plan", "200 Mbps", 2000);
        addPlan("Ultra Plan", "500 Mbps", 5000);
    }

}
