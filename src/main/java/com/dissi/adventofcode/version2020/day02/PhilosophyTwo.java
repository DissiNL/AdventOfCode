package com.dissi.adventofcode.version2020.day02;

import static com.dissi.adventofcode.BufferUtils.getInputAsStringList;

import com.dissi.adventofcode.SolutionAnnotation;
import java.io.IOException;
import java.util.List;


public class PhilosophyTwo {

    private static final String LOCATION = "/2020/day2/input.txt";

    @SolutionAnnotation(day = 2, section = 2, year = 2020)
    public String getAnswer() throws IOException {
        List<String> inputAsStringList = getInputAsStringList(LOCATION);
        long amount = inputAsStringList.stream().map(ComplexPassword::new).filter(ComplexPassword::valid).count();
        return "" + amount;
    }

}
