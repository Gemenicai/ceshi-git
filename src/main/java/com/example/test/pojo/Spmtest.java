package com.example.test.pojo;

public class Spmtest {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spmtest.id
     *
     * @mbg.generated Fri Sep 27 17:49:39 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spmtest.name
     *
     * @mbg.generated Fri Sep 27 17:49:39 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spmtest.id
     *
     * @return the value of spmtest.id
     *
     * @mbg.generated Fri Sep 27 17:49:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spmtest.id
     *
     * @param id the value for spmtest.id
     *
     * @mbg.generated Fri Sep 27 17:49:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spmtest.name
     *
     * @return the value of spmtest.name
     *
     * @mbg.generated Fri Sep 27 17:49:39 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spmtest.name
     *
     * @param name the value for spmtest.name
     *
     * @mbg.generated Fri Sep 27 17:49:39 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}