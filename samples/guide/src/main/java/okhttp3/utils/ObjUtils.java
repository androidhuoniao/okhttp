package okhttp3.utils;

import okhttp3.Handshake;

/**
 * Created by grassswwang
 * on 2021/2/14
 * Email: grassswwang@tencent.com
 */
public class ObjUtils {
    public static String toString(Handshake handshake) {
        StringBuffer sb = new StringBuffer();
        sb.append("tlsVersion: ").append(handshake.tlsVersion()).append("\n");
        sb.append("localCertificates: ").append(handshake.localCertificates()).append("\n");
        sb.append("peerCertificates: ").append(handshake.peerCertificates().toString()).append("\n");
        sb.append("cipherSuite: ").append(handshake.cipherSuite().toString()).append("\n");
        return sb.toString();
    }
    public static String toSimpleString(Handshake handshake) {
        StringBuffer sb = new StringBuffer();
        sb.append("tlsVersion: ").append(handshake.tlsVersion()).append("\n");
        sb.append("localCertificates: ").append(handshake.localCertificates().size()).append("\n");
        sb.append("peerCertificates: ").append(handshake.peerCertificates().size()).append("\n");
        sb.append("cipherSuite: ").append(handshake.cipherSuite().toString()).append("\n");
        return sb.toString();
    }
}
