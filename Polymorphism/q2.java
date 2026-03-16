// Create a class hierarchy:
// Shape → method area()
// Circle, Rectangle override area()

public class q2{
    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.area();

        s = new Circle(4);
        s.area();

        s = new Rectangle(2, 5);
        s.area();

    }
}

class Shape{
    void area(){
        System.out.println("In shape class");
    }
}

class Circle extends Shape{
    int r;
    Circle(int r){
        this.r = r;
    }

    @Override
    void area(){
        System.out.println(3.14*r*r);
    }
}

class Rectangle extends Shape{
    int l,b;
    Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    @Override
    void area(){
        System.out.println(l*b);
    }
}