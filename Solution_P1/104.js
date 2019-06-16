var isSymmetric = function(root) {
    let queue = [];
    queue.push(root);
    queue.push(root);
    
    while (queue.length != 0) {
        let t1 = queue.shift();
        let t2 = queue.shift();
        if (t1 == null && t2 == null) continue;
        if (t1 == null || t2 == null) return false;
        if (t1.val != t2.val) return false;
        queue.push(t1.left);
        queue.push(t2.right);
        queue.push(t1.right);
        queue.push(t2.left);
    }
    return true;
};



var isSymmetric = function(root) {
    return isMirror(root, root);
};

function isMirror(p, q) {
    if (p == null && q == null) return true;
    if (p == null || q == null) return false;
    return (p.val == q.val) && isMirror(p.right, q.left) && isMirror(p.left, q.right);
}