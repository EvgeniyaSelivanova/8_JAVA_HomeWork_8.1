package ru.netology.domain;

public class Radio {

    private int currentRadio;

    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadioStation) {
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
        this.currentRadio = currentRadioStation;
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentRadioVolume) {
        if (currentRadioVolume > 10) {
            return;
        }
        if (currentRadioVolume < 0) {
            return;
        }
        this.currentVolume = currentRadioVolume;
    }

    public void changeUpRadioStation() {
        int radio = getCurrentRadio();
        radio++;
        setCurrentRadio(radio);
    }

    public void changeDownRadioStation() {
        int radio = getCurrentRadio();
        radio--;
        setCurrentRadio(radio);
    }

    public void changeUpVolumeRadio() {
        int volume = getCurrentVolume();
        volume++;
        setCurrentVolume(volume);
    }

    public void changeDownVolumeRadio() {
        int volume = getCurrentVolume();
        volume--;
        setCurrentVolume(volume);
    }

}
