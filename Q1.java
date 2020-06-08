public class Q1 {
public static int sum(int a) {
	int s=0;
	for(int n=1;n<a;n++) {
		if(n%3==0||n%5==0) {
			s=s+n;
		}
	}
	return s;
}
public static void main(String args[]) {
	System.out.println(sum(1000));
}
}
