package rabbitmq;
import com.rabbitmq.*;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
public class Producer 
{
    public static void main( String[] args )
    {
        //1 Create a Connection Factory
        //2 Create a Connection using a Factory
        //3 Set up channel using connection
        //4 define a queue/exhange
        //5 send the message(string)
        
        String msg = "akatsuki";
        String queueName = "darksQueu";
        //1
        ConnectionFactory f = new ConnectionFactory();

        //2
        Connection con = f.newConnection();

        //3
        Channel ch = con.createChannel();

        //4
        ch.queueDeclare();

    }
}
