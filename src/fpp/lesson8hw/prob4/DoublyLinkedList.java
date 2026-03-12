package fpp.lesson8hw.prob4;


import java.util.Objects;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//1. adds to the end of the list
		public void addLast(String item){
			Node cur = header;
			while (cur.next != null) {
				cur = cur.next;
			}

			cur.next = new Node(item, null, cur);
		}
		// 2. Remove by passing object
		public boolean remove(String item){

			Node cur = header;
			while (cur.next != null) {
				if (Objects.equals(item, cur.next.value)) {
					break;
				}

				cur = cur.next;
			}

			if (cur.next != null) {
				cur.next = cur.next.next;
				if (cur.next != null) {
					cur.next.previous = cur;
				}

				return true;
			}

			return  false;
		}

		// 3. Remove the First Node

		public boolean removeFirst() {
			if (header.next == null ){
				return false;
			}

			header.next = header.next.next;
			if (header.next != null) {
				header.next.previous = header;
			}
			return true;
		}


		// 4. Prints the list from last to first
		 public void printReverse() {
			 Node cur = header;
			 while (cur.next != null) {
				 cur = cur.next;
			 }

			 StringBuilder sb = new StringBuilder("[");
			 while (cur.previous != null) {
				 sb.append(cur.value );
				 sb.append(" ");
				 cur = cur.previous;
			 }
			 sb.append("]");
			 System.out.println(sb.toString());
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;

			Node() {
			}

			Node(String val, Node next, Node previous) {
				this.value = val;
				this.next = next;
				this.previous = previous;
			}
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			list.addLast("Nat");

			System.out.println(list.remove("Nati"));
			System.out.println(list);

			System.out.println(list.remove("Bob"));
			list.removeFirst();
			list.addLast("Natu");
			System.out.println(list);
			list.printReverse();
		}
}
