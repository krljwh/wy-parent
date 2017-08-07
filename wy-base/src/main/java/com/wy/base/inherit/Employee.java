package com.wy.base.inherit;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private long id;
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(long id, String name, double salary, int year, int month, int day) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return id == employee.id && Objects.equals(name, employee.name)
                && salary == employee.salary && Objects.equals(hireDay, employee.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name,salary,hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[id=" + id + ",name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
