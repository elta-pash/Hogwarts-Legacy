package a52112401;

/**
 * Defines the various magic levels.
 * wizards have a magic level.
 * in order to be able to use specific spells a minimum magic level is necessary.
 * Note: the compiler generated default constructor may not be sufficient for your implementation
 */
public enum MagicLevel {
    NOOB(50), ADEPT(100), STUDENT(200), EXPERT(500), MASTER(1000);
    private int basicMP = 0;

    //constuctor
    private MagicLevel (int basicMP){
        this.basicMP = basicMP;
    }

    //getter for basicMP
    public int toMana() {
        return basicMP;
    }

    @Override
    public String toString(){
        int level = ordinal() + 1;
        StringBuilder asterisks = new StringBuilder();

        switch (level) {
            case 1:
                asterisks.append("*");
                break;
            case 2:
                asterisks.append("**");
                break;
            case 3:
                asterisks.append("***");
                break;
            case 4:
                asterisks.append("****");
                break;
            case 5:
                asterisks.append("*****");
                break;
        }
        return asterisks.toString();
    }
}