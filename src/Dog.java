public class Dog extends Canine {

    int weight;
    boolean isDomesticated;


    public boolean barking(boolean isStranger) {
        if(isStranger) {
            return true;
        }
        return false;
    }

    public boolean chase(boolean isSquirrel) {
        if(isSquirrel) {
            return true;
        }
        return false;
    }
}

