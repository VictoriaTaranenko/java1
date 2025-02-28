package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        char[][] map = new char[5][5];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = '*';
            }
        }
        for (int i = 0; i < map[0].length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.printf("%2d ", i + 1);
            for (int j = 0; j < map[0].length; j++) {
                System.out.printf("%2c ", map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
