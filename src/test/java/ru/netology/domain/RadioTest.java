package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


//    Testing of changes radio stations

    @Test
    public void getCurrentRadio() {
        Radio RadioObject = new Radio();
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(5);
        assertEquals(5, RadioObject.getCurrentRadio());
    }

    @Test
    public void setMaxBorderCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(9);
        assertEquals(9, RadioObject.getCurrentRadio());
    }

    @Test
    public void setMinBorderCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(0);
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setUpperBorderCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(10);
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setBelowBorderCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(-1);
        assertEquals(9, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeUpperCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(5);
        RadioObject.changeUpRadioStation();
        assertEquals(6, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeBelowCurrentRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(5);
        RadioObject.changeDownRadioStation();
        assertEquals(4, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeUpperMaxBorderRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(9);
        RadioObject.changeUpRadioStation();
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeBelowMinBorderRadio() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentRadio(0);
        RadioObject.changeDownRadioStation();
        assertEquals(9, RadioObject.getCurrentRadio());
    }

    //    Testing of changes radio volume
    @Test
    public void getCurrentVolume() {
        Radio RadioObject = new Radio();
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(5);
        assertEquals(5, RadioObject.getCurrentVolume());
    }

    @Test
    public void setMaxBorderCurrentVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(10);
        assertEquals(10, RadioObject.getCurrentVolume());
    }

    @Test
    public void setMinBorderCurrentVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(0);
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    @Test
    public void setUpperBorderCurrentVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(11);
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    @Test
    public void setBelowBorderCurrentVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(-1);
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    @Test
    public void changeUpperCurrentVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(5);
        RadioObject.changeUpVolumeRadio();
        assertEquals(6, RadioObject.getCurrentVolume());
    }

    @Test
    public void changeBelowCurrentVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(5);
        RadioObject.changeDownVolumeRadio();
        assertEquals(4, RadioObject.getCurrentVolume());
    }

    @Test
    public void changeUpperMaxBorderVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(10);
        RadioObject.changeUpVolumeRadio();
        assertEquals(10, RadioObject.getCurrentVolume());
    }

    @Test
    public void changeBelowMinBorderVolume() {
        Radio RadioObject = new Radio();
        RadioObject.setCurrentVolume(0);
        RadioObject.changeDownVolumeRadio();
        assertEquals(0, RadioObject.getCurrentVolume());
    }
}