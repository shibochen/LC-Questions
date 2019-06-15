var preorderTraversal = function(root) {
    let result = [];
    if (!root) return result;
    let stack = [];
    stack.push(root);
    
    while (stack.length) {
        let node = stack.pop();
        result.push(node.val);
        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
    }
    return result;
};