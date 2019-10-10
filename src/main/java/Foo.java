import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class Foo implements FooInterface {
    String bar;

    @Inject
    public Foo(@Assisted String bar) {
        this.bar = bar;
    }

    public String getFooName() {
        return this.bar;
    }
}
