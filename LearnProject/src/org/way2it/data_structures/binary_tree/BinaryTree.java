package org.way2it.data_structures.binary_tree;

public class BinaryTree {

    // Represents the first node of this tree
    // Should be initialized when first value is added
    private Node root;

    private int size = 0;

    public BinaryTree() {
    }

    // Should add new value to the tree according to binary tree rules:
    // Values that are less than or equal to the value in the current node, should be placed in the left subtree
    // Values that are greater than the value in the current node - should be placed in the right subtree
    public void add(int value) {
        if (root == null) {
            root = new Node();
            root.value = value;
        } else {
            addToTheTree(value, root);
        }
        size++;
    }

    // Should remove specified value from tree and return true
    // If value does not exist in this tree - return false
    public boolean remove(int value) {
        if (size == 0) {
            return false;
        }
        if (size == 1 & root.value == value) {
            root = null;
        } else {

            Node nodeForDelete = find(value, root);
            if (nodeForDelete == null) {return  false;}

            if(nodeForDelete.left == null & nodeForDelete.right == null) {
                Node parent = findParent(value, root);
                if (parent != null && parent.left == nodeForDelete) {
                    parent.left = null;
                    size--;
                    return true;
                } else {
                    if (parent != null) {
                        parent.right = null;
                        size--;
                        return true;
                    }
                    return false;
                }

            } else if (nodeForDelete.left == null) {
                nodeForDelete.value = nodeForDelete.right.value;
                nodeForDelete.left  = nodeForDelete.right.left;
                nodeForDelete.right = nodeForDelete.right.right;

            } else if (nodeForDelete.right == null) {
                nodeForDelete.value = nodeForDelete.left.value;
                nodeForDelete.right = nodeForDelete.left.right;
                nodeForDelete.left  = nodeForDelete.left.left;

            } else {
                Node minNode = findMin(nodeForDelete.right);
                nodeForDelete.value = minNode.value;
            }

        }
        size--;
        return true;
    }

    // Should return true if this tree contains specified value, false - otherwise
    public boolean contains(int value) {
        return find(value, root) != null;
    }

    public int getSize() {
        return size;
    }

    private static class Node {
        int value;
        Node left;
        Node right;
    }

    private static void addToTheTree(int value, Node currNode) {
        if (currNode == null) {
            currNode = new Node();
            currNode.value = value;
        } else {
           if (currNode.value >= value) {
                if (currNode.left == null) {
                    currNode.left = new Node();
                    currNode.left.value = value;
                } else {
                    addToTheTree(value, currNode.left);
                }
            } else {
                if(currNode.right == null) {
                    currNode.right = new Node();
                    currNode.right.value = value;
                } else {
                    addToTheTree(value, currNode.right);
                }
            }
        }
    }

    private static Node find(int value, Node currNode) {
        if (currNode == null) {
            return null;
        } else if (currNode.value == value) {
            return currNode;
        } else {
            if (currNode.value >= value) {
                return find(value, currNode.left);
            } else {
                return find(value, currNode.right);
            }
        }
    }

    public static Node findMin(Node currNode) {
        if (currNode.left == null) {
            return currNode;
        } else {
            return findMin(currNode.left);
        }
    }

    private static Node findParent(int value, Node currNode){

        if (currNode.right != null) {
            if (currNode.right.value == value) {
                return currNode;
            } else {
                if (currNode.right.value >= value) {
                    return  findParent(value, currNode.right.left);
                } else {
                    return  findParent(value, currNode.right.right);
                }
            }
        }

        if (currNode.left != null) {
            if (currNode.left.value == value) {
                return currNode;
            } else {
                if (currNode.left.value >= value) {
                    return  findParent(value, currNode.left.left);
                } else {
                    return  findParent(value, currNode.left.right);
                }
            }
        }

        return null;

    }

 }
