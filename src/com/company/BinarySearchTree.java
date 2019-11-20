package com.company;

import java.util.Scanner;

public class BinarySearchTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BST bst = new BST();
        //creating com.company.BST object
        System.out.println("Binary Search Tree Test\n");
        char ch;
        do {
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Count Nodes");
            System.out.println("5. Check Empty");

            int choice = scan.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    bst.insert (scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter integer element to delete");
                    bst.delete( scan.nextInt() );
                    break;
                case 3 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ bst.search( scan.nextInt() ));
                    break;
                case 4 :
                    System.out.println("Nodes = "+ bst.countNodes());
                    break;
                case 5 :
                    System.out.println("Empty status = "+ bst.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }

            System.out.print("\nPost order : ");
            bst.postorder();
            System.out.print("\nPre order : ");
            bst.preorder();
            System.out.print("\nIn order : ");
            bst.inorder();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

            } while (ch == 'Y' || ch == 'y');
        }
    }

