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
	}

}
