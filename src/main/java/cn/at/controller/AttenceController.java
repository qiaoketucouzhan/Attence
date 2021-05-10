package cn.at.controller;

import cn.at.entity.Attence;
import cn.at.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Package: cn.at.controller
 * @Description:
 * @Author 张伟捷
 * @Create 2021年04月30日 09时50分28秒
 */
@Controller
public class AttenceController {

    @Autowired
    AttenceService attenceService;


    /**
     * @Author: ZhangWeiJie
     * @Date: 2021年04月30日 10时15分19秒
     * @Description: 考勤记录信息表
     * @param model
     * @return
     **/
    @RequestMapping("/list")
    public String list(Model model){

       List<Attence> attenceList = attenceService.getAttenceList();

        model.addAttribute("attenceList",attenceList);

        return "list";
    }



    /**
     * @Author: ZhangWeiJie
     * @Date: 2021年04月30日 10时15分07秒
     * @Description:进入添加页面
     * @return
     **/
    @RequestMapping("getadd")
    public String toadd(){
        return "add";
    }

    /**
     * @Author: ZhangWeiJie
     * @Date: 2021年04月30日 10时15分37秒
     * @Description: 添加考勤信息
     * @param attence
     * @param model
     * @return
     **/
    @RequestMapping("add")
    public String add(Attence attence,Model model){
        attenceService.addAttence(attence);
        model.addAttribute("attence",attence);
        return "redirect:/list";
    }
}
