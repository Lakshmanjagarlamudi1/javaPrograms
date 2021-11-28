import java.util.Scanner;

class TrainDetails {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("*************Welcome**************");
		System.out.println("Enter Train Number");
		int tNumber = s.nextInt();

		System.out.println("Enter Boarding Station");
		String fStation = s.next();
		System.out.println("Enter Your Destination");
		String tStation = s.next();
		System.out.println("Journey Date(Please enter date only)");
		int jDate = s.nextInt();
		System.out.println("Journey Type(GENERAL/TATKAL)");
		String jType = s.next();

		int tPrice = 500;
		System.out.println("********** Train details ***********");
		System.out.println("Train number is : " + tNumber);
		System.out.println("From " + fStation + " To " + tStation);
		System.out.println("Boarding time : " + jDate + "/11/2021 20:00");
		int jDate1 = jDate + 1;
		System.out.println("Arraival time : " + jDate1 + "/11/2021 02:00");
		System.out.println("Available seats are : 200");
		System.out.println(" " + jType + " type");
		System.out.println("Ticket fare : " + tPrice);
		System.out.println("Press 1 to continue booking");
		int p = s.nextInt();
		if (p == 1) {
			System.out.println("**************please enter passenger details*********************");
			System.out.println("please enter your name");
			String pName = s.next();
			System.out.println("please enter your mailid");
			String pMail = s.next();
			System.out.println("please enter your Mobile number");
			Long pMobile = s.nextLong();

			System.out.println("*************** Ticket Details ********************");

			System.out.println("PNR number is : 84569841");
			System.out.println("passenger name : " + pName);
			System.out.println("Your Mobile number is : " + pMobile);
			System.out.println("passenger mailid is: " + pMail + "@gmail.com");
			System.out.println("Boarding time : " + jDate + "/11/2021 20:00");
			System.out.println("Arraival time : " + jDate1 + "/11/2021 02:00");
			System.out.println("Tcket price is Rs: " + tPrice);
			System.out.println("Type of journey : " + jType);
			System.out.println("Your seat number is : S4 45(SW)");
			System.out.println("Thank you, Your ticket booked successfully");
			System.out.println("Have a safe Journey :)");
		} else {

			System.out.println("You have entered invalid key, Please Try again !");
		}
	}
}
