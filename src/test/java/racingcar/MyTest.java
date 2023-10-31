package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Racing;

public class MyTest {
    @Test
    void 문자열이_5보다_클때() {
        assertThatThrownBy(() -> {
            Car car = new Car("sdfsdfsd"); })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 차가_잘_안움직이나() {
        Car car = new Car("Tony");
        car.go(0);
        assertThat(car.getDistance()).isEqualTo(0);
    }

    @Test
    void 차가_잘_움직이나() {
        Car car = new Car("Tony");
        car.go(4);
        assertThat(car.getDistance()).isEqualTo(1);
    }

    @Test
    void StreamTest() {
        Racing racing = new Racing(List.of(new Car[]{new Car("tony"), new Car("tommy")}));
        assertThat(racing.computeResult()).isEqualTo(List.of(new String[]{"tony", "tommy"}));
    }
}
