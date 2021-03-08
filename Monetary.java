package codility_1;

public class Monetary {
	public static int getNOOFcoins(int AmountInCents) {
		int dollars = AmountInCents/100;
		int quarters = (AmountInCents%100)/25;
		int dimes = (AmountInCents - (dollars*100) - (quarters*25))/10;
		int cents = AmountInCents - (dollars*100) - (quarters*25) - (dimes*10); 
		int no_of_coins = dollars+quarters+dimes+cents;
		return no_of_coins;
	}

	public static void main(String[] args) {
		System.out.println("number of coins: " + getNOOFcoins(288));
	}

}
