import java.util.Scanner;

public class BookDetails {
	private String isbn ;
	private double price ;
	private String authorName ;
	private int quantity;
	
	
	
	public BookDetails() {
		super();
	}

	public BookDetails(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}

	public void accept() {
		System.out.println("Enter the Book Details:");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the isbn :");
		isbn = sc.next();
		System.out.println(" Enter the price :");
		price = sc.nextDouble();
		System.out.println(" Enter the isbn :");
		authorName = sc.next();
		System.out.println(" Enter the quantity :");
		quantity = sc.nextInt();
			
		
	}
	
	
	
	

}
