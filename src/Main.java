import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość tablicy: ");
        int length = scanner.nextInt();
        double[] array = generateArray(length);

        System.out.println("------------Nieposortowana tablica------------");
        for (double v : array) {
            System.out.print(v + ", ");
        }
        array = bubbleSort(array);
        System.out.println("\n-------------Posortowana tablica-------------");
        for (double v : array) {
            System.out.print(v + ", ");
        }
    }

    public static double[] generateArray(int length) {
        double[] array = new double[length];
        double random;
        for (int i = 0; i < length; i++) {
            do {
                random = Math.random() * 100;
            } while (!(random >= 30) || !(random <= 70));
            array[i] = (double) round(random * 100) / 100;
        }
        return array;
    }

    public static double[] bubbleSort(double[] array) {
        double temp;
        int arraySize = array.length;
        for (int i = arraySize - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}