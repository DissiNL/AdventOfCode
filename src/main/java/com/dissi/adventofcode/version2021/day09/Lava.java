package com.dissi.adventofcode.version2021.day09;

import static com.dissi.adventofcode.BufferUtils.getInputAsStringList;
import static com.dissi.adventofcode.version2021.day09.LavaLakeCalculator.getByte;
import static com.dissi.adventofcode.version2021.day09.LavaLakeCalculator.isLowestNeighbour;

import com.dissi.adventofcode.Answerable;
import java.io.IOException;
import java.util.List;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Component
@Log
public class Lava implements Answerable {

    private static final String LOCATION = "/2021/day9/input.txt";


    @Override
    public String getAnswer() throws IOException {
        List<String> lines = getInputAsStringList(LOCATION);
        int out = 0;

        for (int y = 0; y < lines.size(); y++) {
            for (int x = 0; x < lines.get(0).length(); x++) {
                if (isLowestNeighbour(x, y, lines)) {
                    int me = getByte(x, y, lines, -1);
                    out += (me + 1);
                }
            }
        }
        return "" + out;
    }


    @Override
    public int getDay() {
        return 9;
    }

    @Override
    public int getSection() {
        return 1;
    }

}
