package org.graviton.xml;

/**
 * Created by Botan on 06/12/2016. 20:32
 */
public class Attribute {
    private final String data;

    public Attribute(String data) {
        this.data = data.trim();
    }

    public byte toByte() {
        return Byte.parseByte(data);
    }

    public short toShort() {
        return Short.parseShort(data);
    }

    public int toInt() {
        return Integer.parseInt(data);
    }

    public long toLong() {
        return Long.parseLong(data);
    }

    public boolean toBoolean() {
        return Boolean.parseBoolean(data);
    }

    public String toString() {
        return data;
    }

}
