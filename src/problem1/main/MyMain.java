package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        int i = 7;
        while(i>0){
            tree.add(scanner.nextInt());
            i--;
        }

        tree.printLeftChild();

        System.out.println(MyBinarySearchTree.noLeftCounter);
    }
}
