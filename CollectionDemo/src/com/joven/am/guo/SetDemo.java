/**
 * 
 */
package com.joven.am.guo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/** 
* @author AMGuo E-mail:www.guoao@foxmail.com 
* @version 创建时间：2017年7月11日 上午9:48:18 
* 类说明 
*/
/**
 * @author LUA
 *
 */
/**
 * @author LUA
 *
 */
public class SetDemo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2784532923711234497L;

	@Test
	public void demo_1() {
		Set<Student> set = new TreeSet<>();
		Student guoaomen = new Student("guoaomen", 2);
		Student ganchao = new Student("janchao", 1);
		Student zhenzhong = new Student("zhenzhong", 4);
		set.add(guoaomen);
		set.add(ganchao);
		set.add(zhenzhong);
		for (Student student : set) {
			System.err.println(student.name + ":" + student.no);
		}
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("T:/user.txt"));
			System.out.println(1);
			os.writeObject(guoaomen);
			System.out.println(2);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("T:/user.txt"));
			System.out.println(3);
			Student zz = (Student) is.readObject();
			is.close();
			guoaomen.setName("d");
			guoaomen.setNo(65);
			System.err.println(zz.name + ":" + zz.no);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
