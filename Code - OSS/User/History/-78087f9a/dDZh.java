import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Bakery {
    public static void main(String[] args) {
        LinkedBlockingQueue<bun> coolingRack =
                new LinkedBlockingQcueue<>(18);
        
        LinkedBlockingQueue<bun> shelf =
                new LinkedBlockingQueue<>(10);
        
        ScheduledExecutorService bakery =
                Executors.newScheduledThreadPool(3);
        
        bakery.scheduleAtFixedRate(
                new Baker(coolingRack),
                0, 5, TimeUnit.SECONDS);
        
                bakery.scheduleAtFixedRate(
                new Worker(coolingRack,shelf),
                2, 1, TimeUnit.SECONDS);
                
                bakery.scheduleAtFixedRate(
                new CustomerGenerator(shelf),
                5, 1, TimeUnit.SECONDS);
    }
}
class CustomerGenerator implements Runnable{
    LinkedBlockingQueue<bun>shelf;
    ExecutorService gen = Executors.newFixedThreadPool(10);
    public CustomerGenerator(LinkedBlockingQueue<bun> shelf) {
        this.shelf = shelf;
    }

 

    @Override
    public void run() {
        gen.submit(new Customer(shelf));
    }
    
    
}
class bun{}
class Baker implements Runnable{

 

    
    LinkedBlockingQueue<bun> coolingRack;

 

    public Baker(LinkedBlockingQueue<bun> coolingRacking) {
        this.coolingRack = coolingRacking;
    }
    
        
    @Override
    public void run() {
        for(int i=0;i<12;i++){
            bun b = new bun();
            
            try{
                coolingRack.put(b);
                System.out.println("BAKER: adding"
                        + " a bun to the rack");
            }
            catch (Exception e){}
        }
    // list - coolingRack(18)
    
    //every 5 seconds
    // add 12 buns to cooling rack
    }
 
}
class Worker implements Runnable{

 

    LinkedBlockingQueue<bun>coolingRack;
    LinkedBlockingQueue<bun>shelf;

 

    public Worker(LinkedBlockingQueue<bun> coolingRack, LinkedBlockingQueue<bun> shelf) {
        this.coolingRack = coolingRack;
        this.shelf = shelf;
    }
    
    @Override
    public void run() {
        for(int i=0;i<4;i++){
           try{
           bun b= coolingRack.take();
               System.out.println("WORKER: taking "
                       + "a bun from the rack");
           shelf.put(b); 
               System.out.println("WORKER: placing "
                       + "a bun on the shelf");
           }
           catch (Exception e){}
        }
    }
    
    
    //list - coolingRack(18)
    //list - shelf(10)
    
    //every 1 second
    //take 4 buns from the coolingRack and 
    //add to the shelf
}
class Customer implements Runnable{
    LinkedBlockingQueue<bun> shelf;
    
    //shelf(10)
    // enter bakery and take a bun from the shelf

 

    public Customer(LinkedBlockingQueue<bun> shelf) {
        this.shelf = shelf;
    }

 

    @Override
    public void run() {
        try{
            System.out.println("CUSTOMER: entered"
                    + " the bakery, going to the shelf");
            bun b = shelf.take();
            System.out.println("CUSTOMER: taking a"
                    + " bun from the shelf");
        }
        catch (Exception e) {}

 

    }
    
}