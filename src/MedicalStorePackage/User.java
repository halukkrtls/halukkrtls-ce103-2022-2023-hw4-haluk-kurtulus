package MedicalStorePackage;



public class User {
	
	
	 enum AccountType {
	        Supplier, Customer;
	    }
	 
	 String UserName;
	    AccountType UserType;
	    
	    
	    @Override
	    public String toString() {
	        return "User [ Name=" + UserName + ", type=" + UserType +"]";
	    }
	    
	   
}
