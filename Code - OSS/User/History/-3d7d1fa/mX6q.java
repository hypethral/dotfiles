public class task1 {
    static int sec =0 ;
    static int mins = 0;
    public static void main(String[] args) {
        new Thread(new Seconds()).start();
        new Thread(new Minutes()).start();
        new Thread(new Display()).start();
        }
static class Display implements Runnable{
   public void run() {
   while(true) {
   System.out.println(mins+":"+sec);
   try{
   Thread.sleep(1000);
   }
   catch (Exception e) {}
   }
   }
   }
static class Minutes implements Runnable{
public void run() {
while(true) {
try{
Thread.sleep(60*1000);
}
catch (Exception e) {}
mins++;
}
}
}
static class Seconds implements Runnable{
public void run() {

    while(true) {
try{
Thread.sleep(1000);
}
catch (Exception e) {}
sec++;
if (sec==60){
sec=0;
}
}
}
}
}