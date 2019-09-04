package com.bw.coll;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.S;
import com.bw.ser.jiekouser;

@Controller
public class coll {
	@Resource
	private jiekouser ser;
	
	@RequestMapping("list.do")
	public String zhanshi(Model model){
		List<S> list=ser.zhanshi();
		model.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("xiangqing.do")
	@ResponseBody
	public S x(Integer id){
		System.out.println(id);
		S s=ser.x(id);
		return s;
	}
}
