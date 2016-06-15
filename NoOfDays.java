import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a month no. :");
		Scanner sc = new Scanner(System.in);
		int months=sc.nextInt();
		int year=2016;
		int numDays=0;
		
		switch(months) {
		
		
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays=31;
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			numDays=30;
		case 2:
			if((year%4==0)&& !(year%100==0)
				|| (year%400==0))
			{
				numDays=29;
			}
			  else
                  numDays = 28;
              break;
          default:
              System.out.println("Invalid month.");
              break;
				
		}
	
			System.out.println("No of Days = " + numDays);
		
		
		
		

	}

}
