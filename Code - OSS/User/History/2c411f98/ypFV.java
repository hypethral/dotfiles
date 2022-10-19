import com.edw.rmi.MessageImpl; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 
public class Main { 
    private void startServer(){ 
        try { 
            // create on port 1099 

Registry registry = LocateRegistry.createRegistry(1099); 

 

// create a new service named myMessage 

registry.rebind("myMessage", new MessageImpl()); 

} catch (Exception e) { 

e.printStackTrace(); 

} 

System.out.println("system is ready"); 

}  
public static void main(String[] args) { 
Main main = new Main(); 
main.startServer(); 
} 
} 
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 
import com.edw.rmi.Message; 
public class Main { 
private void doTest(){ 
try { 
// fire to localhost port 1099 
Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1", 1099); 
// search for myMessage service 
Message impl = (Message) myRegistry.lookup("myMessage"); 
// call server's method          
impl.sayHello("edwin"); 
System.out.println("Message Sent"); 

 } catch (Exception e) { 

            e.printStackTrace(); 

        }         

    } 

      

    public static void main(String[] args) { 

        Main main = new Main(); 

        main.doTest(); 

    } 

} 