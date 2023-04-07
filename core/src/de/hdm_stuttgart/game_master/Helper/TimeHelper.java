package de.hdm_stuttgart.game_master.Helper;

public class TimeHelper {
    private static final double ref = System.currentTimeMillis();
    private static double cur = System.currentTimeMillis();

    public static void waitForCD(int seconds) {
        while (cur - ref < seconds * 1000) {
            cur = System.currentTimeMillis();
        }
    }
}
