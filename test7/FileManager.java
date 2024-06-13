package test7;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileManager {
    public static void main(String[] args) throws IOException {
        BufferedReader kbin = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("# ");
            String cmd = kbin.readLine();
            if (cmd.toLowerCase().equals("exit")) {
                System.exit(0);
            } else if (cmd.toLowerCase().startsWith("ls")) {
                ls(cmd);
            } else if (cmd.toLowerCase().startsWith("cp")) {
                cp(cmd);
            } else if (cmd.toLowerCase().startsWith("mv")) {
                mv(cmd);
            } else if (cmd.toLowerCase().startsWith("rm")) {
                rm(cmd);
            } else if (cmd.toLowerCase().startsWith("md")) {
                md(cmd);
            } else if (cmd.toLowerCase().startsWith("rd")) {
                rd(cmd);
            } else if (cmd.toLowerCase().startsWith("cat")) {
                cat(cmd);
            } else {
                System.out.println("无法识别所输入命令:" + cmd);
            }
        }
    }

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
        if (!file.delete()) {
            System.out.println("删除文件失败");
        }
    }

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