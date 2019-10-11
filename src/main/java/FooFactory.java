import com.google.inject.assistedinject.Assisted;

public interface FooFactory {
    Foo create(@Assisted String bar);
}
