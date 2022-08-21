package lessonone;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author anastasiiakosiak
 * Copyright:
 */

public class Application {
    public static final int NUMBER_OF_MONTHS = 12;
    enum Size {S, M, L, XL, XXL};
    enum Months {January, February};
// javadoc

    /**
     *
     * @param args
     */

    // main
    // сигнатура
    // IO - Input Output
    public static void main(String[] args) throws IOException {
//        Size size = Size.XXL;

        // javac - Java compiler
        // тіло функція
        // void - пусте значення
        // Hello World!
        // ln - line
        // "" - стрічка, String
        // ;
        // statement - ;

        /*
        multiline
        comment
        fgfffffffffffffffffffffffffffffffff
        ffffffffff
         */
// strongly type - строго типізована
        // примітивні типи - 8
        // integer - цілочисельні значення
        // int, short, long, byte
        byte b = 127;
        byte negativeByte = -120;
        // 1 byte - 8 біт
        // -2^7 - 2^7 - 1
        // -128 to 127
        // типи посилання
        short s = 32767;
        // short - 16 bit => 2 byte
        // 1 bit => 8 bit = 1 byte
        // -2^15 to 2^15 -1
        // -32768 to 32767
        int num = 2147483647;
        // int - 32 bit - 4 bytes
        // -2^31 to 2^31 - 1
        // max: 2147483647
        long longNumber = 1555555555555555555L;
        // l/L
        // 64 bit - 8 byte
        // -2^63 to 2^63 -1

        // - числа із десятковою частною
        // floating point numbers -
        // float
        float floatNumber = 5.6F;
        // f/F
        // 32 bit =>
        // 6-7 чисел після коми
        double doubleNum = 5.6;
        //64 bit =>
        float f1 = 5.0f;
        float f2 = 3.0f;
//        System.out.println(f1/f2);
//        double d1 = 5.0;
//        double d2 = 3.0;
//        System.out.println(d1/d2);
        //char - character
        char symbol = 'a';
        char hash = '#';
//        System.out.println(symbol);
        // Unicode
        // boolean - булеві значення - true false

        // 0 - false
        // 1 - true
        // CamelCase

        int numberOfMonths = 12;
        // final
//        final String name = "Name";
//        name = "Name2";

//        System.out.println("Hello world!");
//        System.out.println(5);
//        System.out.println(6);

        // оператори
        // арифметичні
        // +, -, /, *, %
        int sum = 5 + 7;
        int diff = 4 - 6;
        // multiply
        int mul =  5 * 100;
        int divRes = 5/3; // 1
        int divRes2 = 3/4; // 0
//        System.out.println(sum);
//        System.out.println(diff);
//        System.out.println(mul);
//        System.out.println(divRes2);
        double doubleRes = 3.0 / 4;
//        System.out.println(doubleRes);
        // implicit casting - невидиме зведення типів
        // explicit casting - видиме зведення типів
        int numOne = 5;
        long numTwo = 50L;

        double result = numOne + numTwo;
        short shortNum = 32767;
        short shortResult = (short)(shortNum + numOne);
//        System.out.println(shortResult);
        int intNumber = 4;
        byte bNUmber = 12;
        byte byteResult = (byte)(intNumber + bNUmber);
//        System.out.println(byteResult);
        // overflow
        // %
//        System.out.println(5 % 3);
        // 5 = 1 * 3 + 2
//        System.out.println(11%2);
        // 11 = 5 * 2 + 1
        int aNUm = 13;
//        if (aNUm % 2 == 0) {
//            System.out.println("Число парне");
//        }
        // case sensitive
        // оператори присвоєння
        int aValue = 4;
        aValue += 5; // avalue = avalue + 5
        System.out.println(aValue);
        aValue -= 2;
        System.out.println(aValue);
        aValue *= 10;
        System.out.println(aValue);
        aValue /= 2;
        System.out.println(aValue);
        // оператори порівняння
        // <, <=, >, >=, ==, != - вертають true або false
        int fistNum = 45;
        int secondNum = 47;
        boolean boolRes = fistNum != secondNum;
//        System.out.println(boolRes);
        // побітові оператори
        // & - побітове І
        // | - або побітове
        // 10
        // 2, 8, 16
        // логічні оператори
        // Логічне I
        boolean trueValue = true;
        boolean falseValue = false;
        // &&
        boolean andRes = trueValue && true;
//        System.out.println(andRes);
        // OR - ЛОГІЧНЕ АБО - ||
        boolean orRes = !(trueValue || falseValue);
        System.out.println(orRes);
        String str = "yes";
//        if (!str.isEmpty()) {
//            System.out.println(str);
//        } else {
//            System.out.println("Стрічка пуста");
//        }
        // ! - NOT - ЛОГІЧНЕ НЕ
//        System.out.println(!false);
        // інкремент
        // декремент
        int a = 10;
        //System.out.println(a);
        int incRes = 5 + (++a); // 5 + 11 = 16
//        System.out.println(incRes);
//        int incRes2 = (5 + a);  // 5 + 10
//        System.out.println(incRes2);
        System.out.println(a);
        a+= 5;
// immutable
        String str1 = "Hello";
        String str2 = "world!";
        String strNew = str1.replace('e', 'o');
        System.out.println(str1);
        System.out.println(strNew);
        System.out.println(str1.length());
        // ['H', 'e', 'l', 'l', 'o']
        System.out.println(str1.substring(1, 3));
        // [0,3) -> 0, 1, 2
        String words = "word1, word2, word3";
        String[] wArray = words.split(",");
        // trim - обрізати
//        System.out.println(str1.trim() + str2);
        String sentence = str1  + str2;
        int age = 30;
        System.out.println("Hello, I'm " + age + " years old");
        // heap - куча
        String strExample = "Hello";
        String copy = "hello";
        // strExample ---> "Word"
        // copy --->>>
        System.out.println(strExample.equalsIgnoreCase(copy));
        // String: equals
        String joinedStrings = String.join("|", "word1", "word2", "word3");
        System.out.println(joinedStrings);
        // d -digit - цифра
        // s - string
        String formattedString = String.format("Hello, I'm %d years old, and my name is %s", age, "Nastya");
        System.out.println(formattedString);
        // API - lessonone.Application Programming Interface

        StringBuilder stringBuilder = new StringBuilder();
        String strThree = stringBuilder.append("Hello ")
                .append(" world ")
                .append("I am ")
                .append(age)
                .append(" years old ")
                .toString();
        System.out.println(strThree);

        Scanner scanner = new Scanner(System.in);
        String name;
//        System.out.println("Введіть своє ім'я");
//        name = scanner.nextLine();
        Scanner fileReader = new Scanner(Path.of("/home/anastasiiakosiak/test/java-course/src/test.txt"));
//        System.out.println(fileReader.nextLine());
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }

//        System.out.println(sentence);
    }
}
// access modifer- модифікатор доступу
// public, private, protected, default