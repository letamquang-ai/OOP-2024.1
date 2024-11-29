package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Aims {
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("-------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("-------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("-------------------------------");
		System.out.println("1. See a media's details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("-------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("-------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("-------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("-------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove medias in cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("-------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mediaTitle;
		int number;
		
		Cart cart = new Cart();
		Store store = new Store();
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		Book book = new Book("Aladin", new ArrayList<>(Arrays.asList("Fairy Tales", "Arab")), 18.99f);
		Track track1 = new Track("ABC", 15);
		Track track2 = new Track("XYZ", 30);
		CompactDisc cp = new CompactDisc("Star Wars", "Science Fiction", "George Lucas", "Lucasarts", new ArrayList<>(Arrays.asList(track1,track2)), 24.95f);
		
		store.addMedia(dvd, book, cp);
		
		while(true) {
			showMenu();
			number = scanner.nextInt();
			
			if(number == 0) {
				break;
			}
			
			if(number == 1) {
				while(true) {
					storeMenu();
					number = scanner.nextInt();
					
					if(number == 0) {
						break;
					}
					
					if(number == 1) {
						System.out.println("Please input the media title: ");
						scanner.nextLine();
						mediaTitle = scanner.nextLine();
						if(store.contains(mediaTitle)) {
							Media mediaResult = store.find(mediaTitle);
							while(true) {
								System.out.println(mediaResult.toString());
								mediaDetailsMenu();
								number = scanner.nextInt();
								
								if(number == 0) {
									break;
								}
								
								if(number == 1) {
									cart.addMedia(mediaResult);
								}
								
								if(number == 2) {
									
								}
							}
						}
						else {
							System.out.println("The media is not in cart");
						}
					}
					
				}
			}
			
			if (number == 2) {
				
			}

			if(number == 3) {
				while(true) {
					cart.print();
					cartMenu();
					number = scanner.nextInt();
					
					if(number == 0) {
						break;
					}
					
					if(number == 1) {
						
					}
					
					if(number == 2) {
						
					}
				}
			}
		}
		
		scanner.close();
	}
}