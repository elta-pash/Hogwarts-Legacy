package a52112401;

public interface Selectable {
    int getSelectionValue();
    default boolean select(int digit){
        int selectionValue = getSelectionValue();
        String selectionAsString = String.valueOf(selectionValue);
        return selectionAsString.contains(String.valueOf(digit));
    }
}
