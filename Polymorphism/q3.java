// Create class Student with:
// id, name
// Override toString() to print
public class q3{
    public static void main(String[] args) {
        Student s = new Student(11, "Kiratbir Singh");
        System.out.println(s.toString());
    }
}

class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "id: "+ id + " Name: " + name;
    }
}