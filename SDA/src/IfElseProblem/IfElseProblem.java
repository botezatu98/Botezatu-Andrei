package IfElseProblem;

public class IfElseProblem {

//	!!!!!       Doua ce arti terminat de srics codul formatati fisierul cu Ctrl+shift+f

	public static void main(String[] args) {

		System.out.println(getMaxSpeedLimitByIfElse("Drum Express"));
		System.out.println(getMaxSpeedLimitByIfElse("Oras"));
		System.out.println(getMaxSpeedLimitByIfElse("Zona Rezidentiala"));
		System.out.println(getMaxSpeedLimitByIfElse("Autostrada"));
		System.out.println(getMaxSpeedLimitByIfElse("Necunoscut"));

		System.out.println(getMaxSpeedLimitByIfElseComplex("Drum Express"));
		System.out.println(getMaxSpeedLimitByIfElseComplex("Oras"));
		System.out.println(getMaxSpeedLimitByIfElseComplex("Zona Rezidentiala"));
		System.out.println(getMaxSpeedLimitByIfElseComplex("Autostrada"));
		System.out.println(getMaxSpeedLimitByIfElseComplex("Necunoscut"));

		System.out.println(getMaxSpeedLimitBySwitch("Necunoscut"));
		System.out.println(getMaxSpeedLimitBySwitch("Drum Express"));
		System.out.println(getMaxSpeedLimitBySwitch("Zona Rezidentiala"));
		System.out.println(getMaxSpeedLimitBySwitch("Autostrada"));
		System.out.println(getMaxSpeedLimitBySwitch("Oras"));

	}

	public static int getMaxSpeedLimitByIfElse(String roadType) {

		if (roadType == "Autostrada") {
			System.out.println("Viteza Maxima pe autostrada este=");
			return 130;

		} else if (roadType == "Zona Rezidentiala") {
			System.out.println("Viteza maxima in zona rezidentiala este=");
			return 30;

		} else if (roadType == "Oras") {
			System.out.println("Viteza maxima in oras este ");
			return 50;

		} else if (roadType == "Drum Express") {
			System.out.println("Viteza pentru drumul expres este =");
			return 100;
		} else

			System.out.println("Drumul este necunoscut");

		
		return 0;

	}

	public static int getMaxSpeedLimitByIfElseComplex(String roadType) {

		if (roadType == "Autostrada") {
			System.out.println("Viteza maxima admisa este =");
			return 130;
		} else {
			if (roadType == "Oras") {
				System.out.println("Viteza maxima admisa in oras este ");
				return 50;
			} else {
				if (roadType == "Zona Rezidentiala") {
					System.out.println("Viteza maxima admisa in zona rezidentiala este=");
					return 30;
				} else {
					if (roadType == "Drum Express") {
						System.out.println("Viteza maxima admisa pe drumul express este=");
						return 100;

					} else {
						
							System.out.println("Drumul este necunoscut");
					}
				}
			}
		}
		return 0;
	}

	public static int getMaxSpeedLimitBySwitch(String roadType) {
		switch (roadType) {
		case "Autostrada":
			System.out.println("Viteza maxima pe autostrada este =");
			return 130;
		case "Drum Express":
			System.out.println("Viteza maxima pe drumul expres este =");
			return 100;
		case "Oras":
			System.out.println("viteza maxima in oras este =");
			return 50;
		case "Zona Rezidentiala":
			System.out.println("viteza maxima in zona rezidentiala este =");
			return 30;
		default:
			System.out.println("Drum necunoscut !!===");

		}

		return 0;
	}

}