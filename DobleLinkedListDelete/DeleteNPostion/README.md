# GeekkforGeekLinkedList
Delete a node in a doubly linked list

Input: Dull = 2->45->3->1, Node = 45.
Output: 2->3->1

Input: Dull = 2->45->3->1, Node = 1
Output: Dull = 2->45->3.

Approach: The deletion of a node in a double-linked list can be divided into three main categories:
After the deletion of the head node.
After the deletion of the middle node.
After the deletion of the last node.

Algorithm:
Let the node to be deleted be del.
if node to be deled is head node, then change the head pointer to enext current head.
