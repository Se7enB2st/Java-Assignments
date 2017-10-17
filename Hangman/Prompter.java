import java.util.Scanner;

class Prompter {
  private Game game;
  
  public Prompter(Game game) {
    this.game = game;
  }
  
  public boolean promptForGuess() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a letter:  ");
    String guessInput = scanner.nextLine();
    char guess = guessInput.charAt(0);
    return game.applyGuess(guess);    
  }
  
  public void displayProgress() {
    System.out.printf("Displaying current progress: %s\n", game.getCurrentProgress());
  }
}
