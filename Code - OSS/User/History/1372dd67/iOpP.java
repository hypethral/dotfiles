import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server extends UnicastRemoteObject implements Addinterface{  
    public Server()throws RemoteException
    {
        super();
    }
@Override
    public int add(int x, int y)throws RemoteException
    {
        return x+y;
    }
}