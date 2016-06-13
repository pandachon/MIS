package model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Dao.inventoryDao;

public class Inventory {
	  private static List guitars;
	  private inventoryDao   inventoryIDao ;
	  public Inventory() {
	    guitars = new LinkedList();
	  }
	//库存增加：
	  public void addGuitar(String serialNumber, double price,String model,int numStrings,
	                        GuitarSpec spec) {
	  Guitar guitar = new Guitar(serialNumber, price,model,numStrings, spec);
	  guitars.add(guitar);
	  System.out.println("wohao"+guitars.size());
	  
	  }
	  //搜索
	  public static List search(GuitarSpec searchSpec) {
	    List matchingGuitars = new LinkedList();
	    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSpec().matches(searchSpec))
	        matchingGuitars.add(guitar);
	    }
	    return matchingGuitars;
	  }
	  
	  
	  public Guitar getGuitar(String serialNumber) {
		    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
		      Guitar guitar = (Guitar)i.next();
		      if (guitar.getSerialNumber().equals(serialNumber)) {
		        return guitar;
		      }
		    }
		    return null;
		  }
}
