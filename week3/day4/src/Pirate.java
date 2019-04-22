import java.lang.Math;

public class Pirate {
    int counter = 0;
    int drunkenness;
    boolean alive;
    boolean passedOut;

    Pirate() {
        this.drunkenness = 0;
        this.alive = true;
        this.passedOut = false;
    }

    public void drinkSomeRum() {
        if (alive){
            drunkenness += 10;
            counter++;
        } else {
            System.out.println("The pirate is dead");
        }
    }

    public void howsItgoingMate() {
        if (counter <= 4 && alive) {
            System.out.println("Pour me anudder!");
        } else if (alive) {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passedOut = true;
        } else {
            System.out.println("The pirate is dead.");
        }
    }

    public void die() {
        alive = false;
    }

    public void brawl(Pirate otherPirate) {
        if (otherPirate.alive){
            int chance = 0;
            chance = (int) (Math.random() * (3+1));
            if (chance == 1){
                otherPirate.die();
            }else if (chance == 2){
                this.die();

            }else {
                this.passedOut = true;
                otherPirate.passedOut = true;
            }
        }
    }

    public class Parrott {
    }

    public static void main(String[] args) {
        Pirate pirate = new Pirate();
        pirate.drinkSomeRum();
        pirate.drinkSomeRum();
        pirate.drinkSomeRum();
        pirate.die();
        pirate.drinkSomeRum();

        pirate.howsItgoingMate();
    }
}

/*
Create a Pirate class. While you can add other fields and methods, you must have these methods:-

drinkSomeRum() - intoxicates the Pirate some
howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
If you manage to get this far, then you can try to do the following.

die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
And... if you get that far...

Add a parrot.
 */