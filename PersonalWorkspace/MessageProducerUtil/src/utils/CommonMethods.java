package utils;

import java.text.SimpleDateFormat;
import java.util.Random;

public class CommonMethods {
	public String getReference(String reference) {
		String ref = getDate(System.currentTimeMillis(), "yyyyMMddHHmmssSSS") + Thread.currentThread().getId();
		ref = ref + getRandom(99);
		return ref;
	}

	public String getRandom(int upperRange) {
		Random random = new Random();
		return String.format("%02d", random.nextInt(upperRange));
	}

	public static String getDate(Long time, String format) {
		String date = new SimpleDateFormat(format).format(time);
		return date;
	}
}
