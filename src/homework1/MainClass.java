package homework1;

public class MainClass {
    public static void main(String[] args) {
        typesDouble();
        System.out.println(calculate(2,3,4,2));
        System.out.println(twoNumber(7,3));
        integerNumber(-1);
        System.out.println(negativeNumber(9));
        name("Вика");
        leapYear(2000);
    }


    public static void typesDouble() {
        byte  b = 126;
        short sh = 32767;
        int a = 325468423;
        long l = 325649879313165L;
        float f = 23.2562365f;
        double d = 12.9832689654659863;
        char c = 'a';
        boolean  bool = false;
        System.out.println("Примитивные типы данных: " + " byte = " + b + ", " + " short = " + sh + " , " +
                " int = " + a + ", " + "long = " + l + ", " + "float = " + f + ", " + "double = " + d + ", " +
                "char = " + c + ", " + "boolean = " + bool);
    }

    public static int  calculate (int a, int b, int c, int d) {
        int res = a * (b + (c / d));
        return res;
    }

    public static boolean twoNumber(int a, int b){
        int sum = a + b;
        if(sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void integerNumber(int a){
        if(a >= 0) {
            System.out.println(" положительное");
        } else {
            System.out.println(" отрицательное");
        }
    }

    public static boolean negativeNumber(int a) {
        if( a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void name(String name) {
        System.out.println(" Привет, " + name + "!");
    }

    public static void leapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
            System.out.println(" Высокосный");
        } else {
            System.out.println(" Не высокосный");
        }
    }
}
