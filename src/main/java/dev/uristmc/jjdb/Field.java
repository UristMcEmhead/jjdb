package dev.uristmc.jjdb;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public final class Field<T> {

    private final FieldMetadata<T> metadata;
    private T value;

    public Field(@Nonnull FieldMetadata<T> metadata) {
        this.metadata = metadata;
    }

    public T value() {
        return value;
    }

    public void value(@Nullable T value) {
        this.value = value;
    }

    @Nonnull
    public FieldMetadata<T> metadata() {
        return metadata;
    }
}
