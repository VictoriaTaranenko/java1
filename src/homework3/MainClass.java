package homework3;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        guessedNumber();
        questionWords();

    }

    public static void guessedNumber() {
        System.out.println("Угадайте число от 0 до 9");
        int hiddenNumber = random.nextInt(10);
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            if (a == hiddenNumber) {
                System.out.println(" Вы угадали!");
                break;
            } else if (a < hiddenNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }

    }

    public static void questionWords() {
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                       "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                       "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    String question = words[random.nextInt(words.length)];
    while(true) {
        System.out.println("Попробуйте угадать слово");
        String answer = sc.next();
        if(question.equals(answer)) {
            System.out.println("Вы победили");
            break;
        } else {
            for (int i = 0; i < 15; i++) {
                if(i < answer.length() && i < question.length() && question.charAt(i) == answer.charAt(i)) {
                    System.out.print(question.charAt(i));
                } else {
                    System.out.print('#');
                }
            }
            System.out.println();
        }
    }
    }


}
