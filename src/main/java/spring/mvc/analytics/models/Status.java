package spring.mvc.analytics.models;

public enum Status {

	Active(1), Inactive(2), Pending(3), Banned(4);

	int value;

	private Status(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
