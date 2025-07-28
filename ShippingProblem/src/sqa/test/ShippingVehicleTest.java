//Parid Thammasorn 663380394-6 sec.2
package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import sqa.main.ShippingVehicle;

public class ShippingVehicleTest {

    static ShippingVehicle vehicle = new ShippingVehicle();

    static Stream<Arguments> testCases() {
        return Stream.of(

            Arguments.of(0, 0, 0, Arrays.asList(0, 0, 0)),
            Arguments.of(1, 0, 0, Arrays.asList(1, 0, 0)),
            Arguments.of(0, 1, 0, Arrays.asList(0, 1, 0)),
            Arguments.of(0, 0, 1, Arrays.asList(0, 0, 1)),
            Arguments.of(0, 0, 500, Arrays.asList(0, 0, 500)),
            Arguments.of(0, 0, 501, Arrays.asList(-1)),
            Arguments.of(0, 200, 0, Arrays.asList(0, 200, 0)),
            Arguments.of(0, 201, 0, Arrays.asList(-1)),
            Arguments.of(100, 0, 0, Arrays.asList(100, 0, 0)),
            Arguments.of(101, 0, 0, Arrays.asList(-1)),
            Arguments.of(99, 1, 0, Arrays.asList(99, 1, 0)),
            Arguments.of(98, 4, 0, Arrays.asList(-1)),
            Arguments.of(0, 1, 198, Arrays.asList(0, 1, 198)),
            Arguments.of(50, 80, 0, Arrays.asList(50, 80, 0)),
            Arguments.of(50, 80, 10, Arrays.asList(50, 80, 10)),
            Arguments.of(50, 80, 51, Arrays.asList(-1)),
            Arguments.of(0, 200, 0, Arrays.asList(0, 200, 0)),
            Arguments.of(99, 2, 0, Arrays.asList(99, 2, 0)),
            Arguments.of(99, 2, 1, Arrays.asList(-1)),
            Arguments.of(99, 0, 5, Arrays.asList(99, 0, 5)),
            Arguments.of(99, 0, 6, Arrays.asList(-1)),
            Arguments.of(50, 100, 75, Arrays.asList(-1)),
            Arguments.of(45, 51, 50, Arrays.asList(45, 51, 50)),
            Arguments.of(0, 100, 100, Arrays.asList(0, 100, 100)),
            Arguments.of(100, 0, 5, Arrays.asList(-1)),
            Arguments.of(99, 1, 5, Arrays.asList(-1))
        );
    }

    @ParameterizedTest(name = "Test case {index} => L={0}, M={1}, S={2}")
    @MethodSource("testCases")
    void testCalculate(int large, int medium, int small, List<Integer> expected) {
        List<Integer> result = vehicle.calculate(small, medium, large);
        assertEquals(expected, result);
    }
}



