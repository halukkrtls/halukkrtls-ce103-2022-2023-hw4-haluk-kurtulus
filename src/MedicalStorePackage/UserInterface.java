package MedicalStorePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    private static UserInterface instance;
    private UserInterface() {

    }
    
    

   
    public static synchronized UserInterface getInstance() {
        if (instance == null) {
            instance = new UserInterface();
        }
        return instance;
    }
    
    public void print(ArrayList<Medicine> medicineList) {
        for (Object medicine : medicineList) {
            System.out.println(medicine);
        }
    }

    /**
     * @name selectTypeForUser
     * @brief /b The user is then asked to select an option from the list.
     * @brief /b After the user selects an option, they are given a choice of what to do next: Add Medicine, Remove Medicine, Print Medicine, Update Medicine or Search for Medicines.
     * @brief /b The code attempts to allow the user to select from a menu of options.
     */
    public int showMainMenu() {
          
        System.out.println("Select");
        System.out.println("1. Add Medicine \n2. Remove Medicine\n" + "3. Print Medicine\n4. Update Medicine \n5. Search Medicine \n6. Exit \n7. Back User Menu   ");
        int choice = scanner.nextInt();
        return choice;
    }
    
    /**
     * @name selectTypeForUser
     * @brief /b SearchMedicine takes a String input from the user and returns it back to them; selectMedicine does not take any input from the user but instead prints out what they enter on screen.
     * @brief /b The code attempts to be used in a program that has a main menu and the user can select from four options.
     * @brief /b The code attempts to allow the user to select from a menu of options.
     */
    public int showMainMenu2() {
        
        System.out.println("Select");
        System.out.println("1. Buy Medicine\n" + "2. Print Medicine \n3. Search Medicine \n4. Exit \n5. Back User Menu  ");
        int choice = scanner.nextInt();
        return choice;
    }
    public String selectMedicine() {
        System.out.println("Enter the name of medicine : ");
        String userSelection = scanner.next();
        return userSelection;
    }
    public String searchMedicine() {
        System.out.println("Enter the name of medicine : ");
        String userSelection = scanner.next();
        return userSelection;
    }

    

    public int showUpdateMenu() {
        System.out.println("Select");
        System.out.println("1. Update Name \n2. Update Brandname\n" + "3. Update Type\n4. Update Price\n5. Exit  ");
        int updateChoice = scanner.nextInt();
        return updateChoice;
    }

  
    public int showTypeOptions() {
        System.out.println("Select");
        System.out.println("1. AYURVEDIC \n2. ALLOPATHY \n3. HOMEOPATHY ");
        int selectedType = scanner.nextInt();
        return selectedType;
    }
    
    
    
    
}