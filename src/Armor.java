public class Armor extends Decorator{
    public Armor(Character character){
        super(character);
    }
    @Override
    public String getDescription() {
        return character.getDescription() + " with armor";
    }

    @Override
    public int getPower() {
        return character.getPower() + 3;
    }
}
