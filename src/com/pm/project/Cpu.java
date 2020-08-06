package com.pm.project;

import com.pm.project.fileHandler.OutputFileWriter;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Parham on 16-Apr-18.
 */
public class Cpu {
    private ArrayList<String> addresses = new ArrayList();

    public Cpu() {
        double random;
        int randomInt;
        String s = "";
        long l = 0;
        for (int k = 0; k < 5; k++) {
            addresses.clear();
            for (int i = 0; i < 20; i++) {
                s = "";
                l = 0;
                for (int j = 0; j < 32; j++) {
                    random = Math.random();
                    if (random > 0.5)
                        randomInt = 1;
                    else
                        randomInt = 0;
                    s = s + randomInt;
                }
                addresses.add(s);
                l = Long.parseLong(s, 2);
                if (l < 5) {
                    l++;
                    addresses.add(equalizer(Long.toString(l, 2)));
                    l++;
                    addresses.add(equalizer(Long.toString(l, 2)));
                    l++;
                    addresses.add(equalizer(Long.toString(l, 2)));
                    l++;
                    addresses.add(equalizer(Long.toString(l, 2)));
                } else {
                    l--;
                    addresses.add(equalizer(Long.toString(l, 2)));
                    l--;
                    addresses.add(equalizer(Long.toString(l, 2)));
                    l--;
                    addresses.add(equalizer(Long.toString(l, 2)));
                    l--;
                    addresses.add(equalizer(Long.toString(l, 2)));
                }

            }
            for (int i = 100; i < 500; i++) {
                s = "";
                randomInt = (int) (Math.random() * 25) * 4;
                for (int j = randomInt; j < randomInt + 4; j++) {
                    s = addresses.get(j);
                    addresses.add(s);
                }
            }
            try {
                OutputFileWriter outputFileWriter = new OutputFileWriter(addresses, k);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private String equalizer(String string) {
        String result = string;
        while (result.length() < 32)
            result = "0" + result;
        return result;
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }
}
