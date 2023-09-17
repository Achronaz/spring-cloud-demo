package com.achronaz.user.util;

import java.util.HashSet;
import java.util.Random;

public class InvCodeUtils {

    private static final char[] BASE = "4odK1xSHOkhV0Jj8CauRrpzln9fwFg36itGeZLByMcD5TWQUqbEPAmv2NYIXs7".toCharArray(); // shuffled string (a-zA-Z0-9)

    private static final String SALT = "202307";

    public static void main(String[] args) {

        long seed = "202307".hashCode();
        char[] alphanumericSet = "4odK1xSHOkhV0Jj8CauRrpzln9fwFg36itGeZLByMcD5TWQUqbEPAmv2NYIXs7".toCharArray();
        int numOfCode = 10;
        int lenOfCode = 6;

        HashSet<String> result = new  HashSet<String>();
        Random r=new Random(seed);
        int count = 0;
        while(result.size() < numOfCode){
            StringBuilder sb = new StringBuilder();
            for(int l=0; l<lenOfCode; l++)
                sb.append(alphanumericSet[r.nextInt(alphanumericSet.length)]);
            result.add(sb.toString());

            count++;
        }
        //[lQ4YB2, gagC6j, QnwVqO, BxywzM, VViCPn, kvPMNU, 2iAagO, rTOtuU, 7C672o, 6ZSC2M]
        System.out.println(result.toString());
        System.out.println("count="+count);
    }
}