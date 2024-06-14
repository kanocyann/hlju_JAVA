package test7;

import java.io.File;

public class MdCommand {
    public static void md(String cmd) {
        String[] cmdParts = cmd.split(" ");
        if (cmdParts.length != 2) {
            System.out.println("命令格式错误");
            return;
        }
        File dir = new File(cmdParts[1]);
        if (!dir.mkdir()) {
            System.out.println("创建目录失败");
        }
    }
}