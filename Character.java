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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setClass(String jobClass){
        switch (jobClass){
            case "Vagabond":
                this.jobClass = "Vagabond";
                this.level = 9;
                this.health = 15;
                this.dexterity = 13;
                this.intelligence = 9;
                this.endurance = 11;
                this.strength = 14;
                this.faith = 9;
                break;
            case "Samurai":
                this.jobClass = "Samurai";
                this.level = 9;
                this.health = 12;
                this.dexterity = 15;
                this.intelligence = 9;
                this.endurance = 13;
                this.strength = 12;
                this.faith = 9;
                break;
            case "Warrior":
                this.jobClass = "Warrior";
                this.level = 8;
                this.health = 11;
                this.dexterity = 16;
                this.intelligence = 10;
                this.endurance = 11;
                this.strength = 10;
                this.faith = 8;
                break;
            case "Hero":
                this.jobClass = "Hero";
                this.level = 7;
                this.health = 14;
                this.dexterity = 9;
                this.intelligence = 7;
                this.endurance = 12;
                this.strength = 16;
                this.faith = 8;
                break;
            case "Astrologer":
                this.level = 6;
                this.jobClass = "Astrologer";
                this.health = 9;
                this.dexterity = 12;
                this.intelligence = 16;
                this.endurance = 9;
                this.strength = 8;
                this.faith = 7;
                break;
            case "Prophet":
                this.jobClass = "Prophet";
                this.level = 7;
                this.health = 10;
                this.dexterity = 10;
                this.intelligence = 7;
                this.endurance = 8;
                this.strength = 11;
                this.faith = 16;
                break;
        }
    }
}