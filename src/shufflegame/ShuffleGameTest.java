package shufflegame;

public class ShuffleGameTest {
    public static void main(String[] args) {
        int[] starting_array = {1, 0, 1};
        ShuffleGame sg = new ShuffleGame();
//        sg.shuffleGame(starting_array);.
//        System.out.println(sg.playerGuess());
        System.out.println("------------------------welcome to shuffle game-------------------------");
        System.out.println("guess where the 0 is ?");
        sg.checkGuess(sg.shuffleGame(starting_array), sg.playerGuess());
    }
}
