//Parid Thammasorn 663380394-6 sec.2
package sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.Income;

public class IncomeTest {

    private final Income income = new Income();

    @ParameterizedTest(name = "[{index}] P={0}, M={1}, C={2} => Expected: {3}")
    @CsvSource({
       
        "3000, 500, 2000, 85000.0",

    
        "3000, 500, 400, -1.0",

   
        "3000, 500, 3100, -1.0", 
        

        "3000, 299, 2000, -1.0",

      
        "3000, 299, 400, -1.0",

       
        "3000, 299, 3100, -1.0",

       
        "3000, 801, 2000, -1.0",

        
        "3000, 801, 400, -1.0",

        
        "3000, 801, 3100, -1.0",

       
        "999, 500, 2000, -1.0",

        
        "999, 500, 400, -1.0",

       
        "999, 500, 3100, -1.0",

        
        "999, 299, 2000, -1.0",

        
        "999, 299, 400, -1.0",

        
        "999, 299, 3100, -1.0",

        
        "999, 801, 2000, -1.0",

      
        "999, 801, 400, -1.0",

       
        "999, 801, 3100, -1.0",

       
        "5001, 500, 2000, -1.0",

       
        "5001, 500, 400, -1.0",

      
        "5001, 500, 3100, -1.0",

        
        "5001, 299, 2000, -1.0",

       
        "5001, 299, 400, -1.0",

       
        "5001, 299, 3100, -1.0",

        
        "5001, 801, 2000, -1.0",

       
        "5001, 801, 400, -1.0",

       
        "5001, 801, 3100, -1.0"
    })
    void testCalculateIncome(int impeller, int motor, int cover, double expected) {
        double result = income.calculateIncome(impeller, motor, cover);
        assertEquals(expected, result, 0.01); 
    }
}
