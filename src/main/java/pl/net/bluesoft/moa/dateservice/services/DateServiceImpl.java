package pl.net.bluesoft.moa.dateservice.services;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateServiceImpl implements DateService {
    @Override
    public String getData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.format(formatter);
    }
}
