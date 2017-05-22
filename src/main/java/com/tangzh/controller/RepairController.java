package com.tangzh.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.tangzh.domain.Bill;
import com.tangzh.domain.BillExample;
import com.tangzh.domain.BillExample.Criteria;
import com.tangzh.domain.Repair;
import com.tangzh.service.ITbBillService;
import com.tangzh.service.ITbRepairService;

@Controller
@RequestMapping("/repair")
public class RepairController {
	@Resource(name="billService")
	ITbBillService billService;
	
	@Resource(name="repairService")
	ITbRepairService repairService;
	
	@RequestMapping("/billList.do")
	public String billList(Model model) {
		try {
			BillExample example=new BillExample();
			example.setOrderByClause("time desc");
			PageHelper.startPage(1,5);
			List<Bill> list =billService.selectByExample(example);
			model.addAttribute("billList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "fail";
		}
		return "admin/billList";
	}
	
	@RequestMapping("/deleteBill.do")
	public String deleteBill(int bid) {
		try {
			billService.deleteByPrimaryKey(bid);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "fail";
		}
		return "admin/success";
	}
	
	@RequestMapping("/repair.do")
	public String changeBill(int bid,int worker) {
		Repair repair=new Repair();
		
		repair.setBid(bid);
		repair.setWid(worker);
		try {
			Bill bill=billService.selectByPrimaryKey(bid);
			bill.setStatus("正在受理");
			billService.updateByPrimaryKeySelective(bill);
			Date date =new Date();
			Timestamp ts=new Timestamp(date.getTime());
			repair.setRtime(ts);
			repairService.insertSelective(repair);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "admin/changeBill";
		}
		return "admin/success";
	}
	
	@RequestMapping("/selectStatus.do")
	public String selectStatus(Model model,String status) {
		try {
			BillExample example=new BillExample();
			example.setOrderByClause("time desc");
			Criteria criteria=example.createCriteria();
			criteria.andStatusEqualTo(status);
			PageHelper.startPage(1,5);
			List<Bill> list =billService.selectByExample(example);
			model.addAttribute("billList", list);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return "fail";
		}
		return "admin/billList";
	}
	
	@RequestMapping("/repairDone.do")
	public String repairDone(int bid) {
		try {
			Bill bill=billService.selectByPrimaryKey(bid);
			bill.setStatus("已受理");
			billService.updateByPrimaryKeySelective(bill);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return "admin/success";
	}
}
