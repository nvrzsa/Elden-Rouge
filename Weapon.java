public class Weapon {
    private String weaponName;
    private int dexterityRequirement;
    private int endurance;
    private int strength;
    private int intelligence;
    private int faith;


    public Weapon(String weaponName, int dexterityRequirement,
                  int endurance, int strength, int intelligence, int faith) {
        this.weaponName = weaponName;
        this.dexterityRequirement = dexterityRequirement;
        this.endurance = endurance;
        this.strength = strength;
        this.intelligence = intelligence;
        this.faith = faith;
    }
}