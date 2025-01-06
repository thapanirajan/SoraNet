package com.soranet.model;

/**
 *
 * @author thapa
 */
public class InternetModel {

    private String name;
    private String speed;
    private int price;

    public InternetModel(String name, String speed, int price) {
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

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
