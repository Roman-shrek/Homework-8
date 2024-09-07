import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        // Задание 1
        System.out.println("Задание 1");
        int[] numbers = new int[3]; // Массив первый
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] values = {1.57, 7.654, 9.986}; //Массив с дробными знаечниями
        int[] weight = {95, 88, 78, 90, 96, 90, 87, 89, 90, 95, 90, 92};// Произвольный массив
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < numbers.length; i++) { //Первый массив
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < values.length; i++) { // Массив с дробными числами
            System.out.print(values[i]);
            if (i < values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < weight.length; i++) { // Массив с весом
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = numbers.length - 1; i >= 0; i--) { // Массив первый
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();// массив с Дробными числами
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = weight.length - 1; i >= 0; i--) { // Массив с весом
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}