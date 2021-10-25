package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    private Radio radio = new Radio();


    // громкость
    @Test
    public void shouldMaxVolume() {

        radio.setMaxVolume(100);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void shouldMinVolume() {

        radio.setMinVolume(0);

        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume() {

        radio.setMaxVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.getMaxVolume());
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

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldLessMinVolume() {

        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    // станция
    @Test
    public void shouldMaxStation() {

        radio.setCurrentStation(9);

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldMinStation() {

        radio.setCurrentStation(0);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCountMaxStation() {

        radio.setCurrentStation(9);

        assertEquals(10, radio.getCountStation());

    }

    @Test
    public void shouldIncreaseMaxStation2() {

        radio.setMaxStation(9);
        radio.setCurrentStation(radio.getMaxStation());
        radio.increaseStation();

        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldDecreaseMaxStation() {

        radio.setMaxStation(10);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseMinStation() {

        radio.setMinStation(0);

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

        radio.setCurrentStation(10);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldLessMinStation() {

        radio.setCurrentStation(-1);

        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldInitSettings() {

        Radio radio = new Radio();


        radio.setCurrentStation(0);
        radio.setCountStation(10);
        radio.setCurrentVolume(0);


        assertEquals(0, radio.getCurrentStation());
        assertEquals(10, radio.getCountStation());
        assertEquals(0, radio.getCurrentVolume());


    }

    @Test
    public void shouldCurrentStationMinStation() {

        radio.setMaxStation(9);
        radio.increaseStation();

        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void shouldIncreaseX2Volume() {

        radio.setCurrentVolume(20);

        radio.increaseVolume();
        radio.increaseVolume();

        assertEquals(22, radio.getCurrentVolume());
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

    @Test
    public void shouldDecreaseIncreaseVolume2() {

        radio.setCurrentVolume(100);


        radio.increaseVolume();
        radio.increaseVolume();
        radio.decreaseVolume();


        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
    }

    @ParameterizedTest
    @CsvSource(
            {"1",
                    "2",
                    "3"
            })

    public void shouldCountConstructor(int countStation) {

        Radio radio = new Radio(countStation);

        assertEquals(countStation, radio.getCountStation());
    }

    @Test
    public void shouldUseCountConstructor() {

        radio.setCountStation(10);

        radio.getCountStation();

        assertEquals(10, radio.getCountStation());
    }

    // count constructor

    Radio radio1 = new Radio(20);

     @Test
     public void shouldUseCountStationConstructor() {

         assertEquals(19, radio1.calculateMaxStation());

     }

      @Test
      public void shouldUseCountStationConstructor2() {

          radio1.setCurrentStation(70);

          assertEquals(0, radio1.getCurrentStation());

      }


      @Test
      public void shouldUseCountStationConstructorMinusStation() {

          radio1.setCurrentStation(-10);

          assertEquals(0, radio1.getCurrentStation());

      }
 }