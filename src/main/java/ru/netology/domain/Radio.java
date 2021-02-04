package ru.netology.domain;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentRadio = 0;
    private int currentVolume = 0;

    public Radio() {
    }

    public Radio(
            int maxRadioStation,
            int minRadioStation,
            int maxVolume,
            int minVolume,
            int currentRadio,
            int currentVolume) {
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentRadio = currentRadio;
        this.currentVolume = currentVolume;
    }

    public Radio(int currentRadio) {
        this.currentRadio = currentRadio;
    }

    public Radio(int maxVolume, int currentVolume) {
        this.maxVolume = maxVolume;
        this.currentVolume = currentVolume;
    }

    public int getMaxRadioStation() { return maxRadioStation; }

    public void setMaxRadioStation(int maxRadioStation) { this.maxRadioStation = maxRadioStation; }

    public int getMinRadioStation() { return minRadioStation; }

    public void setMinRadioStation(int minRadioStation) { this.minRadioStation = minRadioStation; }

    public int getMaxVolume() { return maxVolume; }

    public void setMaxVolume(int maxVolume) { this.maxVolume = maxVolume; }

    public int getMinVolume() { return minVolume; }

    public void setMinVolume(int minVolume) { this.minVolume = minVolume; }

    public int getCurrentRadio() { return currentRadio; }

    public void setCurrentRadio(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) { currentRadioStation = minRadioStation; }
        if (currentRadioStation < minRadioStation) { currentRadioStation = maxRadioStation; }
        this.currentRadio = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentRadioVolume) {
        if (currentRadioVolume > maxVolume) { return; }
        if (currentRadioVolume < minVolume) { return; }
        this.currentVolume = currentRadioVolume;
    }

    public void changeUpRadioStation() {
        int radio = getCurrentRadio();
        radio++;
        this.setCurrentRadio(radio);
    }

    public void changeDownRadioStation() {
        int radio = getCurrentRadio();
        radio--;
        this.setCurrentRadio(radio);
    }

    public void changeUpVolumeRadio() {
        int volume = getCurrentVolume();
        volume++;
        this.setCurrentVolume(volume);
    }

    public void changeDownVolumeRadio() {
        int volume = getCurrentVolume();
        volume--;
        this.setCurrentVolume(volume);
    }

}
