package rabbitmq;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
public class Producer 
{
    public static void main( String[] args )
    throws IOException, TimeoutException {
        //1 Create a Connection Factory
        //2 Create a Connection using a Factory
        //3 Set up channel using connection
        //4 define a queue/exhange
        //5 send the message(string)
        
        String msg = "akatsuki";
        String queueName = "darksQueue";
        //1
        ConnectionFactory f = new ConnectionFactory();

        //2
        try(Connection con = f.newConnection()){

        //3
        Channel ch = con.createChannel();

        //4
        ch.queueDeclare(queueName, false,false,false,null);

        //5 send msg
        ch.basicPublish("", queueName, true,null, msg.getBytes());
    }
    }
}
