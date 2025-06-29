public class MergeSortLinkedList {
  public class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public void add(int val) {
		ListNode current = this;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new ListNode(val);
	}
}


	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.add(3);
		list1.add(4);
		ListNode list2 = new ListNode(1);
		list1.add(2);
		list1.add(4);

		ListNode result = mergeTwoLists(list2, list2);
		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				list1.next = mergeTwoLists(list1.next, list2);
				return list1;
			} else {
				list2.next = mergeTwoLists(list1, list2.next);
				return list2;
			}
		}
		if (list1 == null)
			return list2;
		return list1;
		
	}
}
