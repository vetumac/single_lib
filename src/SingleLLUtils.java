
public class SingleLLUtils {
	public static int length(Node head){
			if (head.next != null)
				return 1 + length(head.next);
			return 1;
	}
	
	public static int max(Node head){
		if (head.next != null)
			return Math.max(head.value, max(head.next));
		else
			return head.value;
	}
	
	public static int sum(Node head){
		if (head.next != null)
			return head.value + sum(head.next);
		else
			return head.value;
	}
	
	public static boolean groove(Node head){
		if (head.next != null && head.next.value > head.value)
			return groove(head.next);
		else if (head.next == null)
			return true;
		else
			return false;
	}
	
	public static Node addToTail(Node head, int elem){
		if (head.next != null)
			addToTail(head.next, elem);
		else 
			head.next = new Node(elem, null);
		return head;
	}
	
	public static Node addToHead(Node head, int elem){
		return new Node(elem, head);
	}
	
	public static Node add(Node head, int index, int elem){
		if (index == 1){
			head.next = addToHead(head.next, elem);
			return head;
		} else if (index == 0)
			return addToHead(head, elem);
		else {
			add(head.next, index - 1, elem);
			return head;
		}
	}
	
	public static Node remove(Node head, int index){
		if (index == 1){
			head.next = removeHead(head.next);
			return head;
		} else if (index == 0)
			return removeHead(head);
		else {
			remove(head.next, index - 1);
			return head;
		}
	}
	
	public static Node removeTail(Node head){
		if (head.next != null)
			if (head.next.next != null)
				removeTail(head.next);
			else 
				head.next = null;
			return head;
	}
	
	public static Node removeHead(Node head){
		return head.next;
	}
	
	
	
	public static String toString(Node head){
		if (head.next != null)
			return head.value + "->" + toString(head.next);
		else
			return head.value + "*";
	}
	
	
}
