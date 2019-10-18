package pair16TestCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import pair16SourceCode.GradeSystems;
import pair16SourceCode.Grades;


public class TestContainID {
	private GradeSystems aTree;
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("src/pair16SourceCode/SimpleData.txt");
	}
	
	@Test
	public void testContainID_1() {
		Grades actual = aTree.containID("962001044");
		
		assertNotNull(actual);
	}
	
	@Test
	public void testContainID_2() {
		Grades actual = aTree.containID("");
		
		assertNull(actual);
	}
	
	@Test
	public void testContainID_3() {
		Grades actual = aTree.containID("96z001044");
		
		assertNull(actual);
	}
	
	@Test
	public void testContainID_4() {
		Grades actual = aTree.containID("123456789");
		
		assertNull(actual);
	}
	
	@Test
	public void testContainID_5() {
		Grades actual = aTree.containID("96200104");
		
		assertNull(actual);
	}
}
