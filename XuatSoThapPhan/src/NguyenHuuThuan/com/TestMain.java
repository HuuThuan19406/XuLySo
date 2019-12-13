package NguyenHuuThuan.com;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestMain {

	public static void main(String[] args) {
		System.out.println(new DecimalFormat("#.##").format(Math.PI));
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
		dfs.setGroupingSeparator(',');
		DecimalFormat dcf = new DecimalFormat("#,###");
		dcf.setDecimalFormatSymbols(dfs);
		System.out.println(dcf.format(994171899));
	}

}
