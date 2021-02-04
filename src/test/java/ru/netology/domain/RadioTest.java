package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio RadioObject = new Radio();
    //    Testing with default constructor
    //    Testing of changes radio stations
    @Test
    public void getCurrentRadio() {
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setCurrentRadio() {
        RadioObject.setCurrentRadio(5);
        assertEquals(5, RadioObject.getCurrentRadio());
    }

    @Test
    public void setMaxBorderCurrentRadio() {
        RadioObject.setCurrentRadio(9);
        assertEquals(9, RadioObject.getCurrentRadio());
    }

    @Test
    public void setMinBorderCurrentRadio() {
        RadioObject.setCurrentRadio(0);
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setUpperBorderCurrentRadio() {
        RadioObject.setCurrentRadio(10);
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void setBelowBorderCurrentRadio() {
        RadioObject.setCurrentRadio(-1);
        assertEquals(9, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeUpperCurrentRadio() {
        RadioObject.setCurrentRadio(5);
        RadioObject.changeUpRadioStation();
        assertEquals(6, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeBelowCurrentRadio() {
        RadioObject.setCurrentRadio(5);
        RadioObject.changeDownRadioStation();
        assertEquals(4, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeUpperMaxBorderRadio() {
        RadioObject.setCurrentRadio(9);
        RadioObject.changeUpRadioStation();
        assertEquals(0, RadioObject.getCurrentRadio());
    }

    @Test
    public void changeBelowMinBorderRadio() {
        RadioObject.setCurrentRadio(0);
        RadioObject.changeDownRadioStation();
        assertEquals(9, RadioObject.getCurrentRadio());
    }

    //    Testing of changes radio volume
    @Test
    public void getCurrentVolume() {
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        RadioObject.setCurrentVolume(5);
        assertEquals(5, RadioObject.getCurrentVolume());
    }

    @Test
    public void setMaxBorderCurrentVolume() {
        RadioObject.setCurrentVolume(10);
        assertEquals(10, RadioObject.getCurrentVolume());
    }

    @Test
    public void setMinBorderCurrentVolume() {
        RadioObject.setCurrentVolume(0);
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    @Test
    public void setUpperBorderCurrentVolume() {
        RadioObject.setCurrentVolume(11);
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    @Test
    public void setBelowBorderCurrentVolume() {
        RadioObject.setCurrentVolume(-1);
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    @Test
    public void changeUpperCurrentVolume() {
        RadioObject.setCurrentVolume(5);
        RadioObject.changeUpVolumeRadio();
        assertEquals(6, RadioObject.getCurrentVolume());
    }

    @Test
    public void changeBelowCurrentVolume() {
        RadioObject.setCurrentVolume(5);
        RadioObject.changeDownVolumeRadio();
        assertEquals(4, RadioObject.getCurrentVolume());
    }

    @Test
    public void changeUpperMaxBorderVolume() {
        RadioObject.setCurrentVolume(10);
        RadioObject.changeUpVolumeRadio();
        assertEquals(10, RadioObject.getCurrentVolume());
    }

    @Test
    public void changeBelowMinBorderVolume() {
        RadioObject.setCurrentVolume(0);
        RadioObject.changeDownVolumeRadio();
        assertEquals(0, RadioObject.getCurrentVolume());
    }

    //    Testing with all arguments constructor
    Radio RadioObjectAll = new Radio(
            9,
            0,
            10,
            0,
            5,
            5);

    @Test
    public void checkMaxRadioStation() {
        assertEquals(9, RadioObjectAll.getMaxRadioStation());
    }
    @Test
    public void checkChangeMaxRadioStation() {
        RadioObjectAll.setMaxRadioStation(0);
        assertEquals(0, RadioObjectAll.getMaxRadioStation());
    }
    @Test
    public void checkMinRadioStation() {
        assertEquals(0, RadioObjectAll.getMinRadioStation());
    }
    @Test
    public void checkChangeMinRadioStation() {
        RadioObjectAll.setMinRadioStation(1);
        assertEquals(1, RadioObjectAll.getMinRadioStation());
    }
    @Test
    public void checkMaxVolume() {
        assertEquals(10, RadioObjectAll.getMaxVolume());
    }
    @Test
    public void checkChangeMaxVolume() {
        RadioObjectAll.setMaxVolume(100);
        assertEquals(100, RadioObjectAll.getMaxVolume());
    }
    @Test
    public void checkMinVolume() {
        assertEquals(0, RadioObjectAll.getMinVolume());
    }
    @Test
    public void checkChangeMinVolume() {
        RadioObjectAll.setMinVolume(1);
        assertEquals(1, RadioObjectAll.getMinVolume());
    }
    @Test
    public void checkCurrentRadio() {
        assertEquals(5, RadioObjectAll.getCurrentRadio());
    }
    @Test
    public void checkChangeCurrentRadio() {
        RadioObjectAll.setCurrentRadio(8);
        assertEquals(8, RadioObjectAll.getCurrentRadio());
    }
    @Test
    public void checkCurrentVolume() {
        assertEquals(5, RadioObjectAll.getCurrentVolume());
    }
    @Test
    public void checkChangeCurrentVolume() {
        RadioObjectAll.setCurrentVolume(6);
        assertEquals(6, RadioObjectAll.getCurrentVolume());
    }

    //    Testing with one argument constructor - current radio and current volume
    Radio RadioObjectMaxRadio = new Radio(9);
    @Test
    public void setMaxArgumentUpperBorderCurrentRadio() {
        RadioObjectMaxRadio.changeUpRadioStation();
        assertEquals(0, RadioObjectMaxRadio.getCurrentRadio());
    }
    @Test
    public void setMaxArgumentChangeDownRadio() {
        RadioObjectMaxRadio.changeDownRadioStation();
        assertEquals(8, RadioObjectMaxRadio.getCurrentRadio());
    }

    Radio RadioObjectMinRadio = new Radio(0);
    @Test
    public void setMinArgumentChangeUpRadio() {
        RadioObjectMinRadio.changeUpRadioStation();
        assertEquals(1, RadioObjectMinRadio.getCurrentRadio());
    }

    @Test
    public void setMinArgumentChangeDownRadio() {
        RadioObjectMinRadio.changeDownRadioStation();
        assertEquals(9, RadioObjectMinRadio.getCurrentRadio());
    }

    //    Testing with two arguments constructor - maxVolume and current volume
    Radio RadioObjectMaxVolume = new Radio(100,100);
    @Test
    public void setMaxArgumentUpperBorderCurrentVolume() {
        RadioObjectMaxVolume.changeUpVolumeRadio();
        assertEquals(100, RadioObjectMaxVolume.getCurrentVolume());
    }
    @Test
    public void setMaxArgumentChangeDownVolume() {
        RadioObjectMaxVolume.changeDownVolumeRadio();
        assertEquals(99, RadioObjectMaxVolume.getCurrentVolume());
    }

}