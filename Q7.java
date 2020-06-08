public class Q7 {
	public static boolean checkprime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		int n=0;
		int prime=2;
		while(n<10001) {
			if(checkprime(prime)) {
				n++;
			}
			prime++;
		}
		System.out.println(prime-1);
	}
}
