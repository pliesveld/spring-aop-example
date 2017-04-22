package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SwearWordAspect {
    final static private Logger LOG = LogManager.getLogger();

    public void beforeAdvice(String name){

        LOG.debug("Checking if {} is a swear word.", name);

        if ("swearWord".equalsIgnoreCase(name)) {
            throw new InvalidNameException();
        }
    }
}
