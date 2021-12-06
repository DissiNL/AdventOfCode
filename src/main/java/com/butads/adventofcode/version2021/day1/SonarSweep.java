package com.butads.adventofcode.version2021.day1;

import static com.butads.adventofcode.BufferUtils.getInputAsStringList;

import com.butads.adventofcode.Answerable;
import java.io.IOException;
import java.util.List;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Component
@Log
public class SonarSweep implements Answerable {

    private static final String LOCATION = "/2021/day1/input.txt";

    public String getAnswer() throws IOException {
        int amount = 0;

        List<String> lines = getInputAsStringList(LOCATION);
        Integer previous = null;

        for (String line : lines) {
            int now = Integer.parseInt(line);
            if (previous != null && now > previous) {
                amount++;
            }

            previous = now;
        }
        return "" + amount;
    }

    @Override
    public int getDay() {
        return 1;
    }

    @Override
    public int getSection() {
        return 1;
    }
}
