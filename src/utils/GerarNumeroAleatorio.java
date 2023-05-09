package utils;

import java.util.Arrays;
import java.util.Random;

public class GerarNumeroAleatorio {

	public static Integer buscarNumeroAleatorio(Integer maxNumber) {

		Random rand = new Random();

		int k = rand.nextInt(maxNumber);

		Integer[] test = new Integer[maxNumber];
		System.out.println(Arrays.toString(test));

		return k;
	}

}
