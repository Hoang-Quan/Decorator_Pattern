//Bài 3 – RPG Character Buffs (game)
//
//Interface Character có getDescription() và getPower().
//
//Concrete: Warrior, Mage.
//
//Decorators:
//
//SwordDecorator (+5 power).
//
//ArmorDecorator (+3 power).
//
//MagicBuffDecorator (+10 power).
//
//Viết chương trình: tạo Warrior có sword + armor + buff.
public class Main {
    public static void Play() {
        Character warrior = new Warrior();
        Character mage = new Mage();
        warrior = new Armor(warrior);
        warrior = new Sword(warrior);

        mage = new Magic(mage);
        System.out.println(warrior.getDescription() + " with power: " + warrior.getPower());
        System.out.println(mage.getDescription() + " with power: " + mage.getPower());
    }

    public static void main(String[] args) {
        Play();
    }
}