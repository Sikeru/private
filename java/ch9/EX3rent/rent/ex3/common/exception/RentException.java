package rent.ex3.common.exception;

import java.util.Calendar;

public class RentException extends Exception {
	private String mesg;

	public RentException(String mesg) {
		this.mesg = mesg;
	}

	public String toString() {
		return "예외 메시지는 :" + mesg;
	}

	public String getRentExceptionInfo() {
		String errMsg = "예외발생 시간 : " + showErrTime() + "예외 내용 : " + mesg;
		return errMsg;
	}

	public static String showErrTime() {
		String date = null;
		String time = null;
		Calendar cal = Calendar.getInstance();

		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		date = year + "-" + month + "-" + day;
		time = year + "-" + month + "-" + day;
		return date + "" + time;
	}
}