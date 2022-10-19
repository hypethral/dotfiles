import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.IOException;
import java.net.Socket;

public class client{
    public static void main(String args[])throws UnknownHostException, IOException 
    { 
    int number,t; 
    Scanner sc = new Scanner(System.in);//accepting input from the user 
    Socket s = new Socket("localhost",5099);//creating socket for communication 
    Scanner sc1 = new Scanner(s.getInputStream());//another scanner for accepting the result from the server 
    System.out.println("Enter any number"); 
    number = sc.nextInt();//accept the number from the user 
    PrintStream p; 
    p = new PrintStream(s.getOutputStream());//printstream for passing the object 
    p.println(number);//pass the number to the server 
    t=sc1.nextInt();//accept the output from the server 
    System.out.println(t); 
}    
}