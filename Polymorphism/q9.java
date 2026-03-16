import java.util.*;
public class q9{
    public static void main(String[] args) {
Employee e1 = new Employee(101, "Aman");
Employee e2 = new Employee(101, "Aman1");
Employee e3 = new Employee(102, "Rahul");

System.out.println(e1.equals(e2));
System.out.println(e1.hashCode());
System.out.println(e2.hashCode());
System.out.println(e3.hashCode());
HashSet<Employee> set = new HashSet<>();
set.add(e1);
set.add(e2);
set.add(e3);
System.out.println(set.size());
    }
}

class Employee{
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Employee e = (Employee) obj;
        return id == e.id;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}