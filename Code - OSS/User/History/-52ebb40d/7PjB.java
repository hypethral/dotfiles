static class Minutes implements Runnable{

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