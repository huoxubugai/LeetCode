// 本题为考试多行输入输出规范示例，无需提交，不计分。
package test;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Main {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }
        solution(strs);
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= max) {
                max = entry.getValue();
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                result.add(entry.getKey());
            }
        }
        for (String str :
                result) {
            System.out.println(str);
        }
    }

    private static void solution(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            execute(strs[i]);
        }
    }

    private static void execute(String s) {
        if (s == "")
            return;
        if (s.charAt(0) != '/' || s.charAt(s.length() - 1) == '/') {
            return;
        }
        String[] split = s.split("/");
        int curLen = 0;
        for (String s1 : split) {
            curLen += s1.length();
        }
        if (s.length() - curLen != split.length-1) {
            return;
        }
        if (!split[split.length - 1].contains(".txt")) {
            return;
        }
        String cur = "";
        for (int i = 1; i < split.length - 1; i++) {
            cur += "/";
            cur += split[i];
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
    }
}