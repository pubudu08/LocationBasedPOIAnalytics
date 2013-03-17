package spring.mvc.analytics.models;

public enum Gender {
	Male(1),
	Female(2);

    int value;

    private Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
