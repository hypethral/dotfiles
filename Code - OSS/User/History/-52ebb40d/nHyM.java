package stopwatch;
static class Minutes implements Runnable{
    static int sec=0;
    static int mins=0;
    @Override
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