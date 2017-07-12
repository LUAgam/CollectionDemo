package com.joven.am.guo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * @author AMGuo E-mail:www.guoao@foxmail.com
 * @version 创建时间：2017年7月12日 上午9:40:09 类说明
 */
public class Student implements Comparable<Student>, Externalizable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4464929657471473968L;
	transient String name;
	static int no;

	public Student() {
	}

	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public int compareTo(Student o) {
		return 0;
	}

	private void writeObject(ObjectOutputStream out) {
		try {
			out.writeObject(String.valueOf(name));
			out.writeInt(no);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream in) {
		try {
			name = in.readObject().toString() + "s";
			no = in.readInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		try {
			out.writeObject(String.valueOf(name));
			out.writeInt(no);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			name = in.readObject().toString() + "z";
			no = in.readInt();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	

}
