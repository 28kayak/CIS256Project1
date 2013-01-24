
public class SeatChart 
{
	private boolean seat[];
	public SeatChart()
	{
		seat = new boolean [10];
		for(int index = 0; index < seat.length; index++)
		{
			seat[index] = false; 
		}
	}
	public SeatChart(int max)
	{
		if(max >= 1)
		{	
			seat = new boolean[max];
			for(int index = 0; index < seat.length; index++)
			{
				seat[index] = false;
			}
		}
		else
		{
			System.out.println("seat number must be bigger than 1");
			
		}
		
		
	}
	public void reserve(int num)
	{
		if(num >= 0 && num < seat.length && !seat[num])
		{
			seat[num] = true;
			System.out.println("valid seat number.");
		}
		else
		{
			System.out.println("already reserved or invalid number");
		}
	}
	public void release(int num)
	{
		if(num >= 0 && num < seat.length)
		{
			seat[num] = false;
			System.out.println("valid seat number.");
		}	
		else
		{
			System.out.println("invalid seat number.");
		}
		
	}
	public boolean available(int num)
	{
		boolean availablity = false;
		try
		{
			if(!seat[num])//= if seat is false, then condition will be true
				availablity = true;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Error:" + ex);
			availablity = false;
		}
		return availablity;
	}
	public boolean isFull()
	{
		boolean full = false;
		for(int index =0; index < seat.length; index++)
		{
			if(seat[index] == true)
			{
				full = true;
			}
			else
			{
				full = false;
				return full;
			}
			
		}
		
		return full;
	}
	public int getMax()
	{
		/*int availableSeat = 0;
		for(int index = 0; index < seat.length ; index++)
		{
			if(!seat[index])
			{
				//if seat has false then condition will be true;
				availableSeat += 1;
			}
		}
		*/
		return seat.length;
		
	}
	public int numTaken()
	{
		int unavailableSeat = 0;
		for(int index = 0; index < seat.length ; index++)
		{
			if(seat[index] == true)
			{
				unavailableSeat += 1;
			}
			
		}
		
		return unavailableSeat;
		
		
	}
	public static void clearAll(SeatChart aChart)
	{
		for(int index = 0; index <  aChart.seat.length ; index++)
		{
			aChart.seat[index] = false;	
		}
	}
	public boolean validSeat(int num)
	{
		boolean validity = false;
		if(num >= 0 && num < seat.length)
		{
			validity = true;
		}
		else 
		{
			validity = false;
		}
		
		return validity;
	}
	
	@Override 
	public boolean equals(Object obj)//test each conditions work well
	{
		//boolean equals = false; 
		if(this.getClass()==obj.getClass())//determine whether the type is same or not.
		{
			if(this.seat.length ==((SeatChart)obj).seat.length )  
			{// because after determining, we can use cast here(we know it is similer data type)
				for(int index =0; index < seat.length; index++)
				{
					if(seat[index] != ((SeatChart)obj).seat[index])
					{
						System.out.printf("num %d seat does not much.", index);
						return false;
					}
				}
				System.out.println("both are same seat chart");
				return true;
			}
		}
		
		return false;
		
		
	}
	@Override 
	public String toString()
	{
		String message;
		 message = this.numTaken() + "seats are already reserved";
		 return message; 
	}
	public SeatChart clone()
	{
		SeatChart cloneChart = new SeatChart(this.seat.length);
		for(int index =0; index < this.seat.length ; index++)
		{
			cloneChart.seat[index] = this.seat[index];
		}
		return cloneChart;
		
	}
}//class
