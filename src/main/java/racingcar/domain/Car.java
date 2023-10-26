package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int distance = 0;

    public Car(String name) {
        this.name = name;
    }

    private void go() {
        if(Randoms.pickNumberInRange(0, 9) >= 4) {
            distance++;
        }
    }
}
