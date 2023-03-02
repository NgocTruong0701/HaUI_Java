/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_oop;

/**
 *
 * @author ngoct
 */
class Person{
    private String maP;
    private String tenP;
    private int age;
    
    Person(String maP, String tenP, int age){
        this.maP = maP;
        this.tenP = tenP;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Ma: "+maP + "\tTen: "+tenP+"\tTuoi: " + age;
    }
}

class Employee extends Person{
    private float salary;
    
    Employee(String maP, String tenP, int age, float salary){
        super(maP, tenP, age);
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\tLuong: " + salary;
    }
}

class Manager extends Employee{
    private float phuCap;
    
    public Manager(String maP, String tenP, int age, float salary, float phuCap){
        super(maP, tenP, age, salary);
        this.phuCap = phuCap;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\tPhu cap: " + phuCap;
    }
}

class main{
    public static void main(String[] args) {
        Person p = new Person("P01", "Hoa", 20);
        Employee e = new Employee("P02", "Hoang", 20, 200000);
        Manager m = new Manager("P03", "Truong", 21, 300000, 200000);
        
        System.out.println(p.toString());
        System.out.println(e.toString());
        System.out.println(m.toString());
    }
    
    
}
