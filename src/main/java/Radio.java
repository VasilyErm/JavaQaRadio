public class Radio {
    private int radioStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;

    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
        this.maxVolume = 100;
        this.minVolume = 0;
    }

    public Radio(int maxStationsCount) {
        this.maxStation = maxStationsCount - 1;
    }

    public void nextStation() {
        if (radioStation != maxStation) {
            radioStation++;
        } else {
            radioStation = minStation;
        }
    }

    public void previousStation() {
        if (radioStation != minStation) {
            radioStation--;
        } else {
            radioStation = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = minVolume;
        }
    }

    public void turnDownVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = maxVolume;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < minStation) {
            return;
        }
        if (radioStation > maxStation) {
            return;
        }
        this.radioStation = radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
