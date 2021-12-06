package com.butads.adventofcode.version2021.day3;

import static com.butads.adventofcode.BufferUtils.getInputAsStringList;
import static com.butads.adventofcode.version2021.day3.Utils.getMostOccurring;

import com.butads.adventofcode.Answerable;
import java.io.IOException;
import java.util.List;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Component
@Log
public class LifeSupportReport implements Answerable {

    private static final String LOCATION = "/2021/day3/input.txt";

    public String getAnswer() throws IOException {
        List<String> allItems = getInputAsStringList(LOCATION);

        long oxy = calculateBits(allItems, '1', '0');
        long co2 = calculateBits(allItems, '0', '1');

        return "" + (oxy * co2);

    }

    private int calculateBits(List<String> allItems, char mostCommon, char leastCommon) {
        List<String> remaining = allItems;

        for (int currentPosition = 0; currentPosition < 12; currentPosition++) {
            int[] amountOfOnes = getMostOccurring(remaining);
            double middle = remaining.size() / 2f;
            boolean mostCommonIsOne = amountOfOnes[currentPosition] >= middle;
            char toKeep = mostCommonIsOne ? mostCommon : leastCommon;
            final int index = currentPosition;
            remaining = remaining.stream().filter(val -> val.charAt(index) == toKeep).toList();

            if (remaining.size() == 1) {
                return Integer.valueOf(remaining.get(0), 2);
            }
        }
        // Nothing found.
        return 0;
    }

    @Override
    public int getDay() {
        return 3;
    }

    @Override
    public int getSection() {
        return 2;
    }
}
