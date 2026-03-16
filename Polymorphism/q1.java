// Create a class Calculator with overloaded methods:
// add(int a, int b)
// add(double a, double b)
// add(int a, int b, int c)

public class q1{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 4));
        System.out.println(c.add(19.4, 33.8));
        System.out.println(c.add(10,20, 30));
    }
}

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}