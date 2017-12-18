package example;

import download.EPolicyDownLoadRequest;
import download.EPolicyDownLoadResponse;
import download.GSTCPolicyDownLoadServiceLocator;
import download.GSTCPolicyDownLoadServiceSoap11BindingStub;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * Created by zhengming on 17/12/18.
 */
public class GSTCDownloadTest {
    @Test
    public void test()
    {
        GSTCPolicyDownLoadServiceLocator locator = new GSTCPolicyDownLoadServiceLocator();
        GSTCPolicyDownLoadServiceSoap11BindingStub service = null;
        try {
            service = (GSTCPolicyDownLoadServiceSoap11BindingStub) locator.getGSTCPolicyDownLoadServiceHttpSoap11Endpoint(
                    new URL("http://9.1.3.60:7001//webServiceCenter/services/GSTCPolicyDownLoadService?wsdl"));
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("classloader:" + HelloWorldClient.class.getClassLoader().getResource("json.txt"));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        EPolicyDownLoadRequest ePolicyDownLoadRequest = new EPolicyDownLoadRequest();
        ePolicyDownLoadRequest.setPolicyNo("828062017310069000479");
        ePolicyDownLoadRequest.setRequestInfo2("001");
        ePolicyDownLoadRequest.setRequestType("MYB");
        /*MainEhm mainEhm = proposalSaveRequest.getMainEhm();
        mainEhm.setProposalNo("82714201744AL0009" + i);
        mainEhm.setPolicyNo("82714201744AL0009"+i);
        proposalSaveRequest.setMainEhm(mainEhm);

        ApplicantEhm applicantEhm = proposalSaveRequest.getApplicantEhm();
        applicantEhm.setMobile(i+"880219881");
        proposalSaveRequest.setApplicantEhm(applicantEhm);
        System.out.println(proposalSaveRequest.getApplicantEhm().getMobile());

        InsuredEhm insuredEhm = proposalSaveRequest.getInsuredEhm();
        insuredEhm.setMobile(i+"880219881");
        proposalSaveRequest.setInsuredEhm(insuredEhm);

        System.out.println(proposalSaveRequest.getInsuredEhm().getMobile());*/
        EPolicyDownLoadResponse ePolicyDownLoad = null;
        try {
            ePolicyDownLoad = service.service(ePolicyDownLoadRequest);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        System.out.println("proposalSaveResponse.getResponseCode():" + ePolicyDownLoad.getResponseCode());
        System.out.println("proposalSaveResponse.getErrorMessage():" + ePolicyDownLoad.getErrorMessage());
        /*try {
            objectMapper.writeValue(System.out, ePolicyDownLoad);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
