package dsa.basics;

public class ComputePower {

	public static void main(String[] args) {
		
		System.out.println(computePower(2,5));

	}

	private static int computePower(int i, int j) {
		if(j==0)
			return 1;
		int temp=computePower(i, j/2);
		temp=temp*temp;
		if(j%2==0)
			return temp;
		else
			return temp*i;
		
//		Iterative power** more efficient**
		/*
		 * // int res=1; // while(j>0) { // if(i%2!=0) // res=res*i; // i=i*i; // j=j/2;
		 * // } // return res;
		 */	}

}
