import java.util.Scanner;
public class SeatChartTest 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		 
		int allocateSeat;
		boolean fullness;
		int end = -1;
		int action;
		int seatNum = 0;
		System.out.println("How many seat do you need??");
		allocateSeat = scan.nextInt();
		SeatChart seatChart = new SeatChart(allocateSeat);
		
		
		
		do
		{
			System.out.println("\nwhat action do you want to take?");
			System.out.println("1:Reserve a seat \n2:Release a reserved seat");
			System.out.println("3:Get current numbers of available seat \n4:Clear all current reservation");
			System.out.println("5:Compare two SeatChart \n6:Output all current reservation");
			System.out.println("7:Check if there is available seats\n" +
					"Type -1 to Exit this program");
		
			action = scan.nextInt();
			
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
					
					fullness = seatChart.isFull();
					if(fullness == true)
					{
						System.out.println("Sorry, No seat available");
					}
					else
					{
						System.out.println("We still have available seats!");
					}
					System.out.println("");
					break;
				
					
				
			}
		}while (action != end);
		System.out.println("Thanks for using it. See you again!");
	}//main
}//class
