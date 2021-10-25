package com.calculate.ticketFare;

import java.util.ArrayList;

public class TaxiSystemMain 

{

	static ArrayList<TaxiTicketRoute> routeInfo=new ArrayList<TaxiTicketRoute>();
	
	
	public static void main(String[] args) {
		
		routeInfo.add(new TaxiTicketRoute("PUNE","MUMBAI",120));
		routeInfo.add(new TaxiTicketRoute("PUNE","NASHIK",200));
		routeInfo.add(new TaxiTicketRoute("MUMBAI","GOA",350));
		routeInfo.add(new TaxiTicketRoute("MUMBAI","NASHIK",180));
		
		
		//Calculate taxi ticket fare
		
		//pass from and To distination,No of travellers
		calculateTicketFare("PUNE","NASHIK",2);
		
	}


	private static void calculateTicketFare(String source, String destintion, int travellers) {
		// TODO Auto-generated method stub
		
		int distance=0;
		for(TaxiTicketRoute t:routeInfo)
		{
			if(t.getFrom().equalsIgnoreCase(source) && t.getTo().equalsIgnoreCase(destintion))
			{
				distance=t.getDistance();
				System.out.println("Source : "+source+" Destination: "+destintion+" distance: ");
				break;
			}
		}
		
		
		int ticketFare=calculateTicketAsperNoofTravellers(travellers,distance);
		
		System.out.println("Taxi Ticket");
		System.out.println("----------------------------------");
		System.out.print("Source: "+source+"\nDesitination: "+destintion+"\nKms: "+distance+"\nNo. of Travellers: "+travellers+"\nTotal= "+ticketFare);
		
	}


	private static int calculateTicketAsperNoofTravellers(int travellers, int distance) {
		// TODO Auto-generated method stub
		int perticket=0;
		if(distance>100)
		{
		 perticket=((distance-100)*5)+750;
		
		}
		
		return perticket*travellers;
		
		 
	}
	
}
