import java.util.*; 
import java.io.File;
import java.io.FileWriter;   
import java.io.IOException;


/**
 * ** Disclamer: 
 * This program is intended for our CSCI117 (Java Programming) project during Fall 2020 semester. 
 * No one in this group is affiliated with Tesla and the brand. All rights go to the Tesla company.
 * This program is designed for educational purposes ONLY and to not be used elsewhere. **
 * 
 * This project is developed to create a online Tesla dealership where the user can pick and customize a Tesla model to their needs.
 *               
 * 
 */

public class TeslaMain
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int choice;
		char exitChoice;

		
        while(true){
			//welcome screen and choosing car model
			System.out.println("*** Welcome to Tesla ***");
			System.out.println("** Please input a number from 1 - 4 to pick model **");
			System.out.println("1. Model S \n2. Model 3 \n3. Model X \n4. Model Y ");
			System.out.println("\n* To exit the program press 0 *");
			choice = input.nextInt();
        
        
			switch(choice){
        
				//Model S
				case 1:
					//choosing variant
					System.out.println("\nChoice: " + choice);
					System.out.println("Model: Model S");
					System.out.println("Which variant would you like?");
					System.out.println("1. Performance \n2. Long Range Plus");
					choice = input.nextInt();
			
					while(choice != 1 && choice != 2){
						System.out.println("Error! Please enter 1 or 2.");   
						choice = input.nextInt();
					}
			
					if(choice == 1){
						ModelSPerformanceVar car = new ModelSPerformanceVar(); //creating object of variant type
						System.out.println(car);                               //showing details
						
						ConfirmOrder(input,choice,car);                        //confirming if user would like to buy said variant or not
					}
				
					else {
						ModelSLongRangePlusVar car = new ModelSLongRangePlusVar(); 
						System.out.println(car);                               
						
						ConfirmOrder(input,choice,car);                       
					}
					
					break;
            
				//Model S
				case 2:
					//choosing variant
					System.out.println("Choice: " + choice);
					System.out.println("Model: Model 3");
					System.out.println("Which variant would you like?");
					System.out.println("1. Performance \n2. Long Range AWD \n3. Standard Plus");
					choice = input.nextInt();
					
					while(choice != 1 && choice != 2){
						System.out.println("Error! Please enter 1 or 2.");   
						choice = input.nextInt();
					}
			
					if(choice == 1){    
						Model3PerformanceVar car = new Model3PerformanceVar();
						System.out.println(car);   
					
						ConfirmOrder(input,choice,car);
					}
			
					else if(choice == 2){
						Model3LongRangeAWDVar car = new Model3LongRangeAWDVar();
						System.out.println(car);   
                
						ConfirmOrder(input,choice,car);
					}
                
					else if(choice == 3){
						Model3StandardPlusVar car = new Model3StandardPlusVar();
						System.out.println(car);   
                
						ConfirmOrder(input,choice,car);
					}
					
					break;
            
				//Model X
				case 3:
					//choosing variant
					System.out.println("Choice: " + choice);
					System.out.println("Model: Model X");
					System.out.println("Which variant would you like?");
					System.out.println("1. Performance \n2. Long Range Plus");
					choice = input.nextInt();
					
					while(choice != 1 && choice != 2){
						System.out.println("Error! Please enter 1 or 2.");   
						choice = input.nextInt();
					}
					
					if(choice == 1){                    
						ModelXPerformanceVar car = new ModelXPerformanceVar();
						System.out.println(car);   
                
						ConfirmOrder(input,choice,car);
					}
				
					else if(choice == 2){
						ModelXLongRangePlusVar car = new ModelXLongRangePlusVar();
						System.out.println(car);   
                
						ConfirmOrder(input,choice,car);
					}
                
					break;
            
				//Model Y
				case 4:
					//choosing variant
					System.out.println("Choice: " + choice);
					System.out.println("Model: Model Y");
					System.out.println("Which variant would you like?");
					System.out.println("1. Performance \n2. Long Range AWD");
					choice = input.nextInt();
					
					while(choice != 1 && choice != 2){
						System.out.println("Error! Please enter 1 or 2.");   
						choice = input.nextInt();
					}
					
					if(choice == 1){                    
						ModelYPerformanceVar car = new ModelYPerformanceVar();
						System.out.println(car);   
						
						ConfirmOrder(input,choice,car);
					}
			
					else if(choice == 2){
						ModelYLongRangeAWDVar car = new ModelYLongRangeAWDVar();
						System.out.println(car);   
                
						ConfirmOrder(input,choice,car);
					}
                
					break;
            
				case 0: 
					System.out.println("Choice: " + choice);
			
					//confirmation message
					System.out.println("Are you sure you want to leave? (y/n)");
					exitChoice = input.next().charAt(0);
			
					//rejecting char values besides y and n
					while(exitChoice != 'y' && exitChoice != 'n'){
						System.out.println("Error! please enter y to exit or n to continue.");
						exitChoice = input.next().charAt(0);
					}
			
					//exiting program
					if (exitChoice == 'y'){
						System.out.println("Ok, thank you for visiting and goodbye!"); 
						System.exit(0);
					}
					break;
             
				default:
					System.out.println("Error! Please input a number from 0 to 4");
				break;
        }
    }
}
	
  public static void ConfirmOrder(Scanner input, int choice, TeslaCar car){
	  
	  //confirmation message
	  System.out.println("Is Choice No."+ choice + " your decision?");
	  System.out.println("Press \n1. Yes \n2. No");
	  choice = input.nextInt();
	  
	  //rejecting int values besides 1 and 2	  
	  while (choice != 1 && choice != 2){
		  System.out.println("Error! Please enter 1 or 2");
		  choice = input.nextInt();
	  }
	  
	  //calling Receipt() if order is confirmed
	  if(choice == 1)
		  Receipt(car.getBasePrice(), car.getCarType());
  }

	//receipt function
	/**
	* This is the Receipt function. (Under construction -Abdullah)
	* Takes price of car chosen, with all relevant specs pricing
	* Taken payment plan chosen
	* Displays above data into a generated receipt for customer
	* sidequest: Create a .txt file to also hold receipt
	*/

  public static void Receipt(int x, String name){
 	 
   	double taxRate = 5.75;
   	double totalTax = x * taxRate / 100;
   	double totalNet = x + totalTax;
	 
  	 
   	System.out.println("Here is the total net Price for the car you chose: $" + totalNet);
  	 
   	System.out.println("Would you like to save your receipt digitally?");
   	System.out.println("Press 1 to save your receipt, 0 to exit.");

   	Scanner sc = new Scanner(System.in);    
   	int printRec = sc.nextInt();
  	 
   	if (printRec == 1){
  	 
  	 
   	//Try block to create the Receipt file.
   	// Also checks availability of file name.
  	try{
       	File myObj = new File("TeslaReceipt.txt");
       	if (myObj.createNewFile()){
           	System.out.println ("Your receipt has been created! Saved as: "+ myObj.getName());
                    	//Writing to the created file:
                     	try {
                      	FileWriter myWriter = new FileWriter("TeslaReceipt.txt");
                      	myWriter.write("Here is the information regarding your car! \n");
                     	myWriter.write("\nCongrats on your purchase of a Tesla " + name);
                      	myWriter.write("\nYour total after tax is:  $" + totalNet );
                      	myWriter.write("\nYour transaction was completed on: " + java.time.LocalDate.now());
                      
                      	myWriter.close();
                      	System.out.println("Digital Receipt was transferred successfully");
                    	}
                    	catch (IOException e) {  //error handling
                      	System.out.println("An error occurred.");
                      	e.printStackTrace();
                    	}
        	} else
         	System.out.println("A receipt with the same name is already present");
  	}
    
 	catch (IOException e) {   //error handling
  	System.out.println("Unable to save receipt to your device.");
  	e.printStackTrace();
	}
    
}
	else
		System.out.println("Goodbye! Thank you for your purchase.");
}
}
 


 

