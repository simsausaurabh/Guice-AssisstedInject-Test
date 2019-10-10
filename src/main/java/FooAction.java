import javax.inject.Inject;

public class FooAction {

    @Inject
    private FooFactory fooFactory;

    void doFoo() {
        FooInterface foo = fooFactory.create("testing");
        System.out.println(foo.getFooName());
    }
}
