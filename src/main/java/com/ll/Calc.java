package com.ll;

public class Calc {
    public static int run(String exp) { // exp, expression 표현식
        // 값이 없을 경우
        if (exp.isBlank()) return 0;

        String[] expBits = exp.split(" \\+ ");
        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[1]);

        return num1 + num2;
    }
}
