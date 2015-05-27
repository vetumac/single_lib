
public class App {

	public static void main(String[] args) {
		Node head = new Node(1, null);
		SingleLLUtils.addToTail(head, 2);
		SingleLLUtils.addToTail(head, 11);
		head = SingleLLUtils.addToHead(head, 10);
		System.out.println(SingleLLUtils.toString(head));
		head = SingleLLUtils.add(head, 4, 7);
		System.out.println(SingleLLUtils.toString(head));
		head = SingleLLUtils.remove(head, 0);
		System.out.println(SingleLLUtils.toString(head));
		System.out.println(SingleLLUtils.groove(head));
		System.out.println("Length: " + SingleLLUtils.length(head));
		System.out.println("Max: " + SingleLLUtils.max(head));
		System.out.println("Sum: " + SingleLLUtils.sum(head));
		Node headR = new Node(22, null);
		SingleLLUtils.addToTail(headR, 11);
		System.out.println(SingleLLUtils.toString(headR));
		headR = SingleLLUtils.removeHead(headR);
		System.out.println(SingleLLUtils.toString(headR));
	}

}
