public class Server extends UnicastRemoteObject implements Addinterface{  
    public Server()throws RemoteException
    {
        super();
    }
@Override
    public int add(int x,int y)throws RemoteException
    {
        return x+y;
    }
}