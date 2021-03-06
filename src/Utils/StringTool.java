package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTool {

	
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0 || str.equals("") || str.matches("\\s*");
	}
	
	public static boolean isNotEmpty(String str) {

		return !isEmpty(str);

	}

	public StringTool() {
	}

	public static String createUnitId() {

		int random = (int)Math.random();

		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");

		return df.format(new Date()) + random;

	}
	
}
