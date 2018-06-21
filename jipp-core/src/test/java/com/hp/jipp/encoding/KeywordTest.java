package com.hp.jipp.encoding;


import com.hp.jipp.util.BuildError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class KeywordTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    // A basic keyword
    public static class Sample extends Keyword {
        public static final String ONE_NAME = "one";
        public static final Sample One = of(ONE_NAME);
        public static final Sample Two = of("two");
        public static final Sample Three = of("three");

        public static final KeywordType.Encoder<Sample> ENCODER = KeywordType.Companion.encoderOf(Sample.class,
                new Keyword.Factory<Sample>() {
                    @NotNull
                    @Override
                    public Sample of(@NotNull String name, @NotNull Tag tag, String language) {
                        return Sample.of(name);
                    }
                });
        private final String value;

        public static KeywordType<Sample> typeOf(String name) {
            return new KeywordType<Sample>(ENCODER, name);
        }

        public static Sample of(String name) {
            return new Sample(name);
        }

        public Sample(String name) {
            this.value = name;
        }

        @Override
        public String getValue() {
            return value;
        }

        @NotNull
        @Override
        public Tag getTag() {
            return Tag.keyword;
        }

        @Nullable
        @Override
        public String getLanguage() {
            return null;
        }
    }

    @Test
    public void testAll() {
        assertThat(Sample.ENCODER.getAll(), hasItems(Sample.One, Sample.Two, Sample.Three));
    }

    @Test
    public void rejectInvalid() {
        assertFalse(Sample.ENCODER.valid(Tag.integerValue));
    }

    @Test
    public void rejectName() throws IOException {
        StringType nameType = new StringType(Tag.nameWithoutLanguage, "sample");

        // Show that we *cannot* encode nameType as Sample
        exception.expect(BuildError.class);
        Cycler.cycle(Sample.typeOf("sample"), nameType.of("three"));
    }
}
