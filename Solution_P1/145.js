var postorderTraversal = function(root) {
    let result = [];
    if (root == null) return result;
    let stack = [root];
    
    while (stack.length != 0) {
        let node = stack.pop();
        result.unshift(node.val);
        if (node.left) stack.push(node.left);
        if (node.right) stack.push(node.right);
    }
    return result;
};