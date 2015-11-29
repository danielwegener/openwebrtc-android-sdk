package android.util;

/**
 * Stub class for funky android api
 */
public class Base64 {

    public static int NO_WRAP = 0;
    public static int NO_PADDING = 0;
    public static int CRLF = 0;


    /** fixme: ignoring flags for now */
    public static byte[] encode(byte[] bytes, int flags)  {
        return java.util.Base64.getEncoder().encode(bytes);
    }

    /** fixme: ignoring flags for now */
    public static byte[] decode(byte[] bytes, int flags)  {
        return java.util.Base64.getDecoder().decode(bytes);
    }

}
