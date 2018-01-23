package pl.net.bluesoft.moa.dateservice.controllers;

import pl.net.bluesoft.moa.dateservice.services.DateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/date")
public class DateController {

    private final Logger logger = LoggerFactory.getLogger(DateController.class);
    private DateService dateService;

    @Autowired
    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    @GetMapping(path = "current", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCurrentDate() {
        logger.info("Getting date from DataService... {}",dateService.getData());
        return new ResponseEntity<>(dateService.getData().toString() + " Data Service IP is: " +System.getenv("MY_POD_IP"), HttpStatus.OK);
    }
}
