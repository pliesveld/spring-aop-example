package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class GreetingController {
    final static private Logger LOG = LogManager.getLogger();

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        LOG.debug("Creating greeting message for '{}'", name);
        return greetingService.createMessage(name);
    }

    @ExceptionHandler(InvalidNameException.class)
    @ResponseStatus(value= HttpStatus.BAD_REQUEST,
            reason="Invalid Name")
    public void handleInvalidName() {}
}
