public class Q2 {
public static int evenfibo() {
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
	return sum;
}
public static void main(String args[]) {
	System.out.println(evenfibo());
}
}
