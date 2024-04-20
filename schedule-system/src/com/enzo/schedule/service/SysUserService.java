package com.enzo.schedule.service;

import com.enzo.schedule.pojo.SysUser;
import com.enzo.schedule.util.MD5Util;

/**
 * �ýӿڶ�������sys_user���Ϊ���ĵ�ҵ������
 */
public interface SysUserService {
    /**
     * ע���û��ķ���
     * @param sysUser Ҫע����û���������������SysUser�������ʽ����
     * @return ע��ɹ�����1��ע��ʧ�ܷ���0
     */
    int regist(SysUser sysUser);

    /**
     * �����û�����������û���Ϣ�ķ���
     * @param username Ҫ��ѯ���û���
     * @return ����ҵ�����SysUser�����Ҳ�������null
     */
    SysUser findByUsername(String username);
}
