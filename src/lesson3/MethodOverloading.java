package lesson3;

public class MethodOverloading {
    public static void main(String[] args) {
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    // если хотим складывать неограниченное количество
    public static int add(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

}
