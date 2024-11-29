package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book extends Media{

	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(String title, ArrayList<String> authors, float cost) {
		super(title, cost);
		this.authors = authors;
	}

	public Book(String title, String category, ArrayList<String> authors, float cost) {
		super(title, category, cost);
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		boolean flag = true;
		
		for(String author: authors) {
			if(author.equals(authorName)) {
				flag = false;
			}
		}
		
		if(flag) {
			authors.add(authorName);
		}
	}

	public void removeAuthor(String authorName) {
		
		for(String author: authors) {
			if(author.equals(authorName)) {
				authors.remove(authorName);
			}
		}
	}
	
	@Override
	public String toString() {
	    String displayTitle = (getTitle() != null) ? getTitle() : "Unknown";
	    String displayCategory = (getCategory() != null) ? getCategory() : "Unknown";
	    String displayAuthors = (!authors.isEmpty()) ? authors.toString() : "Unknown";
	    String displayCost = (getCost() > 0) ? String.valueOf(getCost()) : "Unknown";

	    return displayTitle + " - " + displayCategory + " - " + displayAuthors + " - " + displayCost;
	}

}
