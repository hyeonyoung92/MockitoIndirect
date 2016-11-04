package kr.hyeonyoung.cut;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestCUT{
	@Test
	public void testDoItWithHello() {
		ClassUnderTest a = new ClassUnderTest();
		Doc b = mock(Doc.class);
		a.setDoc(b);
		
		a.doIt("Hello");
		a.doIt("Hello");
		verify(b, times(2)).say("Hello World!");
	}
	
	@Test
	public void testDoItWithNothingParameter() {
		ClassUnderTest a = new ClassUnderTest();
		Doc b = mock(Doc.class);
		a.setDoc(b);
		
		a.doIt("Hello1");
		verify(b, never()).say(anyString());
	}
}
