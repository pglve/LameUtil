package com.pglvee.lib_mp3lame;

public class LameUtil {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("libmp3lame");
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    private native void initEncoder(int numChannels, int sampleRate, int bitRate, int mode, int quality);
    private native void destroyEncoder();
    private native int encodeFile(String sourcePath, String targetPath);
}
