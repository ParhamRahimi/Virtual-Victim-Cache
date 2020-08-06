package com.pm.project;

/**
 * Created by Parham on 17-Apr-18.
 */
public class Block {
    private String startingData;
    private int time;
    private boolean valid;


    public Block(String startingData, boolean isValid) {
        this.startingData = startingData;
        valid = isValid;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getStartingData() {
        return startingData;
    }

    public void setStartingData(String startingData) {
        this.startingData = startingData;
    }
}