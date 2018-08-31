public class ReflectiveClass implements ReflectiveInterface {

    private int aNumber;
    private String aString;

    public ReflectiveClass(int aNumber, String aString) {
        this.aNumber = aNumber;
        this.aString = aString;
    }

    @Override
    public int getNumber() {
        return aNumber;
    }

    public String getString() {
        return aString;
    }

    private void setStringToNumber() {
        this.aString = String.valueOf(this.aNumber);
    }
}
