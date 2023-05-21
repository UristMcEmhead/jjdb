package dev.uristmc.jjdb;

import jakarta.annotation.Nonnull;

import java.util.List;

public record FieldMetadata<T>(
        @Nonnull String name,
        @Nonnull TypeMetadata<T> metadata,
        @Nonnull List<FieldConstraint<? super T>> constraints
) {}
