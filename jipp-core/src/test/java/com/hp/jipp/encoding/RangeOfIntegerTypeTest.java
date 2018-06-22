package com.hp.jipp.encoding;

import kotlin.ranges.IntRange;
import org.junit.Test;

import java.io.IOException;

import static com.hp.jipp.encoding.Cycler.cycle;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RangeOfIntegerTypeTest {
    RangeOfIntegerType rangeType = new RangeOfIntegerType("range-only");
    IntegerOrRangeOfIntegerType rangeOrIntType = new IntegerOrRangeOfIntegerType("range-or-int");

    @Test
    public void simpleRange() throws IOException {
        Attribute<IntRange> range = cycle(rangeType, rangeType.of(new IntRange(0, 100)));
        assertEquals(0, range.getValue().getStart().intValue());
        assertEquals(100, range.getValue().getEndInclusive().intValue());
    }

    @Test
    public void multiRange() throws IOException {
        Attribute<IntRange> ranges = cycle(rangeType, rangeType.of(new IntRange(0, 100), new IntRange(90, 1000)));
        assertEquals(0, ranges.getValue().getStart().intValue());
        assertEquals(100, ranges.getValue().getEndInclusive().intValue());
        assertEquals(90, ranges.getValues().get(1).getStart().intValue());
        assertEquals(1000, ranges.getValues().get(1).getEndInclusive().intValue());
    }

    @Test
    public void rangeOrInt() throws IOException {
        Attribute<IntRangeOrInt> ranges = cycle(rangeOrIntType, rangeOrIntType.of(5));
        assertTrue(ranges.getValue().getSimpleInt());
        assertEquals(5, ranges.getValue().getRange().getEndInclusive().intValue());
    }

    @Test
    public void rangeOrIntMixed() throws IOException {
        // It's not legal to include both types, so coerce them to ranges
        Attribute<IntRangeOrInt> ranges = rangeOrIntType.of(new IntRangeOrInt(5), new IntRangeOrInt(5, 6));
        assertFalse(ranges.getValues().get(0).getSimpleInt());
    }
}
