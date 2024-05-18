//Multiplication of two numbers
package Recursion;
public class Multiplication {
    public static void main(String[] args) {
    System.out.println(Multiply(3,2));
}
    static int Multiply(int a ,int b){
        if(b==1)
            return a;
        else
            return a+Multiply(a,b-1);
    }
}