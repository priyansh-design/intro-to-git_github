import java.util.Scanner;
public class pattern{
	public static void main(String[] args){
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=num.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=n-i+1;j<=n;j++){
				System.out.print("@ ");
			}
			System.out.println();
				
			
		}
		for(int i=n+1;i<=(2*n-1);i++){
			for(int j=1;j<=i-n;j++){
				System.out.print(" ");
			}
			for(int j=i-n+1;j<=n;j++){
				System.out.print("@ ");
			}
			System.out.println();
		}
	}
}