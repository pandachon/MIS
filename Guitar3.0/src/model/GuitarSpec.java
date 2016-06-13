package model;


public class GuitarSpec {
	 private Builder builder; 
	  private Type type;
	  private Wood backWood;
	  private Wood topWood;

	  
	  
	  public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood) {
	    this.builder = builder;
	    this.type = type;
	    this.backWood = backWood;
	    this.topWood = topWood;
	  }

	  public Builder getBuilder() {
	    return builder;
	  }


	  public Type getType() {
	    return type;
	  }


	  public Wood getBackWood() {
	    return backWood;
	  }

	  public Wood getTopWood() {
	    return topWood;
	  }

	  //返回布尔类型。
	  public boolean matches(GuitarSpec otherSpec) {
	    if (builder != otherSpec.builder)
	      return false;
	    if (type != otherSpec.type)
	      return false;
	    if (backWood != otherSpec.backWood)
	      return false;
	    if (topWood != otherSpec.topWood)
	      return false;
	    return true;
	  }
}
