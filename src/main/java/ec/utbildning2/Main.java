package ec.utbildning2;

public class Main {

    @FunctionalInterface
    interface SumOf {
        int summing (int a, int b, int c);
    }

    @FunctionalInterface
    interface Concat {
        String concatinate (String a, String b, String c);
    }

    public static void main(String[] args) {

        SumOf result = (a, b, c) -> a + b + c;
        System.out.println(addNumbers(21, 55, 76, result));

        SumOf resultTwo = (a, b, c) -> a - b - c;
        System.out.println(addNumbers(99, 54, 1, resultTwo));

        Concat concatMe = (s, t, u) -> s + " " + t + " " + u;
        System.out.println(concatThis("Hej", "där", "snyggo!", concatMe));
    }

    private static int addNumbers(int i, int j, int k, SumOf s) {
        return s.summing(i, j, k);
    }

    private static String concatThis(String s, String t, String u, Concat c) {
        return c.concatinate(s, t, u);
    }
}
