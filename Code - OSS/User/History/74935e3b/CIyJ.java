public Customer implements Runnable {
    BlockingQueue<bun> shelf;

    public void run () {
        try {
            bun b = shelf.take();
            bun b = shelf.take();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}