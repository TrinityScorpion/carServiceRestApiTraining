package cars.service.carService.support;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.Assert.assertEquals;

public class StartTest {
    private Start startService;

    @BeforeEach
    void beforeEach() {
        startService = new Start();
    }


    @Test
    void shouldAddTwoCorrectNumbers() {
        //given
        String a = "10";
        String b = "20";

        //when
        int result = startService.add(a, b);

        //then
        assertEquals(30, result);
    }

    @Test
    void shouldThrowExceptionOnInvalidFirstArgument() {
        //given
        String a = "wrong-number";
        String b = "20";

        //when
        Throwable throwable = catchThrowable(() ->startService.add(a,b));
        //then
        assertThat(throwable)
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("For input string: \"wrong-number\"");
    }

    @Test
    void shouldThrowExceptionOnInvalidSecondArgument() {
        //given
        String a = "10";
        String b = "wrong-number";

        //when
        Throwable throwable = catchThrowable(() ->startService.add(a,b));
        //then
        assertThat(throwable)
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("For input string: \"wrong-number\"");
    }

    @Test
    void shouldThrowExceptionOnEmptyFirstArgument() {
        //given
        String a = "";
        String b = "10";

        //when
        Throwable throwable = catchThrowable(() ->startService.add(a,b));
        //then
        assertThat(throwable)
                .isInstanceOf(NumberFormatException.class)
                .hasMessage("For input string: \"\"");
    }

    @Test
    void shouldThrowExceptionOnIntegerOverFlow() {
        //given
        String a = "3dsds";
        String b = "11";

        //when
        Throwable throwable = catchThrowable(() ->startService.add(a,b));
        //then
        assertThat(throwable)
                .isInstanceOf(NumberFormatException.class);
    }
}
