
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*This is a program that will allow the user to add, remove, update, view and print
 * inventory list of vehicle stored in the program*/
public class Vehicle_Inventory{

	private String carMake;
	private String carModel;
	private String carColor;
	private int carYear;
	private int carMileage;
	
	/*Default constructor is written below*/
	public void Vehicle_Inventory() {
		this.carMake = "Make of the car";
		this.carModel = "Model of the car";
		this.carColor= "Color of the car";
		this.carYear = 0000;
		this.carMileage = 0;
						
	}
	
	/*Parameterized constructor*/
	public void Vehicle_Inventory(String make, String model, String color, int year, int mileage) {
		this.carMake = make;
		this.carModel = model;
		this.carColor= color;
		this.carYear = year;
		this.carMileage = mileage;
						
	}
	
	
	/*Setter method shown below*/
	public void setcarMake(String make) {
    	this.carMake = make;
    }
    public void setcarModel(String model) {
    	this.carModel = model;
    }
    public void setcarColor(String color) {
    	this.carColor = color;
    }
    public void setcarYear(int year) {
    	this.carYear = year;
    }
    public void setcarMileage(int mileage) {
    	this.carMileage = mileage;
    }
	
	
	/*Getter method shown below*/
	public String getcarMake() {
   	    return this.carMake;
   }
   public String getcarModel() {
   	    return this.carModel;
   }
   public String getcarColor() {
   	    return this.carColor;
   }
   public int getcarYear() {
   		return this.carYear;
   }
   public int getcarMileage() {
   	    return this.carMileage;
   }

   public static void main(String[] args){

	   Vehicle_Inventory car = new Vehicle_Inventory ();
      
       car.setcarMake("");
       String make = car.getcarMake();

       car.setcarModel("");
       String model = car.getcarModel();

       car.setcarColor("");
       String color = car.getcarColor();

       car.setcarYear(0);
       Integer year = car.getcarYear();

       car.setcarMileage(0);
       Integer mileage = car.getcarMileage();

       /* This allows the users to enter data */
       Scanner input = new Scanner(System.in); 
       
       /* new integer variable are introduced.   */
       int removeCar;
       int updateCar;
       
       /* This allows the data entered in the vehicle to be stored in an array */
       ArrayList<String> carMake = new ArrayList<>();
       ArrayList<String> carModel = new ArrayList<>();
       ArrayList<String> carColor = new ArrayList<>();
       ArrayList<Integer> carYear = new ArrayList<>();
       ArrayList<Integer> carMileage = new ArrayList<>();
       
       do { 
           try { 
        	   System.out.println(""); 
               System.out.println("What would you like to do? (Pick 1-5) \n");
               
               System.out.println("1. Add a new vehicle?");
               System.out.println("2. Remove a vehicle");
               System.out.println("3. Update the vehicle");
               System.out.println("4. View all the vehicles in the inventory");
               System.out.println("5. Print all data to a text file");
               
               int menu = input.nextInt();
               
               if (menu == 1) {
            	   /* These are questions the user would be prompted to answer*/
            	   System.out.println("What is the Make of the vehicle of interest?");
            	   make = input.next();
            	   carMake.add(make);

            	   System.out.println("What is the Model of the vehicle of interest?");
            	   model = input.next();
            	   carModel.add(model);

            	   System.out.println("What is the Color of the vehicle of interest?");
            	   color = input.next();
            	   carColor.add(color);

            	   System.out.println("What is the Year of the vehicle of interest?");
            	   year = input.nextInt();
            	   carYear.add(year);

            	   System.out.println("What is the Mileage on the vehicle of interest?");
            	   mileage = input.nextInt();
            	   carMileage.add(mileage);   
           }
               /*If the user selects menu 2 to remove a vehicle then the user will be given options
                * to select the vehicle that the user wants to remove*/
               else if (menu == 2) {
               System.out.println("What vehicle would you like to remove? (Select the number)");

               for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() 
               		&& i < carMileage.size(); i++)
                   System.out.println(carMake.indexOf(carMake.get(i)) + ": " +carMake.get(i) + ", " + carModel.get(i) 
                   + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
               removeCar = input.nextInt();
               carMake.remove(removeCar);
               carModel.remove(removeCar);
               carColor.remove(removeCar);
               carYear.remove(removeCar);
               carMileage.remove(removeCar);

           } 
               /*If the user selects menu 3 to update a vehicle then the user will be given options
                * to select the vehicle that the user wants to update
                * After that the user will be asked about the make, model, color, year and mileage
                * of the vehicle that the user wants to update*/
               else if (menu == 3) {
               System.out.println("What car would you like to update? (Select the number)");

               for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() 
               		&& i < carYear.size() && i < carMileage.size(); i++)
                   System.out.println(carMake.indexOf(carMake.get(i)) + ": " +carMake.get(i) + ", " + 
               		carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");

               updateCar = input.nextInt();
               System.out.println("Please update the car Make:");
               carMake.set(updateCar, input.next());
               System.out.println("Please update the car Model:");
               carModel.set(updateCar, input.next());
               System.out.println("Please update the car Color:");
               carColor.set(updateCar, input.next());
               System.out.println("Please update the car Year:");
               carYear.set(updateCar, input.nextInt());
               System.out.println("Please update the car Mileage:");
               carMileage.set(updateCar, input.nextInt());

           }
               /*If the user selects menu 4 then a list of vehicle will be displayed that are stored
                * in the inventory*/ 
               else if (menu == 4) {
            	   System.out.println("----------------------------------------");
            	   System.out.println("Current list of cars in the inventory");
            	   System.out.println("----------------------------------------");
            	   for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size()  
            			   && i < carYear.size() && i < carMileage.size(); i++)
            		   System.out.println(carColor.get(i) + " " + carMake.get(i) + " " + carModel.get(i) + " ("
            		   + ") " + carYear.get(i) + ": $" + carMileage.get(i) + "\n");     	   
           }
               /*If the user selects menu 5 then the information regarding the inventory will be
                * saved in a txt file named Munim_Khan_Vehicle_Inventory*/                
               else if (menu == 5) {
            	   System.out.println ("Would you like to print the inventory list into a text file? (Type Yes/No)");
            	   Scanner scan1 = new Scanner(System.in);
            	   String question1 = scan1.nextLine();
           	
            	   if (question1.equalsIgnoreCase("Yes")) {
            		   System.out.println("Printing the data");

            		   PrintWriter writer = new PrintWriter("Munim_Khan_Vehicle_Inventory.txt", "UTF-8");
               
            		   for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() 
            			 && i < carMileage.size(); i++)
            			 writer.println(carColor.get(i) + " " + carMake.get(i) + " " + carModel.get(i) + " " + carYear.get(i) 
            			 + ": " + carMileage.get(i) + " miles.");
            		   	 writer.close();	
           	}
            	   else {
                       System.out.println("\nYour file will not be printed.");
                   }
        } else {
                   System.out.println("\nKindly select a number between 1-5.");
               }
           }
           catch (Exception e) {
               input.next(); /*This is done to ensure that the user does not enter 
               string in places where integer needs to be entered!*/
               System.out.println("\nYou may not put letters in that field. Please try again.\n");
           }
       }
       while (true);
       }
}