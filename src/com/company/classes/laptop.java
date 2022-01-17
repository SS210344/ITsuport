package com.company.classes;

import java.util.ArrayList;
import com.company.classes.Component;
public class laptop extends Device{
    public ArrayList<Component> Components = new ArrayList<>();

    public laptop(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority, ArrayList<Component> components) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
        Components = components;
    }

    public ArrayList<Component> getComponents() {
        return Components;
    }
    @Override
    public void setPriorityRank(int priority) {
        Priority = 5;
    }

    public void addComponent(Component item){
        this.Components.add(item);
    }






}
