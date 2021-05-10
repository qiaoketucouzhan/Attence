package cn.at.dao;

import cn.at.entity.Attence;

import java.util.List;

/**
 * @Package: cn.at.dao
 * @Description:
 * @Author 张伟捷
 * @Create 2021年04月30日 09时44分49秒
 */
public interface AttenceMapper {

    /**
     * @Author: ZhangWeiJie
     * @Date: 2021年04月30日 09时45分28秒
     * @Description:考勤信息表查询
     * @return
     **/
    List<Attence> getAttenceList();


    /**
     * @Author: ZhangWeiJie
     * @Date: 2021年04月30日 10时13分15秒
     * @Description: 添加考勤状态
     * @param flight
     * @return
     **/
    Integer addAttence(Attence attence);
}
