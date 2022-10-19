class Worker implements Runnable{
    BlockingQueue<bun> coolingRack;
    BlockingQueue<bun> shelf;
    ScheduledExecutorService sched = Executors.newScheduledThreadPool(2);
    sched.scheduleAtFixedRate(new logic;,
                4, 1, TimeUnit.SECONDS);
    public void run(){
        for (int i=0;i<4;i++){
            try {
                bun b = coolingRack.take();
                System.out.println("wocker - bun added!")
                shelf.put(b);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }


}