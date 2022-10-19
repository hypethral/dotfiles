package addproject;
import java.rmi.*;

public interface Addinterface extends Remote{
    public int add(int x,int y)throws RemoteException;
}