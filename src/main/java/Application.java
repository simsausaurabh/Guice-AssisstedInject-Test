import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {

    public static void main(String args[]) throws Exception {
        Injector injector  = Guice.createInjector(new Module());

        FooAction fooAction = injector.getInstance(FooAction.class);
        fooAction.doFoo();
    }
}
