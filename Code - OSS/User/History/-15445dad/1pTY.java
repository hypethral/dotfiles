
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
