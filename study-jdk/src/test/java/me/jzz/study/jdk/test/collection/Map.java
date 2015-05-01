package me.jzz.study.jdk.test.collection;
public interface Map<K,V> {
    //******* map 基础方法 略 *******

	/**
	 * 链表接口声明 
	 */
    interface Entry<K,V> {

        K getKey();

        V getValue();

        V setValue(V value);

        boolean equals(Object o);

        int hashCode();
    }

    boolean equals(Object o);

    int hashCode();
}
