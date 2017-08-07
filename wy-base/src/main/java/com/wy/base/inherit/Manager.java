package com.wy.base.inherit;

public class Manager extends Employee {

    private double bonus;

    public Manager(long id, String name, double salary, int year, int month, int day) {
        super(id, name, salary, year, month, day);
        this.bonus = 0;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)){
            return false;
        }
        Manager manager = (Manager) obj;
        return bonus == manager.bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Double.hashCode(bonus);
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
