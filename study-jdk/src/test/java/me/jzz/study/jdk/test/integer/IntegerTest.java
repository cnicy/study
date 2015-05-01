package me.jzz.study.jdk.test.integer;

import static org.testng.Assert.assertEquals;
import me.jzz.study.jdk.integer.StudyInteger;

import org.testng.annotations.Test;

public class IntegerTest {
	@Test
	public void test(){
		assertEquals(true,256 == Integer.decode("0x100")); // 16 进制
		assertEquals(true,64 == Integer.decode("0100"));   // 8 进制
		assertEquals(true,100 == Integer.decode("100"));   // 10进制
		assertEquals(true,-256 == Integer.decode("-0x100")); // 16 进制（负数）
	}
	@Test
	public void test1(){
		/**
		 * 给定一个int类型数据，返回这个数据的二进制串中“1”的总数量
		 */
		assertEquals(true,2 == Integer.bitCount(10)); // 10 转换成二进制是 1010
		/**
		 * 给定一个int类型数据，返回这个数据的二进制串中从最左边算起连续的“0”的总数量。因
		 * 为int类型的数据长度为32所以高位不足的地方会以“0”填充。
		 */
		assertEquals(true,31 == Integer.numberOfLeadingZeros(1));  // 1 转成成二进制是：1 所以左边全部补0，一共有31个0 
		assertEquals(true,28 == Integer.numberOfLeadingZeros(10)); // 10转成成二进制是：1010  所以左边全部补0，一共有28个0
		/**
		 * 给定一个int类型数据，返回这个数据的二进制串中从最右边算起连续的“0”的总数量。
		 * 因为int类型的数据长度为32所以高位不足的地方会以“0”填充。
		 */
		assertEquals(true,0 == Integer.numberOfTrailingZeros(1));  // 1 转成成二进制是：1 所以右边没0
		assertEquals(true,1 == Integer.numberOfTrailingZeros(10)); // 10 转成成二进制是：1010  所以右边有一个0
		
		assertEquals(true,"1010".equals(Integer.toBinaryString(10))); // 返回int的二进制数
		assertEquals(true,"12".equals(Integer.toOctalString(10)));    // 返回int的八进制数
		assertEquals(true,"a".equals(Integer.toHexString(10)));       // 返回int的十六进制数
		
		//StudyInteger si = new StudyInteger();
		StudyInteger.toString(655636);
	}
	

	
    final static char [] DigitTens = {
        '0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
        '1', '1', '1', '1', '1', '1', '1', '1', '1', '1',
        '2', '2', '2', '2', '2', '2', '2', '2', '2', '2',
        '3', '3', '3', '3', '3', '3', '3', '3', '3', '3',
        '4', '4', '4', '4', '4', '4', '4', '4', '4', '4',
        '5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
        '6', '6', '6', '6', '6', '6', '6', '6', '6', '6',
        '7', '7', '7', '7', '7', '7', '7', '7', '7', '7',
        '8', '8', '8', '8', '8', '8', '8', '8', '8', '8',
        '9', '9', '9', '9', '9', '9', '9', '9', '9', '9',
        } ;

    final static char [] DigitOnes = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        } ;
    final static char[] digits = {
        '0' , '1' , '2' , '3' , '4' , '5' ,
        '6' , '7' , '8' , '9' , 'a' , 'b' ,
        'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
        'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
        'o' , 'p' , 'q' , 'r' , 's' , 't' ,
        'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
	/**
	 * 将int类型 i 转成字符串
	 * @param i
	 * @param index  字符长度
	 * @param buf    
	 */
    static void getChars(int i, int index, char[] buf) {
        int q, r;
        int charPos = index;
        char sign = 0;

        if (i < 0) {
            sign = '-';
            i = -i;
        }
        /**
         * 每次迭代一次可以找出两位字符
         * 这个循环的意思是，当i>65536的时候通过 i - ( i / 100 * 100 )得到每一位的数值
         * DigitOnes 和DigitTwos数组，通过除100得到的余数匹配来个数组中的值就可以得到想要的char类型的数值。
         * 即然后分别通过 i 查DigitTens和DigitOnes两个表，直接获取十位和个位
         */
        while (i >= 65536) {
            q = i / 100;
            r = i - ((q << 6) + (q << 5) + (q << 2)); // 相当于：r = i - (q * 100);
            i = q;
            buf [--charPos] = DigitOnes[r];
            buf [--charPos] = DigitTens[r];
        }

        // Fall thru to fast mode for smaller numbers
        // assert(i <= 65536, i);
        /**
         * 当i < 65536时，通过i - ( i / 10 * 10 )来获得每一位。
         */
        for (;;) {
        	/**
        	 * 下面两行代码实际就是在除以10，只不过是换种效率更高的方法而已
        	 */
            q = (i * 52429) >>> (16+3); // (i * 52429) >>> (16+3) = (i * 52429) / 524288 约等于i * 0.1
            r = i - ((q << 3) + (q << 1));  // 相当于 r = i-(q*10) ...
            buf [--charPos] = digits [r]; // 在字符表中找出每一位对象的值，放入字符数组
            i = q;
            if (i == 0) break;
        }
        if (sign != 0) {
            buf [--charPos] = sign;
        }
    }
}
