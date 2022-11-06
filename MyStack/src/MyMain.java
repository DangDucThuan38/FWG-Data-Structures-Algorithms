
public class MyMain {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
     	stack.push(10);
		stack.push(11);
		System.out.println("My Stack:"+stack.toString());
		System.out.println("Size of stack is:" + stack.size());
		System.out.println("-------------------------");
		System.out.println("Stack pop is :" + stack.pop());
		System.out.println("My Stack after pop is:"+stack.toString());
		System.out.println("--------------------------");
	    System.out.println("My Stack:"+stack.toString());
		System.out.println("Size of stack is:" + stack.size());
		System.out.println("Stack peek is: " + stack.peek());
		System.out.println("Stack Empty:" + stack.isEmpty());
		

	}
}
