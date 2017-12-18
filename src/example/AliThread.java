package example;

import com.*;
import download.EPolicyDownLoadRequest;
import download.EPolicyDownLoadResponse;
import download.GSTCPolicyDownLoadServiceLocator;
import download.GSTCPolicyDownLoadServiceSoap11BindingStub;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import javax.xml.rpc.ServiceException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

/**
 * Created by zhengming on 17/6/6.
 */
public class AliThread implements Runnable {
    private int i = 0;

    public AliThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        SpringFestivalPolicySaveServiceLocator locator = new SpringFestivalPolicySaveServiceLocator();
        SpringFestivalPolicySaveServiceSoap11BindingStub service = null;
        try {
            service = (SpringFestivalPolicySaveServiceSoap11BindingStub) locator.getSpringFestivalPolicySaveServiceHttpSoap11Endpoint(
                    new URL("http://9.1.165.11:7001/webServiceCenter/services/SpringFestivalPolicySaveService?wsdl"));
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("classloader:" + HelloWorldClient.class.getClassLoader().getResource("json.txt"));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ProposalSaveRequest proposalSaveRequest = null;
        try {
            proposalSaveRequest = objectMapper.readValue(HelloWorldClient.class.getClassLoader().getResource("json.txt"), ProposalSaveRequest.class);
            System.out.println("read value:" + proposalSaveRequest.getApplicantEhm().getAppliName());
//                objectMapper.writeValue(System.out, proposalSaveRequest);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        ProposalSaveResponse proposalSaveResponse = null;
        try {
            proposalSaveResponse = service.service(proposalSaveRequest);
        } catch (RemoteException e) {
            System.out.println("remote exception for mobile:+"+i +"cause:"+e);
        }
        System.out.println("proposalSaveResponse.getResponseCode():" + proposalSaveResponse.getResponseCode()+"|for mobile:"+i);
        System.out.println("proposalSaveResponse.getErrorMessage():" + proposalSaveResponse.getErrorMessage()+"|for mobile:"+i);
        try {
            objectMapper.writeValue(System.out, proposalSaveResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
