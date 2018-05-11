# LinkedList 

Problems:
1. 合并
2. 删除
3. 翻转

## Finding the length

```java
public void getLength(ListNode head){
	int length = 0;
	ListNode current = head;
	while(current != 0){
		length++;
		current = current.next;
	}
}
```

## Finding the middle

```java
public void findMiddle(ListNode head){
	ListNode slow = head;
	ListNode fast = head;

	while(fast.next != null && fast.next.next != null){
		slow = slow.next;
		fast = fast.next;
	}
}
```
```java
public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            int temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
```

```java
public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = dummy.next;
        for(int i = 1; i < m ; i++){
            current = current.next;
            prev = prev.next;
        }
        for(int i = 0; i < n - m; i++){
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dummy.next;
    }
```
## Reverse Problems
1. LC 206
2. LC 82
3. LC 24
4. LC 61
5. LC 86
6. LC 143