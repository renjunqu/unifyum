/**
 * 
 */
package com.bupt.qrj.unifyum.api.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author renjun.qrj  2016年1月2日:下午9:47:27
 * com.bupt.qrj.unifyum.api.controller.UserTestDataController
 * unifyum-api
 * 用途: 
 *
 */
public interface UserTestDataController {

    void updateTestData(HttpServletRequest request, HttpServletResponse response);

    void getTestData(HttpServletRequest request, HttpServletResponse response);
}
