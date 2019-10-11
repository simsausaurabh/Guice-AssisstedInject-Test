import com.google.inject.Inject;

public class FooAction {

    @Inject
    private FooFactory fooFactory;

    void doFoo() {
        Foo foo = fooFactory.create("testing");
        System.out.println("chal gaya = " + foo.getFooName());
    }
}
