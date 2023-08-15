package devices;

import media.Media;
import streaming.User;

public class Device {
	private static int idCounter = 0;
	private Device device;
	private int deviceID;
	protected User user;
	protected int notificationCounter;

	public Device(User user) {
		this.user = user;
		user.devices.add(this);
		this.deviceID = idCounter;
		idCounter++;
		this.notificationCounter = 0;
	}

	public Device getDevice() {
		return device;
	}

	public int getDeviceID() {
		return deviceID;
	}

	public String notifyOwner(Media m) {
		notificationCounter++;
		
		String output1 = String.format("--------------------------------------------------%nHey there "
				+ user.getUserName() + "%n" + m.generateNotification() + m.toString());

		String output2 = String.format("Watch it now on your %s device with the id: %d", device.toString(),
				device.getDeviceID());
		
		String output3 = user.postNotificationText(notificationCounter);
		

		return output1 + output2 + output3;
	}

	public int getNotificationCounter() {
		return notificationCounter;
	}

}