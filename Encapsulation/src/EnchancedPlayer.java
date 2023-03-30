public class EnchancedPlayer {
    private String name;
    private int hitPonts =100;
    private String weapon;

    public EnchancedPlayer(String name , int health , String weapon) {
        this.name = name;
        if(health>0&&health<=100){
            this.hitPonts = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int dmg){
        this.hitPonts -=dmg;
        if(this.hitPonts <=0){
            System.out.println ("Player knocked out");
        }
    }
    public int getHealth() {
        return hitPonts;
    }
}
