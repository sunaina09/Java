/*2. Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). 
The marks are entered by the user and the roll numbers are automatically assigned. */
import java.util.Scanner;
class StudentDetails{

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the no of Students");
int num = input.nextInt();
input.nextLine();

int sub1[] = new int[num];
int sub2[] = new int[num];
int sub3[] = new int[num];

 for (int i = 0; i < sub1.length; i++) {
 System.out.println("Please enter marks of subject 1 ");
 sub1[i] = input.nextInt();
 System.out.println("Please enter marks of subject 2 ");
 sub2[i]= input.nextInt();
 System.out.println("Please enter marks of subject 3 ");
 sub3[i]= input.nextInt();
 input.nextLine();
 int avg= (sub1[i]+sub2[i]+sub3[i])/3;
 System.out.println("Marks of the Student "+(i+1)+" for sub 1: "+sub1[i]+" for sub 2 : "+sub2[i]+" for sub 3: "+sub3[i]+ "and average is:"+ avg);
}

}


}