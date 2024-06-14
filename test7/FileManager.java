package test7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileManager {
    public static void main(String[] args) throws IOException {
        BufferedReader kbin = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("# ");
            String cmd = kbin.readLine();
            if (cmd.toLowerCase().equals("exit")) {
                System.exit(0);
            } else if (cmd.toLowerCase().startsWith("ls")) {
                LsCommand.ls(cmd);
            } else if (cmd.toLowerCase().startsWith("cp")) {
                CpCommand.cp(cmd);
            } else if (cmd.toLowerCase().startsWith("mv")) {
                MvCommand.mv(cmd);
            } else if (cmd.toLowerCase().startsWith("rm")) {
                RmCommand.rm(cmd);
            } else if (cmd.toLowerCase().startsWith("md")) {
                MdCommand.md(cmd);
            } else if (cmd.toLowerCase().startsWith("rd")) {
                RdCommand.rd(cmd);
            } else if (cmd.toLowerCase().startsWith("cat")) {
                CatCommand.cat(cmd);
            } else {
                System.out.println("无法识别所输入命令:" + cmd);
            }
        }
    }
}