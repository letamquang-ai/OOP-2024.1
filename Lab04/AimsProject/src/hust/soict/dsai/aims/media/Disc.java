package hust.soict.dsai.aims.media;

public class Disc extends Media{

	private int length;
	private String director;
	
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}
	
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}
	
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	
	public Disc(String title, int length, float cost) {
		super(title, cost);
		this.length = length;
	}
	
	public Disc(String title, String category, float cost) {
		super(title, cost);
	}
	
	@Override
	public String toString() {
	    String displayTitle = (getTitle() != null) ? getTitle() : "Unknown";
	    String displayCategory = (getCategory() != null) ? getCategory() : "Unknown";
	    String displayDirector = (getDirector() != null) ? getDirector() : "Unknown";
	    String displayLength = (getLength() > 0) ? String.valueOf(getLength()) : "Unknown";
	    String displayCost = (getCost() > 0) ? String.valueOf(getCost()) : "Unknown";

	    return displayTitle + " - " + displayCategory + " - " + displayDirector + " - " + displayLength + " - " + displayCost;
	}
}
