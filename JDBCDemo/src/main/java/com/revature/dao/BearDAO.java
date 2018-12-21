package com.revature.dao;

import java.util.List;

import com.revature.beans.Bear;

public interface BearDAO {
	public List<Bear> getBears();
	public Bear getBearById(int id);
	public double feedBear (int bearID, int hiveId, double amt);
}
