PHASE 1 - For this phase I've made two classes then added sample accession IDs. Add method will compare the new ID to each node starting at the root then moving left or right, smaller or greater. Comparable is required becase the tree depends on compareTo for deciding which value is smaller.

PHASE 2 - I added a height method to the BinarySearchTree class and printed the archive height in Main. Each node takes the taller of its left and right sides and adds 1 with empty spots counting as -1. So the leaves are 0, 25, and 75 are 1 and the root is two.

PHASE 3 - Inorder and preorder traversal methods were added and printed in Main. Inorder prints sorted because it moves from the left side first, then node, then right and in a binary search tree everythign on the left is smaller while right is bigger.

PHASE 4 - I tested an empty tree that returned a heigh of -1 and printed nothing without crashign. A single node tree which returned a height of 0. When sorted data was inserted every node became the right child of the one before it so the tree turned into a straight line with a height of 3, while the balanced sample held 7 nodes with a heighnt of only 2.