package test7;

import java.io.File;

public class RdCommand {
    public static void rd(String cmd) {
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
        if (!dir.delete()) {
            System.out.println("删除目录失败");
        }
    }
}