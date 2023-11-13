import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class GameBoard {
    int width;
    int length;
    SceneType sceneType;
    List<Character> characters;
    List<House> houses;

    public GameBoard(int width, int length, SceneType sceneType, int numHouses) {
        this.width = width;
        this.length = length;
        this.sceneType = sceneType;
        this.characters = new ArrayList<>();
        this.houses = generateHouses(numHouses);
    }

    private List<House> generateHouses(int numHouses) {
        List<House> houses = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numHouses; i++) {
            String material = sceneType == SceneType.EUROPEAN ? "Concrete" :
                    sceneType == SceneType.ASIAN ? "Bamboo" :
                            sceneType == SceneType.AFRICAN ?"Wail and Cane": "";
            int houseWidth = 5;
            int houseLength = 5;

            int x = random.nextInt(width - houseWidth + 1);
            int y = random.nextInt(length - houseLength + 1);

            houses.add(new House(material, new Size(houseWidth, houseLength), new Position(x, y)));
        }

        return houses;
    }

    public void render() {

        for (Character character : characters) {
            System.out.println("Character: Type=" + character.type +
                    " Age=" + character.age +
                    " Position=(" + character.position.x + ", " + character.position.y + ")");
        }

        for (House house : houses) {
            System.out.println("House: Material=" + house.material +
                    " Size=(" + house.size.width + "x" + house.size.length + ")" +
                    " Position=(" + house.position.x + ", " + house.position.y + ")");
        }
    }
}