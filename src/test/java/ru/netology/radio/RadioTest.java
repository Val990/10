package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();


    @Test
    public void shouldUseCountConstructor() {

        radio.setCountStation(10);

        radio.getCountStation();

        assertEquals(10, radio.getCountStation());
    }


    @Test
    public void setCurrentVolume() {

        radio.setCurrentVolume(50);

        assertEquals(50, radio.getCurrentVolume());
    }


    @Test
    public void shouldMaxVolume() {

        radio.setMaxVolume(100); //  тестируемое действие, метод

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldMinVolume() {

        radio.setMinVolume(0);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {

        radio.setCurrentVolume(radio.getMaxVolume());

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

        radio.setCurrentVolume(radio.getMinVolume());

        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMinVolume() {

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

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldLessMinVolume() {

        radio.setCurrentVolume(-1);

        radio.getCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    // станция


    @Test
    public void setCurrentStation() {


        radio.setCurrentStation(2);

        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldMaxStation() {

        radio.setMaxStation(9);

        assertEquals(9, radio.getMaxStation());

    }

    @Test
    public void shouldMinStation() {

        radio.setMinStation(0);

        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldIncreaseMaxStation() {

        radio.getCurrentStation();

        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldDecreaseMinStation() {

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldDecreaseMaxStation() {

        radio.setCurrentStation(9);

        radio.decreaseStation();

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMinStation() {



        radio.increaseStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {

        Radio radio = new Radio(0, 0, 100, 5, 0, 9, 10);

        radio.decreaseStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {

        Radio radio = new Radio(0, 0, 100, 8, 0, 9, 10);

        radio.increaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseIncreaseStation() {

        Radio radio = new Radio(0, 0, 100, 8, 0, 9, 10);


        radio.decreaseStation();
        radio.increaseStation();
        radio.decreaseStation();

        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldNextX10Station() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9, 10);

        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldMoreMaxStation() {



        radio.setCurrentStation(10);

        radio.getCurrentStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldLessMinStation() {



        radio.setCurrentStation(-1);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());

    }


    @Test
    public void shouldNextCurrentRadioStation() {

        Radio radio = new Radio(0, 0, 100, 5, 0, 9, 10);

        radio.increaseStation();

        assertEquals(6, radio.getCurrentStation());
    }


    @Test
    public void shouldPlusVolume() {

        Radio radio = new Radio(70, 0, 100, 0, 0, 9, 10);

        radio.increaseVolume();

        assertEquals(71, radio.getCurrentVolume());
    }

    @Test
    public void shouldMinusVolume() {

        Radio volume = new Radio(70, 0, 100, 0, 0, 9, 10);

        volume.decreaseVolume();

        assertEquals(69, volume.getCurrentVolume());
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
            {"1",
             "2",
             "3"
            })

    public void shouldCountStation(int countStation) {

        Radio radio = new Radio(countStation);

        assertEquals(countStation, radio.getCountStation());
    }
}