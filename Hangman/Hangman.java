public class Hangman {

  public static void main(String[] args) {
    // Your incredible code goes here...
    Game game = new Game("Treehouse");
    System.out.println("Making an new game");
    
    Prompter prompter = new Prompter(game);
    prompter.displayProgress();
    boolean isHit = prompter.promptForGuess();
    if(isHit){
      System.out.println("It a hit!");
    }else {
      System.out.println("It a miss :(");
    }
    prompter.displayProgress();
  }
}
