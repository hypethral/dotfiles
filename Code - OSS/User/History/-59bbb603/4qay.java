package add;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;

public class Addserver extends UnicastRemoteObject implements Addinterface{
    public Addserver()throws RemoteException{
        super();
    }
    @Override
    public int add(int x, int y) throws RemoteException {
    return x+y;
    }
}   