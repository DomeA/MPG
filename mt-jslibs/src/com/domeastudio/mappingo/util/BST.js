/**
 * Created by Administrator on 2016/5/6 0006.
 */
define("com/domeastudio/mappingo/util/BST",[],function () {
    var createNew=function () {
        var bst={};
        var root=null;
        var Node=function(element, left, right){
            this.element = element;
            this.left = left;
            this.right = right;
        };
        bst.show=function () {

        };
        bst.insert=function(element) {
            var n = new Node(element, null, null);
            if (root == null) {
                root = n;
            } else {
                var current = root;
                var parent;
                while (true) {
                    parent = current;
                    if (data < current.data) {
                        current = current.left;
                        if (current == null) {
                            parent.left = n;
                            break;
                        }
                    } else {
                        current = current.right;
                        if (current == null) {
                            parent.right = n;
                            break;
                        }
                    }
                }
            }
        };

        bst.inOrder=function(node) {
            if (!(node == null)) {
                inOrder(node.left);
                alert(node.show() + " ");
                inOrder(node.right);
            }
        };

        function preOrder(node) {
            if (!(node == null)) {
                alert(node.show() + " ");
                preOrder(node.left);
                preOrder(node.right);
            }
        }

        function postOrder(node) {
            if (!(node == null)) {
                postOrder(node.left);
                postOrder(node.right);
                alert(node.show() + " ");
            }
        }

        function getMin() {
            var current = this.root;
            while (!(current.left == null)) {
                current = current.left;
            }
            return current.data;
        }

        function getMax() {
            var current = root;
            while (!(current.right == null)) {
                current = current.right;
            }
            return current.data;
        }
        return bst;
    };
    return {
        getInstance:createNew
    };
});