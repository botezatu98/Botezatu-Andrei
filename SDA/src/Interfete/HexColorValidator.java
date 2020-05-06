package Interfete;

public class HexColorValidator {
	Boolean validate(String colorHex) {

		Boolean a = true;

		if (colorHex.charAt(0) != '#') {
			a = false;
			throw new IllegalArgumentException("invalid");

		}

		if (colorHex.length() > 7) {
			a = false;
			throw new IllegalArgumentException("trebuie sa fie mai mic de 7");

		}
		int i = 1;
		while (i < 7) {
			if ((colorHex.charAt(i) != 'a') && (colorHex.charAt(i) != 'b') && (colorHex.charAt(i) != 'c')
					&& (colorHex.charAt(i) != 'd') && (colorHex.charAt(i) != 'e') && (colorHex.charAt(i) != 'f')
					&& (colorHex.charAt(i) != '1') && (colorHex.charAt(i) != '2') && (colorHex.charAt(i) != '3')
					&& (colorHex.charAt(i) != '4') && (colorHex.charAt(i) != '5') && (colorHex.charAt(i) != '6')
					&& (colorHex.charAt(i) != '0') && (colorHex.charAt(i) != '7') && (colorHex.charAt(i) != '8')
					&& (colorHex.charAt(i) != '9') && (colorHex.charAt(i) != 'A') && (colorHex.charAt(i) != 'B')
					&& (colorHex.charAt(i) != 'C') && (colorHex.charAt(i) != 'D') && (colorHex.charAt(i) != 'E')
					&& (colorHex.charAt(i) != 'F')) {
				a = false;
				throw new IllegalArgumentException("codul hex invalid");
			}
			i++;
		}

		return a;

	}
}