public class Empty {
	public static void swing() {
		System.out.print("swing ");
	}

	public void climb() {
		System.out.println("climb ");
	}

	public static void play() {
		swing();
		//climb();
	}

	public static void main(String[] args) {
		Empty rope = new Empty();
		rope.play();
		Empty rope2 = null;
		rope2.play();
	}
}