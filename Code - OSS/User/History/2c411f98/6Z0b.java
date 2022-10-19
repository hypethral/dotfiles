package com.edw.main;
import com.edw.rmi.MessageImpl; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 
public class ServerMain { 
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
    System.out.println("system is ready"); 
    ServerMain main1 = new ServerMain(); 
    main1.startServer(); 
} 
}