package com.hp.jipp.model;

import com.hp.jipp.pwg.Finishing;
import com.hp.jipp.util.KotlinTest;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

import static com.hp.jipp.encoding.Cycler.*;

public class FinishingTest {
    @Test
    public void testFinishings() throws Exception {
        Finishing finishings[] = new Finishing[] { Finishing.bind, Finishing.cover};

        assertEquals(Arrays.asList(finishings),
                cycle(Types.finishingsSupported.of(finishings)).getValues());
    }

    @Test
    public void cover() throws Exception {
        KotlinTest.cover(Types.finishingsSupported.of(Finishing.Code.edgeStitch),
                cycle(Types.finishingsSupported.of(Finishing.edgeStitch)),
                Types.finishingsSupported.of(Finishing.Encoder.get(88)));
    }
}
