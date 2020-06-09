/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.*/
public class Q2 {
	public static void main(String args[]) {
		int m=0;
		int n=1;
		int sum=0;
		int temp=0;
		while(n<4*Math.pow(10, 6)){
			if(n%2==0) {
			sum=sum+n;}
			temp=n;
			n=m+n;
			m=temp;
		}
		System.out.println(sum);
		}
}
//Output4613732
