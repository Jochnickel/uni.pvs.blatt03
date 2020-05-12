package de.jj22.uni.pvs.blatt03;

import de.jj22.uni.pvs.blatt02.Pair;

public class Main {
    public static void main(String[] args) {
        GradeOverview go = new GradeOverview();
        go.addTestResult("HM1", new Pair<>(4.0, 10));
        go.addTestResult("HM2", new Pair<>(4.0, 10));
        go.addTestResult("HM3", new Pair<>(4.0, 10));
        go.addTestResult("PVS", new Pair<>(1.0, 8));
        go.addTestResult("EIDI1", new Pair<>(1.1, 6));
        go.addTestResult("EIDI2", new Pair<>(1.1, 6));
        System.out.println(go.totalGradeAverage());
    }
}