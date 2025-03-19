package org.example;

public class Calc {

    public static int run(String exp) {

//        boolean needToMulti = exp.contains("*");
//        boolean needToPlus = exp.contains("+");
//
//        boolean needToCompound = needToPlus && needToMulti;
//
//        if (needToCompound) {
//            String[] bits = exp.split(" \\+ ");
//
//            return run(bits[0]) + Integer.parseInt(bits[1]) + run(bits[2]);
//        }
//
//        if (needToPlus) {
//            exp = exp.replace("- ", "+ -");
//
//            String[] bits = exp.split(" \\+ ");
//
//            int sum = 0;
//
//            for (int i = 0; i < bits.length; i++) {
//                sum += Integer.parseInt(bits[i]);
//            }
//
//            return sum;
//        } else if (needToMulti) {
//            String[] bits = exp.split(" \\* ");
//
//            int sum = 1;
//
//            for (int i = 0; i < bits.length; i++) {
//                sum *= Integer.parseInt(bits[i]);
//            }
//
//            return sum;
//        }
//
//        throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");
////        throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");
//    }
//
//}
//




        boolean needToMulti = exp.contains("*");
        boolean needToPlus = exp.contains("+");
        boolean needMinus = exp.contains("-");
        boolean needToSplit = exp.contains("(") || exp.contains(")");
        boolean needTocom = needToMulti && needToPlus;

        exp = exp.replace("- ", "+ -");
        exp = exp.replace("(", "");
        exp = exp.replace(")", "");
        //        exp = exp.replace("- ", "- +");
//        bits = exp.split(" \\+ ");
//        bits = exp.split(" \\* ");
//        exp = sdf(exp);

        if (!exp.contains(" ")) {
            return Integer.parseInt(exp);
        }
        System.out.println("exp2 : " + exp);
        String[] bits = new String[]{};
//        if (needgg1&&needgg2) {
//            run(exp);
//
//        }
        if (needToSplit) {
            int bracketsCount = 0;
            int splitPointIndex = -1;

            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) == '(') {
                    bracketsCount++;
                } else if (exp.charAt(i) == ')') {
                    bracketsCount--;
                }
                if (bracketsCount == 0) {
                    splitPointIndex = i;
                    break;
                }
            }
            String firstExp = exp.substring(0, splitPointIndex + 1);
            String secondExp = exp.substring(splitPointIndex + 4);

            return Calc.run(firstExp) + Calc.run(secondExp);

        }

        if (needTocom){
            int sum = 0;
            bits = exp.split(" \\+ ");
            int rs = 0;
            for (int i = 0; i < bits.length; i++) {
                if( bits[i].contains("*")){
                    rs += run(bits[i]);
                }else {
                    rs += Integer.parseInt(bits[i]);
                }
            }

            return rs;
        }
        if (needToPlus) {
            int sum = 0;
            bits = exp.split(" \\+ ");
            for (int i = 0; i < bits.length; i++) {
               sum += Integer.parseInt(bits[i]);
            }
            return sum;
        }
        if (needToMulti) {
            int sum = 1;
            bits = exp.split(" \\* ");
            for (int i = 0; i < bits.length; i++) {
                sum *= Integer.parseInt(bits[i]);
            }
            return sum;
        }
        if (needMinus){
            int sum = 0;
            bits = exp.split(" \\+ ");
            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }
            return sum;
        }



        throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");



    }

    private static String stripOuterBrackets(String exp) {
        if (exp.charAt(0) == '(' && exp.charAt(exp.length() - 1) == ')') {
            exp = exp.substring(1, exp.length() - 1);
        }

        return exp;
    }


}
