package com.butads.adventofcode.version2021.day6;

import static com.butads.adventofcode.BufferUtils.getInputAsString;

import com.butads.adventofcode.Answerable;
import java.io.IOException;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Log
@Component
public class FishDayByte implements Answerable {

    private static final String LOCATION = "/2021/day6/input.txt";

    @Override
    public String getAnswer() throws IOException {
        return "" + Fish.getAmountOfFish(256, getInputAsString(LOCATION));
    }

    @Override
    public int getDay() {
        return 6;
    }

    @Override
    public int getSection() {
        return 2;
    }
}
