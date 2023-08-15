package streaming;

import java.util.ArrayList;

import devices.Device;
import media.Media;

public class StreamingService {
	private ArrayList<Media> mediaList;
	private ArrayList<User> userList;

	public StreamingService() {
		this.mediaList = new ArrayList<>();
		this.userList = new ArrayList<>();
	}

	public void addMedia(Media m) {
		int counter = 0;
		for (Media medias : mediaList) {
			if (medias.getMediaName().equals(m.getMediaName())) {
				System.out
						.println("Media with the same name already exists. Media cannot be added to StreamingService");
				counter = 1;
				break;
			} 
		}
		if (counter != 1) {
			mediaList.add(m);
			System.out.println("User added to the Streaming Service");
		}

	}

	public void addUser(User u) {
		int counter = 0;
		for (User users : userList) {
			if (users.getUserName().equals(u.getUserName())) {
				System.out.println(
						"User with the same username already exists. User cannot be added to StreamingService");
				counter = 1;
				break;
			}
		}
		if (counter != 1) {
			userList.add(u);
			System.out.println("User added to the Streaming Service");
		}

	}

	public void notifyAllUsers() {
		for (User users : userList) {
			for (Media medias : mediaList) {
				if (users.getLikedGenres().contains(medias.getMediaGenre())) {
					for (Device devices : users.getDevices()) {
						if (devices != null) {
							System.out.println(devices.notifyOwner(medias));
						}
					}
				}
			}

		}
	}
}