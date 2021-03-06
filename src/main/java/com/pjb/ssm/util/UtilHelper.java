package com.pjb.ssm.util;

/**
 * 公共处理类
 * @author pan_junbiao
 */
public class UtilHelper
{
    /**
     * 将数组转换成为字符串
     *
     * @param arr    字符串数组
     * @param symbol 连接符号
     * @return 字符串
     */
    public static String arrToStr(String[] arr, String symbol)
    {
        // 实例化StringBuffer
        StringBuffer sb = new StringBuffer();
        // 判断arr是否为有效数组
        if (arr != null && arr.length > 0)
        {
            // 遍历数组
            for (String s : arr)
            {
                // 将字符串追加到StringBuffer中
                sb.append(s);
                // 将字符串追加到StringBuffer中
                sb.append(symbol);
            }
            // 判断字符串长度是否有效
            if (sb.length() > 0)
            {
                // 截取字符
                sb = sb.deleteCharAt(sb.length() - 1);
            }
        }
        // 返回字符串
        return sb.toString();
    }
}