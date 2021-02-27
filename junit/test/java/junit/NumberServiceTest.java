package junit;

import org.junit.*;

public class NumberServiceTest {

    private static NumberService numberService;

    // вик 1 раз перед усіма тестами в класі
    // можна робити instance класу, підключення до БД
    @BeforeClass
    public static void beforeClass() {
        System.out.println("set up");
        numberService = new NumberService();
    }

    // метод, який виконується перед кожним методом тесту
    // по ситуації
    @Before
    public void setUp() throws Exception {
        System.out.println("Test in going to take part in the project");
    }

    // метод запускається як тест
    @Test
    public void count() {
        System.out.println("test count");
        final int count = numberService.count(10, 15);
        Assert.assertEquals(25, count);
    }

    @Test
    public void difference() {
        System.out.println("test difference");
        final int difference = numberService.difference(50, 40);
        Assert.assertEquals(10, difference);
    }

    // після кожного тесту
    @After
    public void tearDown() throws Exception {
        System.out.println("Test finished");
    }

    // після усіх тестів
    // наприклад, закрити connection до БД
    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Tests finished");
    }
}
