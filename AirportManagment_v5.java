import java.util.*;
class Booking
{
	String From , To , Name , PNR , DepartureTime , ArivalTime , AirlineName , FlightNo , FlightName , IdName , APNR , BoardingTime , Meal;
	int ch , nh , no , gateno , dd , mm , yy , mo , ms;
	double weight , price;
	char c;
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		Name = sc.nextLine();
		System.out.println("Enter Departure City");
		From = sc.nextLine();
		System.out.println("Enter Arival City");
		To = sc.nextLine();
		System.out.println("Enter Date");
		dd = sc.nextInt();
		System.out.println("Enter Month");
		mm = sc.nextInt();
		System.out.println("Enter Year");
		yy = sc.nextInt();
	}
	void flightOption()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Airlines You Want : 1)Indigo 2)Spicejet 3)Vistara 4)GoAir");
		System.out.println("Enter Your Choice");
		ch = sc.nextInt();
		if(ch==1||ch==2||ch==3||ch==4)
		{
			timingsOption();
		}
		else
		{
			System.out.println("Enter Valid Choice");
			flightOption();
		}
	}
	void timingsOption()
	{
		Scanner sc = new Scanner(System.in);
		if(ch==1)
		{
			System.out.println("Select Your Flight and Timings : 1)6E5011 07:45amto09:25am 2)6E323 09:25amto11:05am 3)6E2146 11:55amto01:35pm");
			nh = sc.nextInt();
			if(nh==1)
			{
				FlightName = "Indigo";
				FlightNo = "6E5011";
				DepartureTime = "07:45AM";
				ArivalTime = "09:25AM";
				BoardingTime = "07:00AM";
			}
			else if(nh==2)
			{
				FlightName = "Indigo";
				FlightNo = "6E323";
				DepartureTime = "09:25AM";
				ArivalTime = "11:05AM";
				BoardingTime = "08:40AM";
			}
			else if(nh==3)
			{
				FlightName = "Indigo";
				FlightNo = "6E2146";
				DepartureTime = "11:55AM";
				ArivalTime = "01:35PM";
				BoardingTime = "11:10AM";
			}
			else
			{
				System.out.println("Enter Valid Choice of Timings");
				timingsOption();
			}
		}
		if(ch==2)
		{
			System.out.println("Select Your Flight and Timings :1)SG8193 06:10amto07:45am 2)SG194 09:40amto11:20am");
			nh = sc.nextInt();
			if(nh==1)
			{
				FlightName = "SpiceJet";
				FlightNo = "SG8193";
				DepartureTime = "06:10AM";
				ArivalTime = "07:45AM";
				BoardingTime = "05:40AM";
			}
			else if(nh==2)
			{
				FlightName = "SpiceJet";
				FlightNo = "SG194";
				DepartureTime = "09:40AM";
				ArivalTime = "11:20AM";
				BoardingTime = "09:10AM";
			}
			else
			{
				System.out.println("Enter Valid Choice of Timings");
				timingsOption();
			}
		}
		if(ch==3)
		{
			System.out.println("Select Your Flight and Timings :1)UK926 6:45amto8:25am 2)UK946 8:40amto10:25am");
			nh = sc.nextInt();
			if(nh==1)
			{
				FlightName = "Vistara";
				FlightNo = "UK926";
				DepartureTime = "06:45AM";
				ArivalTime = "08:25AM";
				BoardingTime = "05:45AM";
			}
			else if(nh==2)
			{
				FlightName = "Vistara";
				FlightNo = "UK946";
				DepartureTime = "08:40AM";
				ArivalTime = "10:25AM";
				BoardingTime = "07:40AM";
			}
			else
			{
				System.out.println("Enter Valid Choice of Timings");
				timingsOption();
			}
		}
		if(ch==4)
		{
			System.out.println("Select Your Flight and Timings : 1)G8720 08:10amto09:45am 2)G8569 10:40am to 12:20pm");
			nh = sc.nextInt();
			if(nh==1)
			{
				FlightName = "GoAir";
				FlightNo = "G8720";
				DepartureTime = "08:10AM";
				ArivalTime = "09:45AM";
				BoardingTime = "07:30AM";
			}
			else if(nh==2)
			{
				FlightName = "GoAir";
				FlightNo = "G8569";
				DepartureTime = "10:40AM";
				ArivalTime = "12:20PM";
				BoardingTime = "10:00AM";
			}
			else
			{
				System.out.println("Enter Valid Choice of Timings");
				timingsOption();
			}
		}
	}
	void pnrGenerate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 Digit PNR Number");
		PNR = sc.nextLine();
		if(PNR.length()==6)
		{
			System.out.println("Your PNR is " +PNR);
		}
		else
		{
			pnrGenerate();
		}
	}
	void IdProofDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name as Per Id Prof");
		IdName = sc.nextLine();
	}
	void idChecking()
	{
		if(Name.equalsIgnoreCase(IdName))
		{
			System.out.println("You are Verified - Go inside - Proceed For Checkin");
			checkin();
		}
		else
		{
			System.out.println("You are not Verified. You are not Permitted to enter in the airport");
		}
	}
	void checkin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PNR");
		APNR = sc.nextLine();
		if(APNR.equals(PNR))
		{
			System.out.println("PNR Number Verified");
			lugage_checkin();
		}
		else
		{
			System.out.println("Re-Enter PNR Number");
			checkin();
		}
	}
	void lugage_checkin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Luggage Weight. If weight is more than 15KG , you have pay extra rupess @ 500/KG");
		weight = sc.nextDouble();
		if(weight<=15.0)
		{
			System.out.println("Your Luggage Weight = " +weight);
			gate_generate();
		}
		else
		{
			System.out.println("Your Luggage Weight is Overweight");
			System.out.println("You have to pay Extra Rupess " +(weight-15)*500);
			System.out.println("Your Luggage Weight = " +weight);
			gate_generate();
		}
	}
	void gate_generate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Gate Number");
		gateno = sc.nextInt();
		if(gateno>10)
		{
			System.out.println("Re-enter Gate Number");
			gate_generate();
		}
		else
		{
			seat_selection();
		}
	}
	void seat_selection()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Seat From Number 1to30 and alphabet character from AtoF");
		no = sc.nextInt();
		c = sc.next().charAt(0);
		if(no<=30 &&((c=='A')||(c=='B')||(c=='C')||(c=='D')||(c=='E')||(c=='F')))
		{
			System.out.println("Seat Number Verified");
			meal_option();
		}
		else
		{
			System.out.println("Re Enter Seat Number");
			seat_selection();
		}
	}
	void meal_option()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want meal in flight 1)Yes or 2)No");
		int mo = sc.nextInt();
		if(mo==1)
		{
			meal_selection();
		}
		else if(mo==2)
		{
			Meal = "Nil";
			boarding_pass();
		}
		else
		{
			System.out.println("Enter Valid choice for meal selection");
			meal_option();
		}
	}
	void meal_selection()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Your Meal : 1)Upma = 100RS 2)Poha = 100RS 3)Sandwich = 150RS 4)Samosa = 120RS 5)Biriyani = 120RS 6)Cookies = 100RS");
		ms = sc.nextInt();
		if(ms==1)
		{
			Meal = "Upma";
			price = 100;
			boarding_pass();
		}
		else if(ms==2)
		{
			Meal = "Poha";
			price = 100; 
			boarding_pass();
		}
		else if(ms==3)
		{
			Meal = "Sandwich";
			price = 150;
			boarding_pass();				
		}
		else if(ms==4)
		{
			Meal = "Samosa";
			price = 120;
			boarding_pass();
		}
		else if(ms==5)
		{
			Meal = "Biriyani";
			price = 120;
			boarding_pass();
		}
		else if(ms==6)
		{
			Meal = "Cookies";
			price = 100;
			boarding_pass();
		}
		else
		{
			System.out.println("Enter Proper Selection For Meal");
			meal_selection();
		}
	}
	void boarding_pass()
	{
		System.out.println("Your Boarding Pass Details : ");
		System.out.println("Flight Name = " +FlightName);
		System.out.println("Name = " +Name);
		System.out.println("Flight Number = " +FlightNo);
		System.out.println("From = " +From);
		System.out.println("To = " +To);
		System.out.println("Date = " +(dd+"/"+mm+"/"+yy));
		System.out.println("PNR Number = " +PNR);
		System.out.println("Gate Number = " +gateno);
		System.out.println("Boarding Time = " +BoardingTime);
		System.out.println("Departure Time = " +DepartureTime);
		System.out.println("Seat Number = " +(no+""+c));
		System.out.println("Special Services = " +Meal);
	}
}
class AirportManagment{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of People");
		int p = sc.nextInt();
		Booking b[] = new Booking[p];
		for(int i=0 ; i<b.length ; i++)
		{
			b[i] = new Booking();
			b[i].setData();
			b[i].flightOption();
			b[i].pnrGenerate();
			b[i].IdProofDetails();
			b[i].idChecking();
		}
	}
}