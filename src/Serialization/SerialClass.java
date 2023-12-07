package Serialization;

import java.io.Serial;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class SerialClass implements Serializable {
    // serialVersionUID.
    @Serial
    private static final long serialVersionUID = 1L;
    private final Date currentTime;

    // default constructor.
    SerialClass() {
        currentTime = Calendar.getInstance().getTime();
    }

    // getter method.
    public Date getCurrentTime() {
        return currentTime;
    }
}