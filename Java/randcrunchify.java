package Java ;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
/**
 * @author Crunchify.com
 * How to Generate Random Number in Java with Some Variations?
 */
 
public class randcrunchify {
 
    // Simple test which prints random number between min and max number (Number Range Example)
    public void RandomTest1() throws InterruptedException {
        while (true) {
            int min = 50;
            int max = 100;
 
            // random() returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
			// Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.
            float randomNumber = (min + (float) (Math.random() * ((max - min))));
            System.out.println("Crunchify Thread 1 random result: " + randomNumber);
 
            
            // sleep() causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds,
            // subject to the precision and accuracy of system timers and schedulers.
            // The thread does not lose ownership of any monitors.
            Thread.sleep(500);
        }
    }
 
    // Simple test which prints random entry from list below
    public void RandomTest2() throws InterruptedException {
        List<String> list = new ArrayList<String>();
        list.add("Facebook");
        list.add("Twitter");
        list.add("Google");
        
 
        Random randomNumber = new Random();
        String randomEle;
        int listSize = list.size();
 
        while (true) {
            randomEle = list.get(randomNumber.nextInt(listSize));
            System.out.println("Crunchify Thread 2 random result: " + randomEle);
            Thread.sleep(50);
        }
    }
 
    static public void main(String[] args) {

        // Let's run both Test1 and Test2 methods in parallel..
        Thread crunchifyThread1 = new Thread() {
            public void run() {
                randcrunchify crNumber = new randcrunchify();
                try {
                    crNumber.RandomTest1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        
        Thread crunchifyThread2 = new Thread() {
            public void run() {
                randcrunchify crNumber = new randcrunchify();
                try {
                    crNumber.RandomTest2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
 
        // start() Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
		//The result is that two threads are running concurrently: the current thread
		// (which returns from the call to the start method) and the other thread (which executes its run method).
        crunchifyThread1.start();
        crunchifyThread2.start();
   }
   }