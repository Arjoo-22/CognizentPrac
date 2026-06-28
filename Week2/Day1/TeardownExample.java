public class TeardownExample {

    @BeforeEach
    void setup() {
        System.out.println("Setup before test");
    }

    @Test
    void test1() {
        System.out.println("Running Test 1");
    }

    @Test
    void test2() {
        System.out.println("Running Test 2");
    }

    @AfterEach
    void teardown() {
        System.out.println("Cleanup after each test");
    }

    @AfterAll
    static void finalCleanup() {
        System.out.println("Final cleanup after all tests");
    }
} {
    
}
