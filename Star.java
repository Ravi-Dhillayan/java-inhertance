package ainhert;

import java.util.Scanner;
               //WAP Star print
class st{
	void s() {
		int no,i,j;
		Scanner ob=new Scanner(System.in);
		no=ob.nextInt();
		for(i=0;i<=no;i++) {
			{
			System.out.println("*");	
			}
		}
	}
}
class prim extends st{
	void pr() {
	int no,i,m=0,f=0;
	System.out.println(" Enter the no");
	Scanner obj=new Scanner(System.in);
	no=obj.nextInt();
	 
	 m=no/2;
	 for(i=2;i<=m;i++) {
		 if(no%i==0) {
			System.out.println(" number is not Prime :"); 
			f=1;
		 }
	 }
	 if(f==0) {
		 System.out.println("Number is Prime :: ");
	 }
}
}

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   prim bo=new prim();
   bo.pr();
   bo.s();
	}

}
