package addproject;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Rmiregistry {
    public static void main(String[] args)throws RemoteException
    {
        Registry reg = LocateRegistry.createRegistry(1044);
        reg.rebind("add",new Server());
    }
}