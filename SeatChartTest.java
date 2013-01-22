import java.util.Scanner;
public class SeatChartTest 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		/*
		String insufficiency; 
		int allocateSeat;
		 
		System.out.println("Are 10 seats enough for your seat-chart? Y or N");
		insufficiency = scan.nextLine();
		if(insufficiency.equalsIgnoreCase("N"))
		{
			System.out.println("How many seat do you need??");
			allocateSeat = scan.nextInt();
			SeatChart seatChart = new SeatChart(allocateSeat);
			
			
		}		
		*/
			SeatChart seatChart = new SeatChart();
		
		
		int action;
		do
		{
			System.out.println("\nwhat action do you want to take?");
			System.out.println("1:Reserve a seat \n2:Release a reserved seat");
			System.out.println("3:Get current numbers of available seat \n4:Clear all current reservation");
			System.out.println("5: Compare two SeatChart \n6:Output all current reservation");
			System.out.println("7: Exit this program");
		
			action = scan.nextInt();
			int seatNum = 0;
			switch(action)
			{
				case 1:
					System.out.println("Enter seat number you want to reserve");
					seatNum = scan.nextInt();
					seatChart.reserve(seatNum);
					break;
					
				case 2: 
					System.out.println("Enter seat number you want to release");
					seatNum = scan.nextInt();
					seatChart.release(seatNum);
					break;
				case 3:
					seatNum =  seatChart.getMax();
					System.out.printf("currently, %d seats are available", seatNum);
					break;
				case 4: 
					System.out.println("Clear All Current Reservation");
					SeatChart.clearAll(seatChart);
					System.out.println("All seats are currently available");
					break;
				case 5:
					System.out.println("Compare two seatChart");
					SeatChart seatChart2 = new SeatChart();
					if(seatChart.equals(seatChart2))
					{
						System.out.println("True");
					}
					else
					{ 
						System.out.println("false");
					}
					break;
				case 6:
					System.out.println(seatChart.toString());	
					break;
				case 7:
					System.out.println("Thanks for using it. See you again!");
					
					break;
			}
		}while (action != 7 );
		
	}//main
}//class
