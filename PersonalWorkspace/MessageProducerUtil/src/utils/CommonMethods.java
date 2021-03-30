package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

	public String getDate(Long time, String format) {
		String date = new SimpleDateFormat(format).format(time);
		return date;
	}

	public String readFileAsString(String fileName) {
		String text = "";
		try {
			text = new String(Files.readAllBytes(Paths.get(fileName)));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}
}
