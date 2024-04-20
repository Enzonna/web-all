package com.enzo.schedule.controller;

import com.enzo.schedule.pojo.SysUser;
import com.enzo.schedule.service.SysUserService;
import com.enzo.schedule.service.impl.SysUserServiceImpl;
import com.enzo.schedule.util.MD5Util;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user/*")
public class SysUserController extends BaseController {
    private SysUserService userService = new SysUserServiceImpl();

    /**
     * �����û���¼������ɵ�¼ҵ��ķ�����ҵ��ӿ�
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 �����û���������
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2 ���÷���㷽���������û�����ѯ�û���Ϣ
        SysUser loginUser = userService.findByUsername(username);
        if (null == loginUser) {
            //��ת���û���������ʾҳ
            resp.sendRedirect("/loginUsernameError.html");
        } else if (!MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())) {
            //3 �ж������Ƿ�ƥ��
            //��ת������������ʾҳ
            resp.sendRedirect("/loginUserPwdError.html");
        }else {
            //4 ��ת����ҳ
            resp.sendRedirect("/showSchedule.html");
        }



    }

    /**
     * �����û�ע�������ҵ���������ӿ� ����Java�е�interface��
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 ���ܿͻ����ύ�Ĳ���
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2 ���÷���㷽�������ע�Ṧ��
        //����������һ��SysUser�����У��ڵ���regist��������
        SysUser sysUser = new SysUser(null, username, userPwd);

        int rows = userService.regist(sysUser);
        //3 ����ע�������ɹ� ʧ�ܣ���ҳ����ת
        if (rows > 0) {
            resp.sendRedirect("/registSuccess.html");
        } else {
            resp.sendRedirect("/registFail.html");
        }
    }
}
