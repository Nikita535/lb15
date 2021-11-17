package com.company;
import java.sql.SQLOutput;
import java.util.*;


public class Main {

    public static void main(String[] args) {


        //Task3
        System.out.println("Task3");

        HashTable hashTable = new HashTable();
        hashTable.HashTableInit(10);
        hashTable.HashTableAdd("1", "Nikita");
        hashTable.HashTableAdd("2", "Sasha");
        hashTable.HashTableAdd("3", "Pasha");
        hashTable.HashTableAdd("4", "Katya");

        System.out.println("Print HashTable:");
        System.out.println(hashTable+"\n");

        hashTable.HahTableDelete("1");
        System.out.println("print HAshTable after Delete element with key=1");
        System.out.println(hashTable+"\n");

        System.out.println(hashTable.HashTableLookUp("3"));


    }
}