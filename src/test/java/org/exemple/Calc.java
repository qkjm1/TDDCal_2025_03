package org.exemple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calc {

    public static int run(String exp) {
        int sum = 0;

        System.out.println("exp1 : " + exp);

        exp = exp.replace("- ", "+ -");
        exp = exp.replace("- ", "- +");
//        exp = exp.replace("+ ", "+ -");

        System.out.println("exp2 : " + exp);
        String[] bits = new String[]{};
        if(exp.contains("+")) {
            bits = exp.split(" \\+ ");
        }else if(exp.contains("*")) {
            bits = exp.split(" \\* ");
        }

        System.out.println("bits: " + Arrays.toString(bits));


        if(exp.contains("+")) {
            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }
        }else if(exp.contains("*")) {
            sum = 1;
            for (int j = 0; j < bits.length; j++) {
                sum *= Integer.parseInt(bits[j]);
            }
        }
        System.out.println("sum: " + sum);

//        throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");

        return sum;
    }
}

