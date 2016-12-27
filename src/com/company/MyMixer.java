package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by garkaviy on 27.12.2016.
 */
public class MyMixer <T> {
    private  T [] vals;
    public  MyMixer (T... vals){   // ... неизвестное колличество значений
        this.vals = vals;
    }
    public  T[] shuffle(){
        List<T> result =new ArrayList<T>();

        for (int i = 0; i < vals.length ; i++) {

            int idx;
            do {
                idx = (int) (Math.random() * (vals.length));
            }
            while (result.contains(vals[idx]));
                result.add(vals[idx]);

        }
        return result.toArray(vals);

}

}
