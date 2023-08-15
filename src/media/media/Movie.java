package media;

public class Movie extends Media{
	private String directorName;
	private int hoursDuration;
	private int minutesDuration;
	
	public Movie(String movieName, int yearPublish, Genre movieGenre, String directorName, int hoursDuration, int minutesDuration) {
		super(movieName, yearPublish, movieGenre);
		this.directorName = directorName;
		this.hoursDuration = hoursDuration;
		this.minutesDuration = minutesDuration;
	}

	public String getDirectorName() {
		return directorName;
	}

	public int getHoursDuration() {
		return hoursDuration;
	}

	public int getMinutesDuration() {
		return minutesDuration;
	}
	
	public String toString() {
		return String.format("Movie Information:%n" 
				+ super.toString()
				+ "Director: %s%n"
				+ "Duration: %d hours and %d minutes",
				getDirectorName(),getHoursDuration(),getMinutesDuration());
	}
	
	public String generateNotification() {
		return super.generateNotification() + "%n--------------------------------------------------%n"; 
	}
}