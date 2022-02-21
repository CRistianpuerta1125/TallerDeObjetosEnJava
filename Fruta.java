package com.company;

import java.util.ArrayList;

public class Fruta {
    String Blackberry;
    String Strawberry;
    float AverageWeight;
    String color;


    public void Color(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Porple");
        color.add("Red");
        color.add("black");
        for (int i = 0; i < color.size(); i++){
            System.out.println("--"+ color.get(i));
        }

    }

    public String getMora() {
        return Blackberry;
    }

    public void setMora(String mora) {
        this.Blackberry = mora;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
