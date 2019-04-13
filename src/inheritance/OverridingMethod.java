package inheritance;

import java.io.IOException;

public class OverridingMethod extends Overriding {
	//String var;

	@Override
	public void printText() throws IOException {
		System.out.println("Overrding method" + " " + var);
	}

	public static void main(String[] args) throws Exception {
		Overriding overriding = new Overriding();
		Overriding overridingRef = new OverridingMethod();
		OverridingMethod overridingMethod = new OverridingMethod();
		overriding.printText();
		overridingRef.printText();
		overridingMethod.printText();
	}
}
