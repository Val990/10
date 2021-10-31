package ru.netology.radio;

public class Radio {

    // громкость
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    // станция
    private int currentStation;
    private int countStation = 10;


    public Radio() {
    }

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public int getCountStation() {
        return countStation;
    }

    public void setCountStation(int countStation) {
        this.countStation = countStation;
    }


    //  громкость


    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }


    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    //   станция


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > (countStation - 1)) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int increaseStation() {
        if (currentStation < (countStation - 1)) {
            currentStation = currentStation + 1;
            return currentStation;
        }
        if (currentStation == (countStation - 1)) {
            currentStation = 0;
        }
        return currentStation;
    }

    public int decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return currentStation;
        }
        if (currentStation == 0) {
            currentStation = (countStation - 1);
        }
        return currentStation;
    }
}