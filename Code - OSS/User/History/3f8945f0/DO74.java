package stopwatch;

static class Display implements Runnable{

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
