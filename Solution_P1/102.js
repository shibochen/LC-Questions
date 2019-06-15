var levelOrder = function(root) {
    let result = [];
    if (root == null) return result;
    let queue = [root];
    
    while (queue.length != 0) {
        let size = queue.length;
        let list = [];
        for (let i = 0; i < size; i++) {
            let node = queue.shift();
            if (node.left != null) queue.push(node.left);
            if (node.right != null) queue.push(node.right);
            list.push(node.val);
        }
        result.push(list);
    }
    return result;
};