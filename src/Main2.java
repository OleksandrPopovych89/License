import java.util.HashMap;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount;
        amount = sc.nextInt();
        HashMap<Integer, Integer> details = new HashMap<>();
        while (amount > 0) {
            amount--;
            int input = sc.nextInt();
            if (input == -1 || input == 0 || input == 1) {
                details.put(input, details.getOrDefault(input, 0) + 1);
            }
        }
        System.out.println(details.getOrDefault(0, 0) + " " + details.getOrDefault(1, 0) + " " + details.getOrDefault(-1, 0));
    }
}