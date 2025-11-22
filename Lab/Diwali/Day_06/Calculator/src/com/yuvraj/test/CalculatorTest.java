package com.yuvraj.test;

import com.yuvraj.exceptions.WrongOperatorException;
import com.yuvraj.service.Calculator;


public class CalculatorTest {
    
    public static void main(String[] args) {
        System.out.println("=== CALCULATOR DEMONSTRATION ===\n");
        
        // Test Case 1: Valid operations
        demonstrateValidOperations();
        
        // Test Case 2: Invalid operators
        demonstrateInvalidOperations();
        
        // Test Case 3: Edge cases and error scenarios
        demonstrateEdgeCases();
        
        System.out.println("\n=== DEMONSTRATION COMPLETED ===");
    }
    
    private static void demonstrateValidOperations() {
        System.out.println("1. VALID OPERATIONS:");
        System.out.println("-------------------");
        
        int[][] testCases = {
            {15, 3}, {20, 4}, {8, 2}, {10, 3}, {25, 5}
        };
        
        String[] operators = {"+", "-", "*", "/", "%"};
        
        for (int i = 0; i < testCases.length; i++) {
            int num1 = testCases[i][0];
            int num2 = testCases[i][1];
            String operator = operators[i];
            
            try {
                int result = Calculator.calculate(num1, num2, operator);
                String operatorSymbol = Calculator.getOperatorSymbol(operator);
                System.out.printf("%2d %s %2d = %2d%n", num1, operatorSymbol, num2, result);
            } catch (WrongOperatorException | ArithmeticException e) {
                System.out.printf("Error calculating %d %s %d: %s%n", 
                    num1, operator, num2, e.getMessage());
            }
        }
        System.out.println();
    }
    
    private static void demonstrateInvalidOperations() {
        System.out.println("2. INVALID OPERATORS:");
        System.out.println("---------------------");
        
        String[] invalidOperators = {"&", "++", "=", "**", "//", "^", "~"};
        
        for (String operator : invalidOperators) {
            try {
                int result = Calculator.calculate(10, 5, operator);
                System.out.printf("10 %s 5 = %d%n", operator, result);
            } catch (WrongOperatorException e) {
                System.out.printf("Operator '%s': %s%n", operator, e.getMessage());
            } catch (ArithmeticException e) {
                System.out.printf("Arithmetic error with '%s': %s%n", operator, e.getMessage());
            }
        }
        System.out.println();
    }
    
    private static void demonstrateEdgeCases() {
        System.out.println("3. EDGE CASES AND ERROR SCENARIOS:");
        System.out.println("----------------------------------");
        
        // Test division by zero
        testDivisionByZero();
        
        // Test modulo by zero
        testModuloByZero();
        
        // Test with negative numbers
        testNegativeNumbers();
        
        // Test with zero as first operand
        testZeroOperations();
    }
    
    private static void testDivisionByZero() {
        System.out.println("   Division by zero:");
        try {
            int result = Calculator.calculate(10, 0, "/");
            System.out.printf("   10 / 0 = %d%n", result);
        } catch (WrongOperatorException e) {
            System.out.printf("   Wrong operator: %s%n", e.getMessage());
        } catch (ArithmeticException e) {
            System.out.printf("   %s%n", e.getMessage());
        }
    }
    
    private static void testModuloByZero() {
        System.out.println("   Modulo by zero:");
        try {
            int result = Calculator.calculate(10, 0, "%");
            System.out.printf("   10 %% 0 = %d%n", result);
        } catch (WrongOperatorException e) {
            System.out.printf("   Wrong operator: %s%n", e.getMessage());
        } catch (ArithmeticException e) {
            System.out.printf("   %s%n", e.getMessage());
        }
    }
    
    private static void testNegativeNumbers() {
        System.out.println("   Negative numbers:");
        try {
            int result1 = Calculator.calculate(-10, 3, "*");
            System.out.printf("   -10 × 3 = %d%n", result1);
            
            int result2 = Calculator.calculate(10, -2, "/");
            System.out.printf("   10 ÷ -2 = %d%n", result2);
            
            int result3 = Calculator.calculate(-15, -4, "+");
            System.out.printf("   -15 + -4 = %d%n", result3);
        } catch (WrongOperatorException | ArithmeticException e) {
            System.out.printf("   Error: %s%n", e.getMessage());
        }
    }
    
    private static void testZeroOperations() {
        System.out.println("   Zero operations:");
        try {
            int result1 = Calculator.calculate(0, 5, "*");
            System.out.printf("   0 × 5 = %d%n", result1);
            
            int result2 = Calculator.calculate(0, 10, "+");
            System.out.printf("   0 + 10 = %d%n", result2);
            
            int result3 = Calculator.calculate(0, 7, "%");
            System.out.printf("   0 %% 7 = %d%n", result3);
        } catch (WrongOperatorException | ArithmeticException e) {
            System.out.printf("   Error: %s%n", e.getMessage());
        }
    }
}