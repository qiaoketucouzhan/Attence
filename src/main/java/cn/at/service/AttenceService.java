package cn.at.service;

import cn.at.entity.Attence;

import java.util.List;

/**
 * @Package: cn.at.service
 * @Description:
 * @Author 张伟捷
 * @Create 2021年04月30日 09时49分28秒
 */
public interface AttenceService {

    List<Attence> getAttenceList();

    Integer addAttence(Attence attence);
}
