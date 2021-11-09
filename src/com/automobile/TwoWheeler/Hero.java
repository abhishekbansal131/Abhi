package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    public String Model;
    public String Regno;
    public String Owner;
    public int speed;

    public Hero(){
        Model = "xyz";
        Regno = "1234";
        Owner = "abc";
        speed=100;
    }

    @Override
    public String getModeName() {
        return Model;
    }

    @Override
    public String getRegNo() {
        return Regno;
    }

    @Override
    public String getOwner() {
        return Owner;
    }
    public int getSpeed(){
        return speed;
    }
    public void radio(){
        System.out.println("It provides radio");
    }
}
