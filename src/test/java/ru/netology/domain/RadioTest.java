package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void normStationPrevTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 5;
        assertEquals(4, RadioStation.currentRadio(true, false));
    }

    @Test
    public void normStationNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 5;
        assertEquals(6, RadioStation.currentRadio(false, true));
    }

    @Test
    public void normStationPrevTrueNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 5;
        assertEquals(5, RadioStation.currentRadio(true, true));
    }

    @Test
    public void normStationPrevFalseNextFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 5;
        assertEquals(5, RadioStation.currentRadio(false, false));
    }

    @Test
    public void maxBorderStationPrevTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 9;
        assertEquals(8, RadioStation.currentRadio(true, false));
    }

    @Test
    public void maxBorderStationNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 9;
        assertEquals(0, RadioStation.currentRadio(false, true));
    }

    @Test
    public void maxBorderStationPrevTrueNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 9;
        assertEquals(9, RadioStation.currentRadio(true, true));
    }

    @Test
    public void maxBorderStationPrevFalseNextFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 9;
        assertEquals(9, RadioStation.currentRadio(false, false));
    }

    @Test
    public void minBorderStationPrevTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 0;
        assertEquals(9, RadioStation.currentRadio(true, false));
    }

    @Test
    public void minBorderStationNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 0;
        assertEquals(1, RadioStation.currentRadio(false, true));
    }

    @Test
    public void minBorderStationPrevTrueNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 0;
        assertEquals(0, RadioStation.currentRadio(true, true));
    }

    @Test
    public void minBorderStationPrevFalseNextFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 0;
        assertEquals(0, RadioStation.currentRadio(false, false));
    }

    @Test
    public void aboveBorderStationPrevTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 10;
        assertEquals(9, RadioStation.currentRadio(true, false));
    }

    @Test
    public void aboveBorderStationNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 10;
        assertEquals(0, RadioStation.currentRadio(false, true));
    }

    @Test
    public void aboveBorderStationPrevTrueNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 10;
        assertEquals(0, RadioStation.currentRadio(true, true));
    }

    @Test
    public void aboveBorderStationPrevFalseNextFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 10;
        assertEquals(0, RadioStation.currentRadio(false, false));
    }

    @Test
    public void aboveMaxStationPrevTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 12;
        assertEquals(0, RadioStation.currentRadio(true, false));
    }

    @Test
    public void aboveMaxStationNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 12;
        assertEquals(0, RadioStation.currentRadio(false, true));
    }

    @Test
    public void aboveMaxStationPrevTrueNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 12;
        assertEquals(0, RadioStation.currentRadio(true, true));
    }

    @Test
    public void aboveMaxStationPrevFalseNextFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = 12;
        assertEquals(0, RadioStation.currentRadio(false, false));
    }

    @Test
    public void underStationPrevTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = -1;
        assertEquals(9, RadioStation.currentRadio(true, false));
    }

    @Test
    public void underStationNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = -1;
        assertEquals(0, RadioStation.currentRadio(false, true));
    }

    @Test
    public void underStationPrevTrueNextTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = -1;
        assertEquals(9, RadioStation.currentRadio(true, true));
    }

    @Test
    public void underStationPrevFalseNextFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentRadioStation = -1;
        assertEquals(9, RadioStation.currentRadio(false, false));
    }


    @Test
    public void volumeRadioPlusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 5;
        RadioStation.analyzeVolume(5,true,false);
        assertEquals(6, RadioStation.currentVolume);
    }

    @Test
    public void volumeRadioMinusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 5;
        RadioStation.analyzeVolume(5,false,true);
        assertEquals(4, RadioStation.currentVolume);
    }

    @Test
    public void volumeRadioPlusTrueMinusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 5;
        RadioStation.analyzeVolume(5,true,true);
        assertEquals(5, RadioStation.currentVolume);
    }

    @Test
    public void volumeRadioPlusFalseMinusFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 5;
        RadioStation.analyzeVolume(5,false,false);
        assertEquals(5, RadioStation.currentVolume);
    }

    @Test
    public void maxVolumeRadioPlusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 10;
        RadioStation.analyzeVolume(10,true,false);
        assertEquals(10, RadioStation.currentVolume);
    }

    @Test
    public void maxVolumeRadioMinusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 10;
        RadioStation.analyzeVolume(10,false,true);
        assertEquals(9, RadioStation.currentVolume);
    }

    @Test
    public void maxVolumeRadioPlusTrueMinusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 10;
        RadioStation.analyzeVolume(10,true,true);
        assertEquals(10, RadioStation.currentVolume);
    }

    @Test
    public void maxVolumeRadioPlusFalseMinusFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 10;
        RadioStation.analyzeVolume(10,false,false);
        assertEquals(10, RadioStation.currentVolume);
    }

    @Test
    public void minVolumeRadioPlusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 0;
        RadioStation.analyzeVolume(0,true,false);
        assertEquals(1, RadioStation.currentVolume);
    }

    @Test
    public void minVolumeRadioMinusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 0;
        RadioStation.analyzeVolume(0,false,true);
        assertEquals(0, RadioStation.currentVolume);
    }

    @Test
    public void minVolumeRadioPlusTrueMinusTrue() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 0;
        RadioStation.analyzeVolume(0,true,true);
        assertEquals(0, RadioStation.currentVolume);
    }

    @Test
    public void minVolumeRadioPlusFalseMinusFalse() {
        Radio RadioStation = new Radio();
        RadioStation.currentVolume = 0;
        RadioStation.analyzeVolume(0,false,false);
        assertEquals(0, RadioStation.currentVolume);
    }

}