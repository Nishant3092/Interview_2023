public class TestArithmeticOperation {
 
public static void main(String[] args) {
 
    int a=3;
    a=a++;
    System.out.println("Post-Increment a: " +a);
 
    a=++a;
    System.out.println("Pre-Increment a: "+a );
 
    a=a--;
    System.out.println("Post-Decrement a: " +a);
 
    a=--a;
    System.out.println("Pre-Decrement a: "+a );
    
    
    float x =4;
    x*=5;
    x-=6;
    x+=1;
    x/=2;

  System.out.println(x);
    
    
    }
 
}
