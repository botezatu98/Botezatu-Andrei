package Interfete;

public class HexColorValidator{
	Boolean validate(String colorHex) {

		Boolean a = true;

		if (colorHex.charAt(0) != '#') {
			a = false;
			throw new IllegalArgumentException("invalid");

		}

		if (colorHex.length() > 7) {
			a = false;
			throw new IllegalArgumentException(
					"trebuie sa fie mai mic de 7");

		}

		int i = 1;
		while (i < 7)

		{
			if (colorHex.charAt(i) < 'a' && colorHex.charAt(i) < '0'
					|| colorHex.charAt(i) > 'f' && colorHex.charAt(i) > '9') {
				a = false;
				throw new IllegalArgumentException(
						"codul hex invalid");
			}

			i++;

		}

		return a;

	}
}