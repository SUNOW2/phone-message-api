package com.software.phonemessageapi.service;

import com.software.phonemessageapi.po.LoginPo;
import com.software.phonemessageapi.po.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName PhoneMessageService
 * @Description
 * @Author 徐旭
 * @Date 2018/7/18 16:02
 * @Version 1.0
 */
@RequestMapping(value = "refactor")
public interface PhoneMessageService {

    /**
     * 绑定phone-message中"/hello"接口的声明
     * @return
     */
    @RequestMapping(value = "/hello20")
    ResponseEntity hello();

    /**
     * 绑定phone-message中"/hello1"接口的声明
     * @param id
     * @return
     */
    @RequestMapping(value = "/hello21", method = RequestMethod.GET)
    ResponseEntity hello(@RequestParam("id") Integer id);

    /**
     * 绑定phone-message中"/hello2"接口的声明
     * @param id
     * @param password
     * @return
     */
    @RequestMapping(value = "/hello22", method = RequestMethod.GET)
    ResponseEntity hello(@RequestHeader("id") Integer id, @RequestHeader("password") String password);

    /**
     * 绑定phone-message中"/insert"接口的声明
     * @param loginPo
     * @return
     */
    @RequestMapping(value = "/insert20", method = RequestMethod.POST)
    ResponseEntity insert(@RequestBody LoginPo loginPo);
}
