package com.example.enno.rechnentrainier;

import java.lang.UnsupportedOperationException;
import java.util.Random;

public class giveTask {


    public Task makeTask(int pComplexity, int pFloor, int pCeiling) {
        if(pComplexity < 0 || pComplexity > 4) throw new UnsupportedOperationException("Complexity must be between 0 and 4");

        Random r = new Random();
        int operand1 = r.nextInt(pCeiling - pFloor + 1) + pFloor;
        int operand2 = r.nextInt(pCeiling - pFloor + 1) + pFloor;
        int operator = r.nextInt(pComplexity);
        int result;

        switch(operator) {
            case: 0
               result = operand1 + operand2;
              break;
            case: 1
                result = operand1 - operand2;
              break;
            case: 2
                result = operand1 * operand2;
              break;
            case: 3
                result = operand1 / operand2;
              break;
        }

        return new Task(operand1, operand2, operator, result);
    }
}
