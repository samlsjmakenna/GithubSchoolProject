import java.util.Random;
public class RandomNumber {
	private static final Random rand = new Random();
 
	public static int getRandom() {
		return rand.nextInt(10);
	}
}