package com.directi.training.dip.solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        try { 
            BufferedReader reader = new BufferedReader(
                new FileReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt"));
            BufferedWriter writer = new BufferedWriter(
                new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
            EncodingModule encodingModule = new EncodingModule(new MyDatabase());
            encodingModule.encodeWithFiles(reader,writer);
            encodingModule.encodeBasedOnNetworkAndDatabase();
            }
            finally{}

    }}
