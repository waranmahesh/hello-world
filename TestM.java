import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Date date = new Date();
		// date.setTime(1445947944284L);
		//
		// SimpleDateFormat sdf = new SimpleDateFormat(
		// "EEE, d MMM yyyy HH:mm:ss Z");
		// String value = sdf.format(date);
		// System.out.println(value);
		// String CIExtID = "USA_00000000004831135344636";
		// if (CIExtID != null && CIExtID.trim().length() > 0
		// && CIExtID.contains("_")) {
		// int firstIndex = CIExtID.indexOf("_");
		// String CIFinal = CIExtID.substring(firstIndex + 1, CIExtID.trim()
		// .length());
		// System.out.println(CIFinal);
		// BigInteger CIFinalInt = new BigInteger(CIFinal);
		// System.out.println(CIFinalInt);
		// }

		SimpleDateFormat sdfrr = new SimpleDateFormat("HH:mm:ss");
		Date ddatat = sdfrr.parse("00:45:22");
		System.out.println("Dare:" + ddatat.getTime());

		String configId = "SSP-SLA 4";

		int index = configId.indexOf("SLA");
		index = index + 3;
		System.out.println("index after:" + index);

		String finalValue = configId.substring(index, (configId.length()));
		if (finalValue != null) {
			finalValue = finalValue.trim();
		}
		String configIdW = "SSP-SLA 4";
		String[] arrayStr = configIdW.split("SLA");
		System.out.println("arrayStr" + arrayStr);
		System.out.println(arrayStr[arrayStr.length - 1]);

		System.out.println("finalValue:" + finalValue);
	}
}
