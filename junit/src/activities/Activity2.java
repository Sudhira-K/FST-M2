package activities;
import org.junit.jupiter.api.Test;
import activities.Activity2_BankAccount;
import activities.Activity2_NotEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {
	
    @Test
    void notEnoughFunds() {
        // Create an object for BankAccount class
    	Activity2_BankAccount account = new Activity2_BankAccount(9);
 
        // Assertion for exception
        assertThrows(Activity2_NotEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
    }
 
    @Test
    void enoughFunds() {
        // Create an object for BankAccount class
    	Activity2_BankAccount account = new Activity2_BankAccount(100);
    
        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }

}
