
public class Store {

	public static final int MAX_NUMBERS_IN_STORE = 100;
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
	private int qtyOrdered = 0;
	
	public void addDVD(DigitalVideoDisc... disc) {
		if(qtyOrdered + disc.length > MAX_NUMBERS_IN_STORE) {
			System.out.println("The cart is almost full");
		}
		else {
			for(DigitalVideoDisc d: disc) {
				itemsInStore[qtyOrdered] = d;
				qtyOrdered += 1;
			}
			System.out.println("The disc(s) has been added");
		}
	}
	
	public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if(qtyOrdered + 2 > MAX_NUMBERS_IN_STORE) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsInStore[qtyOrdered] = disc1;
			qtyOrdered += 1;
			itemsInStore[qtyOrdered] = disc2;
			qtyOrdered += 1;
			System.out.println("The discs has been added");
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInStore[i].equals(disc)) {
                found = true;
                System.arraycopy(itemsInStore, i + 1, itemsInStore, i, qtyOrdered - i - 1);
                itemsInStore[--qtyOrdered] = null;
                break;
            }
        }

        System.out.println(found ? "The disc has been removed." : "The cart does not have the disc.");
    }

}
