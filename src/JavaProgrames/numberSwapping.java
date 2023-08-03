package JavaProgrames;

public class numberSwapping {
	
	public static void main(String[] args)
	{
		
		/* using addition substraction */
		int a=10; int b=20;
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
		/* using multipication and divtion */
		
		int c=40; int d=50;
		System.out.println(c+" "+d);
		c=c*d;
		d=c/d;
		c=c/d;
		
		System.out.println(c+" "+d);
		
		/* using third virable */
		
		int m=60; int n=70;
		System.out.println(m+" "+n);
		int t=m;
		m=n;
		n=t;
		System.out.println(m+" "+n);
		
		/* using bitwise */
		int p=50; int k=90;
		
		System.out.println(p+" "+k);
		p=p^k;
		k=p^k;
		p=p^k;
		System.out.println(p+" "+k);
		
		
		
		
	}

}
