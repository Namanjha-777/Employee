import java.util.*;
class Employee{
    String pan,name;
    double tax_income,tax;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        name =sc.nextLine();
        System.out.println("enter your pan");
        pan =sc.nextLine();
        System.out.println("enter your taxable income");
        tax_income =sc.nextDouble();
    }void calc(){
        if(tax_income<=100000){
            tax =0;
        }else if(tax_income<=150000){
            tax = 10/100.0*(tax_income-100000);
        }else if(tax_income<=250000){
            tax = 5000+20/100.0*(tax_income-150000);
        }else{
            tax = 25000+30/100.0*(tax_income-250000);
        }
    }void display(){
        System.out.println("Pan number = "+pan);
        System.out.println("Name = "+name);
        System.out.println("Tax-income ="+tax_income);
        System.out.println("Tax ="+tax);
    }
    public static void main(String[]args){
        Employee ob = new Employee();
        ob.input();
        ob.calc();
        ob.display();
    }
}