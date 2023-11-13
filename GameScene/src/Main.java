// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(50, 50, SceneType.EUROPEAN, 10);

        Character character1 = new Character("Human", 30);
        Character character2 = new Character("Elf", 200);

        character1.moveTo(5, 5);
        character2.moveTo(10, 10);

        gameBoard.characters.add(character1);
        gameBoard.characters.add(character2);

        gameBoard.render();
    }
}