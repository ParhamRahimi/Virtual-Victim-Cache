package com.pm.project;

/**
 * Created by Mostafa on 17-Apr-18.
 */

public class VCache {
    private static int totalValid;
    private static int register;

    private static Block[] blocks;

    public VCache() {
        totalValid = 0;
        blocks = new Block[16];
        for (int i = 0; i < 16; i++)
            blocks[i] = new Block("", false);
    }

    public void write(String address) {

        register++;
        //LRU
        int minNum, minIndex = -1;
        minNum = Integer.MAX_VALUE;
        //if cache full      find the smallest number then write

        if (totalValid > 15) {
            for (int i = 0; i < 16; i++) {

                if (blocks[i].isValid() == true) {
                    if (blocks[i].getTime() < minNum) {
                        minNum = blocks[i].getTime();
                        minIndex = i;
                    }
                }
            }

            blocks[minIndex].setStartingData(address);
            blocks[minIndex].setTime(register);

        } else {//if not full write on first empty

            blocks[totalValid].setValid(true);
            blocks[totalValid].setTime(register);
            blocks[totalValid].setStartingData(address);
            totalValid++;

        }
    }

    public boolean hit(String newNumber) {
        boolean hit = false;
        //search newer

        for (int i = 0; i < 16; i++) {
            if (blocks[i].isValid()) {
                if (blocks[i].getStartingData().equals(newNumber)) {
                    hit = true;
                }
            }
        }

        return hit;
    }

}