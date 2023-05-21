package dev.uristmc.jjdb;

import dev.uristmc.jjdb.util.Buffer;
import jakarta.annotation.Nonnull;

public interface TypeMetadata<T> {

    int size(@Nonnull T data);

    void write(@Nonnull Buffer buffer, @Nonnull T data);

    @Nonnull
    T read(@Nonnull Buffer buffer);

    @Nonnull
    Class<T> type();
}
