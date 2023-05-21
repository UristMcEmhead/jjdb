package dev.uristmc.jjdb.util;

public interface Buffer {

    int size();

    int position();

    Buffer position(int position);

    void write(byte[] data);

    void read(byte[] data);

    default void writeInt(int data) {
        write(new byte[]{
                (byte) (data & 0xff << 24),
                (byte) (data & 0xff << 16),
                (byte) (data & 0xff << 8),
                (byte) (data & 0xff),
        });
    }

    default int readInt() {
        byte[] data = new byte[4];
        read(data);

        return data[0] << 24 | data[1] << 16 | data[2] << 8 | data[3];
    }
}
