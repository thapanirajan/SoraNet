package com.soranet.model;

import java.util.UUID;

/**
 *
 * @author thapa
 */
public class CustomerModel {

    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private String internetPlan;
    private String speed;
    private int price;

    public CustomerModel(String customerId, String name, String email, String phoneNumber, String internetPlan, String speed, int price) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.internetPlan = internetPlan;
        this.speed = speed;
        this.price = price;
    }

    public CustomerModel(String name, String email, String phoneNumber, String internetPlan, String speed, int price) {
        this.customerId = UUID.randomUUID().toString().substring(0, 8);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.internetPlan = internetPlan;
        this.speed = speed;
        this.price = price;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInternetPlan() {
        return internetPlan;
    }

    public String getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setInternetPlan(String internetPlan) {
        this.internetPlan = internetPlan;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
