package top.maatp.mian.util;

import java.text.SimpleDateFormat;
import java.util.Date;

//调试生成器
public class Logger {

    //日志时间格式
    static SimpleDateFormat formatter = new SimpleDateFormat(ConstantPool.getDate_Format());

    //日志输出
    public static void logger(String info) {

        System.out.println(ConstantPool.getLog_Prefix() + "[" + formatter.format(new Date()) + "] " + info);
    }

    //错误日志
    public static void error(String info) {

        System.err.println(ConstantPool.getLog_Prefix() + "[" + formatter.format(new Date()) + "] " + info);
    }

}
