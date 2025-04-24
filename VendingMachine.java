package wendingMachine;
import java.util.Scanner;
public class VendingMachine {

	public Beverage pressButton() {
		System.out.println("Choose the beverages : 1.Coffee  2.Juice  3.Wine");
		Scanner sc =new Scanner(System.in);
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("You choose Coffee");
			System.out.println("Select the flavour of cofee : 1.Choclate  2.Vanilla  3.Hot Choclate  4.Capechino");
			int flavour=sc.nextInt();
			if(flavour==1) {
				System.out.println("You choose Choclate");
				return new Coffee();
			}
			else if(flavour==2) {
				System.out.println("You choose Vanila ");
				return new Coffee();
			}
			else if(flavour==3) {
				System.out.println("You choose Hot Choclate");
				return new Coffee();
			}
			else {
				System.out.println("You choose Capechino");
				return new Coffee();
			}
		}
		else if(option==2) {
			System.out.println("You choose Juice");
			System.out.println("select the variant  of juice : 1.Mango  2.Pomegranate  3.Papaya  4.Coke");
			int variant=sc.nextInt();		
			if(variant==1) {
				System.out.println("You choose Mango");
				return new Juice();
			}
			else if(variant==2) {
				System.out.println("You choose Pomegranate");
				return new Juice();
			}
			else if(variant==3) {
				System.out.println("You choose Papaya");
				return new Juice();
			}
			else {
				System.out.println("You choose Coke");
				return new Juice();
			}
		}
		else {
			System.out.println("You choose Wine");
			System.out.println("select variant of wine : 1.Old Monk  2.Mr.Dovells  3.Cherry");
			int var=sc.nextInt();
			if(var==1) {
				System.out.println("You choose Old Monk");
				return new Wine();
			}
			else if(var==2) {
				System.out.println("You choose Mr. Dovells");
				return new Wine();
			}
			else {
				System.out.println("You choose Cherry");
				return new Wine();
			}
		}
	}
}
