package Enumerations;

public enum Days {
    Mon("Monday"),
    TUE("Tuesday"),
    WED("Wednesday"),
    THR("Thursday"),
    FRI("Friday"),
    SAT("Saturday"),
    SUN("Sunday");

    private final String value;

    Days(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
