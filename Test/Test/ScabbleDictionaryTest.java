/**
 * 
 */
package Test;

import edu.metrostate.ics240.jwc695.p5.tree.ScarbbleDictionary;
import edu.metrostate.ics240.jwc695.p5.tree.Tree;
import edu.metrostate.ics240.jwc695.p5.tree.TreeNode;

/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 *         (jamisonczech@gmail.com) </A>
 *
 *
 */
public class ScabbleDictionaryTest {

	public static String fileName = "C:\\Users\\Jamison\\Desktop\\workspace\\JWC695_P5_ScrabbleDictionary\\fruits.txt";

	/**
	 * @param args
	 *            main
	 */
	public static void main(String[] args) {

		// instance variables
		final String SEARCH_WORD = "berry";

		ScarbbleDictionary dictionary = new ScarbbleDictionary();
		dictionary.load(fileName);
		
		System.out.println("Depth of BST = " + dictionary.maxDepth());
		System.out.println("Is the word in the BST?: " + dictionary.find(SEARCH_WORD));
		
		// displays BST with preOrder
		dictionary.BSTpreorderTraversal();

		TreeNode<?> root = dictionary.getRoot();
		System.out.println("The root is: " + root.getData());

		TreeNode<?> parentWord = dictionary.getNode(SEARCH_WORD);
		System.out.println("Parent word of node: " + parentWord.getData());
		
		//display BST structure
		final int depth = 0;
		dictionary.printBinaryTree(depth);
		
		
	}
}
