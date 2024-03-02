/**
 * The Character class represents a player character in the game.
 */

public class Character {
    private String name;
    private String jobClass;
    private int level;
    private int health;
    private int endurance;
    private int dexterity;
    private int strength;
    private int intelligence;
    private int faith;

    /**
     * Constructs a Character object with the specified attributes.
     *
     * @param name         The name of the character.
     * @param jobClass     The job class of the character.
     * @param level        The level of the character.
     * @param health       The health points of the character.
     * @param endurance    The endurance attribute of the character.
     * @param dexterity    The dexterity attribute of the character.
     * @param strength     The strength attribute of the character.
     * @param intelligence The intelligence attribute of the character.
     * @param faith        The faith attribute of the character.
     */

    public Character(String name, String jobClass, int level, int health,
                     int endurance, int dexterity, int strength,
                     int intelligence, int faith) {
        this.name = name;
        this.jobClass = jobClass;
        this.level = level;
        this.health = health;
        this.endurance = endurance;
        this.dexterity = dexterity;
        this.strength = strength;
        this.intelligence = intelligence;
        this.faith = faith;
    }

    /**
     * Displays the current stats of the character, including name, job class, level, and attributes.
     */

    public void displayStats(){
        System.out.println("\nName: " + this.name);
        System.out.println("Job Class: " + this.jobClass);
        System.out.println("Level: " + this.level);
        System.out.println("Health: " + this.health);
        System.out.println("Endurance: " + this.endurance);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Strength: " + this.strength);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("faith: " + this.faith);
    }

    /**
     * Sets the name of the character.
     *
     * @param name The new name of the character.
     */

    public void setName(String name){
        this.name = name;
    }

    /**
     * Gets the name of the character.
     *
     * @return The name of the character.
     */

    public String getName(){
        return this.name;
    }

    /**
     * Gets the level of the character.
     *
     * @return The level of the character.
     */

    public int getLevel() {
        return this.level;
    }
    
    /**
     * Sets the job class of the character based on the provided class code.
     *
     * @param jobClass The class code representing the desired job class.
     * @return True if the job class is valid and set successfully, false otherwise.
     */

    public boolean setClass(String jobClass){
        switch (jobClass){
            case "1":
                this.jobClass = "Vagabond";
                this.level = 9;
                this.health = 15;
                this.dexterity = 13;
                this.intelligence = 9;
                this.endurance = 11;
                this.strength = 14;
                this.faith = 9;
                return true;
            case "2":
                this.jobClass = "Samurai";
                this.level = 9;
                this.health = 12;
                this.dexterity = 15;
                this.intelligence = 9;
                this.endurance = 13;
                this.strength = 12;
                this.faith = 9;
                return true;
            case "3":
                this.jobClass = "Warrior";
                this.level = 8;
                this.health = 11;
                this.dexterity = 16;
                this.intelligence = 10;
                this.endurance = 11;
                this.strength = 10;
                this.faith = 8;
                return true;
            case "4":
                this.jobClass = "Hero";
                this.level = 7;
                this.health = 14;
                this.dexterity = 9;
                this.intelligence = 7;
                this.endurance = 12;
                this.strength = 16;
                this.faith = 8;
                return true;
            case "5":
                this.level = 6;
                this.jobClass = "Astrologer";
                this.health = 9;
                this.dexterity = 12;
                this.intelligence = 16;
                this.endurance = 9;
                this.strength = 8;
                this.faith = 7;
                return true;
            case "6":
                this.jobClass = "Prophet";
                this.level = 7;
                this.health = 10;
                this.dexterity = 10;
                this.intelligence = 7;
                this.endurance = 8;
                this.strength = 11;
                this.faith = 16;
                return true;
            default:
                System.out.println("INVALID CLASS");
                return false;
        }
    }
}