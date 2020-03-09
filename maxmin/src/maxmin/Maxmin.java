package maxmin;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		long min=300000;
		long max= -300000;    
		while(true) {
			System.out.println("Type any letter to see result in place of number");
			System.out.println("enter the number");
			boolean abc=scanner.hasNextLong();
			if(abc) {
				long number=scanner.nextLong();
			if(number>max) {
				max=number;
		}
			if(number<min) {
				min=number;
			}
			}
			else {
	        break;
			}
			scanner.hasNextLine();
		}
			System.out.println("min number is "+ min +" , max number is "+ max);
			scanner.close();
	}
	}


