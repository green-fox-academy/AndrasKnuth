public class Pirate {
    int counter = 0;
    int drunkenness;

    public Pirate(int drunkenness) {
    }

    public void drinkSomeRum(Pirate pirate) {
        this.drunkenness = drunkenness;
        if (pirate == null){
            System.out.println("The pirate is dead");
        } else {
            drunkenness += 10;
            counter++;
        }
    }

    public void howsItgoingMate(Pirate pirate) {
        if (pirate == null){
            System.out.println("The pirate is dead");
        }
        else if (counter <= 4) {
            System.out.println("Pour me anudder!");
        } else if (counter > 4) {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die(Pirate pirate){
        pirate = null;
        System.out.println("The pirate is dead.");
    }



    public static void main(String[] args) {
        Pirate pirate = new Pirate(10);
        pirate.drinkSomeRum(pirate);
        pirate.howsItgoingMate(pirate);
        pirate.drinkSomeRum(pirate);
        pirate.drinkSomeRum(pirate);
        pirate.drinkSomeRum(pirate);
        pirate.die(pirate);
        pirate.howsItgoingMate(pirate);
    }
}

/*
Create a Pirate class. While you can add other fields and methods, you must have these methods:-

drinkSomeRum() - intoxicates the Pirate some
howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
 */