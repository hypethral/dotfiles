import java.io.IOException; 
import java.io.PrintStream; 
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.Scanner; 

class server { 
    public static void main(String args[])throws IOException 
    { 
        int number,t; 
        ServerSocket s1 = new ServerSocket(5099); 
        Socket ss = s1.accept();  // it accept the connection  
        Scanner sc = new Scanner(ss.getInputStream()); 
        number = sc.nextInt();  // invoking  
        t = number*2; 
        PrintStream p; 
        p = new PrintStream(ss.getOutputStream()); 
        p.println(t); 
    }
} 
