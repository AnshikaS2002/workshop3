import static org.junit.jupiter.api.Assertions.assertTrue;

import org.PostAnalyzer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MyTest {

    @ParameterizedTest
    @ValueSource(strings = { "Riya", "Suresh", "Hi", "rahul" })
    void testName(String name) {
        PostAnalyzer postAnalyzer = new PostAnalyzer();
        assertTrue(postAnalyzer.validateName(name));
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc.xyz@gmail.com" })
    void testEmail(String email) {
        PostAnalyzer postAnalyzer = new PostAnalyzer();
        assertTrue(postAnalyzer.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Riya123", "Suresh45", "Hi213", "rahul234" })
    void testUserId(String userId) {
        PostAnalyzer postAnalyzer = new PostAnalyzer();
        assertTrue(postAnalyzer.validateUserId(userId));
    }

    @ParameterizedTest
    @ValueSource(strings = { "", "hello there!!", "msg" })
    void testPostContent(String postContent) {
        PostAnalyzer postAnalyzer = new PostAnalyzer();
        assertTrue(postAnalyzer.validatePostContent(postContent));
    }

}
