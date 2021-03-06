package com.dissi.adventofcode.version2021.day03;

import com.dissi.adventofcode.Answerable;
import com.dissi.adventofcode.BufferUtils;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PowerReport implements Answerable {

    private static final String LOCATION = "/2021/day3/input.txt";

    public String getAnswer() throws IOException {
        List<String> reports = BufferUtils.getInputAsStringList(LOCATION);
        int[] occurrences = new int[12];

        for (String line : reports) {
            for (int i = 0; i < occurrences.length; i++) {
                occurrences[i] += line.charAt(i) == '1' ? 1 : 0;
            }
        }

        int middle = reports.size() / 2;
        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();

        for (int occurrence : occurrences) {
            boolean isGamma = occurrence > middle;
            if (isGamma) {
                gamma.append("1");
                epsilon.append("0");
            } else {
                gamma.append("0");
                epsilon.append("1");
            }
        }
        int total = Integer.parseInt(gamma.toString(), 2) * Integer.parseInt(epsilon.toString(), 2);
        return "" + total;
    }

    @Override
    public int getDay() {
        return 3;
    }

    @Override
    public int getSection() {
        return 1;
    }
}
