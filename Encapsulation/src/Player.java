public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int dmg){
        this.health-=dmg;
        if(this.health<=0){
            System.out.println ("Player knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
