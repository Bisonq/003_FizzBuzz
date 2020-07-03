import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @Test
    @DisplayName("Converter should return the same number when the number is not divisible by 5 or 10 or 15")
    void test1(){
        //given
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        //when
        String result1 = fizzBuzzGame.convert(1);
        String result2 = fizzBuzzGame.convert(11);

        //then
        assertEquals("1", result1);
        assertEquals("11", result2);
    }

    @Test
    @DisplayName("Converter should return 'Fizz' word when the number is divisible by 3")
    void test2(){
        //given
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        //when
        String result1 = fizzBuzzGame.convert(3);
        String string2 = fizzBuzzGame.convert(9);

        //then
        assertEquals("Fizz", result1);
        assertEquals("Fizz", string2);
    }

    @Test
    @DisplayName("Converter should return 'Buzz' word when the number is divisible by 5")
    void test3(){
        //given
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        //when
        String result1 = fizzBuzzGame.convert(5);
        String string2 = fizzBuzzGame.convert(20);

        //then
        assertEquals("Buzz", result1);
        assertEquals("Buzz", string2);
    }

    @Test
    @DisplayName("Converter should return 'FizzBuzz' word when the number is divisible by 3 and 5")
    void test4(){
        //given
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        //when
        String result1 = fizzBuzzGame.convert(15);
        String string2 = fizzBuzzGame.convert(30);

        //then
        assertEquals("FizzBuzz", result1);
        assertEquals("FizzBuzz", string2);
    }
}