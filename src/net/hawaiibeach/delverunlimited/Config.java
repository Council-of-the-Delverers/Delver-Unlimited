package net.hawaiibeach.delverunlimited;

public class Config {

    public static int maxFPS = 0;
    public static boolean useVsync = false;
    public static boolean borderless = false;
    public static int msaaSamples = 0;
    public static boolean skipSteam = false;
    public static boolean skipIntro = false;
    public static int forceSave = 3;

    public static String OfflineVer = "1.3.0";
    public static boolean isRelease = true; // is this a RTM build or just a test build?

    public static int height = 0;
    public static int width = 0;

    public static int getMaxFPS(int defaultFrames) {

        if (maxFPS != 0) {
            return maxFPS; // returns custom maxFPS
        } else {
            return defaultFrames; // if maxFPS isn't set
        }
    }
}
