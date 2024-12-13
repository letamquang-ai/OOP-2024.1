
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc = 0;
	private int id = 0;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
	}
	
	public String toString(String s) {
		if(s != null) {
			return s;
		}
		return "Unknown";
	}
	
	public String toString(int x) {
		if(x != 0) {
			return Integer.toString(x);
		}
		return "Unknown";
	}
	
	public String toString(float x) {
		if(x != 0) {
			return Float.toString(x);
		}
		return "Unknown";
	}

}
