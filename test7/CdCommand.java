package test7;

import java.io.File;

public class CdCommand {
    public static String cd(String cmd, String currentDirectory) {
        String[] cmdParts = cmd.split(" ");
        if (cmdParts.length != 2) {
            System.out.println("命令格式错误");
            return currentDirectory;
        }
        File newDir = new File(currentDirectory, cmdParts[1]);
        if (!newDir.exists() || !newDir.isDirectory()) {
            System.out.println("目录不存在");
            return currentDirectory;
        }
        return newDir.getAbsolutePath();
    }
}