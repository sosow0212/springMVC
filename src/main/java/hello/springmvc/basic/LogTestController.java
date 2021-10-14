package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller 는 return 에서 view가 반환된다
@RestController // RestController는 return이 진짜 String이 반환된다.
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";

        System.out.println("name = " + name);

        log.trace("trace log ={}", name); // > 콘솔에 안 뜬다.
        log.debug("debug log ={}", name); // debug를 본다 > 콘솔에 안 뜬다.
        log.info(" info log={}", name); // 콘솔에 시간, 컨트롤러, 내용을 출력한다.
        log.warn(" warn log ={}", name); // 경고
        log.error("error log ={}", name); // 에러


        return "ok";
    }
}
