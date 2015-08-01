package datastructure;

public class testingIt {

	public static void main(String[] args) {
		// front is a linked list
		List front = new List();
		front.first = new Node(1, new Node(2, null));
		System.out.println("The front list initial state : \n" + front);
		// temp is a linked list
		List temp = new List();
		temp.first = new Node(3, new Node(4, new Node(5, null)));
		System.out.println("The temp list initial state : \n" + temp);

		// now to solve the problem
		Node one = getCurrentByData(1, front);
		Node two = getCurrentByData(2, front);
		Node three = getCurrentByData(3, temp);
		Node four = getCurrentByData(4, temp);
		Node five = getCurrentByData(5, temp);

		front.first = three;
		three.next = two;
		two.next = four;
		four.next = one;
		one.next = five;

		System.out.println("The front final state : " + front);
		System.out.println("The temp final state : " + temp);

	}

	// i will assume you have gotten the current pointer to
	// node with data 2 or any by using the function below
	// this function assumes the number is unique as first version for the
	// solution it works
	public static Node getCurrentByData(int _data, List _list) {
		Node current = null;// first the pointer for node points to nothing
		current = _list.first;// the node points to the head as initial state

		while (current != null) {
			if (current.data == _data) {
				break;// the node has bean found so break
			} else {
				current = current.next;// try the next node to search so
										// increase the pointer one step
			}
		}

		return current;

	}
}

class List {
	Node first;

	@Override
	public String toString() {
		return "\nList [first=" + first + "]";
	}

}

class Node {
	int data;
	Node next;

	public Node() {

	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "\n Node [data=" + data + ", next=" + next + "]";
	}

}
