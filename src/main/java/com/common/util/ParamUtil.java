package com.common.util;

public class ParamUtil {
    /**
     *  判断字符串是否能转换整型，如果不可以，赋值为默认值
     */
    public static String stringToInt(String str,int def){
        if(str == null || str.trim().length() == 0){
            str = def + "";
        }else {
            try{
                Integer.parseInt(str);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return str;
    }

    public static Integer strToInt(String str,int def){
        String s = stringToInt(str, def);
        return Integer.parseInt(s);
    }
}
