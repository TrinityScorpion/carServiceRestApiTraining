package cars.service.carService.support;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    private cars.service.carService.support.Test test;

    @BeforeEach
    public void createInstane() {
        test = new cars.service.carService.support.Test();
    }

    @Test
    void swapMethodInputIsLetter() {
        //given
        String input = "abc";

        //when
        String result = test.swap(input);

        //then
        assertEquals("222", result);
    }

    @Test
    void shouldSwapMethodThrowIllegalArgumentException() {
        //given
        String input = "abc5";

        //when
        String result = test.swap(input);

        //then
        assertEquals("2220", result);
    }

    @Test
    void shouldSwapMethodNotContainZeroValue() {
        //given
        String input = "abs553fga";
        boolean flag = false;

        //when
        String result = test.swap(input);
        if(result.contains("0")){
            flag = true;
        }

        //then
        assertThat(result);
    }
}
