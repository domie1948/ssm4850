package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WangzhituijianEntity;
import com.entity.view.WangzhituijianView;

import com.service.WangzhituijianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 网址推荐
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-18 21:57:52
 */
@RestController
@RequestMapping("/wangzhituijian")
public class WangzhituijianController {
    @Autowired
    private WangzhituijianService wangzhituijianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WangzhituijianEntity wangzhituijian, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wangzhituijian.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WangzhituijianEntity> ew = new EntityWrapper<WangzhituijianEntity>();
		PageUtils page = wangzhituijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wangzhituijian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WangzhituijianEntity wangzhituijian, HttpServletRequest request){
        EntityWrapper<WangzhituijianEntity> ew = new EntityWrapper<WangzhituijianEntity>();
		PageUtils page = wangzhituijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wangzhituijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WangzhituijianEntity wangzhituijian){
       	EntityWrapper<WangzhituijianEntity> ew = new EntityWrapper<WangzhituijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wangzhituijian, "wangzhituijian")); 
        return R.ok().put("data", wangzhituijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WangzhituijianEntity wangzhituijian){
        EntityWrapper< WangzhituijianEntity> ew = new EntityWrapper< WangzhituijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wangzhituijian, "wangzhituijian")); 
		WangzhituijianView wangzhituijianView =  wangzhituijianService.selectView(ew);
		return R.ok("查询网址推荐成功").put("data", wangzhituijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WangzhituijianEntity wangzhituijian = wangzhituijianService.selectById(id);
        return R.ok().put("data", wangzhituijian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WangzhituijianEntity wangzhituijian = wangzhituijianService.selectById(id);
        return R.ok().put("data", wangzhituijian);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        WangzhituijianEntity wangzhituijian = wangzhituijianService.selectById(id);
        if(type.equals("1")) {
        	wangzhituijian.setThumbsupnum(wangzhituijian.getThumbsupnum()+1);
        } else {
        	wangzhituijian.setCrazilynum(wangzhituijian.getCrazilynum()+1);
        }
        wangzhituijianService.updateById(wangzhituijian);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WangzhituijianEntity wangzhituijian, HttpServletRequest request){
    	wangzhituijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wangzhituijian);

        wangzhituijianService.insert(wangzhituijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WangzhituijianEntity wangzhituijian, HttpServletRequest request){
    	wangzhituijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wangzhituijian);

        wangzhituijianService.insert(wangzhituijian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WangzhituijianEntity wangzhituijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wangzhituijian);
        wangzhituijianService.updateById(wangzhituijian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wangzhituijianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WangzhituijianEntity> wrapper = new EntityWrapper<WangzhituijianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wangzhituijianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
