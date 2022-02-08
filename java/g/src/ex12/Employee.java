package ex12;

public class Employee {
	String name;
	int payPerMonth;
	int commsion;

	public Employee(String name, int payPerMonth, int commsion) {
		this.name = name;
		this.payPerMonth = payPerMonth;
		this.commsion = commsion;
	}

	int calcTotalPay() {
		int totalPay = 12 * payPerMonth + commsion;
		return totalPay;
	}
}
