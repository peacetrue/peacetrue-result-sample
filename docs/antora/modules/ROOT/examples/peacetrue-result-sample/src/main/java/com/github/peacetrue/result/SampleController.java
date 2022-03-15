package com.github.peacetrue.result;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 样章控制器。
 *
 * @author peace
 */
//tag::class[]
@RestController
@RequestMapping("/sample")
public class SampleController {

    /** 成功返回 */
    @GetMapping("/success")
    public Sample success() {
        return new Sample();
    }

    /** 缺少必须的请求参数 */
    @RequestMapping("/missingServletRequestParameter")
    public String missingServletRequestParameter(@RequestParam String input) {
        return input;
    }

    /** 缺少必须的路径参数 */
    @RequestMapping("/missingPathVariable")
    public String missingPathVariable(@PathVariable String input) {
        return input;
    }

    /** 方法参数类型不匹配 */
    @RequestMapping("/methodArgumentTypeMismatch")
    public Integer methodArgumentTypeMismatch(@RequestParam Integer input) {
        return input;
    }

    /** 验证异常（form） */
    @RequestMapping("/bindException")
    public Sample bindException(@Validated Sample bean) {
        return bean;
    }

    /** 验证异常（body） */
    @ResponseBody
    @RequestMapping("/methodArgumentNotValid")
    public Sample methodArgumentNotValid(@Validated @RequestBody Sample bean) {
        return bean;
    }

}
//end::class[]
