package assignments.week1day1;

public class FibonacciSeries {
public static void main(String[] args) {	

	int n = 8;
	int a=0;
	int b=1;
	System.out.println(a);
	
	for (int i = 2; i <= n; ++i) {
		int c=a+b;
		a=b;
		b=c;
			
			System.out.println(a);
			
		}
		
		
		}
		
}


