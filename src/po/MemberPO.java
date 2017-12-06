package po;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by py on 2017/10/20.
 * 客户数据的类
 */
@Entity(name = "Member")
public class MemberPO implements Serializable{
    /**
     * 编号
     */
    String number;

    /**
     * 姓名
     */
    String name;

    /**
     * 分类（进货商、销售商）
     */
    String memberClass;

    /**
     * 级别（五级，一级普通用户，五级VIP客户）
     */
    int level;


    /**
     * 电话
     */
    String phoneNumber;

    /**
     * 地址
     */
    String address;

    /**
     * 邮编
     */
    String postcode;

    /**
     * 电子邮箱
     */
    String mailAddress;

    /**
     * 应收额度
     */
    long collectionLimit;

    /**
     * 应收
     */
    long collection;



    /**
     * 应付
     */

    long payment;

    /**
     * 默认业务员
     */
    String managePerson;

    public MemberPO() {

    }

    /**
     *
     * @param number
     * @param name
     * @param memberClass
     * @param level
     * @param phoneNumber
     * @param address
     * @param postcode
     * @param mailAddress
     * @param collectionLimit
     * @param collection
     * @param payment
     * @param managePerson
     */
    public MemberPO(String number, String name, String memberClass, int level, String phoneNumber,
                    String address, String postcode, String mailAddress, long collectionLimit,
                    long collection, long payment, String managePerson) {
        this.number = number;
        this.name = name;
        this.memberClass = memberClass;
        this.level = level;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.postcode = postcode;
        this.mailAddress = mailAddress;
        this.collectionLimit = collectionLimit;
        this.collection = collection;
        this.payment = payment;
        this.managePerson = managePerson;
    }
    @Id
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberClass() {
        return memberClass;
    }

    public void setMemberClass(String memberClass) {
        this.memberClass = memberClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public long getCollectionLimit() {
        return collectionLimit;
    }

    public void setCollectionLimit(long collectionLimit) {
        this.collectionLimit = collectionLimit;
    }

    public long getCollection() {
        return collection;
    }

    public void setCollection(long collection) {
        this.collection = collection;
    }

    public long getPayment() {
        return payment;
    }

    public void setPayment(long payment) {
        this.payment = payment;
    }

    public String getManagePerson() {
        return managePerson;
    }

    public void setManagePerson(String managePerson) {
        this.managePerson = managePerson;
    }
}
