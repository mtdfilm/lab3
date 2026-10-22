import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int smallest = 100;
        int largest = 1;
        int count = 0;

        System.out.println("Random numbers:");

        while (count < 10) {
            int number = random.nextInt(100) + 1;
            System.out.print(number + " ");

            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }

            count++;
        }

        System.out.println();
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
