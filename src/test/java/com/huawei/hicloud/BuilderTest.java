package com.huawei.hicloud;

import com.alibaba.fastjson.JSON;
import com.huawei.hicloud.vo.NetworkVO;
import com.huawei.hicloud.vo.ResultVO;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class BuilderTest {

    private static final Logger logger = LoggerFactory.getLogger(BuilderTest.class);

    @Test
    public void test01() {
        ResultVO<List<Integer>> resultVO = ResultVO.builder()
                .code("200")
                .msg("Request process sucess!")
                .status("sucess")
                .data(Arrays.asList(1, 2, 3))
                .build();

        logger.info("ResultVO: {}", JSON.toJSONString(resultVO));
    }

    @Test
    public void test02() {
        NetworkVO networkVO = new NetworkVO();
        networkVO.setId(UUID.randomUUID().toString());
        networkVO.setName("Net-01");
        
        /*ResultVO<NetworkVO> resultVO = ResultVO.builder()
                .code("200")
                .msg("Request process sucess!")
                .status("sucess")
                .data(networkVO)
                .build();*/

        ResultVO<NetworkVO> resultVO = ResultVO.success(networkVO);

        NetworkVO net = resultVO.getData();
        if (net instanceof NetworkVO) {
            logger.info("Net instanceof NetworkVO!");
        }
        logger.info("Network name; {}", net.getName());

        logger.info("ResultVO: {}", JSON.toJSONString(resultVO));
    }

}
