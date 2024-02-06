package com.shen.oj.judge;

import com.shen.oj.judge.strategy.DefaultJudgeStrategy;
import com.shen.oj.judge.strategy.JavaLanguageJudgeStrategy;
import com.shen.oj.judge.strategy.JudgeContext;
import com.shen.oj.judge.strategy.JudgeStrategy;
import com.shen.oj.model.dto.questionsubmit.JudgeInfo;
import com.shen.oj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManger {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        // 根据语言类型获取对应的策略
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
