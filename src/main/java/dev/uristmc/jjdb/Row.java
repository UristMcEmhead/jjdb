package dev.uristmc.jjdb;

import jakarta.annotation.Nonnull;

import java.util.List;

public interface Row<T, SELF extends Row<T, SELF>> {

    @Nonnull
    RowMetadata<T, SELF> metadata();

    @Nonnull
    List<Field<?>> fields();

    <F> F field(int index);

    @Nonnull
    T read();

    void write(@Nonnull T data);
}
