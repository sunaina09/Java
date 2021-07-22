/* 5. Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family  */

class directory{
 public static void main(String []args){
 String name[]={"Abc","Bcd","Cde","Def","Efg"};
 String address[]={"Pune    ","Mumbai  ","Banglore","Chennai ","Kolkata "};
 int telephone[]={134,859,457,632,951};
 int mobile[]={4579,3625,9865,1596,3245};
 String familyHead[]={"jkl","tuv","pqr","abc","xyz"};

 System.out.println("Name   address   phone   mobile   familyHead");
 for (int i=0;i<name.length;i++){
     System.out.println(name[i]+"    "+address[i]+"    "+telephone[i]+"    "+mobile[i]+"    "+familyHead[i]);
 }

}
}
