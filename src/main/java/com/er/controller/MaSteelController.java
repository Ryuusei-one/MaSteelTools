package com.er.controller;

import com.er.model.MaSteelModel;
import com.er.service.MaSteelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.CrossOrigin;
>>>>>>> 0a7e5dc (修改表示层,提交vue.)
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

<<<<<<< HEAD
=======
@CrossOrigin
>>>>>>> 0a7e5dc (修改表示层,提交vue.)
@RestController
@RequestMapping("masteel")
public class MaSteelController {
    @Autowired
    private MaSteelService maSteelService;
    @RequestMapping("/getMsg")
    public List<MaSteelModel> getMsg(){
        List<MaSteelModel> msg = maSteelService.getMsg();
        msg.forEach(System.out::println);
        return msg;
    }
<<<<<<< HEAD

}
=======
    }
>>>>>>> 0a7e5dc (修改表示层,提交vue.)
