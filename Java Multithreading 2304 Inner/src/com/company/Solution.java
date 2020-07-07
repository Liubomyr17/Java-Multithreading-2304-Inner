package com.company;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];
    public class InnerClass {}
    public static Solution[] getTwoSolutions() {
        Solution[] res = new Solution[2];
        for(int i=0; i<2; i++) {
            res[i] = new Solution();
            res[i].innerClasses[0] = res[i].new InnerClass();
            res[i].innerClasses[1] = res[i].new InnerClass();
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
