
public class MyMain {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
	
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
        queue.enqueue(10);
        
    	System.out.println("MyQueue:"+queue.toString());
		System.out.println("Size of Queue is:" + queue.size());
		System.out.println("-------------------------");
		System.out.println("Queue dequeue is :" + queue.dequeue());
		System.out.println("My Queue after dequeue is:"+queue.toString());
		System.out.println("--------------------------");
		queue.enqueue(11);
		System.out.println("My Queue after enqueue is:"+queue.toString());
		System.out.println("--------------------------");
	    System.out.println("MyQueue:"+queue.toString());
		System.out.println("Size of Queue is:" + queue.size());
		System.out.println("Head of Queue is: " + queue.head());
		System.out.println("Tail of Queue is: " + queue.tail());
		System.out.println("Queue Empty:" + queue.isEmpty());


	}

}
