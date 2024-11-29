package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
	
	private static final int MAX_NUMBERS_ORDERED = 100;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media... mediasToAdd) {
	    if (mediasToAdd == null) {
	        System.out.println("No media to add");
	        return;
	    }
	    if (itemsOrdered.size() + mediasToAdd.length > MAX_NUMBERS_ORDERED) {
	        System.out.println("The cart is almost full");
	    } else {
	        for (Media mediaToAdd : mediasToAdd) {
	            if (mediaToAdd != null) {
	            	if(contains(mediaToAdd.getTitle())) {
	            		continue;
	            	}
	                itemsOrdered.add(mediaToAdd);
	    	        System.out.println("Media has been added");
	            }
	        }
	    }
	}

	public void removeMedia(Media... mediasToRemove) {
	    if (mediasToRemove == null) {
	        System.out.println("No media to remove");
	        return;
	    }
	    for (Media mediaToRemove : mediasToRemove) {
	        if (mediaToRemove != null) {
	        	if(!contains(mediaToRemove.getTitle())) {
            		continue;
            	}
	            itemsOrdered.remove(mediaToRemove);
	    	    System.out.println("Media has been removed");
	        }
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
	
	public Media find(String mediaTitle) {
		for (Media m : itemsOrdered) {
	        if (m.getTitle().equals(mediaTitle)) {
	            return m;
	        }
	    }
		return null;
	}
}