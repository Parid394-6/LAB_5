//Phongwirun Juntafong 663380391-2 sec.2
package sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.Income;

public class IncomeTest {

    private final Income income = new Income();

    @ParameterizedTest(name = "[{index}] P={0}, M={1}, C={2} => Expected: {3}")
    @CsvSource({
        // TC01 
        "3000, 500, 2000, 85000.0",

        // TC02 - Invalid: cover < 500
        "3000, 500, 400, -1.0",

        // TC03 - Invalid: cover > 3000 
        "3000, 500, 3100, -1.0", 

        // TC04 - Invalid: motor 
        "3000, 299, 2000, -1.0",

        // TC05 - Invalid: motor 
        "3000, 299, 400, -1.0",

        // TC06 - Invalid: motor 
        "3000, 299, 3100, -1.0",

        // TC07 - Invalid: motor > 
        "3000, 801, 2000, -1.0",

        // TC08 - motor > 800, cover < 500
        "3000, 801, 400, -1.0",

        // TC09 - motor > 800, cover > 3000
        "3000, 801, 3100, -1.0",

        // TC10 - impeller < 1000
        "999, 500, 2000, -1.0",

        // TC11 - impeller < 1000, cover < 500
        "999, 500, 400, -1.0",

        // TC12 - impeller < 1000, cover > 3000
        "999, 500, 3100, -1.0",

        // TC13 - impeller < 1000, motor < 300
        "999, 299, 2000, -1.0",

        // TC14 - impeller < 1000, motor < 300, cover < 500
        "999, 299, 400, -1.0",

        // TC15 - impeller < 1000, motor < 300, cover > 3000
        "999, 299, 3100, -1.0",

        // TC16 - impeller < 1000, motor > 800
        "999, 801, 2000, -1.0",

        // TC17 - impeller < 1000, motor > 800, cover < 500
        "999, 801, 400, -1.0",

        // TC18 - impeller < 1000, motor > 800, cover > 3000
        "999, 801, 3100, -1.0",

        // TC19 - impeller > 5000
        "5001, 500, 2000, -1.0",

        // TC20 - impeller > 5000, cover < 500
        "5001, 500, 400, -1.0",

        // TC21 - impeller > 5000, cover > 3000
        "5001, 500, 3100, -1.0",

        // TC22 - impeller > 5000, motor < 300
        "5001, 299, 2000, -1.0",

        // TC23 - impeller > 5000, motor < 300, cover < 500
        "5001, 299, 400, -1.0",

        // TC24 - impeller > 5000, motor < 300, cover > 3000
        "5001, 299, 3100, -1.0",

        // TC25 - impeller > 5000, motor > 800
        "5001, 801, 2000, -1.0",

        // TC26 - impeller > 5000, motor > 800, cover < 500
        "5001, 801, 400, -1.0",

        // TC27 - impeller > 5000, motor > 800, cover > 3000
        "5001, 801, 3100, -1.0"
    })
    void testCalculateIncome(int impeller, int motor, int cover, double expected) {
        double result = income.calculateIncome(impeller, motor, cover);
        assertEquals(expected, result, 0.01); 
    }
}
