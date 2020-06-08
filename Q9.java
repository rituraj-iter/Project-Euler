/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
public class Q9 {
public static void main(String[] args) {
        int a,b,c;
        int res=0;
        for (a=1;a<498;a++){
        	for (b=1;b<498;b++) {
        		for (c=1;c<498;c++){
        			if (a+b+c==1000){
        				if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
        					res=a*b*c;
        					}
        				}
        			}
        		}
        	}
        System.out.println(res);
        }
}
//Output31875000
