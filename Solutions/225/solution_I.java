class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> queue;
    
    public MyStack() {
        queue = new LinkedList<>();    
    }
    
    为什么queue.size() - 1？
    当size为1， 不需要移动位置
    当size为2， 直接可以移动一个就可以，比如原来queue中 2 1, 在loop里直接变为 1 2
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */