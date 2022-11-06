



public class MyStack {
	Node topNode = null;
	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void push(int data) {
			Node newNode = new Node(data);
			newNode.next=topNode;
			topNode=newNode;
	}

	public int size() {
		int count = 0;
		Node temp = topNode;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	public Integer pop() {
		if(isEmpty()) {
			return null;
		}
		int temp=topNode.data;
		topNode=topNode.next;
		return temp;
		}
	public boolean isEmpty() {
		return topNode == null;
	}

	public Integer peek() {
		if(isEmpty()) {
			return null;
		}
		return topNode.data;
	}
	public String toString() {		
		String str = "[";
		if (!isEmpty()) {

			Node temp = topNode;
			while (temp.next != null) {
				str += temp.data + " ";
				temp = temp.next;
			}
			str += temp.data;
		}
		str += "]";
		return str;

	}

	

}
