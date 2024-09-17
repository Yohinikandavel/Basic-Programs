
import java.util.Scanner;
public class Snacks
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of pizzas bought: ");
		int pizzas=sc.nextInt();
		System.out.println("Enter the no. of puffs bought: ");
		int puffs=sc.nextInt();
		System.out.println("Enter the no. of drinks bought: ");
		int drinks=sc.nextInt();
		System.out.println("No. of pizzas : "+pizzas);
		System.out.println("No. of puffs : "+puffs);
		System.out.println("No. of drinks : "+drinks);
		int total=((pizzas*100)+(puffs*20)+(drinks*10));
		System.out.println("Total price = "+total);
	}
}

/*Problem Statement – Vohra went to a movie with his friends in a Wave theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices : 
Rs.100/pizza
Rs.20/puffs
Rs.10/cooldrink
Generate a bill for What Vohra has bought.
Sample Input 1:
Enter the no of pizzas bought:10
Enter the no of puffs bought:12
Enter the no of cool drinks bought:5
Sample Output 1:
Bill Details
No of pizzas:10
No of puffs:12
No of cooldrinks:5
Total price=1290
*/