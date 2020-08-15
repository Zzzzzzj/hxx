package org.xx.demo.service.imipl;

import org.springframework.stereotype.Service;
import org.xx.demo.service.TestService;
import org.gdal.gdal.*;
/**
 * @author Pitttttt
 * @Classname TestServiceImpl
 * @Description TODO
 * @Date 2020/8/5 21:51
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String testInterface() {
        return "this is test interface implements!";

    }

}
