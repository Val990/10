package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    // громкость
    @Test
    public void shouldMaxVolume() {

        radio.setCurrentVolume(10); // setter, выстави текущую громкость

        radio.getMaxVolume(); //  тестируемое действие

        int actual = radio.getCurrentVolume(); // getter, покажи текущую громкость
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {

        radio.setCurrentVolume(0);

        radio.getMinVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMaxVolume() {

        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinVolume() {

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMinVolume() {

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {

        radio.setCurrentVolume(7);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        radio.setCurrentVolume(7);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreX2Volume() {

        radio.setCurrentVolume(8);

        radio.increaseVolume();
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextX10Volume() {

        radio.setCurrentVolume(1);

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

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxVolume() {

        radio.setCurrentVolume(11);

        radio.getCurrentVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldLessMinVolume() {

        radio.setCurrentVolume(-1);

        radio.getCurrentVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    // станция
    @Test
    public void shouldMaxStation() {

        radio.setCurrentStation(9);

        radio.getMaxStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMinStation() {

        radio.setCurrentStation(0);

        radio.getMinStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxStation() {
        radio.setCurrentStation(9);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseMinStation() {
        radio.setCurrentStation(0);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseMaxStation() {

        radio.setCurrentStation(9);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseMinStation() {

        radio.setCurrentStation(0);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {

        radio.setCurrentStation(5);

        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {

        radio.setCurrentStation(5);

        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseIncreaseStation() {

        radio.setCurrentStation(8);

        radio.decreaseStation();
        radio.increaseStation();
        radio.decreaseStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
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
        radio.increaseStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxStation() {

        radio.setCurrentStation(10);

        radio.getCurrentStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldLessMinStation() {

        radio.setCurrentStation(-1);

        radio.getCurrentStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
}