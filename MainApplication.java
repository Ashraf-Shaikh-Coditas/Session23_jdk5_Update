package Week5.Session23_jdk5Update;

class Addition {

    void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum with two arguments is :: "+sum);
    }

    void add(int num1, int num2 , int num3) {
        int sum = num1 + num2 +num3;
        System.out.println("Sum with three arguments is :: "+sum);
    }

}

class Varargs_Addition {

    void add(int... num) {
        int sum = 0;
        for(int i : num) {
            sum += i;
        }

        System.out.println("Sum is :: "+sum);
    }
}
public class MainApplication {
    public static void main(String[] args) {

        System.out.println("NORMAL METHOD CALLS ");
        Addition obj_1 = new Addition();
        obj_1.add(2,3);
        obj_1.add(2,3,4);

        System.out.println("VARARGS METHOD CALLS ");
        Varargs_Addition obj_2 = new Varargs_Addition();
        obj_2.add(2,3);
        obj_2.add(2,3,4);
        obj_2.add(10);


    }
}
/*
NORMAL METHOD CALLS
Sum with two arguments is :: 5
Sum with three arguments is :: 9

VARARGS METHOD CALLS
Sum is :: 5
Sum is :: 9
Sum is :: 10

* */