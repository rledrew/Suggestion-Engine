package com.keyin;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Paths;


public class TestSuggestionEngine extends SuggestionEngine{
    // test case for loadDictionaryData
    @Test
    public void testLoadDictionaryData() throws IOException {
        loadDictionaryData(Paths.get("src/main/resources/words.txt"));
    }

    // test case for generateSuggestions
    @Test
    public void testGenerateSuggestions() {

        assert(generateSuggestions("monitr") != null);

    }
    @Test
    public void testGenerateSuggestions2() {
        assert(generateSuggestions("aple") != null);
    }

    @Test
    public void testGenerateSuggestions3() {
        assert(generateSuggestions("abl") != null);
    }

}
