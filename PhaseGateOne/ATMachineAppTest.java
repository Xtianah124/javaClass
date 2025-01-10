import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ATMachineAppTest {

    @Test
    public void testThatRaisesValueError() {
        ATMachineApp app = new ATMachineApp();
        int firstName = 1234;
        int lastName = 1254;
        assert(false);

    }
}