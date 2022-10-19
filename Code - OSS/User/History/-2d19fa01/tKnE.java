import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
public class client {
    public static void main(String[] args)throws MalformedURLException,NotBoundException,RemoteException{
    Addinterface object = (Addinterface)Naming.lookup("rmi://localhost:1044/add");
    System.out.println("The number is:"+object.add(5,7));
    } 
}