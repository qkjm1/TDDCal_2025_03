package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Calc {
    public static boolean debug = true;
    public static int runCallCount = 0;

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

//
//
//
//        boolean needToMulti = exp.contains("*");
//        boolean needToPlus = exp.contains("+")||exp.contains("-");
//        boolean needToSplit = exp.contains("(") || exp.contains(")");
//        boolean needTocom = needToMulti && needToPlus;
//
//        exp = exp.replace("- ", "+ -");
//        exp = exp.replace("(", "");
//        exp = exp.replace(")", "");
//        //        exp = exp.replace("- ", "- +");
////        bits = exp.split(" \\+ ");
////        bits = exp.split(" \\* ");
////        exp = sdf(exp);
//
//        if (!exp.contains(" ")) {
//            return Integer.parseInt(exp);
//        }
//        System.out.println("exp2 : " + exp);
//        String[] bits = new String[]{};
//
//        if (needToSplit) {
//            int bracketsCount = 0;
//            int splitPointIndex = -1;
//
//            for (int i = 0; i < exp.length(); i++) {
//                if (exp.charAt(i) == '(') {
//                    bracketsCount++;
//                } else if (exp.charAt(i) == ')') {
//                    bracketsCount--;
//                }
//                if (bracketsCount == 0) {
//                    splitPointIndex = i;
//                    break;
//                }
//            }
//            String firstExp = exp.substring(0, splitPointIndex + 1);
//            String secondExp = exp.substring(splitPointIndex + 4);
//
//            return Calc.run(firstExp) + Calc.run(secondExp);
//
//        }
//
//        if (needTocom){
//            int sum = 0;
//            bits = exp.split(" \\+ ");
//            int rs = 0;
//            for (int i = 0; i < bits.length; i++) {
//                if( bits[i].contains("*")){
//                    rs += run(bits[i]);
//                }else {
//                    rs += Integer.parseInt(bits[i]);
//                }
//            }
//
//            return rs;
//        }
//        if (needToPlus) {
//            int sum = 0;
//            bits = exp.split(" \\+ ");
//            for (int i = 0; i < bits.length; i++) {
//               sum += Integer.parseInt(bits[i]);
//            }
//            return sum;
//        }
//        if (needToMulti) {
//            int sum = 1;
//            bits = exp.split(" \\* ");
//            for (int i = 0; i < bits.length; i++) {
//                sum *= Integer.parseInt(bits[i]);
//            }
//            return sum;
//        }
//
//
//
//
//        throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");
//
//
//
//    }
//
//    private static String stripOuterBrackets(String exp) {
//        if (exp.charAt(0) == '(' && exp.charAt(exp.length() - 1) == ')') {
//            exp = exp.substring(1, exp.length() - 1);
//        }
//
//        return exp;
//    }
//
//
//}
        /// /////
//        boolean needToMulti = exp.contains("*");
//        boolean needToPlus = exp.contains("+") || exp.contains("-");
//        boolean needToSplit = exp.contains("(") && exp.contains(")");
//        boolean needTocom = needToMulti && needToPlus;
//
//        exp = exp.replace("- ", "+ -"); // - 의 경우 +로 치환된 후 들어감
//        //        exp = exp.replace("(", "");
//        //        exp = exp.replace(")", "");
//        exp = exp.replace("((", "(");
//        exp = exp.replace("))", ")");
//        //        exp = exp.replace("- ", "- +");
//        //        bits = exp.split(" \\+ ");
//        //        bits = exp.split(" \\* ");
//
//        String[] bits = new String[]{};
//
//        exp = sdf(exp);//괄호를 벗겨주는 함수
//
//        // ^^재귀호춯
//
//
//        if (!exp.contains(" ")) {
//            return Integer.parseInt(exp);
//        }
//
//        System.out.println("exp2 : " + exp);//확인용
//
//
//        if (needToSplit) {  // 카운트를 샜다가 다시 줄어드는 코드 >> 0이 될때 괄호가 끝나는 인덱스를 저장하고 반복 마침
//            int bracketsCount = 0;
//            int splitPointIndex = -1;
//
//            for (int i = 0; i < exp.length(); i++) {
//                if (exp.charAt(i) == '(') {
//                    bracketsCount++;
//                } else if (exp.charAt(i) == ')') {
//                    bracketsCount--;
//                }
//                if (bracketsCount == 0) {
//                    splitPointIndex = i;
//                    break;
//                }
//            }
//            String firstExp = exp.substring(0, splitPointIndex + 1); // 0
//            firstExp = sdf(firstExp);
//            Calc.run(firstExp);
//            String secondExp = exp.substring(splitPointIndex + 4);
//
//            if (needTocom){
//                return Calc.run(firstExp) * Calc.run(secondExp);
//            }
//
//            return Calc.run(firstExp) + Calc.run(secondExp);
//
//        }else if (needTocom){
//            int sum = 0;
//            bits = exp.split(" \\+ ");
//            int rs = 0;
//            for (int i = 0; i < bits.length; i++) {
//                if( bits[i].contains("*")){
//                    rs += run(bits[i]);
//                }else {
//                    rs += Integer.parseInt(bits[i]);
//                }
//            }
//
//            return rs;
//        }
//        if (needToPlus) {
//            int sum = 0;
//            bits = exp.split(" \\+ ");
//            for (int i = 0; i < bits.length; i++) {
//                sum += Integer.parseInt(bits[i]);
//            }
//            return sum;
//        }else if (needToMulti) {
//            int sum = 1;
//            bits = exp.split(" \\* ");
//            for (int i = 0; i < bits.length; i++) {
//                sum *= Integer.parseInt(bits[i]);
//            }
//            return sum;
//        }
//
//
//
//
//        throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");
//
//
//
//    }
//
//    private static String sdf(String exp) {
//        int outerBracketsCount = 0;
//
//        while (exp.charAt(outerBracketsCount) == '(' && exp.charAt(exp.length() - 1 - outerBracketsCount) == ')') {
//            outerBracketsCount++;
//        }
//
//        if (outerBracketsCount == 0) return exp;
//
//        return exp.substring(outerBracketsCount, exp.length() - outerBracketsCount);
//    }
//
//}
//
//
        runCallCount++;

        exp = exp.trim(); // 양 옆의 쓸데없는 공백 제거
        // 괄호 제거
        boolean needToMminus = exp.contains("-(");
        if (needToMminus) {
            exp = exp.replace("-", "");
        }

        exp = stripOuterBrackets(exp);


        if (debug) {
            System.out.printf("exp(%d): %s\n", runCallCount, exp);
        }

        // 단일항이 들어오면 바로 리턴
        if (!exp.contains(" ")) {
            return Integer.parseInt(exp);
        }

        boolean needToMulti = exp.contains(" * ");
        boolean needToPlus = exp.contains(" + ") || exp.contains(" - ");
        boolean needToSplit = exp.contains("(") || exp.contains(")");

        boolean needToCompound = needToPlus && needToMulti;



        if (needToSplit) {
            int splitPointIndex = findSplitPointIndex(exp);
            String firstExp = exp.substring(0, splitPointIndex);
            String secondExp = exp.substring(splitPointIndex + 1);

            char operator = exp.charAt(splitPointIndex);

            exp = Calc.run(firstExp) + " " + operator + " " + Calc.run(secondExp);

            if (needToMulti) {
                String[] bits = exp.split(" \\* ");
            }

            return Calc.run(exp);


        } else if (needToCompound) {
            String[] bits = exp.split(" \\+ ");

            String newExp = Arrays.stream(bits)
                    .mapToInt(Calc::run)
                    .mapToObj(e -> e + "")
                    .collect(Collectors.joining(" + "));

            return run(newExp);
        }

        if (needToPlus) {
            exp = exp.replace("- ", "+ -");

            String[] bits = exp.split(" \\+ ");

            int sum = 0;

            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }
            if(needToMminus){
                return -sum;
            }

            return sum;
        } else if (needToMulti) {
            String[] bits = exp.split(" \\* ");

            int sum = 1;

            for (int i = 0; i < bits.length; i++) {
                sum *= Integer.parseInt(bits[i]);
            }

            return sum;
        }

        throw new RuntimeException("해석 불가 : 올바른 계산식이 아닙니다");
    }

    private static int findSplitPointIndex(String exp) {
        int index = findSplitPointIndexBy(exp, '+');

        if (index >= 0) return index;

        return findSplitPointIndexBy(exp, '*');
    }

    private static int findSplitPointIndexBy(String exp, char findChar) {
        int bracketsCount = 0;

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (c == '(') {
                bracketsCount++;
            } else if (c == ')') {
                bracketsCount--;
            } else if (c == findChar) {
                if (bracketsCount == 0) return i;
            }
        }
        return -1;
    }

    private static String stripOuterBrackets(String exp) {

        int outerBracketsCount = 0;

        while (exp.charAt(outerBracketsCount) == '(' && exp.charAt(exp.length() - 1 - outerBracketsCount) == ')') {
            outerBracketsCount++;
        }

        if (outerBracketsCount == 0) return exp;

        return exp.substring(outerBracketsCount, exp.length() - outerBracketsCount);
    }

}