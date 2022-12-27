package MedicalStorePackage;

import java.util.Scanner;

import MedicalStorePackage.Medicine.MedicineType;
import MedicalStorePackage.User.AccountType;
/**
 * @name Main
 * @brief /b The code starts with a class called Main.
 * @brief /b It has one parameter, which is an integer that represents a choice from 1 to 6.
 * @brief /b The code above is a class that contains methods for adding users, printing the list of users, and updating a user's information.
 */
public class Main {
    Scanner scanner = new Scanner(System.in);
    
    public void  UserSection(int choice) {
    	UserLogin userLogin = UserLogin.getInstance();
        UserMenu userMenu = UserMenu.getInstance();
        MedicineStore medicineStore = MedicineStore.getInstance();
        UserMenu userSetting = UserMenu.getInstance();
        

        switch (choice) {
            case 1:
                addUser();
                break;
            case 2:
                String userSelection = userMenu.selectUser();
                User user = userLogin.getUser(userSelection);
                userLogin.remove(user);
                break;
            case 3:
            	userMenu.print(userLogin.GetUserList());  
            	main(null);
              break;
                 
            case 4:
                String UserName = userMenu.selectUser();
                User UserForUpdate = userLogin.getUser(UserName);

                int updateUserChoice = userMenu.showUpdateMenu();
                updateUser(UserForUpdate, updateUserChoice);
                break;
            case 5:
            	 String userSelection1 = userMenu.selectUser();
            	 User user1 = userLogin.getUser(userSelection1);
            	 System.out.println(userLogin.getUser(userSelection1));
                  break;
            case 6:
                System.exit(0);
                break;
            default:

        }
    }
    /**
     * @name handleUserSelection
     * @brief /b The code then creates an instance of the UserInterface class and assigns it to a variable named userInterface.
     * @brief /b The switch statement is used to determine which action should be taken based on what choice was selected by the user.
     * @brief /b In case 1, addMedicine() is called; in case 2, String userSelection = userInterface.selectMedicine(); in case 3, print(medicineStore.getMedicineList()); in case 4, String medicineName = userInterface.selectMedicine(); and finally in case 5, System.exit(0); are all executed depending on what choice was selected by the user
     */
    public void handleUserSelection(int choice) {
        MedicineStore medicineStore = MedicineStore.getInstance();
        UserInterface userInterface = UserInterface.getInstance();

        switch (choice) {
            case 1:
                addMedicine();
                break;
            case 2:
                String userSelection = userInterface.selectMedicine();
                Medicine medicine = medicineStore.getMedicine(userSelection);
                medicineStore.remove(medicine);
                break;
            case 3:
                userInterface.print(medicineStore.getMedicineList());
                
                break;
            case 4:
                String medicineName = userInterface.selectMedicine();
                Medicine medicineForUpdate = medicineStore.getMedicine(medicineName);

                int updateChoice = userInterface.showUpdateMenu();
                updateMedicine(medicineForUpdate, updateChoice);
                break;
            case 5:
            	 String userSelection1 = userInterface.selectMedicine();
            	 Medicine medicine1 = medicineStore.getMedicine(userSelection1);
            	 System.out.println(medicineStore.getMedicine(userSelection1));
                  break;
            case 6:
                System.exit(0);
                break;
            default:

        }
    }
    /**
     * @name handleUserSelection2
     * @brief /b Next, it gets an instance of a class called UserInterface and then switches on choice to determine what happens next.
     * @brief /b If choice equals 1, it prints out the user's selection and removes two medicines from the store.
     * @brief /b If choice equals 2, it prints out all of the medicines in stock and exits if there are no more choices left (case 4).
     * @brief /b If choice equals 3, it selects one medicine from the list that was printed earlier and displays its information before exiting (case 3).
     */
    
    public void handleUserSelection2(int choice) {
        MedicineStore medicineStore = MedicineStore.getInstance();
        UserInterface userInterface = UserInterface.getInstance();

        switch (choice) {
            case 1:
                String userSelection = userInterface.selectMedicine();
                Medicine medicine = medicineStore.getMedicine(userSelection);
                medicineStore.remove2(medicine);
                break;
            case 2:
                userInterface.print(medicineStore.getMedicineList());
                break;
            case 3:
             String userSelection1 = userInterface.selectMedicine();
           	 Medicine medicine1 = medicineStore.getMedicine(userSelection1);
           	 System.out.println(medicineStore.getMedicine(userSelection1));
                 break;
                
            case 4:
                System.exit(0);
                break;
            default:

        }
    }
    
    /**
     * @name updateMedicine
     * @brief /b It then creates an updateMedicine() method that takes two parameters: the medicine to be updated, and the choice of how it should be updated.
     * @brief /b The case 1 option executes if the updateChoice variable is equal to 1.
     * @brief /b In this case, a message asking for input appears on screen and a string called newName is created with scanner's next() method call.
     */

    public void updateMedicine(Medicine medicineForUpdate, int updateChoice) {
        UserInterface userInterface = UserInterface.getInstance();

        switch (updateChoice) {
            case 1:
                System.out.println("Current Name is : " + medicineForUpdate.name + ". Enter your new name :");
                String newName = scanner.next();
                if (medicineForUpdate.name == newName) {
                    System.out.println("Already Having This Name");
                    break;
                }
                medicineForUpdate.name = newName;
                break;
            case 2:
                System.out.println("Current Brand Name is : " + medicineForUpdate.brandName + ". Enter your new Brandname :");
                medicineForUpdate.brandName = scanner.next();
                break;
            case 3:
                System.out.println("Current Type is : " + medicineForUpdate.type + ". Enter your new Type :");
                int selectedType = userInterface.showTypeOptions();
                selectTypeForMedicine(selectedType, medicineForUpdate);
                break;
            case 4:
                System.out.println("Current price is : " + medicineForUpdate.price + ". Enter your new price :");
                medicineForUpdate.price = scanner.nextInt();
                break;
            case 5:
                System.exit(0);
                break;
                default:
        }
    }
    /**
     * @name updateUser
     * @brief /b The switch statement is then used to determine what action should be taken based on the user's choice.
     * @brief /b The case 1 option will print out a message asking for the user to enter their new name.
     * @brief /b If they enter in a name that already exists, it will print out "Already Having This Name" and break from this case.
     */
    public void updateUser(User UserForUpdate, int updateUserChoice) {
        UserMenu userMenu = UserMenu.getInstance();

        switch (updateUserChoice) {
            case 1:
                System.out.println("User Name is : " + UserForUpdate.UserName + ". Enter your new name :");
                String newName = scanner.next();
                if (UserForUpdate.UserName == newName) {
                    System.out.println("Already Having This Name");
                    break;
                }
                UserForUpdate.UserName = newName;
                break;

            case 2:
                System.out.println("Current Type is : " + UserForUpdate.UserType + ". Enter your new Type :");
                int selectedUserType = userMenu.showTypeOptions();
                selectTypeForUser(selectedUserType, UserForUpdate);
                break;

            case 3:
                System.exit(0);
                break;
                default:
            case 4:
               	userMenu.UserSettingsMenu();

              
        }
    }
    /**
     * @name selectTypeForUser
     * @brief /b If the selected type is 1, then it will set the value of "UserType" property of "userForUpdate" object to AccountType.Supplier and if it's 2, then it will set the value of "UserType" property of "userForUpdate" object to AccountType.Customer.
     * @brief /b The code also prints out a message that says Select Correct option i.e 1, 2 or 3
     * @brief /b The code will print the following message on the console: Select Correct option 1 or 2
     */
    
    public void selectTypeForUser(int selectedUserType, User userForUpdate) {
        if (selectedUserType == 1) {
        	userForUpdate.UserType = AccountType.Supplier;
        } 
        
        else if (selectedUserType == 2) {
        	userForUpdate.UserType = AccountType.Customer;
        }
         else {
            System.out.println("Select Correct option 1 or 2");
        }
    }
    /**
     * @name selectTypeForUser
     * @brief /b This method takes in an argument, which is an integer that represents the selected option from 1-3.
     * @brief /b The function then checks if this number matches with one of the three options: AYURVEDIC, ALLOPATHY or HOMEOPATHY.
     * @brief /b If so, then it assigns medicineForUpdate with a MedicineType object that corresponds to that option.
     */
    public void selectTypeForMedicine(int selectedType, Medicine medicineForUpdate) {
        if (selectedType == 1) {
            medicineForUpdate.type = MedicineType.AYURVEDIC;
        } else if (selectedType == 2) {
            medicineForUpdate.type = MedicineType.ALLOPATHY;

        } else if (selectedType == 3) {
            medicineForUpdate.type = MedicineType.HOMEOPATHY;
        } else {
            System.out.println("Select Correct option i.e 1, 2 or 3");
        }
    }
    /**
     * @name selectTypeForUser
     * @brief /b This is an instance of the MedicineStore class which will be used to store information about the medicines that are added to it.
     * @brief /b Next, we declare a variable called userInterface and initialize it with an instance of the UserInterface class.
     * @brief /b The user interface will be used to display options for selecting different types of medicines.
     */
    public void addMedicine() {
        MedicineStore medicineStore = MedicineStore.getInstance();
        UserInterface userInterface = UserInterface.getInstance();

        Medicine medicine = new Medicine();

        System.out.println("Enter the name of the medicine :");
        medicine.name = scanner.next();

        System.out.println("Enter the brand name of the medicine :");
        medicine.brandName = scanner.next();

        System.out.println("Select the medicine type :");
        int selectedType = userInterface.showTypeOptions();
        selectTypeForMedicine(selectedType, medicine);

        System.out.println("Enter the Price :");
        medicine.price = scanner.nextDouble();

        medicineStore.add(medicine);
    }
    /**
     * @name selectTypeForUser
     * @brief /b This is the main menu for the project.
     * @brief /b The next line creates a UserMenu object and assigns it to userMenu variable.
     * @brief /b It then switches back to Main Menu and handles selection accordingly.
     * @brief /b The code then checks if there is an input from the user, which will be either 1 or 2 depending on what choice was selected in Main Menu (user interface).
     */
    
    
public void MainMenu(int choice) {
	  UserInterface userInterface = UserInterface.getInstance();
      UserMenu userMenu = UserMenu.getInstance();
      
      choice = userMenu.showUserMenu2();
      switch (choice) {
      case 1:
    	  choice = userInterface.showMainMenu();
      	handleUserSelection(choice);
          break;
      case 2:
    	  choice = userInterface.showMainMenu2();
      	handleUserSelection2(choice);
          break;
      case 3:
    	  System.out.println("  ***** MEDICAL STORE *****");
     	 System.out.println(" => This Project Is About Medical Store");
     	 System.out.println(" => In This Project we Can Add Medicine ,Customer,Supplier Details");
     	 System.out.println(" => We Can Modifed & Delete Existing Record");
     	 System.out.println(" => We Can Also Search Medicine ,Customer,Supplier Details");
     	 System.out.println(" => It's Helpfull For Display Stock Of Medicine ");
           break;
          
      case 4:
          System.exit(0);
          break;
      default:
  }

  
}
/**
 * @name selectTypeForUser
 * @brief /b Next, the code creates an instance of the User class and sets its name to be whatever was typed in by the user on line 3.
 * @brief /b Then, on line 6, we ask for a list of all possible types that can be selected from when adding a new user.
 * @brief /b On lines 8-9, we select one type based on what is displayed in the list provided by showTypeOptions().
 */
    
    public void addUser() {
    	 UserLogin userLogin = UserLogin.getInstance();
         UserMenu userMenu = UserMenu.getInstance();
        User User = new User();

        System.out.println("Enter the name of the User :");
        User.UserName = scanner.next();
        
        System.out.println("Select the User type :");
        int selectedUserType = userMenu.showTypeOptions();
        selectTypeForUser(selectedUserType, User);


        userLogin.add(User);
    }
    /**
     * @name selectTypeForUser
     * @brief /b The main method is then called, which will loop through the UserSettingsMenu() and showUserMenu() methods until it reaches 3.
     * @brief /b If it reaches 3, the code will exit the program with an error message.
     * @brief /b The code illustrates the main() function of the application which is used to start the program.
     */
    public static void main(String[] args) {
    	 MedicineStore medicineStore = MedicineStore.getInstance();
        UserInterface userInterface = UserInterface.getInstance();
        UserMenu userMenu = UserMenu.getInstance();
        UserLogin userLogin = UserLogin.getInstance();
        
        Main main = new Main();

        int choice = 0;
        while (choice != 3)
       	
        {
        	choice = userMenu.UserSettingsMenu();
        	if(choice==1) 
        	{
        		
        		main.MainMenu(choice);
        	
        	}
        	
        	else if(choice==2) {
        		choice = userMenu.showUserMenu();
            	main.UserSection(choice);
        	}
        	
        	else if(choice==3) {
        		System.exit(0);
                break;}
        	}
        	
        	
        
        }
    }
