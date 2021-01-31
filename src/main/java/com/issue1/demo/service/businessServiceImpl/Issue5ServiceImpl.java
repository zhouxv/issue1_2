package com.issue1.demo.service.businessServiceImpl;

import com.issue1.demo.entity.*;
import com.issue1.demo.service.businessService.IIssue5Service;
import com.issue1.demo.service.businessService.IRemoteAccess;
import com.issue1.demo.service.entityService.*;
import com.issue1.demo.utilEntity.issue5ResultUtil.Issue5ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

import static com.issue1.demo.util.Issue5Util.geneIssue5ResultUtil;

@org.springframework.stereotype.Service
@Slf4j
public class Issue5ServiceImpl implements IIssue5Service {
    private final IServiceService serviceService;
    private final ITestResultService testResultService;
    private final IGroupLevelService groupLevelService;
    private final ISagLevelService sagLevelService;
    private final IIssue2ResultService issue2ResultService;
    private final IIssue2ResultDetailService iIssue2ResultDetailService;
    private final IRemoteAccess remoteAccess;

    public Issue5ServiceImpl(IServiceService serviceService, ITestResultService testResultService, IGroupLevelService groupLevelService, ISagLevelService sagLevelService, IIssue2ResultService issue2ResultService, IIssue2ResultDetailService iIssue2ResultDetailService, IRemoteAccess remoteAccess) {
        this.serviceService = serviceService;
        this.testResultService = testResultService;
        this.groupLevelService = groupLevelService;
        this.sagLevelService = sagLevelService;
        this.issue2ResultService = issue2ResultService;
        this.iIssue2ResultDetailService = iIssue2ResultDetailService;
        this.remoteAccess = remoteAccess;
    }

    @Override
    public Issue5ResultUtil geneIssue5ResultUtils(String serviceId_testId) {
        Issue2Result issue2Result = this.issue2ResultService.findOneIssue2Result(new Issue2Result(serviceId_testId));

        if (issue2Result == null) return null;

        List<Issue2ResultDetail> issue2ResultDetailList1 = this.iIssue2ResultDetailService.findIssue2ResultDetails(issue2Result.getServiceIDtestID(), 1);
        List<Issue2ResultDetail> issue2ResultDetailList2 = this.iIssue2ResultDetailService.findIssue2ResultDetails(issue2Result.getServiceIDtestID(), 2);
        List<Issue2ResultDetail> issue2ResultDetailList3 = this.iIssue2ResultDetailService.findIssue2ResultDetails(issue2Result.getServiceIDtestID(), 3);
        List<Issue2ResultDetail> issue2ResultDetailList4 = this.iIssue2ResultDetailService.findIssue2ResultDetails(issue2Result.getServiceIDtestID(), 4);

        Service service = this.serviceService.findOneServiceByIssue2ResultId(issue2Result.getIssue2resultid());

        TestResult testResult = this.testResultService.findOneTestResultByServiceId(service.getServiceid());

        GroupLevel groupLevel = this.groupLevelService.findOneGroupLevel(service.getServiceid());

        SagLevel sagLevel = this.sagLevelService.findOneSagLevel(service.getServiceid());

        return geneIssue5ResultUtil(issue2Result, service, testResult, groupLevel, sagLevel, issue2ResultDetailList1, issue2ResultDetailList2, issue2ResultDetailList3, issue2ResultDetailList4);
    }

    @Override
    @Async
    public void accessIssue5API(String url, String serviceId_testId) {
        Issue5ResultUtil issue5ResultUtil = this.geneIssue5ResultUtils(serviceId_testId);
        Object data = this.remoteAccess.postJson(url, issue5ResultUtil);
        log.info(data.toString());
    }
}
