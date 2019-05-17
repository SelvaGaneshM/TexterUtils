package com.selvaganesh.texterutil;

import android.util.Log;

public class TextUtils {

    private static String TAG = TextUtils.class.getSimpleName();

    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    public static int getInt(Object input) {
        try {
            return input == null ? 0 : (int) input;
        } catch (Exception e) {
            return 0;
        }
    }

    public static long getLong(Object input) {
        try {
            return input == null ? 0 : (long) input;
        } catch (Exception e) {
            return 0;
        }
    }

    public static double getDouble(Double value) {
        return value == null ? 0.0 : (double) value;
    }

    public static String getString(Object input) {
        return input == null ? "" : input.toString().trim().equals("") ? "" :
                input.toString().trim().equalsIgnoreCase("null") ? "" : input.toString().trim();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(.\\d+)?");
    }

    public static String getFirstChar(String sss) {
        String returnString = "";
        if (!TextUtils.isEmpty(sss)) {
            try {
                /*Pattern p = Pattern.compile("\\b[a-zA-Z]");
                Matcher m = p.matcher(sss);

                while (m.find()) {
                    returnString += m.group();
                }*/

                for (String s : sss.split(" ")) {
                    returnString += s.charAt(0);
                }


                if (returnString.equals("+")) {
                    returnString = sss.substring(1, 2);
                }

                if (returnString.length() > 2) {
                    returnString = returnString.substring(0, 2);
                }

                if (TextUtils.isEmpty(returnString)) {
                    returnString = "Z";
                }

            } catch (Exception e) {
                Log.e(TAG,e.toString());
            }
        }
        return getString(returnString).toUpperCase();

    }

}
