package cn.at.service.impl;

import cn.at.dao.AttenceMapper;
import cn.at.entity.Attence;
import cn.at.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: cn.at.service.impl
 * @Description:
 * @Author 张伟捷
 * @Create 2021年04月30日 09时49分47秒
 */
@Service
public class AttenceServiceImpl implements AttenceService {

    @Autowired
    AttenceMapper attenceMapper;

    @Override
    public List<Attence> getAttenceList() {
        return attenceMapper.getAttenceList();
    }

    @Override
    public Integer addAttence(Attence attence) {
        return attenceMapper.addAttence(attence);
    }
}
