package com.shen.oj.judge.codesandbox;

import com.shen.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.shen.oj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest 请求参数
     * @return 执行结果
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);

}
