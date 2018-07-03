package com.hp.jipp;

import com.hp.jipp.pwg.DocumentFormatVaryingAttribute;
import org.junit.Test;

import java.io.IOException;

import static com.hp.jipp.encoding.Cycler.cycle;
import static com.hp.jipp.pwg.DocumentFormatVaryingAttribute.accuracyUnitsSupported;
import static com.hp.jipp.pwg.PrinterStatusGroup.documentFormatVaryingAttributes;
import static org.junit.Assert.assertEquals;

public class PwgTypesTest {
    @Test
    public void documentFormatVaryingAttributeTest() throws IOException {
        DocumentFormatVaryingAttribute attr = cycle(documentFormatVaryingAttributes,
                documentFormatVaryingAttributes.of(accuracyUnitsSupported))
                .getValue();
        assertEquals(attr, accuracyUnitsSupported);
        // TODO: Add case for documentFormatVaryingAttributes.none which is specified along side Printer group
    }
}
