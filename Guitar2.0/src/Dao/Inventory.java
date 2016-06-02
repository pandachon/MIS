package Dao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Inventory {
	private static List<Guitar> guitars;
	public Inventory(){
		setGuitars(new LinkedList<Guitar>());
		}
	public static List<Guitar> getGuitars() {
		return guitars;
	}
	public void setGuitars(List<Guitar> guitars) {
		Inventory.guitars = guitars;
	}
	
	public void addGuitar(String serialNumber, double price, String model, int numStrings, GuitarSpec spec) {
		Guitar guitar = new Guitar(serialNumber, price, model, numStrings, spec);
		getGuitars().add(guitar);
	}
	public Guitar getGuitar(String serialNumber){
		for(Iterator i=guitars.iterator();i.hasNext();){
			Guitar guitar=(Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)){
				return guitar;
			}
		}
		return null;
	}
	public List<Guitar> search(GuitarSpec spec){
		List<Guitar> guitars = new LinkedList<Guitar>();
	for (Iterator<Guitar> i = getGuitars().iterator(); i.hasNext(); ) {
			
			Guitar guitar = (Guitar)i.next();
			
			if (guitar.getSpec().matches(spec)){
				guitars.add(guitar);
			}				
		}
		return guitars;
	}

}
