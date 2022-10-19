package stopwatch;
static class Seconds implements Runnable{
    static int sec=0;
    static int mins=0;
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
