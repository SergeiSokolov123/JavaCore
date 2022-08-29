package Lesson1Task2;

public class Main {
    public static int[] numbers = new int[]{5, 6, 3, 2, 5, 1, 4, 9};

    public static void main(String[] args) {
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + "\t");
        }

    }
}

