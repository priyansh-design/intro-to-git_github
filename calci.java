import java.util.Scanner;
public class calci{
	public static int add(int num1,int num2){
		int a=num1;
		int b=num2;
		int c=num1+num2;
		return c;
	}
	public static int mul(int num1,int num2){
		int a=num1;
		int b=num2;
		int c=num1*num2;
		return c;

    } 
    public static double div(double num1,double num2){
    	double a=num1;
		double b=num2;
		double c=num1/num2;
		return c;
    }
    public static int sub(int num1,int num2){
    	int a=num1;
    	int b=num2;
    	int c=num1-num2;
		return c;
    }	
    public static void main(String[] args){
    	Scanner n=new Scanner(System.in);
    	System.out.println("Enter the two numbers:");
    	int x=n.nextInt();
    	int y=n.nextInt();
    	System.out.println("Required calculations are:");
    	int ad=add(x,y);
    	int mu=mul(x,y);
    	double di=div(x,y);
    	int su=sub(x,y);
    	System.out.println("Additon: "+ad);
    	System.out.println("Multiplication: "+mu);
    	System.out.println("Division: "+di);
    	System.out.println("Subtraction: "+su);

    }
		

}