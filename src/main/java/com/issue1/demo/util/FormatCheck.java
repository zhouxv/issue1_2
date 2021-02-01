package com.issue1.demo.util;

import com.issue1.demo.entity.TestResult;
import com.issue1.demo.utilEntity.FormatCheckResult;

import java.util.List;

import static com.issue1.demo.util.ConvertList.convertTestResult;
import static com.issue1.demo.util.ConvertList.stringToIntArray;

public class FormatCheck {
    public static FormatCheckResult testResultFormatCheck(TestResult testResult) {
        FormatCheckResult result = new FormatCheckResult();
        result.setError(false);
        StringBuffer stringBuffer = new StringBuffer();

        if (testResult.getServiceid() == null) {
            result.setError(true);
            stringBuffer.append("Serviceid字段不能为空");
            result.setErrorString(stringBuffer.toString());
            return result;
        }

        List<String> stringList = convertTestResult(testResult);


        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i) == null) {
                result.setError(true);
//                stringBuffer.append("指标");
//                stringBuffer.append(i + 1);
                stringBuffer.append("指标参数不能为空；");
                break;
            }
            if (!stringList.get(i).matches("(\\d+,){7}\\d+")) {
                result.setError(true);
//                stringBuffer.append("指标");
//                stringBuffer.append(i + 1);
                stringBuffer.append("测试结果应为正整数");
                break;
            }
            Integer[] integers = stringToIntArray(stringList.get(i));
            if (valueCheck(integers)) {
                result.setError(true);
                stringBuffer.append("测试通过指标数应小于指标数总数");
                break;
            }
        }

        result.setErrorString(stringBuffer.toString());
        return result;
    }

    public static boolean valueCheck(Integer[] integers) {
        return (integers[0] > integers[1]) || (integers[2] > integers[3]) || (integers[4] > integers[5]) || (integers[6] > integers[7]);
    }
}
