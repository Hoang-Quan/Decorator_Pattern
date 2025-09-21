public abstract class Decorator implements Character {
    private Character character;

    public Decorator(Character character) {
        this.character = character;
    }

    protected Decorator() {
    }

    @Override
    public String getDescription() {
        return character.getDescription();
    }

    @Override
    public int getPower() {
        return 0;
    }
}
