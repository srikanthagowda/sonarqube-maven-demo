package com.example;

public class App {

    public double calculateAnnualSalary(double monthlySalary) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException(
                "Monthly salary cannot be negative"
            );
        }

        return monthlySalary * 12;
    }

    public String getEmployeeCategory(double monthlySalary) {
        if (monthlySalary < 0) {
            throw new IllegalArgumentException(
                "Monthly salary cannot be negative"
            );
        }

        if (monthlySalary >= 50000) {
            return "Senior";
        }

        return "Junior";
    }

    public static void main(String[] args) {
        App app = new App();

        double monthlySalary = 60000;
        double annualSalary =
                app.calculateAnnualSalary(monthlySalary);

        String category =
                app.getEmployeeCategory(monthlySalary);

        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Employee Category: " + category);
    }
}