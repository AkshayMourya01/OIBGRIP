import java.util.Scanner;
public class atminterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int pin = 2000;
		    String usrName="AMBCC";
	        boolean bool = true;
	        int option;
	        long balanceRem = 1000000;
	        long withdrawAmt= 0;
	        long depositAmt = 0;
	        long transferAmt = 0;
	        long temp; 
	        System.out.println("Welcome to AB Banking Services");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter correct credentials else your account will be blocked.");
	        System.out.println("Enter Valid User Name");
	        String usrName1=sc.nextLine();
	        if(usrName.equals(usrName1)) {
	         System.out.print("Enter 4 Digit Pin Code: ");
	         int pin1=sc.nextInt();
	         if(pin==pin1) {
	        	 while(bool) {
	        		 System.out.println("Select a option");
	                 System.out.println(" 1.Withdraw\n 2.Deposit\n 3.Transfer\n 4.Transaction History\n 5.EXIT");
	                 option = sc.nextInt();
	                 switch(option)
	                 {
	                    
	                     case 1 :
	                     System.out.print("Enter the withdrawl amount:");
	                     temp = sc.nextInt();
	                     if(temp>balanceRem)
	                     {
	                         System.out.println("Insufficient Balance");
	                     }
	                     else{
	                         withdrawAmt += temp; 
	                         balanceRem -= temp;
	                         System.out.println("COLLECT CASH");
	                         System.out.println(balanceRem + " is remanining balance in your account ");

	                     }
	                     break;

	                     case 2:
	                     System.out.print("Enter the Deposit Amount:");
	                     temp = sc.nextInt();
	                     System.out.println("PLACE CASH CAREFULLY IN THE CASH DEPOSIT SLOT");
	                     depositAmt += temp;
	                     balanceRem += temp;
	                     System.out.println("Current Balance: " + balanceRem);
	                     break;

	                     case 3:
		                     while(true)
		                     {
		                     System.out.println("Enter the account number of the beneficiary");
		                     int accNo = sc.nextInt(); 
		                     System.out.println("Enter the IFSC code of the bank of the beneficiary"); 
		                     String ifscCode = sc.next(); 
		                     System.out.println(accNo);
		                     System.out.println("Please confirm the account number of the beneficiary:"+accNo);
		                     System.out.println("1. Yes\n 2. No");  
		                     int select= sc.nextInt(); 
		                     if(select == 1)
		                       {   System.out.println("Enter Amount");
		                         temp = sc.nextInt();
		                         transferAmt += temp;
		                         balanceRem -= temp;
		                         System.out.println("Fund transferred successfully");  
		        		    	}
		                     break;
		                    
		                     }
	                     break;
	                     
	                    
	                     case 4: 
		                     System.out.println(" HISTORY ");
		                     long rem=balanceRem;
		                     System.out.println("Current Balance:" + rem);
		                     System.out.println("Deposited amount:"+depositAmt);
		                     System.out.println("Withdrawl amount:"+withdrawAmt);
		                     System.out.println("Transferred  amount:"+transferAmt);
		                     break;
		                    
	                  case 5:
	                     System.out.println(" -----THANK YOU FOR BANKING WITH US----- ");
	                     bool = false;
	                     break;
	        	 }}
	     
	}
	          
		        else
		        {
		        	System.out.println("Incorrect PIN!");
		        }
		       
		       

}
	        else
	        {
	        	System.out.println("Ivalid User Name \nTry again later");
	        }
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
