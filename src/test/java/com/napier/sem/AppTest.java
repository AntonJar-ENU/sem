package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    // Employee is Null
    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
    }

    // Employees is Empty
    @Test
    void printSalariesTestEmpty()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        app.printSalaries(employees);
    }

    //Employee Contains null
    @Test
    void printSalariesTestContainsNull()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        employess.add(null);
        app.printSalaries(employess);
    }

    //Employee Contains all non-null - Test for normal Conditions
    @Test
    void printSalaries()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Anton";
        emp.last_name = "Jardine";
        emp.title = "SysAdmin";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }

    // Display Employee is Empty
    @Test
    void displayEmployeeContainsNull()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        app.displayEmployee(null);
    }

    // Display Employee
    @Test
    void DisplayEmployee()
    {
        Employee emp = new Employee();
        emp.emp_no = 6;
        emp.first_name = "Anton";
        emp.last_name = "Jardine";
        emp.title = "System Admin";
        emp.salary = 3000;

        app.displayEmployee(emp);
    }

}