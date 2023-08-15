package media;

public class Series extends Media {
	private String network;
	private int durationSeasons;
	private int durationTotalEpisodes;
	
	public Series(String movieName, int yearPublish, Genre serieGenre, String network, int durationSeasons, int durationTotalEpisodes) {
		super(movieName, yearPublish, serieGenre);
		this.network = network;
		this.durationSeasons = durationSeasons;
		this.durationTotalEpisodes = durationTotalEpisodes;
	}

	public String getNetwork() {
		return network;
	}

	public void setDurationTotalEpisodes(int durationTotalEpisodes) {
		this.durationTotalEpisodes = durationTotalEpisodes;
	}

	public int getDurationSeasons() {
		return durationSeasons;
	}

	public int getDurationTotalEpisodes() {
		return durationTotalEpisodes;
	}
	
	public String toString() {
		return String.format("Series Information:%n" 
				+ super.toString()
				+ "Network: %s%n"
				+ "Duration: %d seasons and %d episodes",
				getNetwork(),getDurationSeasons(),getDurationTotalEpisodes());
	}
	
	public String generateNotification() {
		return super.generateNotification() + "%n--------------------------------------------------%n"; 
	}
	

}