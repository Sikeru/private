package rent.ex2.member;

public class MemberVo {
	String id;
	String password;
	String name;
	String address;
	String phoneNum;

	public MemberVo(String id, String password, String name, String address, String phoneNum) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
