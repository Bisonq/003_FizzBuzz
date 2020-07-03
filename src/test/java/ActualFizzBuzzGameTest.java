import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActualFizzBuzzGameTest {

    @Test
    @DisplayName("FizzBuzzGame should print correct results and pass all tests")
    void test1(){
        //given
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        //then
        for(int i = 1 ; i <= 100 ; i++)
            System.out.println(fizzBuzzGame.convert(i));
    }

}