package com.wy.base.inherit;

import org.junit.Test;

public class EqualsTest {

    @Test
    public void testEqual(){

        Employee employee1 = new Employee(1, "Alice", 75000, 1994, 4, 10);
        Employee employee2 = employee1;
        Employee employee3 = new Employee(1, "Alice", 75000, 1994, 4, 10);
        Employee employee4 = new Employee(2, "Bob", 50000, 1992, 9, 21);

        System.out.println("employee1 == employee2 : " + (employee1 == employee2));
        System.out.println("employee1 == employee3 : " + (employee1 == employee3));
        System.out.println("employee1.equals(employee2) : " + employee1.equals(employee2));
        System.out.println("employee1.equals(employee3) : " + employee1.equals(employee3));
        System.out.println("employee1.equals(employee4) : " + employee1.equals(employee4));
        System.out.println("employee1.hashCode() : " + employee1.hashCode());
        System.out.println("employee3.hashCode() : " + employee3.hashCode());

        System.out.println("employee4 : {} " + employee4);

        Manager manager1 = new Manager(1, "Carl", 80000, 1996, 6, 6);
        Manager manager2 = new Manager(1, "Carl", 80000, 1996, 6, 6);
        manager2.setBonus(500);

        System.out.println("manager2 : {} " + manager2);
        System.out.println("manager1.equals(manager2) : " + manager1.equals(manager2));
        System.out.println("manager1.hashCode() : " +manager1.hashCode());
        System.out.println("manager2.hashCode() : " +manager2.hashCode());

    }
}
