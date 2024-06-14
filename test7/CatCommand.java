package test7;

import java.io.*;

public class CatCommand {
    public static void cat(String cmd) {
        String[] cmdParts = cmd.split(" ");
        if (cmdParts.length != 2) {
            System.out.println("命令格式错误");
            return;
        }
        File file = new File(cmdParts[1]);
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("读取文件时出错：" + e.getMessage());
        }
    }
}