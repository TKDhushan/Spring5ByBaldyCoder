package org.springframework.demo.entity;

import org.springframework.demo.aware.RoleSonAware;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/24 10:38
 * @description：Son角色，实现Aware接口
 * @modified By：`
 * @version: 1.0
 */

public class Person implements RoleSonAware {

	private RoleSon roleSon;

	private RoleDady roleDady;

	private RoleStaff roleStaff;

	public RoleSon getRoleSon() {
		return roleSon;
	}

	@Override
	public void setRoleSon(RoleSon roleSon) {
		this.roleSon = roleSon;
	}

	public RoleDady getRoleDady() {
		return roleDady;
	}

	public RoleStaff getRoleStaff() {
		return roleStaff;
	}

	public void setRoleDady(RoleDady roleDady) {
		this.roleDady = roleDady;
	}

	public void setRoleStaff(RoleStaff roleStaff) {
		this.roleStaff = roleStaff;
	}
}
