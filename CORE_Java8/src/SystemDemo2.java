import java.util.Map;
import java.util.Set;

public class SystemDemo2 {

	
	 public static void main(String args[])  
	    { 
	        Map<String, String> gfg = System.getenv(); 
	        
	        Set<String> keySet = gfg.keySet(); 
	        
	        for(String key : keySet) 
	        { 
	            System.out.println("key= " + key); 
	        } 
	          
	        // checking specific environment variable 
	        System.out.println(System.getenv("PATH")); 
	    } 
	 
}
