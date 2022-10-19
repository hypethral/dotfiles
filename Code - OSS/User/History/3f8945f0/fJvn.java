package stopwatch;

static class Display implements Runnable{
    static int sec=0;
    static int mins=0;
    @Override
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
