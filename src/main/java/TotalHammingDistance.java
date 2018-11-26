/**
 * LeetCode 477
 * ��������֮�����еĺ�������
 * ����λ������int 32bit ��ʮ���ζ��������ֵ�ÿ��λͳ�� 1 �ĸ���
 * �õ��Ľ�� 1 ���� * 0 ���� = numbers
 * Created by Administrator on 2017/7/7 0007.
 */
public class TotalHammingDistance {
    public static void main(final String[] args) {
        int[] array = {4, 14, 2};
        System.out.println(totalDistance2(array));
    }

    public static int totalDistance2(int[] nums) {
        if (nums == null || nums.length <= 0)
            return 0;
        int length = nums.length;
        int total = 0;
        for (int i = 1; i <= 32; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                count += (nums[j] >> i) & 0x01;
            }
            total += count * (length - count);
        }
        return total;
    }

    public static int totalDistance(int[] nums) {
        if (nums == null || nums.length <= 0)
            return 0;

        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum += getDistance(nums[i], nums[j]);
            }
        }

        return sum;
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
