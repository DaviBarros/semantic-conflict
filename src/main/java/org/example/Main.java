package org.example;

import samples.*;

public class Main {
    int x = 0;

    public static void main(String[] args) {
        OverridingAssignmentLocalVariablesSample.conflict();
        x = 1;
    }
}