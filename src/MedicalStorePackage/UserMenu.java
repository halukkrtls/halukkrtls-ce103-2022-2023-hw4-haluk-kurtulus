package MedicalStorePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMenu {
    Scanner scanner = new Scanner(System.in);
    private static UserMenu instance;
    private UserMenu() {

    }
    
    

    public static synchronized UserMenu getInstance() {
        if (instance == null) {
            instance = new UserMenu();
        }
        return instance;
    }
    
    
    public void print(ArrayList<User> userList) {
        for (Object user : userList) {
            System.out.println(user);
        }
            
    }
    
    public int UserSettingsMenu() {
        System.out.println("Select");
        System.out.println("1. Login \n2. User Settings" + "\n3. Exit ");
        int choice = scanner.nextInt();
        return choice;
    }
    
      public int showUserMenu() {
        
        System.out.println("Select");
        System.out.println("1. Add User \n2. Remove User \n" + "3. Print User \n4. Update User" + " \n5. Search User  \n6. Exit \n7. Back User Menu");
        int choice = scanner.nextInt();
        return choice;
    }
      
      
      public int showUserMenu2() {
          System.out.println("Select");
          System.out.println("1. Supplier \n2. Customer \n3. About " + "\n4. Exit ");
          int choice = scanner.nextInt();
          return choice;
      }
      
      
      public String selectUser() {
          System.out.println("Enter the name of User : ");
          String userSelection = scanner.next();
          return userSelection;
      }
      
      public String searchUser() {
          System.out.println("Enter the name of User : ");
          String userSelection = scanner.next();
          return userSelection;
      }
      
      
      public int showUpdateMenu() {
          System.out.println("Select");
          System.out.println("1. Update User Name \n2. Update User Type \n3. Exit \n4. Back ");
          int updateUserChoice = scanner.nextInt();
          return updateUserChoice;
      }
      
      public int showTypeOptions() {
          System.out.println("Select");
          System.out.println("1. Supplier \n2. Customer");
          int selectedUserType = scanner.nextInt();
          return selectedUserType;
      }

      
}