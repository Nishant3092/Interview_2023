
public class ThreadSample {
 
 public static void main(String[] args) {
 
 
  // using lambda Expression
  new Thread(()->System.out.println("Thread is started")).start();
 }
 
}