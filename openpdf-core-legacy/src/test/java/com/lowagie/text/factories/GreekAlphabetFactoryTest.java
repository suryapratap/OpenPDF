package com.lowagie.text.factories;

import static com.lowagie.text.factories.GreekAlphabetFactory.getString;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

// Deprecated: use org.openpdf package (openpdf-core-modern)
@Deprecated
class GreekAlphabetFactoryTest {

    @Test
    void shouldGetGreekString() {
        for (int i = 1; i < 1000; i++) {
            assertNotNull(getString(i));
        }
    }

}