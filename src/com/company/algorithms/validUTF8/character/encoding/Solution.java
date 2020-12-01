package com.company.algorithms.validUTF8.character.encoding;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(validateUTFEncoding(new int[]{1,1,1,0,0,0,1,0, 1,0,0,0,0,0,1,0, 1,0,1,0,1,1,0,0}));
    }

    public static boolean validateUTFEncoding(int[] bits) {
        short bitsInByte = 8;

        //Initial check
        if (null == bits && bits.length < bitsInByte && bits.length % 8 != 0) {
            return false;
        }

        if (bits.length == 8) {
            if (bits[0] == 0) return true;
            return false;
        }

        short leadingBits = 0;

        //Iterate each byte and validate them
        for (int i = 0; i < bits.length; i += 8) {
            if (leadingBits == 0) {
                leadingBits = (short) (countLeadingBits(Arrays.copyOfRange(bits, i, i + 8)) - 1);
            } else {
                if (bits[i] == 1 && bits[i + 1] == 0) {
                    leadingBits--;
                } else {
                    return false;
                }
            }
        }
        return leadingBits == 0 ? true : false;
    }

    public static short countLeadingBits(int[] bits) {
        short leadingBits = 0;
        for (int i = 0; i < 4; i++) {
            if (bits[i] == 1) {
                leadingBits++;
            }
        }

        return leadingBits;
    }
}
