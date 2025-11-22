package com.yuvraj.service;

import com.yuvraj.exceptions.WrongOperatorException;



public class Calculator {
    
    /**
     * Performs calculation based on the operator and returns the result
     * @param number1 First operand
     * @param number2 Second operand
     * @param operator Mathematical operator (+, -, *, /, %)
     * @return Result of the calculation
     * @throws WrongOperatorException If an invalid operator is provided
     * @throws ArithmeticException If division by zero is attempted
     */
    public static int calculate(int number1, int number2, String operator) 
            throws WrongOperatorException {
        
        switch (operator) {
            case "+":
                return number1 + number2;
                
            case "-":
                return number1 - number2;
                
            case "*":
                return number1 * number2;
                
            case "/":
                if (number2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return number1 / number2;
                
            case "%":
                if (number2 == 0) {
                    throw new ArithmeticException("Modulo by zero is not allowed");
                }
                return number1 % number2;
                
            default:
                throw new WrongOperatorException("Invalid operator: '" + operator + 
                    "'. Valid operators are: +, -, *, /, %");
        }
    }
    
    /**
     * Helper method to get operator symbol for display
     */
    public static String getOperatorSymbol(String operator) {
        switch (operator) {
            case "+": return "+";
            case "-": return "-";
            case "*": return "×";
            case "/": return "÷";
            case "%": return "%";
            default: return operator;
        }
    }
}