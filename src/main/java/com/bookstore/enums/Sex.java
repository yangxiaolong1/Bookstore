package com.bookstore.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Administrator on 2018/9/12.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonIgnoreProperties(value = {"declaring_class"})
public enum Sex
{

	male(1, "男"),
	female(2, "女");

	private int value;
	private String desc;

	Sex(int value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public int getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}

	public static Sex getBindType(int value){
		for (Sex Sex : Sex.values()){
			if (Sex.value == value)
				return Sex;
		}
		return null;
	}
}