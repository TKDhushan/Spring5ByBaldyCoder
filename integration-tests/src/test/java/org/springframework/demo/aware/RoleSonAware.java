package org.springframework.demo.aware;

import org.springframework.demo.entity.RoleSon;

/**
 * @author ：a123145
 * @date ：Created in 2022/5/24 10:36
 * @description：Aware的ignore自动注入测试
 * @modified By：`
 * @version: 1.0
 */

public interface RoleSonAware {

	void setRoleSon(RoleSon roleSon);
}
