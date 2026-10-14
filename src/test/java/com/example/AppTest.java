
package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAnnualSalary() {
        App app = new App();

        assertEquals(720000.0,
                app.calculateAnnualSalary(60000), 0.01);
    }

    @Test
    public void testSeniorCategory() {
        App app = new App();

        assertEquals("Senior",
                app.getEmployeeCategory(60000));
    }

    @Test
    public void testJuniorCategory() {
        App app = new App();

        assertEquals("Junior",
                app.getEmployeeCategory(30000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSalary() {
        App app = new App();

        app.calculateAnnualSalary(-1000);
    }
}
