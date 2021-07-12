public class Main {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
        String str2 = str.replace(" ", "");
        str2.replace(" ", "");
        return str2;
    }
}