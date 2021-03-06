package com.dissi.adventofcode.version2021.day12;

import static com.dissi.adventofcode.BufferUtils.getInputAsStringList;
import static com.dissi.adventofcode.version2021.day12.PathingBuilder.countPaths;

import com.dissi.adventofcode.Answerable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class PathTroubles implements Answerable {

    private static final String LOCATION = "/2021/day12/input.txt";

    @Override
    public String getAnswer() throws IOException {
        List<String> lines = getInputAsStringList(LOCATION);

        Map<String, List<String>> connectionMap = PathingBuilder.getConnectionMap(lines);

        return "" + countPaths(connectionMap, false);
    }

    @Override
    public int getDay() {
        return 12;
    }

    @Override
    public int getSection() {
        return 1;
    }
}
