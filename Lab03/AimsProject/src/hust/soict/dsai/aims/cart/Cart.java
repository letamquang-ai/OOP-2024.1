package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc... disc) {
		if(qtyOrdered + disc.length > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		}
		else {
			for(DigitalVideoDisc d: disc) {
				itemsOrdered[qtyOrdered] = d;
				qtyOrdered += 1;
			}
			System.out.println("The disc(s) has been added");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if(qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc1;
			qtyOrdered += 1;
			itemsOrdered[qtyOrdered] = disc2;
			qtyOrdered += 1;
			System.out.println("The discs has been added");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                found = true;
                System.arraycopy(itemsOrdered, i + 1, itemsOrdered, i, qtyOrdered - i - 1);
                itemsOrdered[--qtyOrdered] = null;
                break;
            }
        }

        System.out.println(found ? "The disc has been removed." : "The cart does not have the disc.");
    }
	
	public float totalCost() {
		float cost = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			cost += itemsOrdered[i].getCost();
		}
		return cost;
	}
	
	public String searchById(int id) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].getId() == id) {
				return itemsOrdered[i].toString(i+1)+". "+itemsOrdered[i].toString(itemsOrdered[i].getTitle())+" - "+
						itemsOrdered[i].toString(itemsOrdered[i].getCategory())+" - "+itemsOrdered[i].toString(itemsOrdered[i].getDirector())+" - "
						+itemsOrdered[i].toString(itemsOrdered[i].getLength())+" - "+itemsOrdered[i].toString(itemsOrdered[i].getCost());
			}
		}
		return "Cannot find the required disc";
	}
	
	public String searchByTitle(String title) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].getTitle().equals(title)) {
				return itemsOrdered[i].toString(i+1)+". "+itemsOrdered[i].toString(itemsOrdered[i].getTitle())+" - "+
						itemsOrdered[i].toString(itemsOrdered[i].getCategory())+" - "+itemsOrdered[i].toString(itemsOrdered[i].getDirector())+" - "
						+itemsOrdered[i].toString(itemsOrdered[i].getLength())+" - "+itemsOrdered[i].toString(itemsOrdered[i].getCost());
			}
		}
		return "Cannot find the required disc";
	}
	
	public void print() {
		System.out.println("**************************CART**************************");
		System.out.println("Ordered Items:");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].toString(i+1)+". "+itemsOrdered[i].toString(itemsOrdered[i].getTitle())+" - "+
					itemsOrdered[i].toString(itemsOrdered[i].getCategory())+" - "+itemsOrdered[i].toString(itemsOrdered[i].getDirector())+" - "
					+itemsOrdered[i].toString(itemsOrdered[i].getLength())+" - "+itemsOrdered[i].toString(itemsOrdered[i].getCost()));
		}
		System.out.println("Total cost: "+Float.toString(totalCost()));
		System.out.println("********************************************************");
	}

}
