package net.milkbowl.vault.util;

import java.util.Comparator;

public class VersionComparator implements Comparator<String> {

    public static boolean isOlderThan(String o1, String o2) {
        return new VersionComparator().compare(o1, o2) == -1;
    }

    @Override
    public int compare(String o1, String o2) {
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return 1;
        }
        String[] thisParts = o1.split("\\.");
        String[] thatParts = o2.split("\\.");
        int length = Math.max(thisParts.length, thatParts.length);
        for (int i = 0; i < length; i++) {
            int thisPart = i < thisParts.length ? Integer.parseInt(thisParts[i]) : 0;
            int thatPart = i < thatParts.length ? Integer.parseInt(thatParts[i]) : 0;
            if (thisPart < thatPart) {
                return -1;
            }
            if (thisPart > thatPart) {
                return 1;
            }
        }
        return 0;
    }
}
