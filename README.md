# Great Learning Lab 3 - DSA Solution

This repository contains the DSA Lab Session program for Great Learning for [**Great Learning - FSD Course**](https://www.greatlearning.in/advanced-certification-full-stack-software-development-iit-roorkee)


## Details

### Problem Statement 1

- ### Balancing Brackets
  > Given a string of Brackets determine whether the string entered is a Balanced Brackets or Unbalanced Brackets String.

- ### Longest Path in Binary Tree
  > Given a Binary Tree, find the longest path from the root to the leaf.




### Solution Details

- ### Balancing Brackets
  > - I have used a Stack to determine the balance. 
  > - For every opening bracket, it is pushed in the Stack while for every closing bracket a pop is done and matched with the current bracket to determine closure.

- ### Longest Path in Binary Tree
  > - An ArrayList is created for the Left Tree and Right Tree for each node starting from the rightmost leaf. 
  > - At every node the ArrayList with smaller size is discarded. The current node is added in the remaining list and the process continues till all nodes are traversed.
  > - The ArrayList which remained till last, contains all the nodes of the Longest Path in opposite order, i.e., the leaf at the beginning of the list and the root at the end. 
  > - Print the ArrayList in reverse order to get the longest path from root.

Both the solution contains a Driver class which contains the `main()` method to run the program. 


##  Author
Project created by :  **SHUBHAM KUMAR SHUKLA**