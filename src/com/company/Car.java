package com.company;

public class Car {
    private String color;
    private int maxSpeed;
    public void carInfo(){
        System.out.println("car color="+color+" "+"max speed="+maxSpeed);
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
}
