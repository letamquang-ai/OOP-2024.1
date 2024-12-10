package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Cart {
	
	private static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media... mediasToAdd) {
	    if (itemsOrdered.size() + mediasToAdd.length > MAX_NUMBERS_ORDERED) {
	        System.out.println("The cart is almost full");
	    } else {
	        for (Media mediaToAdd: mediasToAdd) {
	            if (mediaToAdd != null) {
	            	if(contains(mediaToAdd.getTitle())) {
	            		continue;
	            	}
	                itemsOrdered.add(mediaToAdd);
	                System.out.println("Media have been added");
	            }
	        }
	    }
	}

	public void removeMedia(Media... mediasToRemove) {
	    for (Media mediaToRemove: mediasToRemove) {
	        if (mediaToRemove != null) {
	        	if(!contains(mediaToRemove.getTitle())) {
            		continue;
            	}
	            itemsOrdered.remove(mediaToRemove);
	            System.out.println("Media have been removed");
	        }
	    }
	}

	
	public float totalCost() {
		float cost = 0;
		for(Media media: itemsOrdered) {
			cost += media.getCost();
		}
		return cost;
	}
	
	public void print() {
		for(Media m: itemsOrdered) {
			System.out.println(m.toString());
		}
	}
	
	public boolean contains(String mediaTitle) {
	    for (Media m: itemsOrdered) {
	        if (m.getTitle().equals(mediaTitle)) {
	            return true;
	        }
	    }
	    return false;
	}
}
