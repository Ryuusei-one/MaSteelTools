package com.er.controller;

import cn.hutool.core.io.FileUtil;
import com.er.AjaxResult;
import com.er.core.page.TableDataInfo;
import com.er.model.ImgModel;
import com.er.model.MaSteelModel;
import com.er.service.ImgService;
import com.er.service.MaSteelService;
import com.er.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
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

    @Autowired
    private ImgService imgService;

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

    //    @PostMapping("/edit/{state}")
//    @PreAuthorize("@ss.hasPermi('project:masteel:edit')")
//    @PutMapping("/edit")
//    public AjaxResult edit(@RequestParam List<Long> ids,@PathVariable Integer state)
//    {
//        return toAjax(maSteelService.updateByIds(ids, state));
//    }
    @PreAuthorize("@ss.hasPermi('project:masteel:edit')")
    @PutMapping("/edit")
    public AjaxResult edit(@RequestBody MaSteelModel maSteelModel)
    {
        return toAjax(maSteelService.updateById(maSteelModel));
    }

    @ResponseBody
    @PreAuthorize("@ss.hasPermi('project:masteel:getMsgByState')")
    @GetMapping("/getMsgByState")
    public TableDataInfo getMsgByState(MaSteelModel maSteelModel){
//        pageNum = maSteelModel.getPageNum();
//        pageSize = maSteelModel.getPageSize();
//        PageHelper.startPage(pageNum,pageSize,"");
        startPage();
        List<MaSteelModel> msg = maSteelService.getMsgByState(maSteelModel);
        msg.forEach(System.out::println);
        return getDataTable(msg);
    }


    @PreAuthorize("@ss.hasPermi('project:masteel:export')")
    @GetMapping("/export")
    public void export(HttpServletResponse response, MaSteelModel maSteelModel)
    {
        List<MaSteelModel> list = maSteelService.selectBilletInfoList(maSteelModel);
        ExcelUtil<MaSteelModel> util = new ExcelUtil<MaSteelModel>(MaSteelModel.class);
        util.exportExcel(response, list, "导出数据");
    }

    @PreAuthorize("@ss.hasPermi('project:masteel:download')")
    @RequestMapping(value = "/download",method = RequestMethod.GET )
    @RequiresPermissions("imgModel:download")
    public AjaxResult download(HttpServletResponse response, String state) throws IOException {
        //从数据库中取出要下载的图片路径
        String path = "/home/nginx/html/image/";
//        String path = "F:\\VSCode-WSP\\badCase\\public\\image\\";
//        String path = "http://192.168.110.121:8701/image/";
        List<ImgModel> images = imgService.selectImgUrl(state);
//        System.out.println("传入===>"+state);
        ServletOutputStream outputStream = response.getOutputStream();
        for (ImgModel image : images) {
            System.out.println("images:"+images);
            String filename = image.getBilletPicPath();
            String[] split = filename.split(",");
            for (String s : split) {
//                System.out.println("===开始===");
//                System.out.println("s:"+s);
                String modipath = path + s;
//                System.out.println("path:"+path);
                File file = new File(modipath);
//                System.out.println("modipath:"+modipath);
                if (!file.exists()){
                    continue;
                }else {
                    response.addHeader("Content-Disposition","attachment;fileName=" + URLEncoder.encode(file.getName(),"UTF-8"));
                    response.setContentType("application/octet-stream");
                    outputStream.write(FileUtil.readBytes(file),0,0);
//                System.out.println("=====================");
//                System.out.println("filename:"+file.getName());
//                System.out.println("filePath:"+file.getPath());
//                System.out.println("fileParent:"+file.getParent());
//                System.out.println("fileParentFile:"+file.getParentFile());
//                System.out.println("fileAbsolutePath:"+file.getAbsolutePath());
//                System.out.println("fileAbsoluteFile:"+file.getAbsoluteFile());
//                System.out.println("fileLength:"+file.length());
//                System.out.println("=====================");
                String filepath = "/home/nginx/html/image/bad/"+file.getName();
//                    String filepath = "F:\\VSCode-WSP\\badCase\\public\\image\\bad\\"+file.getName();
                    file.renameTo(new File(filepath));
                }

            }
//            System.out.println("-成功-");
        }
        outputStream.flush();
        outputStream.close();
        imgService.state4state(state);
        return toAjax(imgService.state4state(state));
    }


}
