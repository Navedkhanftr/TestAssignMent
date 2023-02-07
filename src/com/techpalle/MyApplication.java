
package com.techpalle;

import java.util.Scanner;

public class MyApplication {

	public static void main(String[] args) 
	{
		System.out.println("WELCOME To Endless Java World");
		do {
		System.out.println("Press 1-for creating  table\nPress 2-for inserting a row into table\n"
				+ "Press 3-for updating the row\nPress 4-for deleting the row\nPress 5-to exit");
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			Operations.create();
			System.out.println("Table has been created  in database uccesfully ");
			break;
		case 2:
			System.out.println("Enter the  id no: ");
			int no=sc.nextInt();
			System.out.println("Enter the  name: ");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.println("Enter the  Salary: ");
			int sal=sc.nextInt();
		Operations.insert(no, name, sal);
			System.out.println("Inserted Data  succesfully ");
           break;
		case 3:
			System.out.println("Enter id no: ");
			int eno=sc.nextInt();
			System.out.println("Enter salary to update: ");
			int esal=sc.nextInt();
			Operations.update(eno, esal);
			System.out.println("Updated Data succesfully");
            break;
		case 4:
			System.out.println("Enter id no: ");
			int dno=sc.nextInt();
			Operations.delete(dno);
			System.out.println("Deleted Succesfully");
			break;
		case 5:
			System.out.println("Thank you For Watching ");
		    return;
		default:
			System.out.println("Notvalid Number");
			break;
			
		}
	  }while(true);
	}

}
