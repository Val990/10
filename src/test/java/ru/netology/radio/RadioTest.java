package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    private Radio radio = new Radio();

    @Test
    public void shouldUseCountConstructor() {

        radio.setCountStation(10);

        radio.getCountStation();

        assertEquals(10, radio.getCountStation());
    }

    // громкость
    @Test
    public void shouldMaxVolume() {

        radio.setCurrentVolume(100); // setter, выставляем текущую громкость

        radio.getMaxVolume(); //  тестируемое действие, метод

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldMinVolume() {

        radio.setCurrentVolume(0);

        radio.getMinVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMaxVolume() {

        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMinVolume() {

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {

        radio.setCurrentVolume(50);

        radio.decreaseVolume();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(75);

        radio.increaseVolume();

        assertEquals(76, radio.getCurrentVolume());
    }

    @Test
    public void shouldMoreX2Volume() {

        radio.setCurrentVolume(20);

        radio.increaseVolume();
        radio.increaseVolume();

        assertEquals(22, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextX10Volume() {

        radio.setCurrentVolume(10);

        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();

        assertEquals(21, radio.getCurrentVolume());
    }

    @Test
    public void shouldMoreMaxVolume() {

        radio.setCurrentVolume(101);

        radio.getCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldLessMinVolume() {

        radio.setCurrentVolume(-1);

        radio.getCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    // станция
    @Test
    public void shouldMaxStation() {

        radio.setCurrentStation(9);

        radio.getCurrentStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldMinStation() {

        radio.setCurrentStation(0);

        radio.getMinStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMaxStation() {
        radio.setCurrentStation(9);

        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldDecreaseMinStation() {
        radio.setCurrentStation(0);

        radio.decreaseStation();

        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldDecreaseMaxStation() {

        radio.setCurrentStation(10);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMinStation() {

        radio.setCurrentStation(0);

        radio.increaseStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {

        radio.setCurrentStation(5);

        radio.decreaseStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {

        radio.setCurrentStation(5);

        radio.increaseStation();

        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseIncreaseStation() {

        radio.setCurrentStation(8);

        radio.decreaseStation();
        radio.increaseStation();
        radio.decreaseStation();

        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldNextX10Station() {

        radio.setCurrentStation(0);

        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();


        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldMoreMaxStation() {

        radio.setCurrentStation(11);

        radio.getCurrentStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldLessMinStation() {

        radio.setCurrentStation(-1);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(
            {"5, 4",
             "8, 7",
             "0, 9"
            })

    public void shouldCountCurrentStationNumber(int countStation, int currentStation) {

        Radio radio = new Radio(countStation, currentStation);

        assertEquals(countStation, radio.getCountStation());
    }

    @ParameterizedTest
    @CsvSource(
             {"5",
              "8",
              "0"
            })

    public void shouldCountStation(int countStation) {

        Radio radio = new Radio(countStation);

        assertEquals(countStation, radio.getCountStation());
    }
}
