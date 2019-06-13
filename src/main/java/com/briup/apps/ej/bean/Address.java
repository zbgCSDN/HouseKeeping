package com.briup.apps.ej.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotBlank;

@ApiModel("地址模型")
public class Address {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_address.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */

    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_address.province
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    @ApiParam(value = "省份")
    @NotBlank(message = "省份不能为空")
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_address.city
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    @ApiParam(value = "城市名")
    @NotBlank(message = "城市名不能为空")
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_address.area
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_address.address
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    @ApiParam(value = "地址")
    @NotBlank(message = "地址不能为空")
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_address.telephone
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    @ApiParam(value = "电话号")
    @NotBlank(message = "电话号不能为空")
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_address.customer_id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    private Long customerId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_address.id
     *
     * @return the value of ej_address.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_address.id
     *
     * @param id the value for ej_address.id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_address.province
     *
     * @return the value of ej_address.province
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_address.province
     *
     * @param province the value for ej_address.province
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_address.city
     *
     * @return the value of ej_address.city
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_address.city
     *
     * @param city the value for ej_address.city
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_address.area
     *
     * @return the value of ej_address.area
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_address.area
     *
     * @param area the value for ej_address.area
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_address.address
     *
     * @return the value of ej_address.address
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_address.address
     *
     * @param address the value for ej_address.address
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_address.telephone
     *
     * @return the value of ej_address.telephone
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_address.telephone
     *
     * @param telephone the value for ej_address.telephone
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_address.customer_id
     *
     * @return the value of ej_address.customer_id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_address.customer_id
     *
     * @param customerId the value for ej_address.customer_id
     *
     * @mbg.generated Mon Jun 10 16:05:14 CST 2019
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}