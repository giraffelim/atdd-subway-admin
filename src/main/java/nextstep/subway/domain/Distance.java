package nextstep.subway.domain;

import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class Distance {
    private static final int MIN_DISTANCE = 0;
    private int value;

    protected Distance() {}

    private Distance(int value) {
        validate(value);
        this.value = value;
    }

    public void validate(int value) {
        if (value <= MIN_DISTANCE) {
            throw new IllegalArgumentException("Distance는 0이하의 값일 수 없습니다.");
        }
    }

    public static Distance from(int value) {
        return new Distance(value);
    }

    public Distance subtract(Distance distance) {
        return new Distance(this.value - distance.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Distance distance = (Distance) o;
        return value == distance.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
