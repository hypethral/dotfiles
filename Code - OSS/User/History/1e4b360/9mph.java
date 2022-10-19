package add;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Add {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     * @throws java.rmi.NotBoundException
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Addinterface service = (Addinterface)Naming.lookup("rmi://localhost:4444/add");
        System.out.println("------"+service.add(5,6)+" "+service.getClass().getName());
    }}