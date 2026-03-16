//All methods in one

import java.util.Objects;

public class q6{
    public static void main(String[] args) {
        Person p1 = new Person(383, "Kirat");
        Person p2 = new Person(383, "Kirat");
        Person p3 = new Person(384, "Kiratbir Singh");
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}

class Person{
    String name;
    int id;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "Name: "+ name + "Id: "+ id;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Person p = (Person) obj;
        return (id == p.id) && name.equals(p.name);
    }

    public int hashCode(){
        return Objects.hash(id, name);
    }
}