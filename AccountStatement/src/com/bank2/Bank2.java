package com.bank2;

import java.util.Scanner;

public class Bank2 {

	public static int ida;
	public static int id[] = new int[10];
	public static String cname[] = new String[10];
	public static int amount[] = new int[10];
	public static String address[] = new String[10];;
	public static int hm;;

	public static void HowMany() {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many people want to add");
		hm = sc.nextInt();
		Addacount();
	}

	public static void Addacount() {

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

			System.out.println("Customer Id = " + id[i]);
			System.out.println(" Customer Name = " + cname[i]);
			System.out.println("Customer Amount = " + amount[i]);
			System.out.println("Customer Address = " + address[i]);
		}
	}

	public static void ChangeAddress() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id to change the address ");

		ida = sc.nextInt();
		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Id = " + id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

				System.out.println("Enter your new Address :- ");
				address[i] = sc.next();

				System.out.println("New Details with new Address :-");

				System.out.println("Customer Id = " + id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

			}
		}

	}

	public static void CheckBalance() {

		System.out.println("Enter id for the Balance check : -");

		Scanner sc = new Scanner(System.in);

		int ida = sc.nextInt();
		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Amount = " + amount[i]);
			}
		}
	}

	public static void updateBalance() {

		System.out.println("Enter id for the Update Amount");
		Scanner sc = new Scanner(System.in);
		ida = sc.nextInt();

		for (int i = 0; i < hm; i++) {
			if (id[i] == ida) {

				System.out.println("Customer Id = " + id[i]);
				System.out.println("Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

				System.out.println("Enter your new Amount :- ");
				amount[i] = sc.nextInt();

				System.out.println("New Details with new Amount :-");

				System.out.println("Customer Id = " + id[i]);
				System.out.println(" Customer Name = " + cname[i]);
				System.out.println("Customer Amount = " + amount[i]);
				System.out.println("Customer Address = " + address[i]);

			}
		}
	}

	public static void AllAcount() {

		for (int i = 0; i < hm; i++) {
			System.out.println("Total Account Details : -");
			System.out.println("Customer Id = " + id[i]);
			System.out.println(" Customer Name = " + cname[i]);
			System.out.println("Customer Amount = " + amount[i]);
			System.out.println("Customer Address = " + address[i]);

		}
	}

	public static void main(String[] args) {

		while (true) {

			System.out.println("Press 0 for How Many people want to Add");
			System.out.println("Press 1 for the Add New Customer ");
			System.out.println("Press 2 for the Change the Address ");
			System.out.println("Press 3 for the Balance check  ");
			System.out.println("Press 4 for the Update Balance  ");
			System.out.println("Press 5 for the All Acounts  ");
			System.out.println("Press 6 for the Quit  ");
			System.out.println("Enter you choice");
			Scanner scm = new Scanner(System.in);
			int input = scm.nextInt();

			switch (input) {

			case 0: {
				HowMany();
				break;
			}

			case 1: {
				Addacount();
				break;
			}
			case 2: {
				ChangeAddress();
				break;
			}

			case 3: {
				CheckBalance();
				break;
			}

			case 4: {
				updateBalance();
				break;
			}

			case 5: {
				AllAcount();
				break;
			}

			case 6: {
				System.out.println("Successfully Exit");
				return;
			}

			default:

				System.out.println("Invalid entry , try again later...");
				break;
			}
		}

	}

}
