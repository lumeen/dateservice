package pl.net.bluesoft.moa.dateservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurnOffController {
    private final Logger logger = LoggerFactory.getLogger(TurnOffController.class);

    @GetMapping(path = "/turnoff")
    public void turnOff() {
        logger.debug("Turning off...");
        System.exit(5000);

    }
}
