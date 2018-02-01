package example;

import client.SPProposalSaveServiceStub;
import org.apache.axis2.AxisFault;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * Created by zhengming on 17/12/18.
 */
public class SPProposalTest {
//    @Test
    public void test(String policyno,String orderno, String startdate, String enddate, String iNum, String iName)
    {

        SPProposalSaveServiceStub stub = null;
        try {
            stub = new SPProposalSaveServiceStub("http://9.23.22.166:7001//webServiceCenter/services/SPProposalSaveService?wsdl");
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        SPProposalSaveServiceStub.ProposalSaveRequest proposalSaveRequest = null;
        SPProposalSaveServiceStub.Service service = new SPProposalSaveServiceStub.Service();
        try {
        proposalSaveRequest = objectMapper.readValue(GSTCDownloadTest.class.getClassLoader().getResource("sp2.txt"), SPProposalSaveServiceStub.ProposalSaveRequest.class);
        proposalSaveRequest.getMainEhm().setProposalNo(policyno);
        proposalSaveRequest.getMainEhm().setPolicyNo(policyno);
        proposalSaveRequest.getMainEhm().setStartDate(startdate);
        proposalSaveRequest.getMainEhm().setEndDate(enddate);
        proposalSaveRequest.getMainEhm().setOthOrderCode(orderno);
        proposalSaveRequest.getMainEhm().setSendTime("2017-09-21 00:00:00");

        proposalSaveRequest.getApplicantEhm().setIdentifyNumber(iNum);
        proposalSaveRequest.getInsuredEhmArray()[0].setIdentifyNumber(iNum);
        proposalSaveRequest.getApplicantEhm().setAppliName(iName);
        proposalSaveRequest.getInsuredEhmArray()[0].setInsuredName(iName);
        proposalSaveRequest.getInsuredEhmArray()[0].getItemKindAddrEhmArray()[0].setAddress("");
        proposalSaveRequest.getInsuredEhmArray()[0].getItemKindEhmArray()[0].setKindCode("");
        proposalSaveRequest.getInsuredEhmArray()[0].getItemKindEhmArray()[0].setAddressNo("");
            service.setRequest(proposalSaveRequest);

    } catch (IOException e) {
            e.printStackTrace();
        }
        SPProposalSaveServiceStub.ServiceResponse response = new SPProposalSaveServiceStub.ServiceResponse();
        try {
            response = stub.service(service);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        System.out.println("保单号:"+proposalSaveRequest.getMainEhm().getPolicyNo()+"|保险起期:"+proposalSaveRequest.getMainEhm().getStartDate()
                    +"|保险止期:"+proposalSaveRequest.getMainEhm().getEndDate()+"|被保人证件号码:"+proposalSaveRequest.getInsuredEhmArray()[0].getIdentifyNumber()
                    +"|被保人姓名:"+ proposalSaveRequest.getInsuredEhmArray()[0].getInsuredName()
                    +"|补录结果:"+ ("1".equals(response.get_return().getResponseCode())?"成功":"失败") + "|原因:"+response.get_return().getErrorMessage());
    }

    @Test
    public void readCsv()
    {
        String path = GSTCDownloadTest.class.getClassLoader().getResource("064.csv").getPath();
            List<String> lines = null;
            try {
                lines = FileUtils.readLines(new File(path));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            if (lines != null && lines.size() > 1) {
                int i = 0;
                for (String line : lines) {
                    i++;
                    if(i == 1)continue;
                    String[] vars = line.split("\\,");
                    if (vars.length > 5) {
                        String policyno = vars[0].substring(1, vars[0].length()-1);
                        String orderno = vars[1].substring(1, vars[1].length()-1);
                        String startdate =vars[2].substring(1, vars[2].length()-1);
                        String enddate = vars[3].substring(1, vars[3].length()-1);
                        String iNum = vars[4].substring(1, vars[4].length()-1);
                        String iName = vars[5].substring(1, vars[5].length()-1);
                        test(policyno,orderno,startdate,enddate,iNum,iName);
                    }
                }
            }
//                String policyno = "80301201733W900093286";
//                String startdate = "2017-10-11 00:00:00";
//                String enddate = "2018-09-21 23:59:59";
//                String iNum = "500223199808280039";
//                String iName = "陶泓沛";

    }
}
