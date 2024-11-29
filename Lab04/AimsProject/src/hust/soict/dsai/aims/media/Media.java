package hust.soict.dsai.aims.media;
import java.util.Comparator;

public abstract class Media {

	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedia = 0;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public Media(String title, float cost) {
		super();
		this.title = title;
		this.cost = cost;
	}
	
	public boolean equals(Media o) {
		return this.title.equals(o.getTitle());
	}
	
	public String toString() {
	    String displayTitle = (title != null) ? title : "Unknown";
	    String displayCategory = (category != null) ? category : "Unknown";
	    String displayCost = (cost > 0) ? String.valueOf(cost) : "Unknown";

	    return displayTitle + " - " + displayCategory + " - " + displayCost;
	}
}
