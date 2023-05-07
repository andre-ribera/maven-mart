package MavenMarketApp.Employee;

import MavenMarketApp.Department.Department;

import java.util.Objects;

public class Employee {
    private Department department;
    private final String name;
    private double wage;
    private boolean onTheClock;
    private boolean beHelpful;

    public Employee(){
        this.department = null;
        this.name = "";
        this.wage = 14.0D;
        this.onTheClock = false;
        this.beHelpful = true;
    }

    public Employee(String name){
        this.department = null;
        this.name = name;
        this.wage = 14.0D;
        this.onTheClock = false;
        this.beHelpful = true;
    }

    public boolean isHelpful() {
        return beHelpful;
    }

    public void setIsHelpful(boolean beHelpful) {
        this.beHelpful = beHelpful;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public boolean isOnTheClock() {
        return onTheClock;
    }

    public void setOnTheClock(boolean onTheClock) {
        this.onTheClock = onTheClock;
    }

    public String greetCustomer(){
        return "Hello! How can I help you?";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.wage, wage) == 0 && onTheClock == employee.onTheClock && beHelpful == employee.beHelpful && Objects.equals(department, employee.department) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, name, wage, onTheClock, beHelpful);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}
