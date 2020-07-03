public class Main {
    public static void main(String[] args) {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        for(int i = 1 ; i <= 100 ; i ++){
            System.out.println(fizzBuzzGame.convert(i));
        }
    }
}
