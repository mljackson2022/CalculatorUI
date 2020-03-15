public class Calculator {
    String primaryNumber = "";
    String previousNumber;

    public Calculator(){
        this("");
    }

    public Calculator(String primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public String attachToMainNumber(String toAttach){
        primaryNumber += toAttach;
        return primaryNumber;
    }

    public void resetPrimaryNumber(){
        primaryNumber = "";
    }

    public String getPrimaryNumber() {
        return primaryNumber;
    }

    public String add(String toAdd){
        var primaryNumberInt = Integer.parseInt(previousNumber,10);
        var newNumberInt = Integer.parseInt(toAdd,10);
        var total = primaryNumberInt + newNumberInt;
        primaryNumber = Integer.toString(total);
        return primaryNumber;
    }

    public String subtract(String toSubtract){
        var primaryNumberInt = Integer.parseInt(previousNumber,10);
        var newNumberInt = Integer.parseInt(toSubtract,10);
        var total = primaryNumberInt - newNumberInt;
        primaryNumber = Integer.toString(total);
        return primaryNumber;
    }

    public String multiply(String toMultiply){
        var primaryNumberInt = Integer.parseInt(previousNumber,10);
        var newNumberInt = Integer.parseInt(toMultiply,10);
        var total = primaryNumberInt * newNumberInt;
        primaryNumber = Integer.toString(total);
        return primaryNumber;
    }

    public String divide(String toDivide){
        var primaryNumberInt = Integer.parseInt(previousNumber,10);
        var newNumberInt = Integer.parseInt(toDivide,10);
        var total = primaryNumberInt / newNumberInt;
        primaryNumber = Integer.toString(total);
        return primaryNumber;
    }

    public void storeAndResetPrimaryNumber(){
        previousNumber = primaryNumber;
        resetPrimaryNumber();
    }
}
