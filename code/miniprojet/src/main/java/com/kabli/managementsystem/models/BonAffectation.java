package com.kabli.managementsystem.models;

import java.util.Date;

public class BonAffectation {
    private int num;
    private Date date;
    private Employe emp;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employe getEmp() {
        return emp;
    }

    public void setEmp(Employe emp) {
        this.emp = emp;
    }
}
