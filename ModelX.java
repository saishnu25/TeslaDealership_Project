  public abstract class ModelX extends TeslaCar{
	  
      //declaring color arrays to store available color choices
	  private String[] interiorColors = new String[3];
	  private String[] exteriorColors = new String[5];
      
	  //constructor to set features, carType, and colors
      public ModelX(){
          this.setFeatures("- Falcon door (doors opens vertically)","- Highly modded sensors to enable autopilot","- Premium audio system specifically tuned for a Tesla's ultra-quiet cabin");
		  this.setCarType("Model X");
		  this.setInteriorColors("Black w/ Ash Wood decor","Black & White w/ Dark Ash Wood decor","Cream w/ Oak Wood decor");
		  this.setExteriorColors("White","Black","Silver","Blue","Red");
	  }
	  
	  //setter functions for colors
	  @Override
	  public void setInteriorColors(String... colors){
		  this.interiorColors[0] = colors[0];
		  this.interiorColors[1] = colors[1];
		  this.interiorColors[2] = colors[2];
	  }
	  
	  @Override
	  public void setExteriorColors(String... colors){
		  this.exteriorColors[0] = colors[0];
		  this.exteriorColors[1] = colors[1];
		  this.exteriorColors[2] = colors[2];
		  this.exteriorColors[3] = colors[3];
		  this.exteriorColors[4] = colors[4];
	  }
	  
	  //getter functions for colors
	  @Override
	  public String getInteriorColors(int x){
		  return interiorColors[x-1];
	  }
	  
	  @Override
	  public String getExteriorColors(int x){
		  return exteriorColors[x-1];
	  }
	  
	  @Override
	  public String toString(){
		  return String.format("%s\n\nFeatures\n%s\n%s\n%s\n", getCarType(), getFeatures(1), getFeatures(2),getFeatures(3));
	  }
}