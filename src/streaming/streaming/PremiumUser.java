package streaming;

public class PremiumUser extends User{

	public PremiumUser(String userName) {
		super(userName);
	}
	
	public String postNotificationText(int count) {
		if(count==1) {
			return "\nYou have 1 notification.";
		}
		else {
			return "\nYou have " + count + " notifications.";
		}
	}
}
