package learning.net.socket.TCP03;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class StreamUtils {
    public static byte[] streamToByteArray(InputStream inputStream) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] tmp = new byte[1024];
        int len;
        while ((len = inputStream.read(tmp)) != -1) {
            bos.write(tmp, 0, len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }
}
