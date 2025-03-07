import java.util.Random;
public class RandomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		int n = rand.nextInt(10);
		System.out.println(n);
	}
}