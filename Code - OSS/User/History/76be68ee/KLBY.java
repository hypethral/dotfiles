import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Applicationserver {
   public static void main(String[]args) throws RemoteException
   {
       Registry registry = LocateRegistry.createRegistry(4444);
       registry.rebind("add", new Addserver());
   }
    
}