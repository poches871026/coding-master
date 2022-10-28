package baekjoon.step5;

public class Ans4673 {

    public static void main(String[] args) {

        System.out.println(sum(25));


    }

    public static int sum(int num) {

        int base = num;
        int a = num / 10;
        int b = num % 10;

        System.out.println("base :: " + base);
        System.out.println("a :: " + a);
        System.out.println("b :: " + b);

        num = num + a + b;

        return num;

    }
}
