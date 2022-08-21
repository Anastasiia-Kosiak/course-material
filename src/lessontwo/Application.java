package lessontwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // if - якщо
        // if (умова) {
        // } else - інакше
        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println(number + " - парне число");
//        } else {
//            System.out.println(number + " - непарне число");
//        }

        // 1-4 - початкова
        // 5 - 9 - середня школа
        // 10-12 - старша школа
//        int grade = scanner.nextInt();
//        if (grade >= 1 && grade <= 4) {
//            System.out.println("Це початкова школа");
//        }
//        else if (grade >= 5 && grade <= 9) {
//            System.out.println("Це середня школа");
//        }
//        else if (grade >= 10 && grade <=12) {
//            System.out.println("Це старша школа");
//        }
//        else {
//            System.out.println("Такого класу не існує");
//        }
//
//        // тернарний оператор
//
//        int num = 44;
//        int age = 20;
//        boolean isEven = num % 2 == 0 ? true : false;
//        boolean isAdult = age >= 18 ? true : false;
//        if (isAdult) {
//            System.out.println("Повнолітня");
//        }
//
        // цикли
        // for
        // while - поки
        //do..while - роби...поки

        // for (ініціалізація індексу; умова завершення циклу; як ми змінюємо індекс) {
        // }
        // 10 20
        // 10 11 12....20
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();

        // межа чисел
        // перевірити, чи є там якесь число
        // вивести на екра
//        for (int i = start; i <=end; i++) {
//            // тіло циклу
//            // 20 19 .. 10 ..
//            System.out.print(i + " ");
//        }
//
//        int index = start;
//         цикл із передумовою
//        while (index <=end) {
//            System.out.print(index + " ");
//            index++;
//        }

        // цикл із післяумовою

//        int index = start;
//        do {
//            System.out.print(index + " ");
//            index++;
//        } while (index <= end);
//
        // continue
        // break

//        int num = 15;
//        for (int i = 0; i < 20; i++) {
//            if (i == num) {
//                continue;
//            }
//            System.out.print(i + " ");

        // switch - перебирати
        // світлофор
        //
//        String color = scanner.nextLine();
//        switch(color) {
//            case "red":
//            case "orange":
//                System.out.println("Don't go");
//                break;
//            case "green":
//                System.out.println("GO");
//                break;
//
//            default:
//                System.out.println("Wrong color");
//        }

        // Масиви - arrays
        int[] intNums = new int[10];
        //[5][0][0][0][0][0][0][0][0][0]
        // 0 to  size - 1
        intNums[0] = 8;
        intNums[1] = 43;
        intNums[7] = 100;
        intNums[9] = 99;
//        System.out.println(intNums[0]);
//        System.out.println(intNums[2]);
        int[] secondArray = new int[] {3, 6,10, -11, 30, 45, 0};
//        System.out.println(secondArray[5]);
        int firstArraySize = intNums.length;
//        System.out.println("size is " + firstArraySize);
//        System.out.println("2nd size is " + secondArray.length);

//        printIntArray(intNums);
//        printIntArray(secondArray);
        int sum = 0;
        for (int i = 0; i < intNums.length; i++) {
            sum += intNums[i];
        }
        System.out.println();
        Random rand = new Random();
//        System.out.println("sum is " + sum);
        int[] thirdArray = new int[5];
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = rand.nextInt(30);
        }
//        printIntArray(thirdArray);

        double[] doubleArray = new double[10];
//        fillDoubleArray(doubleArray);
//        printDoubleArray(doubleArray);

        String[] fruits = new String[4];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "pomegranade";
        fruits[3] = "pear";

        int[] arr = new int[15];
        for (int i = 0; i < intNums.length; i++) {
            arr[i] = intNums[i];
        }
        int[] newArr = Arrays.copyOf(secondArray, 20);
//        printIntArray(newArr);
        Arrays.sort(newArr);
//        printIntArray(newArr);
        Arrays.sort(intNums);
//        printIntArray(intNums);
        Arrays.sort(fruits);
//        for (int i = 0; i < fruits.length; i++) {
//            System.out.print(fruits[i] + " ");
//        }
        Book bookOne = new Book();
        bookOne.setAuthor("Neil Gaiman");
        bookOne.setTitle("Coraline");
        bookOne.setGenre("Novel");
        bookOne.setPublishYear(2010);
        System.out.println(bookOne.getAuthor());
        System.out.println(bookOne.getTitle());
        System.out.println(bookOne.getGenre());
        System.out.println(bookOne.getPublishYear());
        Book[] books = new Book[5];
        books[0] = bookOne;
        books[0].setTitle("New title");
        System.out.println(books[0].getTitle());
//        Book bookTwo = new Book();

//        bookOne.setAuthor("");
//        bookTwo.setAuthor();
        // об'єкти - null
        // int - 0
        // double - 0.0
        // boolean - false
        // char = ''


//        printIntArray(arr);
    }

    public static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printDoubleArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillDoubleArray(double[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble();
        }
    }
}
