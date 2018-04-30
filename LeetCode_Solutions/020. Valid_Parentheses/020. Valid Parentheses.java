 public boolean isValid(String s) {
    //Create Stack object
	Stack<Character> stack = new Stack<Character>();
    //convert string to array of character and loop through each element
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
        //check stack if it is empty or not, and the pop out the value == c?
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
        //judge if the stack is empty or not
	return stack.isEmpty();
}


//Note: Learn Data Structure: stack (including its operations)
		