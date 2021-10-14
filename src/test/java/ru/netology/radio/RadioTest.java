package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio();


    @Test
    public void setCurrentVolume() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.setCurrentVolume(50);

        assertEquals(50, radio.getCurrentVolume());
    }


    @Test
    public void shouldMaxVolume() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.setMaxVolume(100); //  тестируемое действие, метод

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldMinVolume() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.setMinVolume(0);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.setCurrentVolume(radio.getMaxVolume());

        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMaxVolume() {

        Radio radio = new Radio(100, 0, 100, 0, 0, 9);

        radio.decreaseVolume();

        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.setCurrentVolume(radio.getMinVolume());

        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMinVolume() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {

        Radio radio = new Radio(50, 0, 100, 0, 0, 9);

        radio.decreaseVolume();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {

        Radio radio = new Radio(75, 0, 100, 0, 0, 9);

        radio.increaseVolume();

        assertEquals(76, radio.getCurrentVolume());
    }

    @Test
    public void shouldMoreX2Volume() {

        Radio radio = new Radio(20, 0, 100, 0, 0, 9);

        radio.increaseVolume();
        radio.increaseVolume();

        assertEquals(22, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextX10Volume() {

        Radio radio = new Radio(10, 0, 100, 0, 0, 9);

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

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.setCurrentVolume(101);

        radio.getCurrentVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldLessMinVolume() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        radio.getCurrentVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    // станция


    @Test
    public void setCurrentStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(2);

        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldMaxStation() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.setMaxStation(9);

        assertEquals(9, radio.getMaxStation());

    }

    @Test
    public void shouldMinStation() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.setMinStation(0);

        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldIncreaseMaxStation() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.getCurrentStation();

        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldDecreaseMinStation() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());

    }

    @Test
    public void shouldDecreaseMaxStation() {

        Radio radio = new Radio(0, 0, 100, 9, 0, 9);

        radio.decreaseStation();

        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMinStation() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

        radio.increaseStation();

        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {

        Radio radio = new Radio(0, 0, 100, 5, 0, 9);

        radio.decreaseStation();

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation() {

        Radio radio = new Radio(0, 0, 100, 8, 0, 9);

        radio.increaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseIncreaseStation() {

        Radio radio = new Radio(0, 0, 100, 8, 0, 9);


        radio.decreaseStation();
        radio.increaseStation();
        radio.decreaseStation();

        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldNextX10Station() {

        Radio radio = new Radio(0, 0, 100, 0, 0, 9);

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

        Radio radio = new Radio();

        radio.setCurrentStation(10);

        radio.getCurrentStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldLessMinStation() {

        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());

    }


    @Test
    public void shouldNextCurrentRadioStation() {

        Radio radio = new Radio(0, 0, 100, 5, 0, 9);

        radio.increaseStation();

        assertEquals(6, radio.getCurrentStation());
    }


    @Test
    public void shouldPlusVolume() {

        Radio radio = new Radio(70, 0, 100, 0, 0, 9);

        radio.increaseVolume();

        assertEquals(71, radio.getCurrentVolume());
    }

    @Test
    public void shouldMinusVolume() {

        Radio volume = new Radio(70, 0, 100, 0, 0, 9);

        volume.decreaseVolume();

        assertEquals(69, volume.getCurrentVolume());
    }
}