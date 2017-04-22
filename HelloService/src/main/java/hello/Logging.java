package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    final static private Logger LOG = LogManager.getLogger();

    /**
     * The method which will execute
     * before a selected method execution.
     */
    public void beforeAdvice() {
        LOG.debug("Before entering method");
    }

    /**
     * The method which will execute
     * after a selected method execution.
     */
    public void afterAdvice(){
        LOG.debug("Method has been returned");
    }

    /**
     * The method which will execute
     * when any method returns.
     */
    public void afterReturningAdvice(Object retVal) {
        LOG.debug("Returning: {}", retVal);
    }

    /**
     * The method which that will execute
     * if there is an exception raised.
     */
    public void AfterThrowingAdvice(InvalidNameException ex){
        LOG.debug("There has been an exception: {}", ex.getMessage());
    }
}
