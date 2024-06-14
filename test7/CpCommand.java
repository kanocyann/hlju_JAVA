package test7;

import java.io.*;

public class CpCommand {
    public static void cp(String cmd) {
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
        try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            System.out.println("复制文件时出错：" + e.getMessage());
        }
    }
}