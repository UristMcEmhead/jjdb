package dev.uristmc.jjdb;

import dev.uristmc.jjdb.util.Buffer;
import jakarta.annotation.Nonnull;

import java.util.List;

public record RowMetadata<T, R extends Row<T, R>>(
        @Nonnull String name,
        @Nonnull List<FieldMetadata<?>> fields,
        @Nonnull List<? super T> constraints
) {

    @SuppressWarnings("unchecked")
    public <F> FieldMetadata<F> field(int index) {
        return (FieldMetadata<F>) fields.get(index);
    }

    public void write(@Nonnull Buffer buffer, @Nonnull R row) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    @Nonnull
    public R read(@Nonnull Buffer buffer) {
        throw new UnsupportedOperationException("not implemented yet");
    }
}
