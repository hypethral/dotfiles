package rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class receiver {
    public static void main(String[] args) throws IOException, TimeoutException {
        //1 Create a Connection Factory
        //2 Create a Connection using a Factory
        //3 Set up channel using connection
        //4 define a queue/exhange
        //5 send the message(string)
        String queueName = "darksQueue";

        //1
        ConnectionFactory fa = new ConnectionFactory();

        //2 
        Connection con = fa.newConnection();

        //3
        Channel chan = con.createChannel();

        //4
        chan.queueDeclare(queueName,false,false,false,null);

        //5
        chan.basicConsume(queueName, (x, msg)->{},x->{});

    }
}
