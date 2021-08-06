package org.semanticscience.d2s.functions;

import org.junit.Test;
import org.semanticscience.d2s.functions.StringFunctions;

import java.util.List;

import static org.junit.Assert.*;

public class StringFunctions_Test {
    @Test
    public void stringProcess() {
        String input = "Ones";
        List output = StringFunctions.stringProcess(input, "ne", "hoho");
        assertEquals(2, output.size());
    }
}
