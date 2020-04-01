package Sir;

import java.util.Arrays;

public class sir {

	public static void main(String[] args) {
		double[] sir = { 33, 39, 40.5, 37, 37.5, 33.4, 33.2, 39, 35, 40, 40.2 };
		double[] sirs = new double[sir.length];
		for (int j = 0; j < sir.length; j++) {
			sirs[j] = sir[j];
		}

		System.out.println("Sirul initial" + Arrays.toString(sirs));
		Arrays.sort(sir);
		int i = 0;
		while (i < sir.length && sir[i] < 37) {
			i++;
		}
		double[] TempNormale = new double[i];
		double[] TempAnormale = new double[sir.length - i];
		for (int j = 0; j < TempNormale.length; j++) {
			TempNormale[j] = sir[j];
		}
		for (int j = 0; j < TempAnormale.length; j++) {
			TempAnormale[j] = sir[j + i];
		}
		System.out.println("Temperaturile normale sunt:" + Arrays.toString(TempNormale));

		for (int j = 0; j < TempNormale.length; j++) {
			for (int z = 0; z < sirs.length; z++) {

				if (sirs[z] == TempNormale[j])
					System.out.println("Indexul pentru= " + TempNormale[j] + "  este=" + z);
			}
		}
		System.out.println("\n");
		System.out.println("Temperaturile anormale sunt=" + Arrays.toString(TempAnormale));
		for (int j = 0; j < TempAnormale.length; j++) {
			for (int z = 0; z < sirs.length; z++) {

				if (sirs[z] == TempAnormale[j])
					System.out.println("Indexul pentru= " + TempAnormale[j] + "  este=" + z);
			}
		}

	}

}
