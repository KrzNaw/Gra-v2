import Enemy.*;
import Player.*;

public class Runner {
    public static void main(String[] args) {

        Player p = new Knight();
        Enemy e = new TeutonicKnight();


        while (p.getTotalHealthPoints() > 0 || e.getTotalHealthPoints()>0 ) {
            p.attack(e);
            if(e.getTotalHealthPoints()>0){
                e.attack(p);
            } else {
                System.out.println("Walka skończona");
            }
        }

    }
}
