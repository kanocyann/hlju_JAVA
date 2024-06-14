package test7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LsCommand {
    public static void ls(String cmd) {
        String[] cmdParts = cmd.split(" ");
        if (cmdParts.length != 2) {
            System.out.println("命令格式错误");
            return;
        }
        File dir = new File(cmdParts[1]);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("目录不存在");
            return;
        }
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                String df = "yyyy-MM-dd HH:mm:ss";
                Date d = new Date(f.lastModified());
                String sdf = new SimpleDateFormat(df).format(d);
                System.out.printf("%s\t", sdf);
                if (f.isFile())
                    System.out.printf("%16d\t", f.length());
                else
                    System.out.printf("%-16s\t", "<DIR>");
                System.out.println(f.getName());
            }
        }
    }
}