package nullrefererence.staticmethod;
public class NullReferenceStaticMethod {
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
		NullReferenceStaticMethod rope = new NullReferenceStaticMethod();
		rope.climb();
		rope.play();
		NullReferenceStaticMethod.play();
		NullReferenceStaticMethod rope2 = null;
		rope2.play();
	}
}