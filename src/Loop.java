public class Loop {
    public static void main(String[] args) {
        String word = "naveen";

        for (char c : word.toCharArray()) {
            System.out.print(c + "-");
        }
    }
}