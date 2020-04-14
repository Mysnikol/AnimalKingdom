public class Wolf extends Canine {

    int skullSize;
    boolean isCarnivore;

    public boolean howling(boolean isFullMoon) {
        if(isFullMoon) {
            return true;
        }
        return false;
    }

    public boolean preyLarge(boolean isGroup) {
        if(isGroup) {
            return true;
        }
        return false;
    }
}
