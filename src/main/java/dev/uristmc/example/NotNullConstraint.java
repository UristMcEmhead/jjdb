package dev.uristmc.example;

import dev.uristmc.jjdb.FieldConstraint;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

public class NotNullConstraint implements FieldConstraint<Object> {

    @Nonnull
    @Override
    public String name() {
        return "not null";
    }

    @Override
    public boolean violates(@Nullable Object data) {
        return data == null;
    }
}
