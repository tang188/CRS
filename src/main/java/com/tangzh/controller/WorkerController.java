package com.tangzh.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangzh.domain.RepairExample;
import com.tangzh.domain.Worker;
import com.tangzh.domain.WorkerExample.Criteria;
import com.tangzh.domain.WorkerExample;
import com.tangzh.service.ITbRepairService;
import com.tangzh.service.ITbWorkerService;

@Controller
@RequestMapping("/worker")
public class WorkerController {

	@Resource(name="workerService")
	ITbWorkerService workerService;
	
	@RequestMapping("/addWorker.do")
	public String addWorker(Model model,int wid,String name,String addr,String tel) {
		Worker worker=new Worker();
		worker.setWid(wid);
		worker.setAddr(addr);
		worker.setName(name);
		worker.setTel(tel);
		boolean flag=false;
		try {
			workerService.insertSelective(worker);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/addWorker";
		}
		flag=true;
		model.addAttribute("flag", flag);
		return "admin/addWorker";
	}
	
	@RequestMapping("/searchByName.do")
	public String serchByName(String condition,Model model) {
		try {
			WorkerExample example=new WorkerExample();
			Criteria criteria=example.createCriteria();
			criteria.andNameLike("%"+condition+"%");
			List<Worker> list=workerService.selectByExample(example);
			model.addAttribute("workerList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/searchWorker";
		}
		return "admin/workerResult";
	}
	
	@RequestMapping("/searchBySex.do")
	public String searchBySex(int condition,Model model) {
		try {
			WorkerExample example=new WorkerExample();
			Criteria criteria=example.createCriteria();
			String s;
			if (condition==1) {
				 s="男";
			}else {
				s="女";
			}
			criteria.andSexEqualTo(s);
			List<Worker> list=workerService.selectByExample(example);
			model.addAttribute("workerList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/searchWorker";
		}
		return "admin/workerResult";
	}
	
	@RequestMapping("/deleteWorker.do")
	public String deleteWorker(int wid) {
		try {
			workerService.deleteByPrimaryKey(wid);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "fail";
		}
		return "admin/success";
	}
	
	@RequestMapping("/changeWorker.do")
	public String changeWorker(String name,int wid,String tel,String addr,String sex) {
		Worker worker=new Worker();
		worker.setAddr(addr);
		worker.setName(name);
		worker.setSex(sex);
		worker.setWid(wid);
		try {
			workerService.updateByPrimaryKeySelective(worker);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "fail";
		}
		return "admin/success";
	}
	
	@Resource(name="repairService")
	ITbRepairService repairService;
	
	@RequestMapping("/count.do")
	public String count(Model model) {
		WorkerExample workerExample=new WorkerExample();
		List<Worker> workers=workerService.selectByExample(workerExample);
		for (Worker worker : workers) {
			RepairExample example=new RepairExample();
			com.tangzh.domain.RepairExample.Criteria criteria=example.createCriteria();
			criteria.andWidEqualTo(worker.getWid());
			int count = repairService.countByExample(example);
			worker.setCount(count);
			workerService.updateByPrimaryKeySelective(worker);
		}
		List<Worker> workerCount=workerService.selectByExample(new WorkerExample());
		model.addAttribute("countList", workerCount);
		return "admin/count";
	}
}
