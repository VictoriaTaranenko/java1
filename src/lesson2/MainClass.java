package lesson2;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
   printJavaManyTimes();
   printJavaManyTimes1(12);
   printWordManyTimes("Core", 5);

    }

    public static void printJavaManyTimes() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java");
        }
    }
    // for(int i = 0; i < 5; i += 2)
    // for(int i = 1; i < 15; i += 2)
    // for(int i = 20; i > 5; i--)

    public static void printJavaManyTimes1(int times) {
        for( int i = 0; i < times; i++) {
            System.out.println("Java");
        }
    }

    public static void printWordManyTimes(String word, int times) {
        for( int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void cycles() {
        // вложенные циклы
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
            }
        }

        // создаем поле
        int size = 3;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // неопред циклы
        int a  = 143;
        System.out.println(a);
        while( a < 10000) {
            a = a + 10 * a / 3 + 1221;
            System.out.println(a);
        }

        ///////////////
        int currentTemp = 20;
        int targetTemp = 24;
        while(currentTemp < targetTemp) {
            currentTemp++;
            System.out.println(currentTemp);
        }
        ////////
        for(int i = 0; i < 20; i++) {
            if( i > 2 && i < 5){
                continue;
            }
            System.out.print(i + " ");
        }

        ////////
        for(int i = 0; i < 20; i++) {
            if( i > 2 && i < 5){
                break;
            }
            System.out.print(i + " ");
        }

        ////////
        int z = 1;
        if(z == 1) {
            System.out.println("один");
        } else if (z == 2) {
            System.out.println("два");
        } else if (z == 3) {
            System.out.println("три");
        } else {
            System.out.println(" Ну и ладно");
        }
        // аналогия :
        switch(z) {
            case 1:
                System.out.println("один");
                break;
            case 2:
                System.out.println("два");
                break;
            case 3:
                System.out.println("три");
                break;
            default:
                System.out.println(" Ну и ладно");
        }


    }

    public static void arrays() {
        // Тип_данных [] название = new тип_данных[10];
        int[] arr = new int[10];
        arr[0] = 10;
        arr[9] = 20;
        System.out.println(arr[0]);
        System.out.println(arr[9]);
        System.out.println(Arrays.toString(arr));

        int[] br;
        br = new int[10]; // int [] br = new int [10];
        int[] a = {7, 16, 22, 9};
        // спросить длину массива
        System.out.println(a.length);

        int[] c = new int[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        System.out.println(Arrays.toString(c));


        int[] v = {6, 3, 7, 1, 2, 5, 1};
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " ");
        }

        // хотим пройтись по четным
        int[] s = {6, 3, 7, 1, 2, 5, 1};
        for (int i = 0; i < s.length; i += 2) {
            System.out.println(s[i] + " ");
        }
        // шагем влево for(int i = s.length - 1; i >= 0; i--)

        int[] n = {6, 3, 7, 1, 2, 5, 1};
        for (int i = 0; i < n.length; i++) {
            n[i] += 2;
        }
        System.out.println(Arrays.toString(n));

        int[] x = {6, 3, 7, 1, 2, 5, 1};
        method(x);
        System.out.println(Arrays.toString(x));
        //////////
    }

        public static void method (int [] w) {
            for( int i = 0; i < w.length; i++) {
                w[i] = 0;
        }

            int [][] arr = new int [5][5];
            arr[1][1] = 10;
            System.out.println(Arrays.deepToString(arr));

            ////

            int [][] wz = {{1,2,3}, {4,5,6}, {7,8,9}};
            // for-each
            int [] jhg = {1,2,3,4,5};
            for(int o : jhg) {
                System.out.println(jhg);
            }

            int [][] vcx = new int [5][5];
            for(int i = 0; i <  5; i++) {
                for(int j = 0; j < 5; j++) {
                    System.out.println(vcx[i][j]);
                }
            }





















    }


}
