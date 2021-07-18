
/*10. A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a function 'getBalance' which returns 0. 
Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a function with the same 
name 'getBalance' which returns the amount deposited in that particular bank. 
Call the function 'getBalance' by the object of each of the three banks. */

 class Bank{
	public int getBalance(int money) {
	return 0;	
	}
}	
 class BankA extends Bank {
	public int getBalance(int money) {
	System.out.println("amount deposited in bank A: "+ money); 	
	return money;
        }
}

class BankB extends Bank {
	public int getBalance(int money) {
	System.out.println("amount deposited in bank B: "+ money);
	return money;
        }
}

class BankC extends Bank {
	public int getBalance(int money) {
	System.out.println("amount deposited in bank C: "+ money);	
        return money;
	}
}

class deposite{
        public static void main(String[] args){
        BankA a= new BankA();
        a.getBalance(1000);
	BankB b= new BankB();
        b.getBalance(1500);
	BankC c= new BankC();
        c.getBalance(2000);
        
        
       }
}

