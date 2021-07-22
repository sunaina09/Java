/* 3. Write a program to calculate the average height of all the students of a class. 
The number of students and their heights are entered by the user. */

import java.util.Scanner;
class StudentHeight{

public static void main(String[] args) {
Scanner input = new Scanner(System.in);System.out.println("Enter the no of students of a class");
int num = input.nextInt();
input.nextLine();

double height[] = new double[num];
double ht=0;
        
for (int i = 0; i < height.length; i++) {
  System.out.println("Please enter height of Student "+ (i+1));
  height[i]= input.nextDouble();
  input.nextLine();
  ht= ht+height[i];
}
double avg=ht/num;
 System.out.println("The average height of all the students is: "+avg);
}

}