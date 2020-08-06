package com.pm.project.fileHandler;

import com.pm.project.Cpu;
import com.pm.project.DirectMapCache;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Parham on 18-Apr-18.
 */
public class InputFileReader {
    public InputFileReader(String address, boolean victimCacheExists) {
        DirectMapCache directMapCache = new DirectMapCache();
        int hit = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(address))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (directMapCache.request(line, victimCacheExists))
                    hit++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hit: " + hit);
    }
}
