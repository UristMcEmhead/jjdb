package dev.uristmc.example;

import dev.uristmc.jjdb.*;
import jakarta.annotation.Nonnull;

import java.util.List;

public class ExampleRow implements Row<Example, ExampleRow> {

    private static final RowMetadata<Example, ExampleRow> METADATA;

    static {
        METADATA = new RowMetadata<>(
                "Example",
                List.of(
                        new FieldMetadata<>(
                                "field",
                                new IntTypeMetadata(),
                                List.of(new NotNullConstraint())
                        )
                ),
                List.of()
        );
    }

    private final List<Field<?>> fields = List.of(
            new Field<>(METADATA.field(0))
    );

    @Nonnull
    @Override
    public RowMetadata<Example, ExampleRow> metadata() {
        return METADATA;
    }

    @Nonnull
    @Override
    public List<Field<?>> fields() {
        return fields;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <F> F field(int index) {
        return ((Field<F>) fields.get(index)).value();
    }

    @Nonnull
    @Override
    public Example read() {
        return new Example(field(0));
    }

    @Override
    public void write(@Nonnull Example data) {
        setStuff(data.stuff);
    }

    public int getStuff() {
        return field(0);
    }

    @SuppressWarnings("unchecked")
    public void setStuff(int value) {
        ((Field<Integer>) fields.get(0)).value(value);
    }
}
