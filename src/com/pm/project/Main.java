package com.pm.project;

import com.pm.project.fileHandler.InputFileReader;

/**
 * Created by Parham on 17-Apr-18.
 */
public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        System.out.println("address_0.txt(victimCacheExists): ");
        InputFileReader inputFileReader0 = new InputFileReader("inputs/address_0.txt", true);
        System.out.println("address_1.txt(victimCacheExists): ");
        InputFileReader inputFileReader1 = new InputFileReader("inputs/address_1.txt", true);
        System.out.println("address_2.txt(victimCacheExists): ");
        InputFileReader inputFileReader2 = new InputFileReader("inputs/address_2.txt", true);
        System.out.println("address_3.txt(victimCacheExists): ");
        InputFileReader inputFileReader3 = new InputFileReader("inputs/address_3.txt", true);
        System.out.println("address_4.txt(victimCacheExists): ");
        InputFileReader inputFileReader4 = new InputFileReader("inputs/address_4.txt", true);
        System.out.println("address_0.txt(victimCacheDoesNotExist): ");
        InputFileReader inputFileReader5 = new InputFileReader("inputs/address_0.txt", false);
        System.out.println("address_1.txt(victimCacheDoesNotExist): ");
        InputFileReader inputFileReader6 = new InputFileReader("inputs/address_1.txt", false);
        System.out.println("address_2.txt(victimCacheDoesNotExist): ");
        InputFileReader inputFileReader7 = new InputFileReader("inputs/address_2.txt", false);
        System.out.println("address_3.txt(victimCacheDoesNotExist): ");
        InputFileReader inputFileReader8 = new InputFileReader("inputs/address_3.txt", false);
        System.out.println("address_4.txt(victimCacheDoesNotExist): ");
        InputFileReader inputFileReader9 = new InputFileReader("inputs/address_4.txt", false);
    }
}
