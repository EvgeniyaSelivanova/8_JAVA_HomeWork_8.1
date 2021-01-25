package ru.netology.domain;

public class Radio {
    int currentRadioStation;
    int currentVolume;


    public int currentRadio(boolean prev, boolean next) {
        int radioStation = currentRadioStation;

        if (next == true) {
            radioStation++;
        }

        if (prev == true) {
            radioStation--;
        }

        if (radioStation > 9) {
            return 0;
        }
        if (radioStation < 0) {
            return 9;
        }
        return radioStation;
    }

    public void analyzeVolume(int volume, boolean plus, boolean minus) {
        if (plus == true) {
            volume++;
        }
        if (minus == true) {
            volume--;
        }
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.currentVolume = volume;
    }
}
