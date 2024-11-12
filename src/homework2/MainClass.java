package homework2;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
       // Number();
        //Numb();
        NumbersLessThanSix();
    }

    public static void Number() {
        int[] numb = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(numb));
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] == 0) {
                numb[i] = 1;
            } else if (numb[i] == 1) {
                numb[i] = 0;
            }

        }
        System.out.println(Arrays.toString(numb));
    }

    public static void Numb() {
        int [] numbers = new int [8];
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            //numbers[i] = i * 3;
            numbers[i] = i;

        }
        System.out.println(Arrays.toString(numbers));
    }


    public static void NumbersLessThanSix() {
        int[] numbSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(numbSix));
        for (int i = 0; i < numbSix.length; i++) {
            if (numbSix[i] > 6) {
                numbSix[i] *= 2;
            }

        }
        System.out.println(Arrays.toString(numbSix));
    }








}
