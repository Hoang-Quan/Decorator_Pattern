public class Magic extends Decorator{
    public Magic(Character character){
        super(character);
    }
    @Override
    public String getDescription() {
        return character.getDescription() + " with magic";
    }

    @Override
    public int getPower() {
        return character.getPower() + 10;
    }
}
