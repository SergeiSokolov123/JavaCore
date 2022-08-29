package Lesson1Task1;

public class Main {
    public static int arrayCount = 10;
    public static int[][] array = new int[arrayCount][arrayCount];

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 1000);
            }
        }
        int max = array[0][0];
        int min = array[0][0];
        int avg = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (min > array[i][j])
                    min = array[i][j];
                avg += array[i][j] / (array.length * array.length);
            }
        }
        System.out.println("\n" + "max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
