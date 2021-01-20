package Printer;

import java.util.Scanner;


class Printer 
{ 

	public static int height;
	
	public static int width = (2*height) - 1; 
			
	public static int i, j; 
	
	public static char character;
	
//Function to print letter H 
public static void  printH() { 
    for (i = 0; i < height; i++)   { 
        System.out.printf("*"); 
        	for (j = 0; j < height; j++) { 
        		if ((j == height - 1) || (i == height / 2)) 
        			System.out.printf("*"); 
        		else
        			System.out.printf(" "); 
        		} 
        System.out.printf("\n"); 
    } 
} 

//Function to print letter L 
public static void printL() { 
	for (i = 0; i < height; i++)  { 
		System.out.printf("*"); 
			for (j = 0; j <= height; j++) { 
				if (i == height - 1) 
					System.out.printf("*"); 
				else
					System.out.printf(" "); 
				} 
		System.out.printf("\n"); 
 	} 
} 

//Function to print letter X
public static void printX() { 
	for (i = 1; i <= height; i++) { 
		for (j = 1; j <= height; j++) { 
			if (i == j|| i + j == height+1) 
				System.out.printf("*"); 
			else
				System.out.printf(" "); 
			} 
		System.out.printf("\n"); 
	} 
} 

//Function to print letter Y
public static void printY() { 
int counter = 0; 
	for (i = 0; i < height; i++) { 
		for (j = 0; j <= height; j++) { 
			if (j == counter || j == height - counter -1) 
				System.out.printf("*"); 
			else
				System.out.printf(" "); 
			} 
		System.out.printf("\n"); 
			if (i < height / 2) 
				counter++; 
	} 
} 

//Function to print letter Z 
public static void printZ() { 
int counter = height - 1; 
	for (i = 0; i < height; i++) { 
		for (j = 0; j < height; j++) { 
			if (i == 0 || i == height - 1 || j == counter) 
				System.out.printf("*"); 
			else
				System.out.printf(" "); 
			} 
				counter--; 
		System.out.printf("\n"); 
	} 
} 

//Printing letter of choice
public static void Print(char character) 
{ 
	switch (character) 
	{ 
	case 'H': 
		printH(); 
		break;
	case 'L': 
		printL(); 
		break; 
	case 'X': 
		printX(); 
		break; 
	case 'Y': 
		printY(); 
		break; 
	case 'Z': 
		printZ(); 
		break; 
	} 

}

//Driver 
public static void main(String[] args)  { 
	do {	
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter H, L, X, Y or Z");
			character = input.next().toUpperCase().charAt(0);
			System.out.println("Please enter Odd Numbers from 3 to 21");
			height = input.nextInt();
	   }while
		   (character != 'H' &&character != 'L' && character != 'X' && character != 'Y' && character != 'Z' ||
		   height <3 || height > 21 || height % 2 ==0);
			Print(character); 
	 }
}

