package de.jj22.uni.pvs.blatt03;

import java.util.HashMap;
import java.util.Optional;

import de.jj22.uni.pvs.blatt02.Pair;

public class GradeOverview {
    final private HashMap<String, Pair<Double, Integer>> GRADEOVERVIEW = new HashMap<String, Pair<Double, Integer>>();

    public Pair<Double, Integer> addTestResult(final String lectureName, final Pair<Double, Integer> gradeAndECTS) {
        // if (null==lectureName) throw new IllegalArgumentException();
        // if (null==gradeAndECTS) throw new IllegalArgumentException();

        return GRADEOVERVIEW.put(lectureName, gradeAndECTS);
    }

    public int currentECTS() {
        // int ectsSum = 0;
        // for (Pair<?,Integer> grade : GRADEOVERVIEW.values()) {
        // ectsSum += grade.getSecond();
        // }
        // return ectsSum;

        return GRADEOVERVIEW.values().stream().mapToInt(grade -> grade.getSecond()).sum();
    }

    public Optional<Pair<Double, Integer>> getExamResults(final String lectureName) {
        // if (null==lectureName) throw new IllegalArgumentException();

        if (GRADEOVERVIEW.containsKey(lectureName)) {
            return Optional.ofNullable(GRADEOVERVIEW.get(lectureName));
        } else {
            return Optional.empty();
        }
    }

    public double totalGradeAverage() {
        // double weightedGradeSum = 0;
        // for (Pair<Double,Integer> grade : GRADEOVERVIEW.values()) {
        // weightedGradeSum += grade.getFirst()*grade.getSecond();
        // }
        // final double avgGrade = weightedGradeSum/currentECTS();
        // return avgGrade;

        return GRADEOVERVIEW.values().stream().mapToDouble(grade -> grade.getFirst() * grade.getSecond()).sum()
                / currentECTS();
    }
}