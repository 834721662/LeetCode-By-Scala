/**
 * Ѱ���ַ��������е������ǰ׺
 * Created by Administrator on 2017/7/7 0007.
 */
public class CommonPrefix {
    public static void main(final String[] args) {
        String[] strs = {"asdeee", "asdeweq", "asdeeqwe", "asdasd"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int i = 1;
        String pre = strs[0];
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0) {
                //indexOf�����ã� �ж�String����ʱ�����Ŀ���ַ���;
                pre = pre.substring(0, pre.length() - 1);
                //sunstring ��ȡĿ���ַ����� �����Ƕ�Ӧλ��.
                System.out.println(pre + " " + i);
            }
            i++;
        }
        return pre;
    }
}
