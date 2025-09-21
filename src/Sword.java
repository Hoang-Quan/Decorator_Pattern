public class Sword extends Decorator {
    public Sword(Character character) {
        super(character);
    }

    @Override
    public String getDescription() {
        return character.getDescription() + " with sword";
    }

    @Override
    public int getPower() {
        return character.getPower() + 5;
    }
}
