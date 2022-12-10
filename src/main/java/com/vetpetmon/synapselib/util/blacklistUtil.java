package com.vetpetmon.synapselib.util;

import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class blacklistUtil {

    /**
     * Creates a block blacklist through a given set of namespaces.
     *
     * @param nameSpaces A raw string array of namespaces
     * @return an ArrayList of blocks found by namespace.
     */
    public static ArrayList<Block> castToBlockBL(String[] nameSpaces) {
        ArrayList<Block> blockBlackList = new ArrayList<>();
        List<String> listTemp = Arrays.asList(nameSpaces);
        ArrayList<String> AL =  new ArrayList<>(listTemp);
        for (String i:AL) {
            blockBlackList.add(Block.getBlockFromName(i));
        }
        return blockBlackList;


    }

    //WIP
    /*public static ArrayList<Item> castToItemBL(String[] nameSpaces) {
        ArrayList<Item> itemBlackList = new ArrayList<>();
        List<String> listTemp = Arrays.asList(nameSpaces);
        ArrayList<Integer> itemIDs =  new ArrayList<Integer>();
        for (String i: listTemp) {
            itemIDs.add(Item.getIdFromItem(i));
        }
        for (int i:itemIDs) {
            itemBlackList.add(Item.getItemById(i));
        }
        return itemBlackList;


    }*/
}
