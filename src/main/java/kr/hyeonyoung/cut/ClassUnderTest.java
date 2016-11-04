package kr.hyeonyoung.cut;

public class ClassUnderTest {
	private Doc b;
	
	public void setDoc(Doc b) {
		this.b = b;
	}
	
	public void doIt(String str) {
		if(str =="Hello")
			b.say("Hello World!");
			
	}
}
