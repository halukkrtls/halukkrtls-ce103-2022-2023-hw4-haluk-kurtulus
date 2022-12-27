package MedicalStorePackage;
import java.util.ArrayList;

public class UserLogin {
	 private static UserLogin instance;
	    private ArrayList<User> userList = new ArrayList<User>();
	 
	    private UserLogin(){

	    }
	    
	    public static synchronized UserLogin getInstance() {
	        if(instance == null) {
	            instance = new UserLogin();
	        }
	        return instance;
	    }
	    
	    
	    public void add(User User) {
	    	userList.add(User);
	    }

	    public void remove(User User) {
	    	userList.remove(User);
	    }
	    
	    
    public ArrayList<User> GetUserList() {
        return userList;
    }
    
    
   
   
    public User getUser(String UserName) {
        for (User user : userList) {
            if (UserName.equals(user.UserName)) {
                return user;
            }
        }
        return null;
    }
    
   
    
   
}
