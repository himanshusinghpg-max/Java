 import java.util.Scanner;


class Person {
    String name;
    int age;
    float salary;

    Person(String name,int age,float salary) throws java.lang.Exception {

        if(name.length()>=20){
            throw new java.lang.Exception ("name length should not be greater than 20");          // throw used inside constructor to manually create exception 
        }

        if(age < 18) {
            throw new java.lang.Exception ("age must be greater than 18");
    
        }
        if(salary < 100000){
            throw new java.lang.Exception ("salary must be greater than one lakh");
        }

        this.name = name;
        this.age = age;
        this.salary = salary;

        System.out.println("data inserted successfully");

    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
        System.out.println("salary : " + salary);
    }
}
public class Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {                            
            Person p = new Person("yash",17,110000);
            p.display();
        }
        catch (java.lang.Exception e) {
            System.out.println("Error : " + e.getMessage());   
        }

    }
}