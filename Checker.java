package FinalProject;

public class Checker {
    private char checkerSign;

    private Checker() {}

    public Checker(char checkerSign) {
        this.setCheckerSign(checkerSign);
    }

    public void setCheckerSign(char checkerSign) {
        this.checkerSign = checkerSign;
    }

    public char getCheckerSign() {
        return checkerSign;
    }
}
