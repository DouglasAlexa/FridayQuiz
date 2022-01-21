package ec.utbildning1;

public class Main {
    
    @FunctionalInterface
    interface ToUpper {
        String upperCased(String str);
    }

    public static void main(String[] args) {

        String lowerCase = "hello beautiful!";
        ToUpper makeUpper = String::toUpperCase;
        System.out.println(useInterface(lowerCase, makeUpper));


    }
    private static String useInterface(String s, ToUpper toUpper) {
        return toUpper.upperCased(s);
    };
}
