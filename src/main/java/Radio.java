public class Radio {
    private int radioStation;
    private int currentVolume;

    public void nextStation() {
        if (radioStation != 9) {
            radioStation++;
        } else {
            radioStation = 0;
        }
    }

    public void nextVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void turnDownVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
            return;
        }
        this.radioStation = radioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
