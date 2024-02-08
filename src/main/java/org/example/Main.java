package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5();
//        Task6();
//        Task7();
//        Task8();
//        Task9();
//        Task10();
//        Task11(10, "vertical", '*');

        System.out.print(Arrays.toString(Task12(new int[]{5,1,4,3,2}, "asc")));
    }

    private static void Task1() {
        System.out.println("Your time is limited, \n\tso don’t waste it \n\t\tliving someone else’s life\n\t\t\tSteve Jobs");
    }

    private static void Task2() {
        Scanner scanner = new Scanner(System.in);
        int num = 0, percent = 0;
        boolean isInt;

        System.out.println("Input number: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            num = scanner.nextInt();
        }

        System.out.println("Input percent: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            percent = scanner.nextInt();
            if (percent < 1 || percent > 100) {
                System.out.println("Wrong percent!");
                return;
            }
        }

        System.out.println(percent + "% from " + num + " = " + (num / percent));
    }

    private static void Task3() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        boolean isInt;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input " + (i + 1) + " number: ");
            isInt = scanner.hasNextInt();
            if (isInt) {
                numbers[i] = scanner.nextInt();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number);
        }
        int finishNumber = Integer.parseInt(sb.toString());

        System.out.println("Final number = " + finishNumber);
    }

    private static void Task4() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isInt;

        System.out.println("Input XXXXXX number: ");
        isInt = scanner.hasNextInt();
        if (isInt) {
            number = scanner.nextInt();
            if (String.valueOf(number).length() != 6) {
                System.out.println("It's not a XXXXXX number: ");
                return;
            }
            System.out.println("Original number: " + number);
            int[] numArr = new int[6];

            for (int i = numArr.length - 1; i >= 0; i--) {
                numArr[i] = number % 10;
                number /= 10;
            }

            //зміна чисел місцями
            numArr[0] += numArr[5];
            numArr[5] = numArr[0] - numArr[5];
            numArr[0] -= numArr[5];

            numArr[1] += numArr[4];
            numArr[4] = numArr[1] - numArr[4];
            numArr[1] -= numArr[4];

            int transformedNum = 0;

            for (int num : numArr) {
                transformedNum = transformedNum * 10 + num;
            }

            System.out.println("Transformed number: " + transformedNum);
        }
    }

    private static void Task5() {
        Scanner scanner = new Scanner(System.in);

        int month;
        System.out.println("Input number of month: ");

        boolean isInt = scanner.hasNextInt();

        if (isInt) {
            month = scanner.nextInt();
        } else {
            System.out.println("Error!");
            return;
        }

        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println("Winter!");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring!");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer!");
        } else if (month >= 9 && month <= 12) {
            System.out.println("Autumn!");
        } else {
            System.out.println("You input non-existing month");
        }
    }

    private static void Task6() {
        Scanner scanner = new Scanner(System.in);

        int length;
        boolean isInt;
        System.out.println("Input length in meters:");

        isInt = scanner.hasNextInt();

        if (isInt) {
            length = scanner.nextInt();
        } else {
            System.out.print("Error!");
            return;
        }

        System.out.println("Choose unit of measurement:\n1. Мiles\n2. Inches\n3. Yards\nYour choise:");

        int choise;
        isInt = scanner.hasNextInt();

        if (isInt) {
            choise = scanner.nextInt();
        } else {
            System.out.println("Error!");
            return;
        }

        switch (choise) {
            case 1: {
                System.out.println(length + " meters = " + length * 0.00062 + " miles.");
            }
            break;
            case 2: {
                System.out.println(length + " meters = " + length * 39.37 + " inches.");
            }
            break;
            case 3: {
                System.out.println(length + " meters = " + length * 1.0936 + " yards.");
            }
            break;
            default: {
                System.out.println("Error choise!");
            }
        }
    }

    private static void Task7() {
        Scanner scanner = new Scanner(System.in);

        int fisrt, second;
        boolean isInt;
        System.out.println("Input first number:");

        isInt = scanner.hasNextInt();

        if (isInt) {
            fisrt = scanner.nextInt();
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.println("Input second number:");

        isInt = scanner.hasNextInt();

        if (isInt) {
            second = scanner.nextInt();
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.print("Odd number: ");
        for (int i = Math.min(fisrt, second); i <= Math.max(fisrt, second); i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void Task8() {
        Scanner scanner = new Scanner(System.in);

        int fisrt, second;
        boolean isInt;
        System.out.println("Input first number:");

        isInt = scanner.hasNextInt();

        if (isInt) {
            fisrt = scanner.nextInt();
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.println("Input second number:");

        isInt = scanner.hasNextInt();

        if (isInt) {
            second = scanner.nextInt();
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.println("Multiplication Table");
        for (int i = Math.min(fisrt, second); i <= Math.max(fisrt, second); i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.print("\n");
        }
    }

    private static void Task9() {
        int size = 40;
        int[] arr = new int[size];
        Random random = new Random();

        int countNegative = 0, countPositive = 0, countZero = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        System.out.print("Random array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 10);
            System.out.print(arr[i] + " ");
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > 0)
                countPositive++;
            if (arr[i] < 0)
                countNegative++;
            if (arr[i] == 0)
                countZero++;
        }

        System.out.println("\nCount positive number = " + countPositive + "\nCount negative number = " + countNegative + "\nCount zero = " + countZero + "\nMax number = " + max + "\nMin number = " + min);
    }

    private static void Task10() {
        int size = 40;
        int[] arr = new int[size];
        Random random = new Random();

        ArrayList<Integer> listNegative = new ArrayList<>();
        ArrayList<Integer> listPositive = new ArrayList<>();
        ArrayList<Integer> listEven = new ArrayList<>();
        ArrayList<Integer> listOdd = new ArrayList<>();

        System.out.print("Random array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10, 10);
            System.out.print(arr[i] + " ");

            if (arr[i] > 0)
                listPositive.add(arr[i]);
            if (arr[i] < 0)
                listNegative.add(arr[i]);
            if (arr[i] % 2 == 0)
                listEven.add(arr[i]);
            if (arr[i] % 2 != 0)
                listOdd.add(arr[i]);
        }

        int[] arrNegative = listNegative.stream().mapToInt(i -> i).toArray();//підгледів цей варік в інеті
        int[] arrPositive = listPositive.stream().mapToInt(i -> i).toArray();
        int[] arrEven = listEven.stream().mapToInt(i -> i).toArray();
        int[] arrOdd = listOdd.stream().mapToInt(i -> i).toArray();

        System.out.println("\n\nArray negative: " + Arrays.toString(arrNegative));
        System.out.println("Array positive: " + Arrays.toString(arrPositive));
        System.out.println("Array even: " + Arrays.toString(arrEven));
        System.out.println("Array odd: " + Arrays.toString(arrOdd));
    }

    private static void Task11(int length, String direction, char symbol) {

        for (int i = 0; i < length; i++) {
            switch (direction) {
                case "vertical":
                    System.out.println(symbol);
                    break;
                case "horizontal":
                    System.out.print(symbol);
                    break;
                default:
                    System.out.println("Error!");
            }
        }
    }

    private static int[] Task12(int[] arr, String method) {
        switch (method) {
            case "asc":
                Arrays.sort(arr);
                break;
            case "desc": {
                Arrays.sort(arr);
                for (int i = 0; i < arr.length / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = temp;
                }
            }
            break;
            default:
                return arr;
        }

        return arr;
    }
}