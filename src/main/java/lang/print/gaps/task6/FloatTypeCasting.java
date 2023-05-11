package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result;
        if ((numberToBeRounded*10) % 10 < 5) {
            result = (int) numberToBeRounded;
        } else result = (int) numberToBeRounded + 1;
    }
}
