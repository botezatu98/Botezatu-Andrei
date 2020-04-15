package Interfete;

public class BorderClassValidator {
	Boolean validate(int borderWidth) {
		Boolean a = true;

		if (borderWidth < 0) {
			a = false;
			throw new IllegalArgumentException("Valoarea introdusa este mai mica de 0");
		}

		return a;
	}
}
