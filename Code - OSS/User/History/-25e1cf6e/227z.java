import java.rmi.*;

public interface Addinterface extends Remote{
    public int add(String X)throws RemoteException;
}