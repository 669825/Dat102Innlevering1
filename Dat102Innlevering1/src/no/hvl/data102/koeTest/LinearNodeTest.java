package no.hvl.data102.koeTest;
 
import no.hvl.data102.koeTest.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class LinearNodeTest {
	private LinearNode<Integer> neste;
	private int element;
	
	
	@Test
	public void testSetGetNeste() {
	LinearNode <Integer> node = new LinearNode<>();
	node.setElement(1);
	LinearNode <Integer> node2 = new LinearNode<>();
	node2.setElement(2);
	LinearNode <Integer> forventet = node2;
	LinearNode <Integer> faktisk = node.getNeste();
	assertEquals(forventet, faktisk);
	

	}
	
	
	@Test
	public void testSetGetElement() {
	LinearNode <Integer> node = new LinearNode<>();
	node.setElement(1);
	int forventet = 1;
	int faktisk = node.getElement();
	assertEquals(forventet, faktisk);
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
