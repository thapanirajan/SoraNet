/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soranet.model;

/**
 *
 * @author thapa
 */
public class InternetModel {

    private String name;
    private String speed;
    private String price;

    public InternetModel(String name, String speed, String price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSpeed() {
        return speed;
    }

    public String getPrice() {
        return price;
    }
}

