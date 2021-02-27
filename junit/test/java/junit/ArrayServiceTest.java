package junit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArrayServiceTest {

    private static ArrayService arrayService;

    @BeforeClass
    public static void beforeClass() {
        arrayService = new ArrayService();
    }

    @Test
    public void aNumbers() {
        System.out.println(1);
        final int[] numbers = arrayService.numbers(14, 27, 39, 67);
        Assert.assertNotNull(numbers);
        Assert.assertEquals(4, numbers.length);
        final int[] expectedArray = {14, 27, 39, 67};
        Assert.assertArrayEquals(expectedArray, numbers);
    }

    @Test
    public void cData() {
        System.out.println(2);
        final List<Integer> data = arrayService.data(-57, 0);
        Assert.assertNotNull(data);
        Assert.assertEquals(2, data.size());
        final int integer = data.get(0);
        Assert.assertEquals(-57, integer);
        final int value = data.get(1);
        Assert.assertEquals(0, value);
    }

    @Test(expected = NullPointerException.class)
    public void bSave() {
        System.out.println(3);
        arrayService.save(null);
    }
}
