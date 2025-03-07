package org.example;

// 전위연산, 후위연산

class Main {
    public static void main(String[] args) {

        double a = 2.1;
        double a2 = a * 10;

        System.out.println(a2);

        if ((a2 * 3) == 63) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }

// ======================================
//        int a = 1;
//
//        int i = a++;
//
//        System.out.println("i : " + i);
//        System.out.println("a : " + a);

// ======================================
//        int n = 10, firstTerm = 0, secondTerm = 1;
//
//        for(int i = 1; i <= n; ++i){
//            System.out.println(firstTerm + ", ");
//
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }
//
// ======================================
//        int base = 3;
//        long result = 1;
//
//        for (int exponent = 4; exponent != 0; --exponent) {
//            result = result * base;
//        }
//
//        System.out.println("Answer : " + result);

    }
}