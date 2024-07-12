package ainhert;
import java.util.Scanner;
class Arm{
	void Ar(){
	int n,t, d1,d2,d3;
	System.out.println("Enter the three No. ");
	//Scanner o=new Scanner(System.in);
	//n= o.nextInt();
	for(n=1;n<=500;n++) {
		t=n;
		d1=t%10;
		t=t/10;
		d2=t%10;
		t=t/10;
		d3=t%10;
		if(d1*d1*d1+d2*d2*d2+d3*d3*d3==n) {
			System.out.println(n);
		}
		}
	}
}
class Div extends Arm{
	void dis(){
		float sum=0,i,n;
		//System.out.println();
		System.out.println("Enter the N number :");
		Scanner ob=new Scanner(System.in);
		n=ob.nextFloat();
		
		for(i=1;i<=n;i++) {
			sum=sum+(1/i);
		}
		System.out.println(sum);		
	}
}

public class oinher1 {
	public static void main(String[] args) {
		Div obj=new Div();
		obj.Ar();
		obj.dis();
	}
}
