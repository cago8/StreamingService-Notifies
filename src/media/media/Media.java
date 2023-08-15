package media;

public class Media {
	private String mediaName;
	private int yearPublish;
	private Genre mediaGenre;
	
	public Media(String mediaName, int yearPublish, Genre mediaGenre) {
		this.mediaName = mediaName;
		this.yearPublish = yearPublish;
		this.mediaGenre = mediaGenre;
	}

	public String getMediaName() {
		return mediaName;
	}

	public int getYearPublish() {
		return yearPublish;
	}

	public Genre getMediaGenre() {
		return mediaGenre;
	}
	
	public String toString() {
		return String.format(
				"Name: %s%nYear: %d%nGenre: %s%n",
				getMediaName(),getYearPublish(),getMediaGenre());

	}
	
	public String generateNotification() {
		return String.format(
				"A new %s movie is added to our platform.%nWe thought you might like it!"
				,getMediaGenre());
	}
}