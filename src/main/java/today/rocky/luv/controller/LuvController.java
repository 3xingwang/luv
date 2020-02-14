package today.rocky.luv.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import today.rocky.luv.bean.Detail;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rocky
 * @date 2020/2/12 14:53
 */
@Slf4j
@Controller
public class LuvController {

	/**
	 *用于首页跳转到 表单页面
	 */
    @GetMapping
    public String luv(){
        log.info("进入首页");
        return "msg";
    }

	/**
	 *将index页面表单数据填充为Detail对象 使用了lomkbok
     * @param detail 表单信息  不可缺失否则出错
	 */
    @RequestMapping("/index")
    public ModelAndView show(Detail detail){
        log.info("进入跳转页 信息:"+detail.toString());
        ModelAndView mav = new ModelAndView();
        mav.addObject("info",detail);
        mav.setViewName("luv");
        System.out.println("进入跳转页");
       return mav;
    }
}
