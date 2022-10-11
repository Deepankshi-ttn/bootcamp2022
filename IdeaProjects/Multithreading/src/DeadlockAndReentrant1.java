public class DeadlockAndReentrant1{
    public static void main(String[] args) throws InterruptedException {
        DeadlockAndReentrant1 worker1 = new DeadlockAndReentrant1();
        Cakes bakery1 = new Cakes("Pineapple", 10000);
        Cakes bakery2 = new Cakes("Butterscotch", 20000);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                worker1.lock(bakery1, bakery2);
                worker1.transfer(bakery1, bakery2, 1000);
                worker1.unLock(bakery1, bakery2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                worker1.lock(bakery2, bakery1);
                worker1.transfer(bakery2, bakery1, 1000);
                worker1.unLock(bakery2, bakery1);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Total amount of cakes for both Bakeries: " + (bakery1.getAmount() +
                bakery2.getAmount()));
    }
    private void transfer(Cakes fromBakery,Cakes toBakery, Integer amount) {
        System.out.println("Transferring cakes: " + amount + " from bakery " +
                fromBakery.getBakery() + " to bakery " + toBakery.getBakery());
        toBakery.setAmount(toBakery.getAmount() - amount);
        fromBakery.setAmount(fromBakery.getAmount() + amount);
    }
    private void lock(Cakes fromBakery, Cakes toBakery) {
        while (true) {
            Boolean fromBakeryLocked = fromBakery.getLock().tryLock();
            Boolean toBakeryLocked = toBakery.getLock().tryLock();
            if (fromBakeryLocked && toBakeryLocked) {
                return;
            }
            if(fromBakeryLocked) {
                fromBakery.getLock().unlock();
            }
            if(toBakeryLocked) {
                toBakery.getLock().unlock();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void unLock(Cakes fromBakery, Cakes toBakery) {
        fromBakery.getLock().unlock();
        toBakery.getLock().unlock();
    }
}

//cd ./IdeaProjects
//cd ./Multithreading
//git add .
//git commit -m "Initial commit"
//git branch abc
//git checkout abc
//git branch -a
//git remote add origin https://github.com.git
//git push -u origin