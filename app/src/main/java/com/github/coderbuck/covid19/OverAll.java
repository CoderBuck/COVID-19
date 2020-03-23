package com.github.coderbuck.covid19;

import java.util.List;

public class OverAll {


    /**
     * results : [{"currentConfirmedCount":10821,"confirmedCount":81062,"suspectedCount":114,"curedCount":67037,"deadCount":3204,"seriousCount":3226,"currentConfirmedIncr":-1357,"confirmedIncr":41,"suspectedIncr":19,"curedIncr":1388,"deadIncr":10,"seriousIncr":-384,"generalRemark":"1. 3 月 12 日国家卫健委确诊补订遗漏 12 例确诊病例（非 12 日新增），暂无具体省份信息。 2. 浙江省 12 例外省治愈暂无具体省份信息。","abroadRemark":"","remark1":"易感人群：人群普遍易感。老年人及有基础疾病者感染后病情较重，儿童及婴幼儿也有发病","remark2":"潜伏期：一般为 3～7 天，最长不超过 14 天，潜伏期内可能存在传染性，其中无症状病例传染性非常罕见","remark3":"宿主：野生动物，可能为中华菊头蝠","remark4":"","remark5":"","note1":"病毒：SARS-CoV-2，其导致疾病命名 COVID-19","note2":"传染源：新冠肺炎的患者。无症状感染者也可能成为传染源。","note3":"传播途径：经呼吸道飞沫、接触传播是主要的传播途径。气溶胶传播和消化道等传播途径尚待明确。","updateTime":1584280315335}]
     * success : true
     */

    private boolean success;
    private List<ResultsBean> results;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * currentConfirmedCount : 10821
         * confirmedCount : 81062
         * suspectedCount : 114
         * curedCount : 67037
         * deadCount : 3204
         * seriousCount : 3226
         * currentConfirmedIncr : -1357
         * confirmedIncr : 41
         * suspectedIncr : 19
         * curedIncr : 1388
         * deadIncr : 10
         * seriousIncr : -384
         * generalRemark : 1. 3 月 12 日国家卫健委确诊补订遗漏 12 例确诊病例（非 12 日新增），暂无具体省份信息。 2. 浙江省 12 例外省治愈暂无具体省份信息。
         * abroadRemark :
         * remark1 : 易感人群：人群普遍易感。老年人及有基础疾病者感染后病情较重，儿童及婴幼儿也有发病
         * remark2 : 潜伏期：一般为 3～7 天，最长不超过 14 天，潜伏期内可能存在传染性，其中无症状病例传染性非常罕见
         * remark3 : 宿主：野生动物，可能为中华菊头蝠
         * remark4 :
         * remark5 :
         * note1 : 病毒：SARS-CoV-2，其导致疾病命名 COVID-19
         * note2 : 传染源：新冠肺炎的患者。无症状感染者也可能成为传染源。
         * note3 : 传播途径：经呼吸道飞沫、接触传播是主要的传播途径。气溶胶传播和消化道等传播途径尚待明确。
         * updateTime : 1584280315335
         */

        private int currentConfirmedCount;
        private int confirmedCount;
        private int suspectedCount;
        private int curedCount;
        private int deadCount;
        private int seriousCount;
        private int currentConfirmedIncr;
        private int confirmedIncr;
        private int suspectedIncr;
        private int curedIncr;
        private int deadIncr;
        private int seriousIncr;
        private String generalRemark;
        private String abroadRemark;
        private String remark1;
        private String remark2;
        private String remark3;
        private String remark4;
        private String remark5;
        private String note1;
        private String note2;
        private String note3;
        private long updateTime;

        public int getCurrentConfirmedCount() {
            return currentConfirmedCount;
        }

        public void setCurrentConfirmedCount(int currentConfirmedCount) {
            this.currentConfirmedCount = currentConfirmedCount;
        }

        public int getConfirmedCount() {
            return confirmedCount;
        }

        public void setConfirmedCount(int confirmedCount) {
            this.confirmedCount = confirmedCount;
        }

        public int getSuspectedCount() {
            return suspectedCount;
        }

        public void setSuspectedCount(int suspectedCount) {
            this.suspectedCount = suspectedCount;
        }

        public int getCuredCount() {
            return curedCount;
        }

        public void setCuredCount(int curedCount) {
            this.curedCount = curedCount;
        }

        public int getDeadCount() {
            return deadCount;
        }

        public void setDeadCount(int deadCount) {
            this.deadCount = deadCount;
        }

        public int getSeriousCount() {
            return seriousCount;
        }

        public void setSeriousCount(int seriousCount) {
            this.seriousCount = seriousCount;
        }

        public int getCurrentConfirmedIncr() {
            return currentConfirmedIncr;
        }

        public void setCurrentConfirmedIncr(int currentConfirmedIncr) {
            this.currentConfirmedIncr = currentConfirmedIncr;
        }

        public int getConfirmedIncr() {
            return confirmedIncr;
        }

        public void setConfirmedIncr(int confirmedIncr) {
            this.confirmedIncr = confirmedIncr;
        }

        public int getSuspectedIncr() {
            return suspectedIncr;
        }

        public void setSuspectedIncr(int suspectedIncr) {
            this.suspectedIncr = suspectedIncr;
        }

        public int getCuredIncr() {
            return curedIncr;
        }

        public void setCuredIncr(int curedIncr) {
            this.curedIncr = curedIncr;
        }

        public int getDeadIncr() {
            return deadIncr;
        }

        public void setDeadIncr(int deadIncr) {
            this.deadIncr = deadIncr;
        }

        public int getSeriousIncr() {
            return seriousIncr;
        }

        public void setSeriousIncr(int seriousIncr) {
            this.seriousIncr = seriousIncr;
        }

        public String getGeneralRemark() {
            return generalRemark;
        }

        public void setGeneralRemark(String generalRemark) {
            this.generalRemark = generalRemark;
        }

        public String getAbroadRemark() {
            return abroadRemark;
        }

        public void setAbroadRemark(String abroadRemark) {
            this.abroadRemark = abroadRemark;
        }

        public String getRemark1() {
            return remark1;
        }

        public void setRemark1(String remark1) {
            this.remark1 = remark1;
        }

        public String getRemark2() {
            return remark2;
        }

        public void setRemark2(String remark2) {
            this.remark2 = remark2;
        }

        public String getRemark3() {
            return remark3;
        }

        public void setRemark3(String remark3) {
            this.remark3 = remark3;
        }

        public String getRemark4() {
            return remark4;
        }

        public void setRemark4(String remark4) {
            this.remark4 = remark4;
        }

        public String getRemark5() {
            return remark5;
        }

        public void setRemark5(String remark5) {
            this.remark5 = remark5;
        }

        public String getNote1() {
            return note1;
        }

        public void setNote1(String note1) {
            this.note1 = note1;
        }

        public String getNote2() {
            return note2;
        }

        public void setNote2(String note2) {
            this.note2 = note2;
        }

        public String getNote3() {
            return note3;
        }

        public void setNote3(String note3) {
            this.note3 = note3;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }
    }
}
