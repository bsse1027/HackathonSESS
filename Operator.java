package othersPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Operator implements Serializable
{
	ArrayList <Account> accounts = new ArrayList <Account> ();
	
	private static final long serialVersionUID = -1025998266932287368L;
	
	public int search (String s)
	{	
		for(int i=0;i<accounts.size();i++)
		{	
			String s4 = accounts.get(i).getAccNum();
			if(s4.equals(s))
			{	
				return i;
			}
		}
		return -1;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public void createAccount ()
	{
		Scanner cin = new Scanner (System.in);
		
		String s,s1,s2;
		Double d;
			
		System.out.print("\nEnter info:\nAccount name: ");
		s=cin.nextLine();
		
		System.out.print("Account number: ");
		s1=cin.nextLine();
		
		System.out.print("First deposit amount: ");
		d=cin.nextDouble();
		
		System.out.print("NID: ");
		s2=cin.nextLine();
		s2=cin.nextLine();
		
		
		
		//filledTo=filledTo+1;

		accounts.add(new Account(s,s1,d,s2));
		
		System.out.println("\nACCOUNT CREATED!\n");
	}
	
	public void beforeLogIn()
	{
		Scanner cin = new Scanner (System.in);
		
		System.out.print("\nEnter account number: ");
				
		String s3=cin.nextLine();
			
		int i = search(s3);
		
		if(i!=-1) accounts.get(i).afterLogIn();
		else System.out.println("\nACCOUNT NOT FOUND!\n");
	}
	
	
	
	public void Menu()
	{		
		Scanner cin = new Scanner (System.in);
	
		while(true)
		{
			System.out.println("WELCOME TO THE BANK!\n1.Create account\n2.Log in\n3.Exit\n");
			
			int choice;
			choice = cin.nextInt();
			
			if(choice==3) break;
			else if(choice==1) createAccount();
			else if(choice==2) beforeLogIn();
			
			System.out.println();
		}
	}
}
