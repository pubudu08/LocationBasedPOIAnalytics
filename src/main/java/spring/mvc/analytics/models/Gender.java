package spring.mvc.analytics.models;

public enum Gender {
    M("Male"), F("Female");
    
    String value;

    private Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
