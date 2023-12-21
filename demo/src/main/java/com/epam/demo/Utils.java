package com.epam.demo;

import org.apache.commons.lang3.math.NumberUtils;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       return args.stream().allMatch(x -> NumberUtils.isCreatable(x) && NumberUtils.toDouble(x)>0);
    }
}