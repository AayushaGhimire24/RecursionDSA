//To find the HCF(GCD)of two numbers.
package Recursion;
public class HCForGCD {
    public static void main(String[] args) {
        System.out.println(gcd(20,25));
    }
    static int gcd(int n1,int n2){
        if(n2==0)
            return n1;
        else if(n1==0)
            return n2;
        else
            return gcd(n2,n1%n2);
    }
} 
