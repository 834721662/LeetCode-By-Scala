/**
 * �������� �� ��һ���ַ������һ���ַ�����Ҫ�ı���ַ�����
 * ��������Ķ�������Ҫ�ı�ĸ���  ֻ��Ҫ������ �õ��Ľ��ͳ��1�ĸ���
 * Created by Administrator on 2017/7/7 0007.
 */
public class HammingDistance {
    public static void main(final String[] args) {
        System.out.println(getDistance(4, 14));
    }

    public static int getDistance(int x, int y) {
        int cur = x ^ y;
        int sum = 0;
        //ͳ�� �������� 1�ĸ���
        while (cur > 0) {
            cur = cur & (cur - 1);
            sum++;
        }
        return sum;
    }
}
