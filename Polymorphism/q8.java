public class q8{
    public static void main(String[] args) {
        Vehicle[] v = new Vehicle[3];
        v[0] = new Bike();
        v[1] = new Car();
        v[2] = new Vehicle();

        for(Vehicle a : v){
            a.start();
        }

        for(Vehicle a : v){
            System.out.println(a);
        }
    }
}

class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }

    @Override
    public String toString(){
        return "Vehicle is starting in toString()";
    }
}

class Car extends Vehicle{

    @Override
    void start(){
        System.out.println("Car is strating");
    }

    @Override
    public String toString(){
        return "car is starting in toString()";
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike is strating");
    }

    @Override
    public String toString(){
        return "Bike is starting in toString()";
    }
}