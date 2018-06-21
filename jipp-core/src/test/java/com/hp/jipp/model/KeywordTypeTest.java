package com.hp.jipp.model;

import org.junit.Test;

import static org.junit.Assert.*;

import static com.hp.jipp.encoding.Cycler.*;

public class KeywordTypeTest {
    @Test
    public void identifyActions() throws Exception {
        assertEquals("display", IdentifyActions.display.toString());
        assertEquals(IdentifyActions.display,
                cycle(Types.identifyActions, Types.identifyActions.of(IdentifyActions.display)).get(0));
    }

    @Test
    public void acceptOtherIdentifyActions() throws Exception {
        IdentifyActions flareGun = new IdentifyActions("flare-gun");
        assertEquals("flare-gun",
                cycle(Types.identifyActions, Types.identifyActions.of(flareGun)).get(0).getValue());
    }

    @Test
    public void outputBinActions() throws Exception {
        assertEquals("large-capacity", OutputBin.largeCapacity.toString());
        assertEquals(OutputBin.myMailbox,
                cycle(Types.outputBinSupported, Types.outputBinSupported.of(OutputBin.myMailbox)).get(0));
    }
}
