public class FizzBuzzGame {

    public String convert(int element){
        if(element % 15 == 0)
            return "FizzBuzz";
        else if (element % 3 == 0)
            return "Fizz";
        else if (element % 5 ==0)
            return "Buzz";
        else
            return element + "";
    }
}
