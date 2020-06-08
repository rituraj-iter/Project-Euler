/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?*/
public class Q3 {
public static double prime(double a) {
	double n;
	double q=a;
	double b=0;
	for(n=2;n<Math.sqrt(q);n++){
		while(a%n==0) {
			b=n;
			a=a/n;
		}
	}
	return b;
}
public static void main(String args[]) {
	System.out.println((int)prime(600851475143d));
}
}
//Output6857
