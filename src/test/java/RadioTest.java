import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(5);

        int expected = 5;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValues1() {
        Radio radio = new Radio();
        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValues2() {
        Radio radio = new Radio();
        radio.setRadioStation(0);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValues3() {
        Radio radio = new Radio();
        radio.setRadioStation(1);

        int expected = 1;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValues4() {
        Radio radio = new Radio();
        radio.setRadioStation(8);

        int expected = 8;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValues5() {
        Radio radio = new Radio();
        radio.setRadioStation(9);

        int expected = 9;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationLimitValues6() {
        Radio radio = new Radio();
        radio.setRadioStation(10);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNext1() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNext2() {
        Radio radio = new Radio();
        radio.setRadioStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioStationNext3() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);

        int expected = 50;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeLimitValues1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeLimitValues2() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeLimitValues3() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeLimitValues4() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeLimitValues5() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolumeLimitValues6() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.nextVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolume2() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.nextVolume();
        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolume3() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.nextVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeVolume4() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.nextVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.turnDownVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume2() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.turnDownVolume();
        int expected = 49;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume3() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.turnDownVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolume4() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.turnDownVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}