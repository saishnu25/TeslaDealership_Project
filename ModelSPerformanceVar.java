  public class ModelSPerformanceVar extends ModelS {
	  
	  //declaring wheelSize[] to store the types of wheel sizes for this variant
	  private int[] wheelSize = new int[2];

	  //constructor to update carType and set the remaining data
	  public ModelSPerformanceVar(){
		  this.setCarType("Model S (Performance Variant)");
		  this.setSpecs("Long Range", 4929, "2.3 seconds 0-60 mph", 28, 387, "Driver Display w/ 17\" Touchscreen",
		  "All-Wheel Drive", "250 kW max; Pay Per Use", 5, "11.5 kW max (48A)", 91990); //without wheelSize and warranty
		  this.setWarranty("Basic Vehicle - 4 years or 50,000 miles, whichever comes first\nBattery & Drive Unit - 8 years or 150,000 miles, whichever comes first");
		  this.setWheelSize(19,21);
	  }
	  
	  //setter function for wheel size(s)
	  @Override
	  public void setWheelSize(int... wheelSize){
		  this.wheelSize[0] = wheelSize[0];
		  this.wheelSize[1] = wheelSize[1];
	  }
	  
	  //getter function for wheel size(s)
	  @Override
	  public int getWheelSize(int x){
		  return wheelSize[x-1];
	  }
	  
	  @Override
	  public String toString(){
		  return String.format("%s\nSpecs\n"
		                       +"Battery: %s\n"
							   +"Weight: %d lbs\n"
							   +"Acceleration: %s\n"
							   +"Cargo Size: %d cubic ft\n"
							   +"Range: %d miles\n"
							   +"Displays: %s\n"
							   +"Drive: %s\n"
							   +"Supercharging: %s\n"
							   +"Seating: %d pax\n"
							   +"Onboard Charger: %s\n"
							   +"Wheel Size: %d\" or %d\"\n"
							   +"Warranty Details:\n%s\n\n"
							   +"Base Price: $%d\n",
							   super.toString(), getBattery(), getWeight(), getAcceleration(), getCargo(), getRange(), getDisplay(),
							   getDrive(), getSupercharge(), getSeatingSize(), getOnboardCharger(), getWheelSize(1), getWheelSize(2),
							   getWarranty(), getBasePrice());
	  }
  
  }