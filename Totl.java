class Totl{
//30. Write a program in java to compute the total and average of four numbers.   

 public static void main(String []args){
   	double Array[] = { 25, 20, 15, 25 };
	double size = Array.length;
	double total = 0;
	for (int i = 0; i < size; i++) {
		total += Array[i];
	} 
	double avg = total / size;
	System.out.println("The total of four numbers is : "+total);
        System.out.println("The average of four numbers is : "+avg);
 }
}