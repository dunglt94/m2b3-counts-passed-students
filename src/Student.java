import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int list[];
        int size;
        do {
            System.out.print("Enter the size of the list: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size does not exceed 30");
            }
        } while (size > 30);
        list = new int[size];

        int i = 0;
        while (i < size) {
            do {
                System.out.print("Enter the the mark for student " + (i + 1) + ": ");
                list[i] = scanner.nextInt();
                if (list[i] < 0 || list[i] > 10) {
                    System.out.println("Invalid mark");
                }
            } while (list[i] < 0 || list[i] > 10);
            i++;
        }

        int count = 0;
        for (int j = 0; j < size; j++) {
            if (list[j] >= 5 && list[j] <= 10) {
                count++;
            }
        }
        System.out.println("The number of students passed the exam is " + count);
    }
}
