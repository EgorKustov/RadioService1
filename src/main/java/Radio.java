public class Radio {

    private int maxStation;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
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

    public void nextStation() {
        if (this.currentStation == maxStation) {
            this.currentStation = 0;
        } else {
            this.currentStation++;
        }
    }

    public void nextVolume() {
        if (this.currentVolume < 100) {
            this.currentVolume++;
        }
    }

    public void prevVolume() {
        if (this.currentVolume > 0) {
            this.currentVolume--;
        }
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}
