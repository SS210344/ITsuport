package com.company.classes;

public class Component {
    public String Name;
    public Double Cost;

    public Component(String name, Double cost) {
        Name = name;
        Cost = cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }
}



