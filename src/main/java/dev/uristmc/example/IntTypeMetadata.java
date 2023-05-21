package dev.uristmc.example;

import dev.uristmc.jjdb.TypeMetadata;
import dev.uristmc.jjdb.util.Buffer;
import jakarta.annotation.Nonnull;

public final class IntTypeMetadata implements TypeMetadata<Integer> {

    @Override
    public int size(@Nonnull Integer data) {
        return 4;
    }

    @Override
    public void write(@Nonnull Buffer buffer, @Nonnull Integer data) {
        buffer.writeInt(data);
    }

    @Nonnull
    @Override
    public Integer read(@Nonnull Buffer buffer) {
        return buffer.readInt();
    }

    @Nonnull
    @Override
    public Class<Integer> type() {
        return Integer.TYPE;
    }
}
