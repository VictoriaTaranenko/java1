package lesson1;

public class Main {
    public static void main(String[] args) {
//     printHelloWorld2Times();
//        System.out.println("__________________");
//        printHelloWorld2Times();
//        System.out.println("__________________");
//        printHelloWorld2Times();
// addTwoVariablesPrint();
// addTwoVariablesOptionsPrint(23,56);


        int requiredTemp = 22;
        int currentTemp = 22;
        if(currentTemp > requiredTemp) {
            System.out.println(" Охлаждение");
        }
        if(currentTemp < requiredTemp) {
            System.out.println(" Нагрев");
        }
        if(currentTemp == requiredTemp) {
            System.out.println("Все и так хорошо");
        }

        int minTemp = 22;
        int maxTemp = 28;
        int currentTem = 25;
        if(currentTem >= minTemp && currentTem <= maxTemp) {
            System.out.println(" Все ОК!");
        } else {
            System.out.println(" Все плохо");
        }

        int time = 11;
        if(time < 10 || time > 16) {
            System.out.println(" Мне подходит");
        } else {
            System.out.println(" Мне не подходит");
        }


        int times = 19;
        if((times >= 8 && times <= 10) || (times >= 16 && times <= 18)) {
            System.out.println(" Мне подходит");
        } else {
            System.out.println(" Мне не подходит");
        }

        System.out.println(isNumberBiggerThan10(5));

    }

    public static void method1() {
        System.out.println(" Hello World!!!");
        int a = 10;
        int b = 20;
        int c;
        c = a + b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        int a1 = 12;
        int b1 = 87;
        int c1 = a1 + b1;
        System.out.println("c = a + b = " + a1 + " + " + b1 + " = " + c1);
    }

    public static void printHelloWorld2Times() {
        System.out.println(" Hello World");
        System.out.println(" Hello World");
    }
    public static void addTwoVariablesPrint() {
        int a = 10;
        int b = 5;
        int res = a + b;
        System.out.println("result = " + a + " + " + b + " = "+ res);
        abc();
    }

    public static void abc() {
        System.out.println("abc");
    }

    public static void addTwoVariablesOptionsPrint(int a, int b) {
        int res = a + b;
        System.out.println("result = " + a + " + " + b + " = "+ res);
    }

    public static boolean isNumberBiggerThan10( int n) { // return n > 10
        if(n > 10) {
            return true;
        } else {
            return false;
        }
    }
}
