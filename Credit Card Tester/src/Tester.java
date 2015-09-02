import java.util.Scanner;

public class Tester
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please enter a 16 digit number");
				long cardNumber = userInput.nextLong();
				
				long myArray[] = new long [16];
				
				for (int a=16; a>0; a--)
					{
						myArray[a-1] = cardNumber%10;
						cardNumber = cardNumber/10;
						
					}
				
				long convert = 0;
				for (int b = 0; b<16; b=b+2)
					{
						if ( myArray [b]<5) 
							myArray[b]*=2;
						else
							{
								convert = myArray[b];
								convert*=2;
								convert = (convert%10)+(convert/10);
								myArray[b]=convert;			
							}
							
					}
				long total = 0;
				for (int c = 0; c<16; c++)
					{
						total+= myArray[c];
					}
				if (total%10 == 0)
					System.out.println("This credit card number is potentially valid!");
				else
					System.out.println("This credit card number is not even potentially valid.");
				
				userInput.close();

			}

	}
