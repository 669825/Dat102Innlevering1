package no.hvl.data102.koeTest;

import no.hvl.data102.koeTest.*;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class KjedetKoeTest{
	
	
	@Test
	public void testInnkoe() {
	KjedetKoe<Integer> koe = new KjedetKoe<>();
	//tester InnKoe() når kø er tom, 1 skal bli 
	//satt først i tabellen
    koe.innKoe(1);
	assertEquals(1,koe.foerste().intValue());
	//sjekker om nytt element blir lagt bakers i kø
	koe.innKoe(2);
	//fjerner første element, element 2 skal bli først 
	koe.utKoe();
	assertEquals(2,koe.foerste().intValue());
	}
	
	@Test
	public void testUtKoe() {
	KjedetKoe <Integer> koe = new KjedetKoe<>();
	koe.innKoe(20);
	int faktisk = koe.utKoe();
	assertEquals(20, faktisk);
    //sjekker om køen er tom, elemeentet ble fjernet
	assertThrows(EmptyCollectionException.class,()->koe.utKoe());
	}
	
	@Test
	public void testFoerste() {
	KjedetKoe <Integer> koe = new KjedetKoe<>();
	assertThrows(EmptyCollectionException.class,()->koe.utKoe());
	koe.innKoe(1);
	koe.innKoe(2);
	assertEquals(1,koe.utKoe().intValue());
	}
	
	@Test
	public void testErTom() {
	KjedetKoe <Integer> koe = new KjedetKoe<>();
	assertEquals(true,koe.erTom());	
	}
	
	@Test
	public void testToString() {
	KjedetKoe <Integer> koe = new KjedetKoe<>();
	koe.innKoe(1);
	koe.innKoe(2);
	koe.innKoe(3);
	String forventet = " 1"+"n/"+" 2"+"n/"+" 3"+"n/";
	String faktisk = koe.toString();
	assertEquals(forventet, faktisk);
	}
	
	
	
			
	
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

