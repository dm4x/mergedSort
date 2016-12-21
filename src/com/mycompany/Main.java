package com.mycompany;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr1 = {1,3,7,56,88,232};
        //int[] arr1 = {1};
        //int[] arr1 = {};
	    int[] arr2 = {6,9,34,73,83,86,392,739,982,8427};
        //int[] arr2 = {6};
        //int[] arr2 = {};
	    int[] resarr = new int[arr1.length+arr2.length];
	    int i = 0;
        int j = 0;
        int k = 0;

	    while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]){
                resarr[k] = arr1[i];
                ++i;
            }
            else if (arr1[i] > arr2[j]){
                resarr[k] = arr2[j];
                ++j;
            }
            else if (arr1[i] == arr2[i]){
                resarr[k] = arr1[i];
                resarr[k + 1] = arr2[i];
                ++i;
                ++j;
            }
            ++k;
        }

        if (i == arr1.length || arr1.length == 0){
            for (int z = j; z < arr2.length; ++z) {
                resarr[k] = arr2[z];
                ++k;

            }
        }

        else if (j == arr2.length || arr2.length == 0) {
            for (int z = i; z < arr1.length; ++z) {
                resarr[k] = arr1[z];
                ++k;

            }
        }

        System.out.print(Arrays.toString(resarr));
    }
}
