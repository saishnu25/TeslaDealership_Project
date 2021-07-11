  public abstract class TeslaCar{
	  
	  //declaring data 
	  private String carType;
	  private String[] features = new String[3];
	  private String battery;
	  private int weight;
	  private String acceleration;
	  private int cargoSize;
	  private int range;
	  private String displayDetails;
	  private String driveDetails;
	  private String supercharge;
	  private int seatingSize;
	  private String onboardCharger;
	  private int basePrice;
	  private String warranty;
	  
	  //declaring setter functions
	  public void setCarType(String carType){
		  this.carType = carType;
	  }
	  
	  public void setFeatures(String... features){
	      this.features[0] = features[0];
		  this.features[1] = features[1];
		  this.features[2] = features[2];
	  }
	  
	  //setter for all data besides carType, features and warranty.
	  public void setSpecs(String battery, int weight, String acceleration, int cargo, int range, String display,
	  String drive, String supercharge, int seatingSize, String onboardCharger, int basePrice){
	      this.battery = battery;
	      this.weight = weight;
	      this.acceleration = acceleration;
	      this.cargoSize = cargo;
	      this.range = range;
	      this.displayDetails = display;
	      this.driveDetails = drive;
	      this.supercharge = supercharge;
	      this.seatingSize = seatingSize;
	      this.onboardCharger = onboardCharger;
	      this.basePrice = basePrice;
	   }
	   
	  public void setWarranty(String warranty){
		  this.warranty = warranty;
	  }

	  public abstract void setInteriorColors(String... colors);
	  
	  public abstract void setExteriorColors(String... colors);

	  public abstract void setWheelSize(int... wheelSize); 
	  
	  //getter functions
	  public String getCarType(){
		  return carType;
	  }
	  
	  public String getFeatures(int x){
		  return features[x-1];
	  }
	  
	  public String getBattery(){
	      return battery;
	  }
	   
	  public int getWeight(){
	      return weight;
	  }
	   
	  public String getAcceleration(){
	      return acceleration;
	  }
	   
	  public int getCargo(){
	      return cargoSize;
	  }
	   
	  public int getRange(){
	      return range;
	  }
	   
	  public String getDisplay(){
	      return displayDetails;
	  }
	   
	  public String getDrive(){
	      return driveDetails;
	  }
	   
	  public String getSupercharge(){
	      return supercharge;
	  }
	   
	  public int getSeatingSize(){
	      return seatingSize;
	  }
	   
	  public String getOnboardCharger(){
		  return onboardCharger;
	  }
	  	   
	  public String getWarranty(){
	      return warranty;
	  }
	   
	  public int getBasePrice(){
	      return basePrice;
	  }
	   
	  public abstract String getInteriorColors(int x);
	   
	  public abstract String getExteriorColors(int x);
	  
	  public abstract int getWheelSize(int x);
	  
}