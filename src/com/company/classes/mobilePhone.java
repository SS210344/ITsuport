package com.company.classes;

public class mobilePhone extends Device{
    public mobilePhone(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        super(identificationCode, makeAndModel, owner, problemDescription, repairNotes, priority);
    }
    @Override
    public void setPriorityRank(int priority) {
        Priority = 4;
    }
    boolean isChargable;
}
