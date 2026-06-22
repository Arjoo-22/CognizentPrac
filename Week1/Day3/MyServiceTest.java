import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testMocking() {

        ExternalAPI mockApi = mock(ExternalAPI.class);

        when(mockApi.getData())
                .thenReturn("Mock Data");

        MyService service =
                new MyService(mockApi);

        String result =
        
                service.fetchData();

        assertEquals(
                "Mock Data",
                result
        );
    }
}