package org.fasttrackit.util;

import org.junit.Assert;
import org.junit.Test;

public class CalcJunitTest {

    @Test
    public void givenTwoNumbersTheCalculatorShouldSumThemWhenAddIsInvoked() {
        int a = 10, b = 15;
        Calc calc = new Calc();

        int result = calc.add(a, b);

        Assert.assertEquals("Should sum the input.", 25, result);
    }
}
