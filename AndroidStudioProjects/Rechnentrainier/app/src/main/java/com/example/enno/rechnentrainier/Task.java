package com.example.enno.rechnentrainier;


public class Task {
    private int operand1;
    private int operand2;
    private int operator;
    private int result;

    public Task(int pOperand1, int pOperand2, int pOperator, int pResult ) {
       operand1 = pOperand1;
       operand2 = pOperand2;
       operator = pOperator;
       result = pResult; 
    }

    public int getOperand1() {
        return operand1;
    }
    public int getOperand2() {
        return operand2;
    }
    public int getOperator() {
        return operator;
    }
    public int getResult() {
        return result;
    }
}
