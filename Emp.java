//1. Write a program to print the name, salary and date of joining of 10 employees in a company. Use array of objects.

import java.util.Scanner;
class Emp{

public static void main(String[]args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter the no of Employee");
int num = input.nextInt();
input.nextLine();

String name[] = new String[num];
int Salary[] = new int[num];
String doj[] = new String[num];
        
for (int i = 0; i < name.length; i++) {
System.out.println("Please enter name of employee "+ (i+1));
name[i] = input.nextLine();
System.out.println("Please enter salary of employee "+ (i+1));
Salary[i]= input.nextInt();
System.out.println("Please enter date of joining of employee "+ (i+1));
doj[i]= input.next();
input.nextLine();
System.out.println("Name of the employee "+(i+1)+" is "+name[i]+" Salary : "+Salary[i]+" Date of joining : "+doj[i]);
}

}
}