package model;

public enum Builder {
	  GIBSON, OLSON, RYAN;
	  public String toString() {
	    switch(this) {
	      case GIBSON:   return "Gibson";
	      case OLSON:    return "Olson";
	      case RYAN:     return "Ryan";
	      default:       return "Unspecified";
	    }
	  }
}
