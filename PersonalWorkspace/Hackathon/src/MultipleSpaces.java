public class MultipleSpaces {

    public static void main(String[] args) {
        String input = "A  B    C       D";
        System.out.println(input);
        input = input.replaceAll("( )+", " ");
        System.out.println(input);
    }
}
