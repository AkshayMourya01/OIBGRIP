package numberGuessing;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Number Guessing Game\nThis game consists of three levels");
		System.out.println("Each level has 6 chances to guess the number");
		Scanner sc=new Scanner(System.in);
		Random rdm=new Random();
		int C1=6,score=0;
		System.out.println("1.Start game\n2.Exit");
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		if(choice==1)
		{
		
					for(int level=1;level<=3;level++) 
					{  
						boolean flag=false; 
						int number=rdm.nextInt(100)+1;
						System.out.println("num is" +number );
						System.out.println("You are in level:"+level);	
						
					
						
						for(int chances=1;chances<=C1;chances++)	
						  {
							System.out.println("Enter the number (1-100)");
							int usrnum=sc.nextInt();
															
							if(usrnum>number) {
								System.out.println("The number is lower than entered nummber.");
							     }
							else if(usrnum<number) {
								System.out.println("The number is greater than entered nummber.");
							     }
							else if(usrnum==number) {
								score+=10;
								System.out.println("yup,your guess was right.");
								if(level!=3)
								    {System.out.println("Hurray! You are qualified for next level");}
								else
									{System.out.println("YOU WON! CONGRATULATIONS");}
								  flag = true;    
								  break;}
						      	
			              }
					       
						if(flag) 
						  continue;
						else
					    	System.out.println("You Lost\nPlay from beginning");
						break;
							
			        }
			
              }
		
		System.out.println("Your score is:"+score+"/30");
		
		sc.close();
		
		
		
		
     }
	
	
}
