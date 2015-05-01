package me.jzz.study.jdk.shorts;

public class StudyShort {
	private short value;
	public static void main(String[] args) {
		System.out.println(Integer.toHexString(10));
	}
    public static Short valueOf(short s) {
        final int offset = 128;
        int sAsInt = s;
        if (sAsInt >= -128 && sAsInt <= 127) { // must cache
            Short s2 =  ShortCache.cache[sAsInt + offset];
            return s2;
        }
        return new Short(s);
    }
    
    /**
     * 这是short一个内部类，用于缓存Short对象
     * 2015-4-16
     * @author rono
     */
    private static class ShortCache {
        private ShortCache(){}

        static final Short cache[] = new Short[-(-128) + 127 + 1];
        /**
         * 静态代码块，类初始化就会缓存 -128 到 127 之间的对象 
         */
        static {
            for(int i = 0; i < cache.length; i++){
            	cache[i] = new Short((short)(i - 128));
            	System.out.println("s");
            }
        }
    }

	public short getValue() {
		return value;
	}

	public void setValue(short value) {
		this.value = value;
	}
}
