package projects;

import java.util.ArrayList;
import java.util.Scanner;

class Students{
    String Name;
    int Roll_no;
    String course;
    Students(String name, int roll, String course){
        this.Name = name;
        this.Roll_no = roll;
        this.course = course;
    }
}

public class studentsManagement {
    static ArrayList<Students> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent(){
        String name = sc.next();
        int roll = sc.nextInt();
        String course = sc.next();
        Students s = new Students(name, roll, course);
        list.add(s);
    }

    
   static void edit(){
        int roll = sc.nextInt();
        boolean found = false;
        for(Students s : list){
            if(s.Roll_no == roll){
                String course = sc.next();
                s.course = course; 
                System.out.println("Done Edition");
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("Not found");
            }
    }

    static void delete(){
        int roll = sc.nextInt();
        boolean found  = false; 
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).Roll_no == roll){
                list.remove(i);
                System.out.println(list);
                System.out.println("done deletion");
                found = true;
                break;
            }
        }
        if(!found){
                System.out.println("Not found");
            }
    }

    static void display(){
        if(list.isEmpty()){
            System.out.println("No data found");
            return;
        }
        for(Students s : list){
            System.out.println("Name: "+s.Name+" "+"Roll No: "+s.Roll_no+" "+"Course: "+s.course);
        }
    }

    public static void main(String[] args) {
        
        while(true){
            int data = sc.nextInt();
            switch(data){
                case 1:
                    addStudent();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}