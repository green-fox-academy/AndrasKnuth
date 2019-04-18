import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    private List<Sharpie> sharpieList;

    public SharpieSet(){
        this.sharpieList = new ArrayList<>();
    }

    void add(Sharpie sharpie){
        this.sharpieList.add(sharpie);
    }


    int countUsable() {
        int counter = 0;
        for (Sharpie sharpie : sharpieList) {
            if (sharpie.inkAmount > 0) {
                counter++;
            }
        }
        return counter;
    }
    void removeTrash() {
        for (Sharpie sharpie : sharpieList) {
            if (!(sharpie.inkAmount >0)) {
                sharpieList.remove(sharpie);
            }
        }
    }
}

/* Reuse your Sharpie class
Create SharpieSet class
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies */