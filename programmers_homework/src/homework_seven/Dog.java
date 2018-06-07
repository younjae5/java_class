package homework_seven;

public class Dog {
    public abstract class Dog{
    
        protected String name;

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        
        public String speak() {
            return "Woof";
        }
        abstract int avgBreedWeight();
    }

    class Labrador extends Dog {
        private String color; // black, yellow, or chocolate?
        private int breedWeight = 75;

        public Labrador(String name, String color) {
            super(name);
            this.color = color;
        }

        @Override
        public String speak() {
            return "Wool";
        }

        public int avgBreedWeight() {
            return breedWeight;
        }

    }

    class Yorkshire extends Dog {
        private int breedWeight = 45;

        public Yorkshire(String name) {
            super(name);
        }

        @Override
        public String speak() {
            return "woor";
        }
        
        public int avgBreedWeight() {
            return breedWeight;
        }

    }

    class DogTest {
        public String showDogInfo(Yorkshire d) {
            return d.toString();
                }
    }
}

