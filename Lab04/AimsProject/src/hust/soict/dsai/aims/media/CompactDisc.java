package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc(String title, String category, String director, String artist,
			ArrayList<Track> tracks, int length, float cost) {
		super(title, category, director, length, cost);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public CompactDisc(String title, String artist, ArrayList<Track> tracks, int length, float cost) {
		super(title, length, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	public CompactDisc(String title, String category, String director, String artist,
			ArrayList<Track> tracks, float cost) {
		super(title, category, director, cost);
		this.artist = artist;
		this.tracks = tracks;
	}

	public void addTrack(Track trackToAdd) {
	    if (!tracks.contains(trackToAdd)) {
	        tracks.add(trackToAdd);
	        System.out.println("Track has been added");
	    } 
	    else {
	        System.out.println("Track is already in the list");
	    }
	}

	public void removeTrack(Track trackToRemove) {
	    if (tracks.remove(trackToRemove)) {
	        System.out.println("Track has been removed");
	    } 
	    else {
	        System.out.println("Track is not in the list");
	    }
	}
	
	public int getLength() {
		int total_length = 0;
		for(Track track: tracks) {
			total_length += track.getLength();
		}
		return total_length;
	}
	
	public void play() {
		System.out.println("Compact disc artist: "+this.artist);
		for(Track track: tracks) {
			track.play();
		}
		System.out.println("Total length: "+Integer.toString(getLength()));
	}
	
	@Override
	public String toString() {
	    String displayTitle = (getTitle() != null) ? getTitle() : "Unknown";
	    String displayCategory = (getCategory() != null) ? getCategory() : "Unknown";
	    String displayDirector = (getDirector() != null) ? getDirector() : "Unknown";
	    String displayArtist = (artist != null) ? artist : "Unknown";
	    String displayTracks = (!tracks.isEmpty()) ? tracks.toString() : "Unknown";
	    String displayLength = (getLength() > 0) ? String.valueOf(getLength()) : "Unknown";
	    String displayCost = (getCost() > 0) ? String.valueOf(getCost()) : "Unknown";

	    return displayTitle + " - " + displayCategory + " - " + displayDirector + " - " + displayLength + " - " +
	    		displayArtist + " - " + displayTracks + " - " + displayCost;
	}
}
