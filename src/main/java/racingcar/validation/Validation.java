package racingcar.validation;

public class Validation {
    public void racingCarNameValidate(String[] racingCarNames) {
        if (racingCarNames.length ==0) {
            throw new IllegalArgumentException();
        }
        for (String name : racingCarNames){
            if (name.length()>5) {
                throw new IllegalArgumentException();
            }
        }
    }
}
