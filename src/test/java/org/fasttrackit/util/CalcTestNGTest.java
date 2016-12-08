package org.fasttrackit.util;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class CalcTestNGTest {

    //@Test
    public void givenTwoNumbersTheCalculatorShouldSumThemWhenAddIsInvoked() {
        int a = 10, b = 15;
        Calc calc = new Calc();

        int result = calc.add(a, b);

        Assert.assertEquals(result, 25, "should have added the input");
    }
}
