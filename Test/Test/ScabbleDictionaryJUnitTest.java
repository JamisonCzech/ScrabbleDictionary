/**
 * 
 */
package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.metrostate.ics240.jwc695.p5.tree.ScarbbleDictionary;

/**
 * @author Jamison Czech <A HREF="mailto:main@jamisonczech@gmail.com">
 *         (jamisonczech@gmail.com) </A>
 *
 *
 */
public class ScabbleDictionaryJUnitTest {
	ScarbbleDictionary scrabbleBST;

	@Before
	public void createTree() {
		scrabbleBST = new ScarbbleDictionary();
		scrabbleBST.load(ScabbleDictionaryTest.fileName);
	}

	@Test
	public void testMethodLoad() {
		scrabbleBST.load(ScabbleDictionaryTest.fileName);
	}

	@Test
	public void testMethodFind() {
		scrabbleBST.load(ScabbleDictionaryTest.fileName);
		assertTrue(scrabbleBST.find("berry"));
		assertFalse(scrabbleBST.find("nut"));
	}
	
	@Test
	public void testMethodMaxDepth() {
		scrabbleBST.load(ScabbleDictionaryTest.fileName);
		
	}
	
	@Test
	public void testMethodGetRoot() {
		scrabbleBST.load(ScabbleDictionaryTest.fileName);
		
	}
	
	@Test
	public void testMethodGetNode() {
		scrabbleBST.load(ScabbleDictionaryTest.fileName);
		
	}
	
	
}
