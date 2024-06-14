package test7;

import java.io.File;

public class MvCommand {
    public static void mv(String cmd) {
        String[] cmdParts = cmd.split(" ");
        if (cmdParts.length != 3) {
            System.out.println("命令格式错误");
            return;
        }
        File source = new File(cmdParts[1]);
        File dest = new File(cmdParts[2]);
        if (!source.exists() || !source.isFile()) {
            System.out.println("源文件不存在");
            return;
        }
        if (!source.renameTo(dest)) {
            System.out.println("移动文件失败");
        }
    }
}