package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 30000);

    }

    @Test
    void testGetEmployee()
    {
        Employee emp = app.getEmployee(255530);
        assertEquals(emp.emp_no, 255530);
        assertEquals(emp.first_name, "Ronghao");
        assertEquals(emp.last_name, "Garigliano");
    }

    @Test
    void testAddEmployee() {
        Employee emp = new Employee();
        emp.emp_no = 500000;
        emp.first_name = "Anton";
        emp.last_name = "Jardine";

        // Add employee
        app.addEmployee(emp);

        // Get employee
        emp = app.getEmployee(499999);

        // Perform assertions
        assertEquals(emp.emp_no, 499999);
        assertEquals(emp.first_name, "Sachin");
        assertEquals(emp.last_name, "Tsukuda");
    }

}