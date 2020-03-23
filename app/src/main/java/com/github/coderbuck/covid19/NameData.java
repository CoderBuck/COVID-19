package com.github.coderbuck.covid19;

import java.util.List;

public class NameData {

    /**
     * results : ["上海市","不丹","中国","中非共和国","丹麦","乌克兰","乌兹别克斯坦","乌拉圭","云南省","亚美尼亚","以色列","伊拉克","伊朗","俄罗斯","保加利亚","克罗地亚","内蒙古自治区","冰岛","几内亚","列支敦士登","刚果（布）","刚果（金）","加拿大","加纳","加蓬","匈牙利","北京市","北爱尔兰","北马其顿","南非","卡塔尔","卢旺达","卢森堡","印度","印度尼西亚","危地马拉","厄瓜多尔","古巴","台湾","吉林省","哈萨克斯坦","哥伦比亚","哥斯达黎加","喀麦隆","四川省","土耳其","圣巴泰勒米","圣文森特和格林纳丁斯","圣马丁岛","圣马力诺","圭亚那","埃及","埃塞俄比亚","塞内加尔","塞尔维亚","塞浦路斯","塞舌尔","墨西哥","多哥","多米尼加","大不列颠及北爱尔兰联合王国","天津市","奥地利","委内瑞拉","孟加拉国","宁夏回族自治区","安徽省","安提瓜和巴布达","安道尔","尼日利亚","尼泊尔","山东省","山西省","巴勒斯坦","巴哈马","巴基斯坦","巴拉圭","巴拿马","巴林","巴西","布基纳法索","希腊","广东省","广西壮族自治区","德国","意大利","拉脱维亚","挪威","捷克","摩尔多瓦","摩洛哥","摩纳哥","文莱","斯威士兰","斯洛伐克","斯洛文尼亚","斯里兰卡","新加坡","新疆维吾尔自治区","新西兰","日本","智利","柬埔寨","根西岛","格鲁吉亚","梵蒂冈","比利时","毛里塔尼亚","江苏省","江西省","沙特阿拉伯","河北省","河南省","法国","法属圭亚那","法属波利尼西亚","法罗群岛","波兰","波黑","泰国","泽西岛","洪都拉斯","浙江省","海南省","湖北省","湖南省","澳大利亚","澳门","爱尔兰","爱沙尼亚","牙买加","特立尼达和多巴哥","玻利维亚","瑞典","瑞士","甘肃省","留尼汪","白俄罗斯","直布罗陀","福建省","科威特","科特迪瓦","秘鲁","突尼斯","立陶宛","约旦","纳米比亚","罗马尼亚","美国","肯尼亚","至尊公主邮轮","芬兰","苏丹","苏里南","英国","英国（含北爱尔兰）","荷兰","菲律宾","葡萄牙","蒙古","西班牙","西藏自治区","贵州省","赤道几内亚","越南","辽宁省","重庆市","钻石公主号邮轮","阿塞拜疆","阿富汗","阿尔及利亚","阿尔巴尼亚","阿曼","阿根廷","阿联酋","陕西省","青海省","韩国","香港","马尔代夫","马提尼克","马来西亚","马耳他","黎巴嫩","黑龙江省"]
     * success : true
     */

    private boolean success;
    private List<String> results;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<String> getResults() {
        return results;
    }

    public void setResults(List<String> results) {
        this.results = results;
    }
}