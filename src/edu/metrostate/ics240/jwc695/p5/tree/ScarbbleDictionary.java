/**
 * 
 */
package edu.metrostate.ics240.jwc695.p5.tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Jamison
 *
 */
public class ScarbbleDictionary {

	// instance variables
	private Scanner entireTextFile;
	private String word;
	private Tree<String> tree;
	private ArrayList<String> tempTree;
	private String enterWord;

	/**
	 * no argument constructor
	 */
	public ScarbbleDictionary() {

	}

	/**
	 * <b>Precondition:</b> filename contains path to the wordfile wordfile has
	 * one word per line in no assumed order
	 * 
	 * @param fileName
	 *            the location of the file to be entered into the BST
	 *            <b>Postcondition:</b> a BST of dataType T is instantiated
	 */
	public void load(String fileName) {

		tree = new Tree<String>();
		tempTree = new ArrayList<String>();

		try {
			entireTextFile = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (entireTextFile.hasNextLine()) {
			word = entireTextFile.nextLine();
			tempTree.add(word);

		} // end while

		while (tempTree.size() != 0) {
			int randomWord = (int) ((Math.random() * tempTree.size()));
			enterWord = tempTree.remove(randomWord);
			tree.insertNode(enterWord);
		}
	}// end method load

	/**
	 * Uses a preorder traversal to print the data from each node at or below
	 * this node of the binary tree. <b>Postcondition:</b> preorder traversal is
	 * displayed
	 **/
	public void BSTpreorderTraversal() {
		tree.preorderTraversal();

		/** tests data
		System.out.println(tree.root.getData() + " is the root.");
		System.out.println("There are " + tree.size() + " nodes int this BST.");
		System.out.println(tree.findWord("berry") + " was found!");
		System.out.println("There are " + tree.countLeaves() + " leaves");
		System.out.println("Tree Depth = " + tree.depthOfBST());
		
		tree.print();
		*/
	}

	/**
	 * searches for a string <CODE>a string</CODE> in the BST
	 * 
	 * @param word
	 *            is the word returned <b>Postcondition:</b>
	 * @return true if word was found
	 */
	public boolean find(String word) {
		if (tree.findWord(word) != null) {
			return true;
		}
		return false;
	}

	/**
	 * (
	 * 
	 * @return height of Binary Search tree <b>Postcondition:</b> returns a
	 *         <CODE> int </CODE> that gives the height of the Search Tree
	 */
	public int maxDepth() {
		return tree.depthOfBST();
	}

	/**
	 * 
	 * @return the root of the Bianry Search Treev <b>Postcondition:</b> BST
	 *         root
	 */
	public TreeNode<?> getRoot() {
		return tree.getRoot();
	}

	/**
	 * 
	 * @param word
	 *            is the String parameter <b>Postcondition:</b>
	 * @return either the node containing the specified word or null if the word
	 *         is not found
	 */
	public TreeNode<?> getNode(String word) {
		return tree.getParent(word);

	}

	public void  printBinaryTree(int depth) {
		 tree.printBinaryTree(depth);
		
	}

	

}// end class ScarbbleDictionary
