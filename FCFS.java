import java.util.*;
import java.io.*;

public class FCFS implements Algorithm {
    private List<Task> Queue;
    private static int currentCount = -1;
    
    public FCFS(List<Task> queue) {
	this.Queue = queue;
    }//constructor.


    public void schedule() {
	System.out.println("in schedule");
	System.out.println("Size of list: "+ this.Queue.size());

	for(int i=0; i<this.Queue.size(); i++) {
	    //System.out.println("i: "+i);
	    Task workingTask = pickNextTask();
	    CPU.run(workingTask, workingTask.getBurst());
	}
	//System.out.println("Count: "+currentCount);
	
    }


    public Task pickNextTask() {
	currentCount++;
	Task nextTask = Queue.get(currentCount);	
	return nextTask;
   
	
    }
    

}
