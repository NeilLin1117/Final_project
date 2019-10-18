package pair16TestCode;

import static org.junit.Assert.*;

import org.junit.Test;

import pair16SourceCode.UI;


public class TestUI {
	private UI aUI;

	@Test
	public void testUI_1() {
		aUI = new UI();
		
		assertNotNull(aUI);
	}

}
