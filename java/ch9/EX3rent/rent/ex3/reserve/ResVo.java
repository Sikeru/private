package rent.ex3.reserve;

public class ResVo {
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String returnDate;

	public ResVo(String resCarNumber, String resDate, String useBeginDate, String returnDate) {
		super();
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.returnDate = returnDate;
	}

	public String getResCarNumber() {
		return resCarNumber;
	}

	public void setResCarNumber(String resCarNumber) {
		this.resCarNumber = resCarNumber;
	}

	public String getResDate() {
		return resDate;
	}

	public void setResDate(String resDate) {
		this.resDate = resDate;
	}

	public String getUseBeginDate() {
		return useBeginDate;
	}

	public void setUseBeginDate(String useBeginDate) {
		this.useBeginDate = useBeginDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

}
