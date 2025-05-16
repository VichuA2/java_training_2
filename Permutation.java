import java.util.Scanner;

class Permutation {
    public static void printPermutations(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Pick one character
            String remaining = str.substring(0, i) + str.substring(i + 1); // Remove it
            printPermutations(remaining, result + ch); // Recur with the remaining
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Permutations:");
        printPermutations(input, "");
    }
}