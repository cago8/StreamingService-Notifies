package devices;

import media.Media;
import streaming.User;

public class CellPhone extends Device {

	public CellPhone(User user) {
		super(user);
	}

	public String notifyOwner(Media m) {
		notificationCounter++;
		String output1 = String.format("--------------------------------------------------%nHey there "
				+ user.getUserName() + "%n" + m.generateNotification() + m.toString());

		String output2 = String.format("%n--------------------------------------------------%n"
				+ "Watch it now on your CellPhone device with the id: " + getDeviceID());
				
		String output3 = user.postNotificationText(getNotificationCounter())
				+ "\n--------------------------------------------------";

		return output1 + output2 + output3;

	}
}