package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int mimVolume = 0;

    public Radio(int size) {
        maxStation = size - 1;
    }
    public Radio(){

    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxStation(){
        return maxStation;
    }
    public int getMinStation(){
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public void next() {

        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {

        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {;
        if (currentVolume > mimVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = mimVolume;

        }
    }
}