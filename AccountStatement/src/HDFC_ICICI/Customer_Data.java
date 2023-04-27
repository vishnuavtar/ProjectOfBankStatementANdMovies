package HDFC_ICICI;

import java.util.Scanner;

public class Customer_Data implements HDFC_Bank, ICICI_Bank {

	public static int ida;
	public static int id[] = new int[10];
	public static String cname[] = new String[10];
	public static int amount[] = new int[10];
	public static String address[] = new String[10];;
	public static int hm;

	@Override
	public void HowManyHD() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people want to add");
		hm = sc.nextInt();
		AddacountHD();

	}

	public static void main(String[] args) {

		HDFC_Bank hd;
		hd = new Customer_Data();

		ICICI_Bank ici;
		ici = new Customer_Data();

		System.out.println("Enter your choice :-");
		System.out.println("Press 1 for the HDFC Bank ");
		System.out.println("Press 2 for the ICICI Bank");
		System.out.println("Press 3 for the Exit");
		Scanner scm = new Scanner(System.in);
		int scb = scm.nextInt();

		switch (scb) {
		case 1:

			while (true) {

				System.out.println("HDFC Bank (You Can add only 3 accounts , Customer id is Account Number itself :-)");
				System.out.println("Account Number Should be Like 'HDFC1234' ");
				System.out.println("Here , 0 to 6 only for the HDFC Bank");
				System.out.println("Press 0 for How Many people want to Add");
				// System.out.println("Press 1 for the Add New Customer ");
				System.out.println("Press 2 for the Change the Address ");
				System.out.println("Press 3 for the Balance check  ");
				System.out.println("Press 4 for the Update Balance  ");
				System.out.println("Press 5 for the All Acounts  ");
				System.out.println("Press 6 for the Back  ");
				System.out.println("Enter you choice");
				Scanner sca = new Scanner(System.in);
				int input = scm.nextInt();

				switch (input) {

				case 0: {
					hd.HowManyHD();
					break;
				}

				case 1: {
					hd.AddacountHD();
					break;
				}
				case 2: {
					hd.ChangeAddressHD();
					break;
				}

				case 3: {
					hd.CheckBalanceHD();
					break;
				}

				case 4: {
					hd.updateBalanceHD();
					break;
				}

				case 5: {
					hd.AllAcountHD();
					break;
				}

				case 6: {
					System.out.println("Back is Successful");
					break;
				}

				default:

					System.out.println("Invalid entry , try again later...");
					break;
				}
			}

		case 2:

			while (true) {
				
					System.out.println(
							"ICICI Bank (You Can add only 10 accounts , Customer id is Account Number itself :-)");
					System.out.println("Account Number Should be Like 'ICICI1234' Enter only numeric number");
					System.out.println("To Retrive a Customer account should follow only numeric");
					System.out.println("Here , 0 to 6 only for the ICICI Bank");
					System.out.println("Press 0 for How Many people want to Add");
					// System.out.println("Press 1 for the Add New Customer ");
					System.out.println("Press 2 for the Change the Address ");
					System.out.println("Press 3 for the Balance check  ");
					System.out.println("Press 4 for the Update Balance  ");
					System.out.println("Press 5 for the All Acounts  ");
					System.out.println("Press 6 for the Back  ");
					System.out.println("Enter you choice");
					Scanner sca = new Scanner(System.in);
					int input = scm.nextInt();

					switch (input) {

					case 0: {
						ici.HowManyIc();
						break;
					}

					case 1: {
						ici.AddacountIc();
						break;
					}
					case 2: {
						ici.ChangeAddressIc();
						break;
					}

					case 3: {
						ici.CheckBalanceIc();
						break;
					}

					case 4: {
						ici.updateBalanceIc();
						break;
					}

					case 5: {
						ici.AllAcountIc();
						break;
					}

					case 6: {
						System.out.println("Back Successfully");
						break;
					}

					default:

						System.out.println("Invalid entry , try again later...");
						break;
					}
					
				}

				
			

		case 3:
			System.out.println("Successfully exit");
			return;

		default:
			System.out.println("Invalid entry, try again later...");
			break;
		}

	}

	@Override
	public void AddacountHD() {
		// TODO Auto-generated method stub

		System.out.println("Add new Customer :-");

		for (int i = 0; i < hm; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Customer id");
			id[i] = sc.nextInt();

			System.out.println("Enter Customer Name :-");
			cname[i] = sc.next();	

			System.out.println("Enter Amount :-");
			amount[i] = sc.nextInt();

			System.out.println("Enter Address :-");
			address[i] = sc.next();

			System.out.println("Customer Id = " + "HDFC" + id[i]);
			System.out.println(" Customer Name = " + cname[i]);
			System.out.println("Customer Amount = " + amount[i]);
			System.out.println("Customer Address = " + address[i]);
		}
	}

	@Override
	public void ChangeAddressHD() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id to change the address ");

		ida = sc.nextInt();
		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Id = "+ "HDFC" + id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

				System.out.println("Enter your new Address :- ");
				address[i] = sc.next();

				System.out.println("New Details with new Address :-");

				System.out.println("Customer Id = "+ "HDFC" + id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

			}
		}

	}

	@Override
	public void CheckBalanceHD() {
		// TODO Auto-generated method stub
		System.out.println("Enter id for the Balance check : -");

		Scanner sc = new Scanner(System.in);

		int ida = sc.nextInt();
		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Amount = " + amount[i]);
			}
		}

	}

	@Override
	public void updateBalanceHD() {
		// TODO Auto-generated method stub

		System.out.println("Enter id for the Update Amount");
		Scanner sc = new Scanner(System.in);
		ida = sc.nextInt();

		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Id = "+ "HDFC" + id[i]);
				System.out.println("Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

				System.out.println("Enter your new Amount :- ");
				amount[i] = sc.nextInt();

				System.out.println("New Details with new Amount :-");

				System.out.println("Customer Id = "+ "HDFC" + id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

			}
		}
	}

	@Override
	public void AllAcountHD() {
		// TODO Auto-generated method stub
		for (int i = 0; i < hm; i++) {
			System.out.println("Total Account Details : -");
			System.out.println("Customer Id = "+ "HDFC" + id[i]);
			System.out.println(" Customer Name = " + cname[i]);
			System.out.println("Customer Amount = " + amount[i]);
			System.out.println("Customer Address = " + address[i]);

		}

	}

	@Override
	public void HowManyIc() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people want to add");
		hm = sc.nextInt();
		AddacountIc();

	}

	@Override
	public void AddacountIc() {
		// TODO Auto-generated method stub
		System.out.println("Add new Customer :-");

		for (int i = 0; i < hm; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Customer id");
			id[i] = sc.nextInt();

			System.out.println("Enter Customer Name :-");
			cname[i] = sc.next();

			System.out.println("Enter Amount :-");
			amount[i] = sc.nextInt();

			System.out.println("Enter Address :-");
			address[i] = sc.next();

			System.out.println("Customer Id = "+"ICICI" + id[i]);
			System.out.println(" Customer Name = " + cname[i]);
			System.out.println("Customer Amount = " + amount[i]);
			System.out.println("Customer Address = " + address[i]);
		}

	}

	@Override
	public void ChangeAddressIc() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id to change the address ");

		ida = sc.nextInt();
		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Id = "+ "ICICI"+ id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

				System.out.println("Enter your new Address :- ");
				address[i] = sc.next();

				System.out.println("New Details with new Address :-");

				System.out.println("Customer Id = " + "ICICI"+ id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

			}
		}

	}

	@Override
	public void CheckBalanceIc() {
		// TODO Auto-generated method stub
		System.out.println("Enter id for the Balance check : -");

		Scanner sc = new Scanner(System.in);

		int ida = sc.nextInt();
		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Amount = " + amount[i]);
			}
		}

	}

	@Override
	public void updateBalanceIc() {
		// TODO Auto-generated method stub
		System.out.println("Enter id for the Update Amount");
		Scanner sc = new Scanner(System.in);
		ida = sc.nextInt();

		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Id = "+ "ICICI" + id[i]);
				System.out.println("Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

				System.out.println("Enter your new Amount :- ");
				amount[i] = sc.nextInt();

				System.out.println("New Details with new Amount :-");

				System.out.println("Customer Id = "+ "ICICI" + id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

			}
		}

	}

	@Override
	public void AllAcountIc() {
		// TODO Auto-generated method stub

		for (int i = 0; i < hm; i++) {
			System.out.println("Total Account Details : -");
			System.out.println("Customer Id = "+ "ICICI" + id[i]);
			System.out.println(" Customer Name = " + cname[i]);
			System.out.println("Customer Amount = " + amount[i]);
			System.out.println("Customer Address = " + address[i]);

		}

	}

}
