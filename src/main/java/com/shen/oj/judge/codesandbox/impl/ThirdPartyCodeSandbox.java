package com.shen.oj.judge.codesandbox.impl;

import com.shen.oj.judge.codesandbox.CodeSandbox;
import com.shen.oj.judge.codesandbox.model.ExecuteCodeRequest;
import com.shen.oj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.printf("第三方代码沙箱");
        return null;
    }
}
