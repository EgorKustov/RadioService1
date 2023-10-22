public class Radio {

    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public int getCurrentStation(){
    return currentStation;
    }

    public void setCurrentStation(int currentStation) {
       if (currentStation < 0) {
           return;
       }
       if (currentStation > 9) {
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
        if (currentStation != maxStation) {
            currentStation ++;
        } else {
            currentStation = 0;
        }
    }
    public void nextVolume() {
        if (currentVolume != 100) {
            currentVolume ++;
        } else {
            currentVolume = 0;
        }
    }

    public void prevVolume() {
        if (currentVolume != 0) {
            currentVolume --;
        } else {
            currentVolume = 100;
        }
    }
    public void prevStation() {
        if (currentStation != 0) {
            currentStation --;
        } else {
            currentStation = maxStation;
        }
    }

    public Radio() {
        this.maxStation = 9;

    }
    public Radio (int stationCount) {
        this.maxStation = stationCount - 1;

    }

}
