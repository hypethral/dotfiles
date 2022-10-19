package stopwatch;

public class main {
    static int sec=0;
    static int mins=0;
    public static void main(String[] args) {
        new Thread(new Seconds()).start();
        new Thread(new Minutes()).start();
        new Thread(new Display()).start();
        }
}
