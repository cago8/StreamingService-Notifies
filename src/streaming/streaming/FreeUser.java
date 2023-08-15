package streaming;

public class FreeUser extends User{
	public FreeUser(String userName) {
		super(userName);
	}

	public String postNotificationText(int count) {
		return "\nDownload KuVPN now and get 10% off your next subscription.";
	}
}
