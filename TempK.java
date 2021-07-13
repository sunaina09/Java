class TempK{
//26. Write a program in java to convert temperature in Fahrenheit to Kelvin.   

 public static void main(String []args){
  double tempF=80.33, tempK=((5.0/9)*(tempF-32)+273.15);
  System.out.println("The temperature in Fahrenheit :"+tempF);
  System.out.println("The temperature in Kelvin : "+tempK);
 }
}