class EnggClg{

   void StudentDetails(){
     int rollNumber=10;
     final double POINTER_CGPA=9.14;
     String studentName= "Tom Jerry";
     System.out.println("Student Name: "+studentName+ "\nRoll Number: "+ rollNumber+ "\nPercentage: "+POINTER_CGPA);    
   }

   public static void main(String []args){
        EnggClg ec=new EnggClg();   
        ec.StudentDetails();
   }
}