import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int correctpin = 1234;
	    
		System.out.println("enter correct pin");
		int pin = sc.nextInt();
		
		if(pin == correctpin){
		    System.out.println("Access granted");
		}else{
		    System.out.println("invalid pin");
		}
		
	}
}
