class TemF{
//24. Write a program in java to convert temperature in Kelvin to Fahrenheit.   

 public static void main(String []args){
   double tempK=300, tempF=((9.0/5)*(tempK-273.15)+32);
   System.out.println("The temperature in Kelvin :"+tempK);
   System.out.println("The temperature in Fahrenheit : "+tempF);
 }
}