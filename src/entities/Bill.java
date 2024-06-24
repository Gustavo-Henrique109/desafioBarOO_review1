package entities;

public class Bill {

	public static final double BEER_PRICE = 5.0;
	public static final double BARBECUE_PRICE = 7.0;
	public static final double SOFT_DRINK_PRICE = 3.0;

	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;

	public Bill() {
	}

	public Bill(char gender, int beer, int barbecue, int softDrink) {
		super();
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public int getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}

	public double cover() {
		return (feeding() > 30.0) ? 0.0 : 4.0;
	}

	public double feeding() {
		return (barbecue * BARBECUE_PRICE) + (beer * BEER_PRICE) + (softDrink * SOFT_DRINK_PRICE);
	}

	public double ticket() {
		return (gender == 'M') ? 10.0 : 8.0; 
	}

	public double total() {
		return cover() + feeding() + ticket(); 
	}
	
	@Override 
	public String toString() {
		return String.format("Valor a pagar = R$ %.2f", total());
	}   
} 
