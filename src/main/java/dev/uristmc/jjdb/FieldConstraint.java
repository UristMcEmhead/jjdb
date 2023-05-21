package dev.uristmc.jjdb;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public interface FieldConstraint<T> {

    @Nonnull
    String name();

    boolean violates(@Nullable T data);
}
