package Person;
import java.util.Scanner;


public class main {
	
	public static void main(String[] args) {
		System.out.println("Project 01 - Project, Singleton - Austin Stephens");
		/*Var.|Initl.*/
		Scanner IN = new Scanner(System.in);
		String nameFirst = "", nameLast = "", nameMiddle = "";
		
		/*Get Instance*/
		PersonType person = PersonType.getInstance(nameFirst, nameMiddle, nameLast);
		
		
		/*Inputs/Outputs*/
		System.out.println("Initilized Information");
		System.out.println("Name = " + nameFirst + "" + nameMiddle + "" + nameLast);
		
		System.out.println("Please enter what you want to change it to. \n ");
		System.out.println("First Name = "); nameFirst = IN.nextLine();
		System.out.println("Middle Name = "); nameMiddle = IN.nextLine();
		System.out.println("First Name = "); nameLast = IN.nextLine();
		System.out.println("\n\n");
		
		System.out.println("Information Supplied/Set");
		System.out.println("Name = " + nameFirst + " " + nameMiddle + " " + nameLast);
	}
}
