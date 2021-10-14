package ru.netology.radio;

public class Radio {

    // громкость
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    // станция
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;

    // 1) настройка текущей громкости
    public int getCurrentVolume() { // покажи текущую громкость
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {  // выставить значения громкости, что хотим вывести
        if (currentVolume < minVolume) { // от 0
            return;
        }
        if (currentVolume > maxVolume) { // до 10
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    // 2) переключение громкости
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    // 1) настройка текущей станции
    public int getCurrentStation() { // покажи текущую станцию
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {  // выставить значения станции, что хотим вывести
        if (currentStation < minStation) { // от 0
            return;
        }
        if (currentStation > maxStation) { // до 9
            return;
        }
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    // 2) переключение станции
    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}