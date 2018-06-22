package com.hp.jipp.encoding;

import org.junit.Test;

import java.io.IOException;
import java.util.Date;

import static com.hp.jipp.encoding.Cycler.cycle;
import static org.junit.Assert.*;

public class DateTimeTypeTest {
    private DateTimeType type = new DateTimeType("date-time");

    @Test
    public void now() throws IOException {
        Date now = new Date();
        // Chop to nearest 100 millis because that's the only resolution we support
        now = new Date((now.getTime() / 100) * 100);
        Attribute<Date> dateTime = cycle(type, type.of(now));
        assertEquals(now.getTime() % 1000, dateTime.getValue().getTime() % 1000);
        assertEquals(now, dateTime.getValue());
    }
}
