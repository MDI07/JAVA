package com.company;

import java.io.File;

public class DiskUsage {
    public static void main(String[] args) {
        File cDrive = new File("C:");
        System.out.println(String.format("Total space: %.2f GB",
                (double)cDrive.getTotalSpace() /1073741824));
        System.out.println(String.format("Free space: %.2f GB",
                (double)cDrive.getFreeSpace() /1073741824));
        System.out.println(String.format("Usable space: %.2f GB",
                (double)cDrive.getUsableSpace() /1073741824));
    }
}
