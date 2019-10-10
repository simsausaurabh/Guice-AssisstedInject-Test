import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.setup.Environment;

import java.util.List;

public class Application extends io.dropwizard.Application<Configuration> {

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        // Uncomment below lines then try again if you are getting NullPointerException
        // kyuki docs me ye dia hai - "As a side-effect of this binding, Guice will inject the factory to initialize it for use. The factory cannot be used until the injector has been initialized."
//        final List<Module> appModules = Lists.newArrayList();
//        appModules.add(new Module());
//        final Injector injector  = Guice.createInjector(ImmutableList.copyOf(appModules));
        environment.jersey().register(new Module());
    }

    public static void main(String args[]) throws Exception {
        new Application().run(args);
        FooAction fooAction = new FooAction();
        fooAction.doFoo();
    }
}
