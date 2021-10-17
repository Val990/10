package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int countStation = 10;


    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public Radio (int countStation, int currentStation) { // количество станций
        this.countStation = countStation;
        maxStation = countStation - 1;
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    //настройка громкости


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    //настройка станции

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }

        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }
}