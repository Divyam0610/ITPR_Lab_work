
// Q.12 Program to input 10 numbers and display them in ascending order

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input 10 numbers
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Sort numbers in ascending order
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Display sorted numbers
        System.out.println("\nNumbers in ascending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
