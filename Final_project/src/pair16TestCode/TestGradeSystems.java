package pair16TestCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pair16SourceCode.GradeSystems;
import pair16SourceCode.Grades;


public class TestGradeSystems {
	private GradeSystems aTree;
	
	@Before
	public void createGradeSystems() {
		aTree = new GradeSystems("src/pair16SourceCode/SimpleData.txt");
	}
	
	@Test
	public void testGradeSystems_1() {
		Grades aGrade = aTree.containID("962001044");
		double expected = 87;
		double actual = aGrade.lab1;
		
		assertEquals(expected, actual, 0.00001);
	}
	
	@Test
	public void testGradeSystems_2() {
		Grades aGrade = aTree.containID("962001051");
		double expected = 98;
		double actual = aGrade.lab2;
		
		assertEquals(expected, actual,0.00001);
	}

}
