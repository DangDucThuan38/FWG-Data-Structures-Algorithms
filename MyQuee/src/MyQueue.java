
public class MyQueue {
	Node headNode;
	Node tailNode;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
	MyQueue() {
		headNode = tailNode = null;
	}
	
	
	

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			headNode = tailNode = newNode;
		} else {
			tailNode.next = newNode;
			tailNode = newNode;
		}
	}
	public Integer dequeue() {
		if (isEmpty()) {
			return null;
		}
		Node temp= headNode;
		if (headNode == tailNode) {
			headNode = tailNode = null;
		} else {
			headNode = headNode.next;
		}
		return temp.data;
	}



	public boolean isEmpty() {
		return (headNode == null && tailNode == null);
	}
	public Integer head() {
		if(isEmpty()) {
			return null;
		}
		return headNode.data;
	}
	public Integer tail() {
		if(isEmpty()) {
			return null;
		}
		return tailNode.data;
	}
	public String toString() {
		String str = "[";
		if (!isEmpty()) {

			Node temp = headNode;
			while (temp.next != null) {
				str += temp.data + ",";
				temp = temp.next;
			}
			str += temp.data;
		}
		str += "]";
		return str;
	}
//4
	public int size() {
		int count = 0;
		Node temp = headNode;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;

	}

}
