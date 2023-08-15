package streaming;

import java.util.ArrayList;

import devices.Device;
import media.Genre;

public class User {
	private String userName;
	private ArrayList<Genre> likedGenres;
	public ArrayList<Device> devices;

    public User(String userName) {
        this.userName = userName;
        this.likedGenres = new ArrayList<>();
        this.devices = new ArrayList<>();
    }

	public String getUserName() {
		return userName;
	}

	public ArrayList<Genre> getLikedGenres() {
		return likedGenres;
	}

	public ArrayList<Device> getDevices() {
		return devices;
	}
	
	public void likeGenre(Genre g) {
		likedGenres.add(g);
	}
	
	public void unlikeGenre(Genre g) {
		likedGenres.remove(g);
	}
	
	public void removeDevice(Device d) {
		devices.remove(d);
	}
	
	public String postNotificationText(int count) {
		return "\nDownload KuVPN now and get 10% off your next subscription.";
	}
	
	
}