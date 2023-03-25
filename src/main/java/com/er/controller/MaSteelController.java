package com.er.controller;

import com.er.core.page.TableDataInfo;
import com.er.model.MaSteelModel;
import com.er.service.MaSteelService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ryuusei
 */
@CrossOrigin
@RestController
@Controller
@RequestMapping("masteel")
public class MaSteelController extends BaseController{
    @Autowired
    private MaSteelService maSteelService;
    @ResponseBody
    @PreAuthorize("@ss.hasPermi('project:masteel:getMsg')")
    @GetMapping("/getMsg")
    public TableDataInfo getMsg(MaSteelModel maSteelModel){
//        pageNum = maSteelModel.getPageNum();
//        pageSize = maSteelModel.getPageSize();
//        PageHelper.startPage(pageNum,pageSize,"");
        startPage();
        List<MaSteelModel> msg = maSteelService.getMsg(maSteelModel);
        msg.forEach(System.out::println);
        return getDataTable(msg);
    }

}
