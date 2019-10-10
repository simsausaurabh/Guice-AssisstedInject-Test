import io.dropwizard.client.JerseyClientConfiguration;
import lombok.Getter;

@Getter
public class Configuration extends io.dropwizard.Configuration {
    JerseyClientConfiguration jerseyClient = new JerseyClientConfiguration();
}
