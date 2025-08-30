package main;

import watertank.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WaterInterface wt = new WaterTank();
		int choice;
		
		do {
			System.out.println("\n --- Water Tank Menu --- ");
			System.out.println("[ 1 ]\tCheck Water Level");
			System.out.println("[ 2 ]\tFill");
			System.out.println("[ 3 ]\tDrain");
			System.out.println("[ 4 ]\tShow History");
			System.out.println("[ 5 ]\tExit");
			System.out.print("Enter Choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("\nCurrent Water Level: " + wt.getLevel()+ "/" + WaterInterface.MAX_CAP + " gallons");
				break;
			case 2:
				System.out.print("\nEnter Gallons to Fill: ");
				wt.fill(sc.nextInt());
				break;
			case 3:
				System.out.print("\nEnter Gallons to Drain: ");
				wt.drain(sc.nextInt());
				break;	
			case 4:
				wt.showHistory();
				break;
			case 5:
				System.out.println("\nWater Tank Exiting...");
				break;
			default:
				System.out.println("\nInvalid Choice!");
			
			}
		} while (choice != 5);
		
		sc.close();	
	}

}