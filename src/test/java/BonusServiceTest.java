import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService bonusService = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = bonusService.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService bonusService = new BonusService();

        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = bonusService.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUnregisteredAndUnderLimit() {
        BonusService bonusService = new BonusService();

        long amount = 10_000_60;
        boolean registered = false;
        long expected = 100;

        long actual = bonusService.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUnregisteredAndOverLimit() {
        BonusService bonusService = new BonusService();

        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = bonusService.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAmountEqualsZeroRegistered() {
        BonusService bonusService = new BonusService();

        long amount = 0;
        boolean registered = true;
        long expected = 0;

        long actual = bonusService.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAmountEqualsZeroUnregistered() {
        BonusService bonusService = new BonusService();

        long amount = 0;
        boolean registered = false;
        long expected = 0;

        long actual = bonusService.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}