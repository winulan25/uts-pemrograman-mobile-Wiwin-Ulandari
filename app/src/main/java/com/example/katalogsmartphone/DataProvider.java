package com.example.katalogsmartphone;


import android.content.Context;


import com.example.katalogsmartphone.model.Hp;
import com.example.katalogsmartphone.model.Infinix;
import com.example.katalogsmartphone.model.Pixel;
import com.example.katalogsmartphone.model.Sony;

import java.util.ArrayList;
import java.util.List;




public class DataProvider {
    private static List<Hp> hps = new ArrayList<>();

    private static List<Infinix> initDataInfinix(Context ctx) {
        List<Infinix> infinixes = new ArrayList<>();
        infinixes.add(new Infinix("HOT9 PLAY", "OS Android 9.0 Pie (Go edition",
                "Released 2020, April 09,MEMORY 32GB 2GB RAM, 32GB 3GB RAM, 64GB 3GB RAM, 64GB 4GB RAM", R.drawable.infinix_hot9_play));
        infinixes.add(new Infinix("HOT 10", "OS  Android 10, XOS 6.0",
                ": 2020, September 17. Released 2020, October 17,MEMORY 64GB 3GB RAM, 64GB 4GB RAM, 128GB 4GB RAM, 128GB 6GB RAM", R.drawable.infinix_hot10));
        infinixes.add(new Infinix("NOTE 8 ", "OS Android 9.0 (Pie), XOS 5.0",
                ". Released 2019, September MEMORY : 32GB 2GB RAM, 64GB 4GB RAM", R.drawable.infinix_note8));
        infinixes.add(new Infinix("S5 PRO", "        infinixes.add(new Infinix(\"S5 PRO\", \"\",\n",
                "Released 2020, April MEMORY 64GB 4GB RAM, 128GB 6GB RAM", R.drawable.infinix_s5pro));
        infinixes.add(new Infinix("ZERO 8", " OS Android 10",
                "Released 2020, August 31 MEMORY : 128GB 8GB RAM", R.drawable.infinix_zero8));
        return infinixes;
    }
    private static List<Pixel> initDataPixel(Context ctx) {
        List<Pixel> pixels = new ArrayList<>();
        pixels.add(new Pixel("PIXEL 3", "OS Android 11",
                "Released 2020, October 15 PLATFORM MEMORY 128GB 8GB RAM\n", R.drawable.pixel_3));
        pixels.add(new Pixel("PIXEL 3XL", "OS Android 9.0 ",
                "Released 2018, October 18 MEMORY 64GB 4GB RAM, 128GB 4GB RAM\n", R.drawable.pixel_3xl));
        pixels.add(new Pixel("PIXEL 4", "JOS Android 10, upgradable to Android 11",
                "Released 2019, October 22 MEMORY 64GB 6GB RAM, 128GB 6GB RAM ", R.drawable.pixel_4));
        pixels.add(new Pixel("PIXEL 5", "OS Android 11",
                ": Released 2020, October 15 MEMORY : 128GB 8GB RAM", R.drawable.pixel_5));
        pixels.add(new Pixel("PIXEL", "Android 6.0.1 (Marshmallow), upgradable to Android 8.0 (Oreo)",
                "Released 2015, December 08 MEMORY 32GB 3GB RAM, 64GB 3GB RAM\n", R.drawable.google_pixel));
        return pixels;

    }
    private static List<Sony> initDataSony(Context ctx) {
        List<Sony> sonys = new ArrayList<>();
        sonys.add(new Sony("X COMPACT", ":OS Android 6.0.1 (Marshmallow), upgradable to Android 8.0",
                ". Released 2016, September 08 MEMORY : 32GB 3GB RAM", R.drawable.sony_x_compact));
        sonys.add(new Sony("XZ1", "OS Android 8.0 (Oreo), upgradable to Android 9.0",
                ". Released 2017, September 19 MEMORY : 64GB 4GB RAM ", R.drawable.sony_xz1));
        sonys.add(new Sony("XZ2", "OS Android 8.0 (Oreo), upgradable to Android 10",
                "Released 2018, April 20 MEMORY  64GB 4GB RAM, 64GB 6GB RAM ", R.drawable.sony_xz2));
        sonys.add(new Sony("Z5", "OS Android 5.1.1 (Lollipop), upgradable to 7.1.1 (Nougat)",
                "Released 2015, October 02 MEMORY :  32GB 3GB RAM", R.drawable.sony_z5));
        sonys.add(new Sony("XZS", "OS Android 7.1 (Nougat), upgradable to Android 8.0 (Oreo)",
                "Released 2017, April 03 MEMORY : 32GB 4GB RAM, 64GB 4GB RAM", R.drawable.sony_xzs));
        return sonys;
    }

    private static void initAllHps(Context ctx) {
        hps.addAll(initDataInfinix(ctx));
        hps.addAll(initDataPixel(ctx));
        hps.addAll(initDataSony(ctx));

    }

    public static List<Hp> getAllHp(Context ctx) {
        if (hps.size() == 0) {
            initAllHps(ctx);
        }
        return  hps;
    }

    public static List<Hp> getHpsByTipe(Context ctx, String merek) {
        List<Hp> hpsByType = new ArrayList<>();
        if (hpsByType.size() == 0) {
            initAllHps(ctx);
        }
        for (Hp o : hps) {
            if (o.getMerek().equals(merek)) {
                hpsByType.add(o);
            }
        }
        return hpsByType;
    }

}







