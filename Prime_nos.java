import java.util.*;

class Prime_nos{
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Check wether the number is prime or not...");
		System.out.println("Enter any number Greater than 1 : ");
		int num= sc.nextInt();
		int i, flag, n;
		flag=0;
		n=num/2;
		
		if(num==1){
			System.out.println("Number must be Greater than 1");			
		}
		else{
			for(i=2;i<=n&&flag==0;i++){
				if(num%i==0){
					flag=1;
				}
				else{
					flag=0;
				}
				
			}
			if(flag==1){
				System.out.println(num + " is not a Prime Number");
			}
			else{
				System.out.println(num + " is a Prime Number");
			}
		}
		
		
	}
}
