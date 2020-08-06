package com.pm.project;

import java.util.ArrayList;

/**
 * Created by Parham on 17-Apr-18.
 */
public class DirectMapCache {
    private ArrayList<Block> directMapCacheData;
    private VCache vCache;
    int i;

    public DirectMapCache() {
        directMapCacheData = new ArrayList<>();
        for (int i = 0; i < 256; i++)
            directMapCacheData.add(new Block("", false));
        vCache = new VCache();
        i = 0;
    }

    public boolean request(String req, boolean victimCacheExists) {
        int index = Integer.parseInt(req.substring(20, 28), 2);
        if (victimCacheExists) {
            boolean result = false;
            if (directMapCacheData.get(index).isValid()) {
                if (directMapCacheData.get(index).getStartingData().equals(req.substring(0, 28))) {
                    return true;
                } else {
                    result = vCache.hit(req.substring(0, 28));
                    vCache.write(directMapCacheData.get(index).getStartingData());
                    directMapCacheData.set(index, new Block(req.substring(0, 28), true));
                    if (result)
                        i++;
                    return result;
                }
            } else {
                directMapCacheData.set(index, new Block(req.substring(0, 28), true));
            }
        } else {
            if (directMapCacheData.get(index).isValid()) {
                if (directMapCacheData.get(index).getStartingData().equals(req.substring(0, 28))) {
                    return true;
                }
            } else {
                directMapCacheData.set(index, new Block(req.substring(0, 28), true));
                return false;
            }

        }
        return false;
    }
}
