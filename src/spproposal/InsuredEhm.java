/**
 * InsuredEhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package spproposal;

public class InsuredEhm  implements java.io.Serializable {
    private java.lang.String addressName;

    private java.lang.String age;

    private java.lang.String appOccupationFlag;

    private java.lang.String applyNum;

    private spproposal.BenefitEhm[] benefitEhmArray;

    private java.lang.String birthday;

    private java.lang.String driveNo;

    private java.lang.String email;

    private java.lang.String identifyNumber;

    private java.lang.String identifyType;

    private java.lang.String inValidMessage;

    private java.lang.String insuredCode;

    private java.lang.String insuredName;

    private java.lang.String insuredNature;

    private spproposal.ItemKindAddrEhm[] itemKindAddrEhmArray;

    private spproposal.ItemKindEhm[] itemKindEhmArray;

    private java.lang.String linkerName;

    private java.lang.String marriage;

    private java.lang.String mobile;

    private java.lang.String occupationCode1;

    private java.lang.String occupationCode2;

    private java.lang.String occupationCode3;

    private java.lang.String othField1;

    private java.lang.String othField2;

    private java.lang.String othField3;

    private java.lang.String othField4;

    private java.lang.String othField5;

    private java.lang.String phone;

    private java.lang.String postAddress;

    private java.lang.String postCode;

    private java.lang.String relation;

    private java.lang.Integer serialNo;

    private java.lang.String sex;

    private java.lang.Boolean valid;

    private java.lang.String workUnit;

    private java.lang.String iDcardEndDate;

    private java.lang.String iDcardStartDate;

    public InsuredEhm() {
    }

    public InsuredEhm(
           java.lang.String addressName,
           java.lang.String age,
           java.lang.String appOccupationFlag,
           java.lang.String applyNum,
           spproposal.BenefitEhm[] benefitEhmArray,
           java.lang.String birthday,
           java.lang.String driveNo,
           java.lang.String email,
           java.lang.String identifyNumber,
           java.lang.String identifyType,
           java.lang.String inValidMessage,
           java.lang.String insuredCode,
           java.lang.String insuredName,
           java.lang.String insuredNature,
           spproposal.ItemKindAddrEhm[] itemKindAddrEhmArray,
           spproposal.ItemKindEhm[] itemKindEhmArray,
           java.lang.String linkerName,
           java.lang.String marriage,
           java.lang.String mobile,
           java.lang.String occupationCode1,
           java.lang.String occupationCode2,
           java.lang.String occupationCode3,
           java.lang.String othField1,
           java.lang.String othField2,
           java.lang.String othField3,
           java.lang.String othField4,
           java.lang.String othField5,
           java.lang.String phone,
           java.lang.String postAddress,
           java.lang.String postCode,
           java.lang.String relation,
           java.lang.Integer serialNo,
           java.lang.String sex,
           java.lang.Boolean valid,
           java.lang.String workUnit,
           java.lang.String iDcardEndDate,
           java.lang.String iDcardStartDate) {
           this.addressName = addressName;
           this.age = age;
           this.appOccupationFlag = appOccupationFlag;
           this.applyNum = applyNum;
           this.benefitEhmArray = benefitEhmArray;
           this.birthday = birthday;
           this.driveNo = driveNo;
           this.email = email;
           this.identifyNumber = identifyNumber;
           this.identifyType = identifyType;
           this.inValidMessage = inValidMessage;
           this.insuredCode = insuredCode;
           this.insuredName = insuredName;
           this.insuredNature = insuredNature;
           this.itemKindAddrEhmArray = itemKindAddrEhmArray;
           this.itemKindEhmArray = itemKindEhmArray;
           this.linkerName = linkerName;
           this.marriage = marriage;
           this.mobile = mobile;
           this.occupationCode1 = occupationCode1;
           this.occupationCode2 = occupationCode2;
           this.occupationCode3 = occupationCode3;
           this.othField1 = othField1;
           this.othField2 = othField2;
           this.othField3 = othField3;
           this.othField4 = othField4;
           this.othField5 = othField5;
           this.phone = phone;
           this.postAddress = postAddress;
           this.postCode = postCode;
           this.relation = relation;
           this.serialNo = serialNo;
           this.sex = sex;
           this.valid = valid;
           this.workUnit = workUnit;
           this.iDcardEndDate = iDcardEndDate;
           this.iDcardStartDate = iDcardStartDate;
    }


    /**
     * Gets the addressName value for this InsuredEhm.
     * 
     * @return addressName
     */
    public java.lang.String getAddressName() {
        return addressName;
    }


    /**
     * Sets the addressName value for this InsuredEhm.
     * 
     * @param addressName
     */
    public void setAddressName(java.lang.String addressName) {
        this.addressName = addressName;
    }


    /**
     * Gets the age value for this InsuredEhm.
     * 
     * @return age
     */
    public java.lang.String getAge() {
        return age;
    }


    /**
     * Sets the age value for this InsuredEhm.
     * 
     * @param age
     */
    public void setAge(java.lang.String age) {
        this.age = age;
    }


    /**
     * Gets the appOccupationFlag value for this InsuredEhm.
     * 
     * @return appOccupationFlag
     */
    public java.lang.String getAppOccupationFlag() {
        return appOccupationFlag;
    }


    /**
     * Sets the appOccupationFlag value for this InsuredEhm.
     * 
     * @param appOccupationFlag
     */
    public void setAppOccupationFlag(java.lang.String appOccupationFlag) {
        this.appOccupationFlag = appOccupationFlag;
    }


    /**
     * Gets the applyNum value for this InsuredEhm.
     * 
     * @return applyNum
     */
    public java.lang.String getApplyNum() {
        return applyNum;
    }


    /**
     * Sets the applyNum value for this InsuredEhm.
     * 
     * @param applyNum
     */
    public void setApplyNum(java.lang.String applyNum) {
        this.applyNum = applyNum;
    }


    /**
     * Gets the benefitEhmArray value for this InsuredEhm.
     * 
     * @return benefitEhmArray
     */
    public spproposal.BenefitEhm[] getBenefitEhmArray() {
        return benefitEhmArray;
    }


    /**
     * Sets the benefitEhmArray value for this InsuredEhm.
     * 
     * @param benefitEhmArray
     */
    public void setBenefitEhmArray(spproposal.BenefitEhm[] benefitEhmArray) {
        this.benefitEhmArray = benefitEhmArray;
    }

    public spproposal.BenefitEhm getBenefitEhmArray(int i) {
        return this.benefitEhmArray[i];
    }

    public void setBenefitEhmArray(int i, spproposal.BenefitEhm _value) {
        this.benefitEhmArray[i] = _value;
    }


    /**
     * Gets the birthday value for this InsuredEhm.
     * 
     * @return birthday
     */
    public java.lang.String getBirthday() {
        return birthday;
    }


    /**
     * Sets the birthday value for this InsuredEhm.
     * 
     * @param birthday
     */
    public void setBirthday(java.lang.String birthday) {
        this.birthday = birthday;
    }


    /**
     * Gets the driveNo value for this InsuredEhm.
     * 
     * @return driveNo
     */
    public java.lang.String getDriveNo() {
        return driveNo;
    }


    /**
     * Sets the driveNo value for this InsuredEhm.
     * 
     * @param driveNo
     */
    public void setDriveNo(java.lang.String driveNo) {
        this.driveNo = driveNo;
    }


    /**
     * Gets the email value for this InsuredEhm.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this InsuredEhm.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the identifyNumber value for this InsuredEhm.
     * 
     * @return identifyNumber
     */
    public java.lang.String getIdentifyNumber() {
        return identifyNumber;
    }


    /**
     * Sets the identifyNumber value for this InsuredEhm.
     * 
     * @param identifyNumber
     */
    public void setIdentifyNumber(java.lang.String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }


    /**
     * Gets the identifyType value for this InsuredEhm.
     * 
     * @return identifyType
     */
    public java.lang.String getIdentifyType() {
        return identifyType;
    }


    /**
     * Sets the identifyType value for this InsuredEhm.
     * 
     * @param identifyType
     */
    public void setIdentifyType(java.lang.String identifyType) {
        this.identifyType = identifyType;
    }


    /**
     * Gets the inValidMessage value for this InsuredEhm.
     * 
     * @return inValidMessage
     */
    public java.lang.String getInValidMessage() {
        return inValidMessage;
    }


    /**
     * Sets the inValidMessage value for this InsuredEhm.
     * 
     * @param inValidMessage
     */
    public void setInValidMessage(java.lang.String inValidMessage) {
        this.inValidMessage = inValidMessage;
    }


    /**
     * Gets the insuredCode value for this InsuredEhm.
     * 
     * @return insuredCode
     */
    public java.lang.String getInsuredCode() {
        return insuredCode;
    }


    /**
     * Sets the insuredCode value for this InsuredEhm.
     * 
     * @param insuredCode
     */
    public void setInsuredCode(java.lang.String insuredCode) {
        this.insuredCode = insuredCode;
    }


    /**
     * Gets the insuredName value for this InsuredEhm.
     * 
     * @return insuredName
     */
    public java.lang.String getInsuredName() {
        return insuredName;
    }


    /**
     * Sets the insuredName value for this InsuredEhm.
     * 
     * @param insuredName
     */
    public void setInsuredName(java.lang.String insuredName) {
        this.insuredName = insuredName;
    }


    /**
     * Gets the insuredNature value for this InsuredEhm.
     * 
     * @return insuredNature
     */
    public java.lang.String getInsuredNature() {
        return insuredNature;
    }


    /**
     * Sets the insuredNature value for this InsuredEhm.
     * 
     * @param insuredNature
     */
    public void setInsuredNature(java.lang.String insuredNature) {
        this.insuredNature = insuredNature;
    }


    /**
     * Gets the itemKindAddrEhmArray value for this InsuredEhm.
     * 
     * @return itemKindAddrEhmArray
     */
    public spproposal.ItemKindAddrEhm[] getItemKindAddrEhmArray() {
        return itemKindAddrEhmArray;
    }


    /**
     * Sets the itemKindAddrEhmArray value for this InsuredEhm.
     * 
     * @param itemKindAddrEhmArray
     */
    public void setItemKindAddrEhmArray(spproposal.ItemKindAddrEhm[] itemKindAddrEhmArray) {
        this.itemKindAddrEhmArray = itemKindAddrEhmArray;
    }

    public spproposal.ItemKindAddrEhm getItemKindAddrEhmArray(int i) {
        return this.itemKindAddrEhmArray[i];
    }

    public void setItemKindAddrEhmArray(int i, spproposal.ItemKindAddrEhm _value) {
        this.itemKindAddrEhmArray[i] = _value;
    }


    /**
     * Gets the itemKindEhmArray value for this InsuredEhm.
     * 
     * @return itemKindEhmArray
     */
    public spproposal.ItemKindEhm[] getItemKindEhmArray() {
        return itemKindEhmArray;
    }


    /**
     * Sets the itemKindEhmArray value for this InsuredEhm.
     * 
     * @param itemKindEhmArray
     */
    public void setItemKindEhmArray(spproposal.ItemKindEhm[] itemKindEhmArray) {
        this.itemKindEhmArray = itemKindEhmArray;
    }

    public spproposal.ItemKindEhm getItemKindEhmArray(int i) {
        return this.itemKindEhmArray[i];
    }

    public void setItemKindEhmArray(int i, spproposal.ItemKindEhm _value) {
        this.itemKindEhmArray[i] = _value;
    }


    /**
     * Gets the linkerName value for this InsuredEhm.
     * 
     * @return linkerName
     */
    public java.lang.String getLinkerName() {
        return linkerName;
    }


    /**
     * Sets the linkerName value for this InsuredEhm.
     * 
     * @param linkerName
     */
    public void setLinkerName(java.lang.String linkerName) {
        this.linkerName = linkerName;
    }


    /**
     * Gets the marriage value for this InsuredEhm.
     * 
     * @return marriage
     */
    public java.lang.String getMarriage() {
        return marriage;
    }


    /**
     * Sets the marriage value for this InsuredEhm.
     * 
     * @param marriage
     */
    public void setMarriage(java.lang.String marriage) {
        this.marriage = marriage;
    }


    /**
     * Gets the mobile value for this InsuredEhm.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this InsuredEhm.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the occupationCode1 value for this InsuredEhm.
     * 
     * @return occupationCode1
     */
    public java.lang.String getOccupationCode1() {
        return occupationCode1;
    }


    /**
     * Sets the occupationCode1 value for this InsuredEhm.
     * 
     * @param occupationCode1
     */
    public void setOccupationCode1(java.lang.String occupationCode1) {
        this.occupationCode1 = occupationCode1;
    }


    /**
     * Gets the occupationCode2 value for this InsuredEhm.
     * 
     * @return occupationCode2
     */
    public java.lang.String getOccupationCode2() {
        return occupationCode2;
    }


    /**
     * Sets the occupationCode2 value for this InsuredEhm.
     * 
     * @param occupationCode2
     */
    public void setOccupationCode2(java.lang.String occupationCode2) {
        this.occupationCode2 = occupationCode2;
    }


    /**
     * Gets the occupationCode3 value for this InsuredEhm.
     * 
     * @return occupationCode3
     */
    public java.lang.String getOccupationCode3() {
        return occupationCode3;
    }


    /**
     * Sets the occupationCode3 value for this InsuredEhm.
     * 
     * @param occupationCode3
     */
    public void setOccupationCode3(java.lang.String occupationCode3) {
        this.occupationCode3 = occupationCode3;
    }


    /**
     * Gets the othField1 value for this InsuredEhm.
     * 
     * @return othField1
     */
    public java.lang.String getOthField1() {
        return othField1;
    }


    /**
     * Sets the othField1 value for this InsuredEhm.
     * 
     * @param othField1
     */
    public void setOthField1(java.lang.String othField1) {
        this.othField1 = othField1;
    }


    /**
     * Gets the othField2 value for this InsuredEhm.
     * 
     * @return othField2
     */
    public java.lang.String getOthField2() {
        return othField2;
    }


    /**
     * Sets the othField2 value for this InsuredEhm.
     * 
     * @param othField2
     */
    public void setOthField2(java.lang.String othField2) {
        this.othField2 = othField2;
    }


    /**
     * Gets the othField3 value for this InsuredEhm.
     * 
     * @return othField3
     */
    public java.lang.String getOthField3() {
        return othField3;
    }


    /**
     * Sets the othField3 value for this InsuredEhm.
     * 
     * @param othField3
     */
    public void setOthField3(java.lang.String othField3) {
        this.othField3 = othField3;
    }


    /**
     * Gets the othField4 value for this InsuredEhm.
     * 
     * @return othField4
     */
    public java.lang.String getOthField4() {
        return othField4;
    }


    /**
     * Sets the othField4 value for this InsuredEhm.
     * 
     * @param othField4
     */
    public void setOthField4(java.lang.String othField4) {
        this.othField4 = othField4;
    }


    /**
     * Gets the othField5 value for this InsuredEhm.
     * 
     * @return othField5
     */
    public java.lang.String getOthField5() {
        return othField5;
    }


    /**
     * Sets the othField5 value for this InsuredEhm.
     * 
     * @param othField5
     */
    public void setOthField5(java.lang.String othField5) {
        this.othField5 = othField5;
    }


    /**
     * Gets the phone value for this InsuredEhm.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this InsuredEhm.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the postAddress value for this InsuredEhm.
     * 
     * @return postAddress
     */
    public java.lang.String getPostAddress() {
        return postAddress;
    }


    /**
     * Sets the postAddress value for this InsuredEhm.
     * 
     * @param postAddress
     */
    public void setPostAddress(java.lang.String postAddress) {
        this.postAddress = postAddress;
    }


    /**
     * Gets the postCode value for this InsuredEhm.
     * 
     * @return postCode
     */
    public java.lang.String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this InsuredEhm.
     * 
     * @param postCode
     */
    public void setPostCode(java.lang.String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the relation value for this InsuredEhm.
     * 
     * @return relation
     */
    public java.lang.String getRelation() {
        return relation;
    }


    /**
     * Sets the relation value for this InsuredEhm.
     * 
     * @param relation
     */
    public void setRelation(java.lang.String relation) {
        this.relation = relation;
    }


    /**
     * Gets the serialNo value for this InsuredEhm.
     * 
     * @return serialNo
     */
    public java.lang.Integer getSerialNo() {
        return serialNo;
    }


    /**
     * Sets the serialNo value for this InsuredEhm.
     * 
     * @param serialNo
     */
    public void setSerialNo(java.lang.Integer serialNo) {
        this.serialNo = serialNo;
    }


    /**
     * Gets the sex value for this InsuredEhm.
     * 
     * @return sex
     */
    public java.lang.String getSex() {
        return sex;
    }


    /**
     * Sets the sex value for this InsuredEhm.
     * 
     * @param sex
     */
    public void setSex(java.lang.String sex) {
        this.sex = sex;
    }


    /**
     * Gets the valid value for this InsuredEhm.
     * 
     * @return valid
     */
    public java.lang.Boolean getValid() {
        return valid;
    }


    /**
     * Sets the valid value for this InsuredEhm.
     * 
     * @param valid
     */
    public void setValid(java.lang.Boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the workUnit value for this InsuredEhm.
     * 
     * @return workUnit
     */
    public java.lang.String getWorkUnit() {
        return workUnit;
    }


    /**
     * Sets the workUnit value for this InsuredEhm.
     * 
     * @param workUnit
     */
    public void setWorkUnit(java.lang.String workUnit) {
        this.workUnit = workUnit;
    }


    /**
     * Gets the iDcardEndDate value for this InsuredEhm.
     * 
     * @return iDcardEndDate
     */
    public java.lang.String getIDcardEndDate() {
        return iDcardEndDate;
    }


    /**
     * Sets the iDcardEndDate value for this InsuredEhm.
     * 
     * @param iDcardEndDate
     */
    public void setIDcardEndDate(java.lang.String iDcardEndDate) {
        this.iDcardEndDate = iDcardEndDate;
    }


    /**
     * Gets the iDcardStartDate value for this InsuredEhm.
     * 
     * @return iDcardStartDate
     */
    public java.lang.String getIDcardStartDate() {
        return iDcardStartDate;
    }


    /**
     * Sets the iDcardStartDate value for this InsuredEhm.
     * 
     * @param iDcardStartDate
     */
    public void setIDcardStartDate(java.lang.String iDcardStartDate) {
        this.iDcardStartDate = iDcardStartDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsuredEhm)) return false;
        InsuredEhm other = (InsuredEhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressName==null && other.getAddressName()==null) || 
             (this.addressName!=null &&
              this.addressName.equals(other.getAddressName()))) &&
            ((this.age==null && other.getAge()==null) || 
             (this.age!=null &&
              this.age.equals(other.getAge()))) &&
            ((this.appOccupationFlag==null && other.getAppOccupationFlag()==null) || 
             (this.appOccupationFlag!=null &&
              this.appOccupationFlag.equals(other.getAppOccupationFlag()))) &&
            ((this.applyNum==null && other.getApplyNum()==null) || 
             (this.applyNum!=null &&
              this.applyNum.equals(other.getApplyNum()))) &&
            ((this.benefitEhmArray==null && other.getBenefitEhmArray()==null) || 
             (this.benefitEhmArray!=null &&
              java.util.Arrays.equals(this.benefitEhmArray, other.getBenefitEhmArray()))) &&
            ((this.birthday==null && other.getBirthday()==null) || 
             (this.birthday!=null &&
              this.birthday.equals(other.getBirthday()))) &&
            ((this.driveNo==null && other.getDriveNo()==null) || 
             (this.driveNo!=null &&
              this.driveNo.equals(other.getDriveNo()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.identifyNumber==null && other.getIdentifyNumber()==null) || 
             (this.identifyNumber!=null &&
              this.identifyNumber.equals(other.getIdentifyNumber()))) &&
            ((this.identifyType==null && other.getIdentifyType()==null) || 
             (this.identifyType!=null &&
              this.identifyType.equals(other.getIdentifyType()))) &&
            ((this.inValidMessage==null && other.getInValidMessage()==null) || 
             (this.inValidMessage!=null &&
              this.inValidMessage.equals(other.getInValidMessage()))) &&
            ((this.insuredCode==null && other.getInsuredCode()==null) || 
             (this.insuredCode!=null &&
              this.insuredCode.equals(other.getInsuredCode()))) &&
            ((this.insuredName==null && other.getInsuredName()==null) || 
             (this.insuredName!=null &&
              this.insuredName.equals(other.getInsuredName()))) &&
            ((this.insuredNature==null && other.getInsuredNature()==null) || 
             (this.insuredNature!=null &&
              this.insuredNature.equals(other.getInsuredNature()))) &&
            ((this.itemKindAddrEhmArray==null && other.getItemKindAddrEhmArray()==null) || 
             (this.itemKindAddrEhmArray!=null &&
              java.util.Arrays.equals(this.itemKindAddrEhmArray, other.getItemKindAddrEhmArray()))) &&
            ((this.itemKindEhmArray==null && other.getItemKindEhmArray()==null) || 
             (this.itemKindEhmArray!=null &&
              java.util.Arrays.equals(this.itemKindEhmArray, other.getItemKindEhmArray()))) &&
            ((this.linkerName==null && other.getLinkerName()==null) || 
             (this.linkerName!=null &&
              this.linkerName.equals(other.getLinkerName()))) &&
            ((this.marriage==null && other.getMarriage()==null) || 
             (this.marriage!=null &&
              this.marriage.equals(other.getMarriage()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.occupationCode1==null && other.getOccupationCode1()==null) || 
             (this.occupationCode1!=null &&
              this.occupationCode1.equals(other.getOccupationCode1()))) &&
            ((this.occupationCode2==null && other.getOccupationCode2()==null) || 
             (this.occupationCode2!=null &&
              this.occupationCode2.equals(other.getOccupationCode2()))) &&
            ((this.occupationCode3==null && other.getOccupationCode3()==null) || 
             (this.occupationCode3!=null &&
              this.occupationCode3.equals(other.getOccupationCode3()))) &&
            ((this.othField1==null && other.getOthField1()==null) || 
             (this.othField1!=null &&
              this.othField1.equals(other.getOthField1()))) &&
            ((this.othField2==null && other.getOthField2()==null) || 
             (this.othField2!=null &&
              this.othField2.equals(other.getOthField2()))) &&
            ((this.othField3==null && other.getOthField3()==null) || 
             (this.othField3!=null &&
              this.othField3.equals(other.getOthField3()))) &&
            ((this.othField4==null && other.getOthField4()==null) || 
             (this.othField4!=null &&
              this.othField4.equals(other.getOthField4()))) &&
            ((this.othField5==null && other.getOthField5()==null) || 
             (this.othField5!=null &&
              this.othField5.equals(other.getOthField5()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.postAddress==null && other.getPostAddress()==null) || 
             (this.postAddress!=null &&
              this.postAddress.equals(other.getPostAddress()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode()))) &&
            ((this.relation==null && other.getRelation()==null) || 
             (this.relation!=null &&
              this.relation.equals(other.getRelation()))) &&
            ((this.serialNo==null && other.getSerialNo()==null) || 
             (this.serialNo!=null &&
              this.serialNo.equals(other.getSerialNo()))) &&
            ((this.sex==null && other.getSex()==null) || 
             (this.sex!=null &&
              this.sex.equals(other.getSex()))) &&
            ((this.valid==null && other.getValid()==null) || 
             (this.valid!=null &&
              this.valid.equals(other.getValid()))) &&
            ((this.workUnit==null && other.getWorkUnit()==null) || 
             (this.workUnit!=null &&
              this.workUnit.equals(other.getWorkUnit()))) &&
            ((this.iDcardEndDate==null && other.getIDcardEndDate()==null) || 
             (this.iDcardEndDate!=null &&
              this.iDcardEndDate.equals(other.getIDcardEndDate()))) &&
            ((this.iDcardStartDate==null && other.getIDcardStartDate()==null) || 
             (this.iDcardStartDate!=null &&
              this.iDcardStartDate.equals(other.getIDcardStartDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddressName() != null) {
            _hashCode += getAddressName().hashCode();
        }
        if (getAge() != null) {
            _hashCode += getAge().hashCode();
        }
        if (getAppOccupationFlag() != null) {
            _hashCode += getAppOccupationFlag().hashCode();
        }
        if (getApplyNum() != null) {
            _hashCode += getApplyNum().hashCode();
        }
        if (getBenefitEhmArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBenefitEhmArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBenefitEhmArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBirthday() != null) {
            _hashCode += getBirthday().hashCode();
        }
        if (getDriveNo() != null) {
            _hashCode += getDriveNo().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getIdentifyNumber() != null) {
            _hashCode += getIdentifyNumber().hashCode();
        }
        if (getIdentifyType() != null) {
            _hashCode += getIdentifyType().hashCode();
        }
        if (getInValidMessage() != null) {
            _hashCode += getInValidMessage().hashCode();
        }
        if (getInsuredCode() != null) {
            _hashCode += getInsuredCode().hashCode();
        }
        if (getInsuredName() != null) {
            _hashCode += getInsuredName().hashCode();
        }
        if (getInsuredNature() != null) {
            _hashCode += getInsuredNature().hashCode();
        }
        if (getItemKindAddrEhmArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemKindAddrEhmArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemKindAddrEhmArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemKindEhmArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemKindEhmArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemKindEhmArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinkerName() != null) {
            _hashCode += getLinkerName().hashCode();
        }
        if (getMarriage() != null) {
            _hashCode += getMarriage().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getOccupationCode1() != null) {
            _hashCode += getOccupationCode1().hashCode();
        }
        if (getOccupationCode2() != null) {
            _hashCode += getOccupationCode2().hashCode();
        }
        if (getOccupationCode3() != null) {
            _hashCode += getOccupationCode3().hashCode();
        }
        if (getOthField1() != null) {
            _hashCode += getOthField1().hashCode();
        }
        if (getOthField2() != null) {
            _hashCode += getOthField2().hashCode();
        }
        if (getOthField3() != null) {
            _hashCode += getOthField3().hashCode();
        }
        if (getOthField4() != null) {
            _hashCode += getOthField4().hashCode();
        }
        if (getOthField5() != null) {
            _hashCode += getOthField5().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPostAddress() != null) {
            _hashCode += getPostAddress().hashCode();
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        if (getRelation() != null) {
            _hashCode += getRelation().hashCode();
        }
        if (getSerialNo() != null) {
            _hashCode += getSerialNo().hashCode();
        }
        if (getSex() != null) {
            _hashCode += getSex().hashCode();
        }
        if (getValid() != null) {
            _hashCode += getValid().hashCode();
        }
        if (getWorkUnit() != null) {
            _hashCode += getWorkUnit().hashCode();
        }
        if (getIDcardEndDate() != null) {
            _hashCode += getIDcardEndDate().hashCode();
        }
        if (getIDcardStartDate() != null) {
            _hashCode += getIDcardStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsuredEhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "InsuredEhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "addressName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("age");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "age"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appOccupationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "appOccupationFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "applyNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitEhmArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "benefitEhmArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "BenefitEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "birthday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("driveNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "driveNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "identifyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "identifyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inValidMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "inValidMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "insuredCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "insuredName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuredNature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "insuredNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemKindAddrEhmArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "itemKindAddrEhmArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "ItemKindAddrEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemKindEhmArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "itemKindEhmArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "ItemKindEhm"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "linkerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marriage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "marriage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupationCode1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "occupationCode1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupationCode2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "occupationCode2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupationCode3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "occupationCode3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othField1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "othField1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othField2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "othField2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othField3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "othField3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othField4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "othField4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("othField5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "othField5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "postAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "postCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "relation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "serialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "sex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "workUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDcardEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "iDcardEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDcardStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://common.dto.proposalSave.brokenScreen.webServiceCenter.sinosoft.com/xsd", "iDcardStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
