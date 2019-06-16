const height = (root) => {
    if (!root) {
        return 0;
    }
    const left = height(root.left);
    const right = height(root.right);
    if (left === -1 || right === -1 || Math.abs(left - right) > 1) {
        return -1;
    }
    return Math.max(left, right) + 1;
};

var isBalanced = function(root) {
    return height(root) !== -1;
};
