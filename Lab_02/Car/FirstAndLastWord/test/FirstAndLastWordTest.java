import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastWordTest {
    List<String> stringList;
    List<String> test;

    @Test
    public void testSort() {
        List<String> stringList = new ArrayList<>();
        List<String> test = new ArrayList<>();
        stringList.add("a");
        stringList.add("Z");
        test.add("Z");
        test.add("a");
        FirstAndLastWord firstAndLastWord = new FirstAndLastWord(stringList);
        firstAndLastWord.sort();
        Assert.assertEquals(test, stringList);
    }
    @Test
    public void testSortIgnoreCase() {
        List<String> stringList = new ArrayList<>();
        List<String> test = new ArrayList<>();
        stringList.add("a");
        stringList.add("Z");
        test.add("a");
        test.add("Z");
        FirstAndLastWord firstAndLastWord = new FirstAndLastWord(stringList);
        firstAndLastWord.sortIgnoreCase();
        Assert.assertEquals(test, stringList);
    }
}