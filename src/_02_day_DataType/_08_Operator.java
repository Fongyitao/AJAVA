package _02_day_DataType;

public class _08_Operator {
    public static void main(String[] args) {
        /*
         * 注意事项：
         * a:+号在java中有三种作用,代表正号,做加法运算,字符串的连接符
         * b:整数相除只能得到整数。如果想得到小数，必须把数据变化为浮点数类型
         * c:/获取的是除法操作的商，%获取的是除法操作的余数
         * %运算符
         * 当左边的绝对值小于右边绝对值时,结果是左边
         * 当左边的绝对值等于右边或是右边的倍数时,结果是0
         * 当左边的绝对值大于右边绝对值时,结果是余数
         * %运算符结果的符号只和左边有关系,与右边无关
         * 任何一个正整数%2结果不是0就是1可以用来当作切换条件
         *
         */

        System.out.println(10 / 3);// 结果是:3;整数相除只能得到整数

        System.out.println(10 / 3.0);//结果：3.3333333333333335
        //如果想得到小数，把其中一个数变成小数，另一个数在运算时会自动类型提升

        System.out.println(10 % 3);//取模，1；即取余数


    }
}
