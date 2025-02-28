package lesson3;


import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {


    }

    public static void abc() {
        // тернарный оператор
        int a = 10;
        boolean b = a < 0 ? true : false;
        // второй вариант
        boolean c = false;
        if (a < 0) {
            c = true;
        } else {
            c = false;
        }

        // чтобы общаться с пользователем
        //Scanner sc = new Scanner(System.in); // ввод с клавиатуры
        System.out.println("Введите любое число ");
        int d = sc.nextInt(); // ждем пока введем число
        System.out.println("Вы ввели : " + d);
        //
        System.out.println("Введите два любых числа ");
        int v = sc.nextInt();
        int x = sc.nextInt();
        System.out.println("Вы ввели: " + v + "&" + x);

    }

    public static int getNumber(int min, int max) {
        // System.out.println("Введите число впределах [ " + min + ", " + max + " ]");
        // int n = 0;
        // do {
        //   n = sc.nextInt();
        //} while( n < min || n > max);
        // return n;

        // второй вариант
        System.out.println("Введите число впределах [ " + min + ", " + max + " ]");
        int n = 0;
        while (true) {
            n = sc.nextInt();
            if (n >= min && n <= max) {
                break;
            } else {
                System.out.println("Введено некорректное значение. Повторите попытку.");
            }
        }
        return n;
    }

    // случайное число
    int a = (int) (Math.random() * 101);

    public static void randomNumber() {
        //String[] str = {"A", "B", "C", "D"};
        //System.out.println(str[random.nextInt(str.length)]);
        //
        String[] str = {"A", "B", "C", "D"};
        int index = random.nextInt(str.length);
        System.out.println(str[index]);

        // сравниваем строки
        String a = "apple";
        String b = sc.next();
        if (a.equals(b)) {
            System.out.println("true");
        }
    }




















}
