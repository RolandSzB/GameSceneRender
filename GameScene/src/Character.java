

import java.util.ArrayList;
import java.util.List;

    class Character {
        String type;
        int age;
        Position position;
        Size size;
        List<Character> group;

        public Character(String type, int age) {
            this.type = type;
            this.age = age;
            this.position = new Position(0, 0);
            this.size = new Size(1, 1);
            this.group = new ArrayList<>();
        }

        public void moveTo(int x, int y) {

            if (isPositionValid(x, y)) {
                this.position.x = x;
                this.position.y = y;
            } else {
                System.out.println("Character can not occupe an occuped position");
            }
        }

        private boolean isPositionValid(int x, int y) {
            return true;
        }
    }


