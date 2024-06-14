package test7;

import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RmCommand {
    public static void rm(String cmd) {
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

        // 添加用户确认步骤
        System.out.print("你确定要删除文件 " + file.getName() + " 吗？(Y/n): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String response = reader.readLine();
            if (response.equalsIgnoreCase("Y")) {
                if (file.delete()) {
                    System.out.println("文件已删除");
                } else {
                    System.out.println("删除文件失败");
                }
            } else if (response.equalsIgnoreCase("N")) {
                System.out.println("取消删除操作");
            } else {
                System.out.println("输入错误");
            }
        } catch (IOException e) {
            System.out.println("读取用户输入时出错：" + e.getMessage());
        }
    }
}