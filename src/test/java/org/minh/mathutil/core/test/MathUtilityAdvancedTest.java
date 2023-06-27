/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.minh.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.minh.mathutil.core.MathUtinity;

/**
 *
 * @author admin
 */
public class MathUtilityAdvancedTest {
    
    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1}, 
                               {1, 1},
                               {2, 2},
                               {4, 24}, 
                               {6, 7200}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtinity.getFactorial(n));
    }
}
