import java.rmi.*;

public interface Addinterface extends Remote{
    public String add(String X)throws RemoteException;
}