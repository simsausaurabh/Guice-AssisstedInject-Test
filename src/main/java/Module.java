import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class Module extends AbstractModule {
    @Override
    public void configure() {
        install(new FactoryModuleBuilder()
              .implement(FooInterface.class, Foo.class)
              .build(FooFactory.class));
    }
}
