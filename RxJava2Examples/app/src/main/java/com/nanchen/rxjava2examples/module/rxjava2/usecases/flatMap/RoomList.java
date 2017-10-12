package com.nanchen.rxjava2examples.module.rxjava2.usecases.flatMap;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @Function
 * @Data 2017/9/27
 * @Author daixiansen
 */

public class RoomList {


    @Override
    public String toString() {
        return "RoomList{" +
                "flag='" + flag + '\'' +
                ", content=" + content +
                '}';
    }

    /**
     * flag : 001
     * content : {"roomList":{"headline":[{"wealthrank":20,"username":"静心，嫦娥","pic":"https://vi1.6rooms.com/live/2017/09/27/10/1007v1506478271279853598_s.jpg","rid":"759268","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":3138,"honor":"","tagid":7,"uid":"61048909","sex":0,"goldAnchor":1,"zy":0,"score":"8.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1480671051","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v61048909-118606481","secflvtitle":"v61048909-118606481_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/07/29/01/1010v1501261379138037740_s.jpg","tala":0,"talc":0,"province":5,"realstarttime":1506478266,"tagname":"","tagnames":"","tagids":[],"largepic":"","daren":1},{"wealthrank":24,"username":"wuli黄豆豆啊~","pic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","rid":"740650","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":8535,"honor":"10401,10801","tagid":7,"uid":"68616191","sex":0,"goldAnchor":1,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1470298394","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v68616191-118600691","secflvtitle":"v68616191-118600691_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","tala":0,"talc":0,"province":12,"realstarttime":1506472580,"tagname":"颜值","tagnames":"舞秀,颜值","tagids":[1012,13],"largepic":"","daren":0},{"wealthrank":18,"username":"又又唱歌给你听","pic":"https://vi0.6rooms.com/live/2017/09/27/11/1007v1506482265226345399_s.jpg","rid":"116821","h264":"true","isRecommend":1,"ut":1,"rtype":"r5","count":5282,"honor":"10202","tagid":7,"uid":"78282409","sex":0,"goldAnchor":0,"zy":0,"score":"10.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1491918145","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v78282409-118610585","secflvtitle":"v78282409-118610585_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/05/31/16/1010v1496217904467434871_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506482261,"tagname":"","tagnames":"","tagids":[],"largepic":"","daren":0},{"wealthrank":28,"username":"元气贺勇哥荣升亲王","pic":"https://vi3.6rooms.com/live/2017/09/27/07/1007v1506469095689598243_s.jpg","rid":"868789","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":4745,"honor":"","tagid":7,"uid":"40612337","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1388505746","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v40612337-118598141","secflvtitle":"v40612337-118598141_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/06/19/06/1010v1497823776677388298_s.jpg","tala":0,"talc":0,"province":17,"realstarttime":1506469086,"tagname":"","tagnames":"","tagids":[],"largepic":"","daren":0}],"vrecom":[{"uid":"56381807","alias":"你敢进来吗？","rid":"57089","count":2711,"wealthrank":30,"starttime":"46分前","pospic":"https://vi3.6rooms.com/live/2015/08/03/18/1010v1438596827595251365_s.jpg","picuser":"https://vi1.6rooms.com/live/2017/01/13/00/1003v1484237328735417855.jpg","pic":"https://vi0.6rooms.com/live/2017/09/27/11/1007v1506482332517778115_s.jpg","rtype":"r10","recordtype":1,"videotype":1},{"uid":"69189856","alias":"二毛是个疯丫头👻","rid":"765892","count":2365,"wealthrank":16,"starttime":"49分前","pospic":"https://vi2.6rooms.com/live/2017/01/17/12/1010v1484626869483014985_s.jpg","picuser":"https://vi3.6rooms.com/live/2017/09/22/22/1003v1506090780547480562.jpg","pic":"https://vi3.6rooms.com/live/2017/09/27/11/1007v1506482155161829884_s.jpg","rtype":"u2","recordtype":1,"videotype":1},{"uid":"66382639","alias":"✰゛铃铛","rid":"845846","count":1433,"wealthrank":13,"starttime":"44分前","pospic":"https://vi3.6rooms.com/live/2017/05/11/20/1010v1494504490915451575_s.jpg","picuser":"https://vi2.6rooms.com/live/2017/08/16/04/1003v1502830023047172580.jpg","pic":"https://vi3.6rooms.com/live/2017/05/11/20/1010v1494504490915451575_s.jpg","rtype":"r4","recordtype":2,"videotype":5},{"uid":"53191242","alias":"九儿也温柔﹏","rid":"820129","count":2261,"wealthrank":26,"starttime":"2小时36分前","pospic":"https://vi1.6rooms.com/live/2017/07/19/06/1010v1500418471780652573_s.jpg","picuser":"https://vi2.6rooms.com/live/2017/09/20/00/1003v1505839522209266564.jpg","pic":"https://vi3.6rooms.com/live/2017/09/27/09/1007v1506475719861871094_s.jpg","rtype":"r10","recordtype":1,"videotype":1},{"uid":"69448654","alias":"咪宝用生命过任务","rid":"8214","count":2141,"wealthrank":15,"starttime":"41分前","pospic":"https://vi0.6rooms.com/live/2017/09/24/10/1010v1506219176151019906_s.jpg","picuser":"https://vi0.6rooms.com/live/2017/09/24/10/1003v1506219078860816674.jpg","pic":"https://vi3.6rooms.com/live/2017/09/27/11/1007v1506482990201180137_s.jpg","rtype":"u2","recordtype":1,"videotype":1},{"uid":"69175939","alias":"表妹❀月底任务悬了","rid":"96231","count":2219,"wealthrank":18,"starttime":"1小时2分前","pospic":"https://vi1.6rooms.com/live/2017/01/20/11/1010v1484883075198180997_s.jpg","picuser":"https://vi3.6rooms.com/live/2017/08/18/17/1003v1503047708461233463.jpg","pic":"https://vi3.6rooms.com/live/2017/09/27/11/1007v1506481432873165506_s.jpg","rtype":"r5","recordtype":1,"videotype":1}],"u0":[{"wealthrank":43,"username":"夏目&七","pic":"https://vi3.6rooms.com/live/2017/09/27/07/1007v1506470111614651294_s.jpg","rid":"777","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":13453,"honor":"","tagid":7,"uid":"45435986","sex":"0","goldAnchor":0,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1400927960","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v45435986-118598645","secflvtitle":"v45435986-118598645_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2015/05/21/15/1010v1432194019277429787_s.jpg","tala":0,"talc":0,"province":2,"realstarttime":1506470107,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":35,"username":"╰❀ℎℒ╮聆听花蕾～","pic":"https://vi3.6rooms.com/live/2017/09/27/09/1007v1506474813034776405_s.jpg","rid":"13920","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":12906,"honor":"","tagid":7,"uid":"58539278","sex":"0","goldAnchor":0,"zy":0,"score":"12.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1445942079","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v58539278-118602815","secflvtitle":"v58539278-118602815_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/08/21/06/1010v1503268219546886103_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506474798,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":26,"username":"☜❤☞芯瑶爱唱歌","pic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470512064614035_s.jpg","rid":"815661","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":8053,"honor":"","tagid":7,"uid":"52539824","sex":0,"goldAnchor":0,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":0,"anchorTm":"1447830241","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v52539824-118598885","secflvtitle":"v52539824-118598885_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/09/01/11/1010v1504235850643193006_s.jpg","tala":0,"talc":0,"province":7,"realstarttime":1506470388,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":71,"username":"♩♪珍爱♫♬","pic":"https://vi0.6rooms.com/live/2017/09/27/06/1007v1506464578598123767_s.jpg","rid":"86888","h264":"true","isRecommend":0,"ut":1,"rtype":"r10","count":7846,"honor":"","tagid":7,"uid":"23299753","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1323770590","ltype":1,"sound":0,"alevel":"r10","isvideo":4,"videotype":1,"recordtype":1,"flvtitle":"v23299753-118596629","secflvtitle":"v23299753-118596629_500","mgid":3,"pospic":"https://vi1.6rooms.com/live/2015/12/22/22/1010v1450792892153843197_s.jpg","tala":0,"talc":0,"province":12,"realstarttime":1506464575,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":34,"username":"┣叶ぃ叶子丫头╃","pic":"https://vi1.6rooms.com/live/2017/09/27/09/1007v1506477156574236585_s.jpg","rid":"999955","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":6540,"honor":"","tagid":"","uid":"41491125","sex":"0","goldAnchor":0,"zy":0,"score":"12.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1383208779","ltype":"1","sound":0,"alevel":"r10","isvideo":0,"videotype":"1","recordtype":1,"flvtitle":"v41491125-118605323","secflvtitle":"v41491125-118605323_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2016/11/27/14/1010v1480228011942579274_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506477119,"tagids":[],"largepic":""},{"wealthrank":30,"username":"辣妹子Oo唱歌甜甜甜","pic":"https://vi0.6rooms.com/live/2017/09/27/11/1007v1506484246898555128_s.jpg","rid":"518518","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":6099,"honor":"","tagid":7,"uid":"65212505","sex":0,"goldAnchor":1,"zy":0,"score":"10.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1457686043","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v65212505-118609877","secflvtitle":"v65212505-118609877_500","mgid":3,"pospic":"https://vi0.6rooms.com/live/2017/09/19/14/1010v1505803145588246889_s.jpg","tala":0,"talc":0,"province":19,"realstarttime":1506481596,"tagname":"","tagnames":"","tagids":[],"largepic":""}],"u1":[{"wealthrank":24,"username":"wuli黄豆豆啊~","pic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","rid":"740650","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":8535,"honor":"10401,10801","tagid":7,"uid":"68616191","sex":0,"goldAnchor":1,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1470298394","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v68616191-118600691","secflvtitle":"v68616191-118600691_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","tala":0,"talc":0,"province":12,"realstarttime":1506472580,"tagname":"颜值","tagnames":"舞秀,颜值","tagids":[1012,13],"largepic":""},{"wealthrank":27,"username":"依诺♔小蛮腰大长腿","pic":"https://vi1.6rooms.com/live/2017/06/17/20/1010v1497703693554248689_s.jpg","rid":"191111","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":5547,"honor":"10401,10801","tagid":7,"uid":"63213382","sex":0,"goldAnchor":1,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1462866480","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v63213382-118603109","secflvtitle":"v63213382-118603109_500","mgid":3,"pospic":"https://vi1.6rooms.com/live/2017/06/17/20/1010v1497703693554248689_s.jpg","tala":0,"talc":0,"province":7,"realstarttime":1506475061,"tagname":"颜值","tagnames":"舞秀,颜值","tagids":[1012,13],"largepic":""},{"wealthrank":19,"username":"果果❤️感恩有你","pic":"https://vi3.6rooms.com/live/2017/09/18/17/1010v1505726161872047872_s.jpg","rid":"7509","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":4855,"honor":"","tagid":7,"uid":"77230521","sex":0,"goldAnchor":1,"zy":0,"score":"8.50","isSproutingAnchor":0,"recscore":0,"anchorTm":"1486624233","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v77230521-118600055","secflvtitle":"v77230521-118600055_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/09/18/17/1010v1505726161872047872_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506471870,"tagname":"舞秀","tagnames":"舞秀","tagids":["1012"],"largepic":""},{"wealthrank":27,"username":"代理温唇-充值币即返","pic":"https://vi3.6rooms.com/live/2017/01/13/23/1010v1484322603368635529_s.jpg","rid":"9998","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":4829,"honor":"","tagid":7,"uid":"53915232","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1432467477","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v53915232-118606265","secflvtitle":"v53915232-118606265_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/01/13/23/1010v1484322603368635529_s.jpg","tala":0,"talc":0,"province":7,"realstarttime":1506477985,"tagname":"舞秀","tagnames":"舞秀","tagids":[1012],"largepic":""},{"wealthrank":16,"username":"你好，娜妹","pic":"https://vi2.6rooms.com/live/2016/10/16/22/1010v1476629980569524424_s.jpg","rid":"849185","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":3326,"honor":"","tagid":"","uid":"63864345","sex":0,"goldAnchor":0,"zy":0,"score":"10.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1464855007","ltype":"1","sound":0,"alevel":"r5","isvideo":0,"videotype":"1","recordtype":1,"flvtitle":"v63864345-118606301","secflvtitle":"v63864345-118606301_500","mgid":0,"pospic":"https://vi2.6rooms.com/live/2016/10/16/22/1010v1476629980569524424_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506478083,"tagids":[],"largepic":""},{"wealthrank":18,"username":"总有刁民想害~君宝","pic":"https://vi1.6rooms.com/live/2017/08/29/18/1010v1504002959274933598_s.jpg","rid":"521010","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":3061,"honor":"","tagid":"","uid":"62185489","sex":0,"goldAnchor":1,"zy":0,"score":"7.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1468398759","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v62185489-118604855","secflvtitle":"v62185489-118604855_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/08/29/18/1010v1504002959274933598_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506476719,"tagids":[],"largepic":""}],"u2":[{"wealthrank":40,"username":"纪小纪，带你们吃西瓜","pic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478017696798397_s.jpg","rid":"6399","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":12750,"honor":"","tagid":7,"uid":"20018775","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1312868685","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v20018775-118605413","secflvtitle":"v20018775-118605413_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2016/09/08/10/1010v1473302955040871003_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506477234,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":35,"username":"话社★小东北★","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506483284714059213_s.jpg","rid":"6807","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":9811,"honor":"","tagid":1014,"uid":"52600834","sex":1,"goldAnchor":0,"zy":0,"score":"9.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1421499639","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v52600834-118611449","secflvtitle":"v52600834-118611449_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2015/11/17/21/1010v1447768755981978820_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506483280,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":22,"username":"蕾胖子VS欠铁锤","pic":"https://vi2.6rooms.com/live/2017/09/27/10/1007v1506478352884690323_s.jpg","rid":"91218","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":3657,"honor":"","tagid":9,"uid":"63110290","sex":0,"goldAnchor":0,"zy":0,"score":"7.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1449651650","ltype":"1","sound":0,"alevel":"r10","isvideo":0,"videotype":"1","recordtype":1,"flvtitle":"v63110290-118606535","secflvtitle":"v63110290-118606535_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/03/24/17/1010v1490347375279584474_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506478341,"tagname":"组合","tagnames":"组合","tagids":[9],"largepic":""},{"wealthrank":20,"username":"Mc维克多正在@你","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506482664405638891_s.jpg","rid":"52345","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":3582,"honor":"10301,10401","tagid":7,"uid":"22385461","sex":"1","goldAnchor":0,"zy":0,"score":"8.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1320224587","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v22385461-118610849","secflvtitle":"v22385461-118610849_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/07/29/18/1010v1501323903202578461_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506482658,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":18,"username":"师弟小vs师妹","pic":"https://vi1.6rooms.com/live/2017/09/27/10/1007v1506479934628984146_s.jpg","rid":"764054","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":2758,"honor":"","tagid":"9","uid":"66499504","sex":0,"goldAnchor":0,"zy":0,"score":"6.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1483268020","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v66499504-118607471","secflvtitle":"v66499504-118607471_500","mgid":0,"pospic":"https://vi2.6rooms.com/live/2017/08/19/12/1010v1503117608667862754_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506479261,"tagname":"组合","tagnames":"组合","tagids":["9"],"largepic":""},{"wealthrank":17,"username":"车友_搞笑黄老邪","pic":"https://vi3.6rooms.com/live/2017/09/27/07/1007v1506470329105426319_s.jpg","rid":"747250","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":2500,"honor":"","tagid":"","uid":"60906709","sex":1,"goldAnchor":0,"zy":0,"score":"3.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1474002258","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v60906709-118598789","secflvtitle":"v60906709-118598789_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/01/31/11/1010v1485833010135337907_s.jpg","tala":0,"talc":0,"province":7,"realstarttime":1506470314,"tagids":[],"largepic":""}],"u3":[{"wealthrank":36,"username":"奕露西ぁ代理","pic":"https://vi1.6rooms.com/live/2017/09/27/09/1007v1506474091590188255_s.jpg","rid":"199500","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":5656,"honor":"","tagid":13,"uid":"35591044","sex":"0","goldAnchor":0,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1367588597","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v35591044-118602071","secflvtitle":"v35591044-118602071_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/02/21/16/1010v1487665078392978481_s.jpg","tala":0,"talc":0,"province":24,"realstarttime":1506474077,"tagname":"颜值","tagnames":"颜值","tagids":[13],"largepic":""},{"wealthrank":18,"username":"又又唱歌给你听","pic":"https://vi0.6rooms.com/live/2017/09/27/11/1007v1506482265226345399_s.jpg","rid":"116821","h264":"true","isRecommend":1,"ut":1,"rtype":"r5","count":5282,"honor":"10202","tagid":7,"uid":"78282409","sex":0,"goldAnchor":0,"zy":0,"score":"10.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1491918145","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v78282409-118610585","secflvtitle":"v78282409-118610585_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/05/31/16/1010v1496217904467434871_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506482261,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":18,"username":"♩♪小雨♫早上8点","pic":"https://vi0.6rooms.com/live/2017/09/27/07/1007v1506470356643257672_s.jpg","rid":"86333","h264":"true","isRecommend":1,"ut":1,"rtype":"r5","count":4924,"honor":"10202","tagid":7,"uid":"73616364","sex":0,"goldAnchor":0,"zy":0,"score":"6.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1502594559","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v73616364-118598825","secflvtitle":"v73616364-118598825_500","mgid":4,"pospic":"https://vi1.6rooms.com/live/2017/08/15/19/1010v1502796005983885431_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506470348,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":22,"username":"晴缘求人气票","pic":"https://vi3.6rooms.com/live/2017/09/27/09/1007v1506476929765087797_s.jpg","rid":"222299","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":4858,"honor":"10202","tagid":"","uid":"18269148","sex":0,"goldAnchor":1,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":0,"anchorTm":"1303213902","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v18269148-118605083","secflvtitle":"v18269148-118605083_500","mgid":0,"pospic":"https://vi3.6rooms.com/live/2017/03/30/15/1010v1490860674197030995_s.jpg","tala":0,"talc":0,"province":10,"realstarttime":1506476926,"tagids":[],"largepic":""},{"wealthrank":28,"username":"元气贺勇哥荣升亲王","pic":"https://vi3.6rooms.com/live/2017/09/27/07/1007v1506469095689598243_s.jpg","rid":"868789","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":4745,"honor":"","tagid":7,"uid":"40612337","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1388505746","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v40612337-118598141","secflvtitle":"v40612337-118598141_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/06/19/06/1010v1497823776677388298_s.jpg","tala":0,"talc":0,"province":17,"realstarttime":1506469086,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":31,"username":"︶❀一妃❥゛很温柔","pic":"https://vi1.6rooms.com/live/2017/09/27/06/1007v1506466438437378665_s.jpg","rid":"6612","h264":"true","isRecommend":0,"ut":1,"rtype":"r10","count":4420,"honor":"","tagid":7,"uid":"55092577","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1423062714","ltype":1,"sound":0,"alevel":"r10","isvideo":2,"videotype":1,"recordtype":1,"flvtitle":"v55092577-118597127","secflvtitle":"v55092577-118597127_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/01/06/12/1010v1483677964388466598_s.jpg","tala":0,"talc":0,"province":3,"realstarttime":1506466429,"tagname":"","tagnames":"","tagids":[],"largepic":""}],"special":[{"wealthrank":10,"username":"黑瞎岛打鱼大叔.","pic":"https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_s.jpg","rid":"852531","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":13337,"honor":"","tagid":10,"uid":"73257411","sex":0,"goldAnchor":0,"zy":0,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":"1504956872","ltype":"1","sound":0,"alevel":"r1","isvideo":0,"videotype":"6","recordtype":2,"flvtitle":"v73257411-118598753","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/09/22/05/1010v1506028380976797437_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470257,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":"https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_l.jpg"},{"wealthrank":40,"username":"纪小纪，带你们吃西瓜","pic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478017696798397_s.jpg","rid":"6399","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":12750,"honor":"","tagid":7,"uid":"20018775","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1312868685","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v20018775-118605413","secflvtitle":"v20018775-118605413_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2016/09/08/10/1010v1473302955040871003_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506477234,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":20,"username":"跟跟北京也钓鱼","pic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_s.jpg","rid":"739234","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":11878,"honor":"","tagid":10,"uid":"63394131","sex":1,"goldAnchor":0,"zy":0,"score":"4.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1469607446","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v63394131-118599095","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/05/22/07/1010v1495409708739271982_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470625,"tagname":"户外","tagnames":"户外","tagids":[2],"largepic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_l.jpg"},{"wealthrank":35,"username":"话社★小东北★","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506483284714059213_s.jpg","rid":"6807","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":9811,"honor":"","tagid":1014,"uid":"52600834","sex":1,"goldAnchor":0,"zy":0,"score":"9.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1421499639","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v52600834-118611449","secflvtitle":"v52600834-118611449_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2015/11/17/21/1010v1447768755981978820_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506483280,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":24,"username":"wuli黄豆豆啊~","pic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","rid":"740650","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":8535,"honor":"10401,10801","tagid":7,"uid":"68616191","sex":0,"goldAnchor":1,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1470298394","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v68616191-118600691","secflvtitle":"v68616191-118600691_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","tala":0,"talc":0,"province":12,"realstarttime":1506472580,"tagname":"颜值","tagnames":"舞秀,颜值","tagids":[1012,13],"largepic":""},{"wealthrank":36,"username":"奕露西ぁ代理","pic":"https://vi1.6rooms.com/live/2017/09/27/09/1007v1506474091590188255_s.jpg","rid":"199500","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":5656,"honor":"","tagid":13,"uid":"35591044","sex":"0","goldAnchor":0,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1367588597","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v35591044-118602071","secflvtitle":"v35591044-118602071_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/02/21/16/1010v1487665078392978481_s.jpg","tala":0,"talc":0,"province":24,"realstarttime":1506474077,"tagname":"颜值","tagnames":"颜值","tagids":[13],"largepic":""}],"mlive":[{"wealthrank":10,"username":"黑瞎岛打鱼大叔.","pic":"https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_s.jpg","rid":"852531","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":13337,"honor":"","tagid":10,"uid":"73257411","sex":0,"goldAnchor":0,"zy":0,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":"1504956872","ltype":"1","sound":0,"alevel":"r1","isvideo":0,"videotype":"6","recordtype":2,"flvtitle":"v73257411-118598753","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/09/22/05/1010v1506028380976797437_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470257,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":"https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_l.jpg"},{"wealthrank":20,"username":"跟跟北京也钓鱼","pic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_s.jpg","rid":"739234","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":11878,"honor":"","tagid":10,"uid":"63394131","sex":1,"goldAnchor":0,"zy":0,"score":"4.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1469607446","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v63394131-118599095","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/05/22/07/1010v1495409708739271982_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470625,"tagname":"户外","tagnames":"户外","tagids":[2],"largepic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_l.jpg"},{"wealthrank":11,"username":"翠妹儿缅甸翡翠","pic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478928040070863_s.jpg","rid":"745750","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":3622,"honor":"","tagid":10,"uid":"64098027","sex":0,"goldAnchor":0,"zy":0,"score":"0.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1478068478","ltype":1,"sound":0,"alevel":"r4","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v64098027-118607147","secflvtitle":"","mgid":0,"pospic":"https://vi2.6rooms.com/live/2016/11/02/14/1010v1478068082034239622_s.jpg","tala":0,"talc":0,"province":25,"realstarttime":1506478913,"tagname":"有好货","tagnames":"有好货","tagids":[1007],"largepic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478928040070863_l.jpg"},{"wealthrank":10,"username":"小霞翡翠","pic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506477366898254778_s.jpg","rid":"758664","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":3286,"honor":"","tagid":10,"uid":"67708645","sex":0,"goldAnchor":0,"zy":0,"score":"0.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1480406050","ltype":"1","sound":0,"alevel":"r1","isvideo":0,"videotype":"6","recordtype":2,"flvtitle":"v67708645-118605545","secflvtitle":"","mgid":0,"tala":0,"talc":0,"province":25,"realstarttime":1506477359,"tagname":"有好货","tagnames":"有好货","tagids":[1007],"largepic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506477366898254778_l.jpg","pospic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506477366898254778_s.jpg"},{"wealthrank":17,"username":"独醉白雪，魔女","pic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506476007287745502_s.jpg","rid":"842479","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":3086,"honor":"","tagid":10,"uid":"68883589","sex":0,"goldAnchor":0,"zy":0,"score":"1.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1460980087","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":5,"recordtype":2,"flvtitle":"v68883589-118604123","secflvtitle":"","mgid":0,"pospic":"https://vi2.6rooms.com/live/2017/08/19/10/1010v1503110870928925512_s.jpg","tala":0,"talc":0,"province":22,"realstarttime":1506476001,"tagname":"","tagnames":"","tagids":[],"largepic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506476007287745502_l.jpg"},{"wealthrank":5,"username":"阿玲翡翠","pic":"https://vi2.6rooms.com/live/2017/09/27/10/1007v1506479701615034739_s.jpg","rid":"756807","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":2952,"honor":"","tagid":10,"uid":"64768043","sex":0,"goldAnchor":0,"zy":0,"score":"0.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1479442323","ltype":1,"sound":0,"alevel":"r2","isvideo":0,"videotype":5,"recordtype":2,"flvtitle":"v64768043-118608005","secflvtitle":"","mgid":0,"tala":0,"talc":0,"province":25,"realstarttime":1506479691,"tagname":"有好货","tagnames":"有好货","tagids":[1007],"largepic":"https://vi2.6rooms.com/live/2017/09/27/10/1007v1506479701615034739_l.jpg","pospic":"https://vi2.6rooms.com/live/2017/09/27/10/1007v1506479701615034739_s.jpg"}],"male":[{"wealthrank":20,"username":"跟跟北京也钓鱼","pic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_s.jpg","rid":"739234","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":11878,"honor":"","tagid":10,"uid":"63394131","sex":1,"goldAnchor":0,"zy":0,"score":"4.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1469607446","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v63394131-118599095","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/05/22/07/1010v1495409708739271982_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470625,"tagname":"户外","tagnames":"户外","tagids":[2],"largepic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_l.jpg"},{"wealthrank":35,"username":"话社★小东北★","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506483284714059213_s.jpg","rid":"6807","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":9811,"honor":"","tagid":1014,"uid":"52600834","sex":1,"goldAnchor":0,"zy":0,"score":"9.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1421499639","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v52600834-118611449","secflvtitle":"v52600834-118611449_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2015/11/17/21/1010v1447768755981978820_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506483280,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":18,"username":"老三vs大脸vs细狗","pic":"https://vi3.6rooms.com/live/2017/09/27/11/1007v1506483669995484105_s.jpg","rid":"782561","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":4130,"honor":"","tagid":"2","uid":"75911449","sex":1,"goldAnchor":1,"zy":0,"score":"6.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1489389900","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v75911449-118611857","secflvtitle":"v75911449-118611857_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/07/19/17/1010v1500457432951816218_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506483658,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":""},{"wealthrank":22,"username":"海陆空主播云飛舞","pic":"https://vi3.6rooms.com/live/2017/09/27/10/1007v1506479361238157240_s.jpg","rid":"68568","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":3691,"honor":"","tagid":"2","uid":"58069298","sex":1,"goldAnchor":0,"zy":0,"score":"6.50","isSproutingAnchor":0,"recscore":0,"anchorTm":"1462774666","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v58069298-118607573","secflvtitle":"v58069298-118607573_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/08/14/14/1010v1502691081141456546_s.jpg","tala":0,"talc":0,"province":15,"realstarttime":1506479358,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":""},{"wealthrank":20,"username":"Mc维克多正在@你","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506482664405638891_s.jpg","rid":"52345","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":3582,"honor":"10301,10401","tagid":7,"uid":"22385461","sex":"1","goldAnchor":0,"zy":0,"score":"8.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1320224587","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v22385461-118610849","secflvtitle":"v22385461-118610849_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/07/29/18/1010v1501323903202578461_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506482658,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":17,"username":"文哥恭喜好运荣升子爵","pic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506479995743514805_s.jpg","rid":"818943","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":2504,"honor":"","tagid":"2","uid":"53834223","sex":1,"goldAnchor":0,"zy":0,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":"1450442383","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v53834223-118608347","secflvtitle":"v53834223-118608347_500","mgid":0,"pospic":"https://vi2.6rooms.com/live/2016/06/27/16/1010v1467015566328647440_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506479987,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":""}]},"roomListRec":[{"wealthrank":0,"username":"犯二课堂","pic":"https://vi0.6rooms.com/live/2017/02/22/14/1010v1487744918814581153_s.jpg","rid":"217745641","h264":"true","isRecommend":0,"ut":1,"rtype":"zy","count":5858,"honor":"","tagid":"","uid":"61098736","picuser":"https://vi1.6rooms.com/live/2017/02/22/11/1003v1487735721098643553.jpg","sex":0,"goldAnchor":0,"zy":1,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":0,"ltype":1,"sound":0,"alevel":"r2","isvideo":4,"videotype":1,"recordtype":1,"flvtitle":"v61098736-118607663","secflvtitle":"v61098736-118607663_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/02/22/14/1010v1487744918814581153_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506479415,"tagids":[],"largepic":"","banpic":"https://vi0.6rooms.com/live/2017/02/22/11/1013v1487735108260620273.jpg","nbanpic":"https://vi0.6rooms.com/live/2017/02/22/11/1013v1487735129701861082.jpg","viewPicNormal":""},{"wealthrank":5,"username":"圆圆脸吃播","pic":"https://vi0.6rooms.com/live/2017/09/11/10/1010v1505096748338038225_s.jpg","rid":"226213455","h264":"true","isRecommend":0,"ut":1,"rtype":"zy","count":856,"honor":"","tagid":10,"uid":"75277624","picuser":"https://vi1.6rooms.com/live/2017/09/05/15/1003v1504597228635595023.jpg","sex":0,"goldAnchor":0,"zy":1,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":0,"ltype":1,"sound":0,"alevel":"r2","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v75277624-118612757","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/09/11/10/1010v1505096748338038225_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506484717,"tagname":"","tagnames":"","tagids":[],"largepic":"","banpic":"","nbanpic":"https://vi1.6rooms.com/live/2017/09/06/10/1013v1504664066152391888.jpg","viewPicNormal":""}],"roomListCount":{"u0":312,"u1":64,"u2":96,"u3":473,"r10":60,"r5":106,"r4":69,"r2":18,"r1":59,"video":0,"mlive":331,"lianmai":19,"male":59,"special":96,"allCount":970,"zy":3,"":3,"other":19}}
     */

    private String flag;
    private ContentBean content;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public ContentBean getContent() {
        return content;
    }

    public void setContent(ContentBean content) {
        this.content = content;
    }

    public static class ContentBean {
        /**
         * roomList : {"headline":[{"wealthrank":20,"username":"静心，嫦娥","pic":"https://vi1.6rooms.com/live/2017/09/27/10/1007v1506478271279853598_s.jpg","rid":"759268","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":3138,"honor":"","tagid":7,"uid":"61048909","sex":0,"goldAnchor":1,"zy":0,"score":"8.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1480671051","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v61048909-118606481","secflvtitle":"v61048909-118606481_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/07/29/01/1010v1501261379138037740_s.jpg","tala":0,"talc":0,"province":5,"realstarttime":1506478266,"tagname":"","tagnames":"","tagids":[],"largepic":"","daren":1},{"wealthrank":24,"username":"wuli黄豆豆啊~","pic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","rid":"740650","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":8535,"honor":"10401,10801","tagid":7,"uid":"68616191","sex":0,"goldAnchor":1,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1470298394","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v68616191-118600691","secflvtitle":"v68616191-118600691_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","tala":0,"talc":0,"province":12,"realstarttime":1506472580,"tagname":"颜值","tagnames":"舞秀,颜值","tagids":[1012,13],"largepic":"","daren":0},{"wealthrank":18,"username":"又又唱歌给你听","pic":"https://vi0.6rooms.com/live/2017/09/27/11/1007v1506482265226345399_s.jpg","rid":"116821","h264":"true","isRecommend":1,"ut":1,"rtype":"r5","count":5282,"honor":"10202","tagid":7,"uid":"78282409","sex":0,"goldAnchor":0,"zy":0,"score":"10.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1491918145","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v78282409-118610585","secflvtitle":"v78282409-118610585_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/05/31/16/1010v1496217904467434871_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506482261,"tagname":"","tagnames":"","tagids":[],"largepic":"","daren":0},{"wealthrank":28,"username":"元气贺勇哥荣升亲王","pic":"https://vi3.6rooms.com/live/2017/09/27/07/1007v1506469095689598243_s.jpg","rid":"868789","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":4745,"honor":"","tagid":7,"uid":"40612337","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1388505746","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v40612337-118598141","secflvtitle":"v40612337-118598141_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/06/19/06/1010v1497823776677388298_s.jpg","tala":0,"talc":0,"province":17,"realstarttime":1506469086,"tagname":"","tagnames":"","tagids":[],"largepic":"","daren":0}],"vrecom":[{"uid":"56381807","alias":"你敢进来吗？","rid":"57089","count":2711,"wealthrank":30,"starttime":"46分前","pospic":"https://vi3.6rooms.com/live/2015/08/03/18/1010v1438596827595251365_s.jpg","picuser":"https://vi1.6rooms.com/live/2017/01/13/00/1003v1484237328735417855.jpg","pic":"https://vi0.6rooms.com/live/2017/09/27/11/1007v1506482332517778115_s.jpg","rtype":"r10","recordtype":1,"videotype":1},{"uid":"69189856","alias":"二毛是个疯丫头👻","rid":"765892","count":2365,"wealthrank":16,"starttime":"49分前","pospic":"https://vi2.6rooms.com/live/2017/01/17/12/1010v1484626869483014985_s.jpg","picuser":"https://vi3.6rooms.com/live/2017/09/22/22/1003v1506090780547480562.jpg","pic":"https://vi3.6rooms.com/live/2017/09/27/11/1007v1506482155161829884_s.jpg","rtype":"u2","recordtype":1,"videotype":1},{"uid":"66382639","alias":"✰゛铃铛","rid":"845846","count":1433,"wealthrank":13,"starttime":"44分前","pospic":"https://vi3.6rooms.com/live/2017/05/11/20/1010v1494504490915451575_s.jpg","picuser":"https://vi2.6rooms.com/live/2017/08/16/04/1003v1502830023047172580.jpg","pic":"https://vi3.6rooms.com/live/2017/05/11/20/1010v1494504490915451575_s.jpg","rtype":"r4","recordtype":2,"videotype":5},{"uid":"53191242","alias":"九儿也温柔﹏","rid":"820129","count":2261,"wealthrank":26,"starttime":"2小时36分前","pospic":"https://vi1.6rooms.com/live/2017/07/19/06/1010v1500418471780652573_s.jpg","picuser":"https://vi2.6rooms.com/live/2017/09/20/00/1003v1505839522209266564.jpg","pic":"https://vi3.6rooms.com/live/2017/09/27/09/1007v1506475719861871094_s.jpg","rtype":"r10","recordtype":1,"videotype":1},{"uid":"69448654","alias":"咪宝用生命过任务","rid":"8214","count":2141,"wealthrank":15,"starttime":"41分前","pospic":"https://vi0.6rooms.com/live/2017/09/24/10/1010v1506219176151019906_s.jpg","picuser":"https://vi0.6rooms.com/live/2017/09/24/10/1003v1506219078860816674.jpg","pic":"https://vi3.6rooms.com/live/2017/09/27/11/1007v1506482990201180137_s.jpg","rtype":"u2","recordtype":1,"videotype":1},{"uid":"69175939","alias":"表妹❀月底任务悬了","rid":"96231","count":2219,"wealthrank":18,"starttime":"1小时2分前","pospic":"https://vi1.6rooms.com/live/2017/01/20/11/1010v1484883075198180997_s.jpg","picuser":"https://vi3.6rooms.com/live/2017/08/18/17/1003v1503047708461233463.jpg","pic":"https://vi3.6rooms.com/live/2017/09/27/11/1007v1506481432873165506_s.jpg","rtype":"r5","recordtype":1,"videotype":1}],"u0":[{"wealthrank":43,"username":"夏目&七","pic":"https://vi3.6rooms.com/live/2017/09/27/07/1007v1506470111614651294_s.jpg","rid":"777","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":13453,"honor":"","tagid":7,"uid":"45435986","sex":"0","goldAnchor":0,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1400927960","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v45435986-118598645","secflvtitle":"v45435986-118598645_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2015/05/21/15/1010v1432194019277429787_s.jpg","tala":0,"talc":0,"province":2,"realstarttime":1506470107,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":35,"username":"╰❀ℎℒ╮聆听花蕾～","pic":"https://vi3.6rooms.com/live/2017/09/27/09/1007v1506474813034776405_s.jpg","rid":"13920","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":12906,"honor":"","tagid":7,"uid":"58539278","sex":"0","goldAnchor":0,"zy":0,"score":"12.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1445942079","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v58539278-118602815","secflvtitle":"v58539278-118602815_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/08/21/06/1010v1503268219546886103_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506474798,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":26,"username":"☜❤☞芯瑶爱唱歌","pic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470512064614035_s.jpg","rid":"815661","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":8053,"honor":"","tagid":7,"uid":"52539824","sex":0,"goldAnchor":0,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":0,"anchorTm":"1447830241","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v52539824-118598885","secflvtitle":"v52539824-118598885_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/09/01/11/1010v1504235850643193006_s.jpg","tala":0,"talc":0,"province":7,"realstarttime":1506470388,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":71,"username":"♩♪珍爱♫♬","pic":"https://vi0.6rooms.com/live/2017/09/27/06/1007v1506464578598123767_s.jpg","rid":"86888","h264":"true","isRecommend":0,"ut":1,"rtype":"r10","count":7846,"honor":"","tagid":7,"uid":"23299753","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1323770590","ltype":1,"sound":0,"alevel":"r10","isvideo":4,"videotype":1,"recordtype":1,"flvtitle":"v23299753-118596629","secflvtitle":"v23299753-118596629_500","mgid":3,"pospic":"https://vi1.6rooms.com/live/2015/12/22/22/1010v1450792892153843197_s.jpg","tala":0,"talc":0,"province":12,"realstarttime":1506464575,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":34,"username":"┣叶ぃ叶子丫头╃","pic":"https://vi1.6rooms.com/live/2017/09/27/09/1007v1506477156574236585_s.jpg","rid":"999955","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":6540,"honor":"","tagid":"","uid":"41491125","sex":"0","goldAnchor":0,"zy":0,"score":"12.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1383208779","ltype":"1","sound":0,"alevel":"r10","isvideo":0,"videotype":"1","recordtype":1,"flvtitle":"v41491125-118605323","secflvtitle":"v41491125-118605323_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2016/11/27/14/1010v1480228011942579274_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506477119,"tagids":[],"largepic":""},{"wealthrank":30,"username":"辣妹子Oo唱歌甜甜甜","pic":"https://vi0.6rooms.com/live/2017/09/27/11/1007v1506484246898555128_s.jpg","rid":"518518","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":6099,"honor":"","tagid":7,"uid":"65212505","sex":0,"goldAnchor":1,"zy":0,"score":"10.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1457686043","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v65212505-118609877","secflvtitle":"v65212505-118609877_500","mgid":3,"pospic":"https://vi0.6rooms.com/live/2017/09/19/14/1010v1505803145588246889_s.jpg","tala":0,"talc":0,"province":19,"realstarttime":1506481596,"tagname":"","tagnames":"","tagids":[],"largepic":""}],"u1":[{"wealthrank":24,"username":"wuli黄豆豆啊~","pic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","rid":"740650","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":8535,"honor":"10401,10801","tagid":7,"uid":"68616191","sex":0,"goldAnchor":1,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1470298394","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v68616191-118600691","secflvtitle":"v68616191-118600691_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","tala":0,"talc":0,"province":12,"realstarttime":1506472580,"tagname":"颜值","tagnames":"舞秀,颜值","tagids":[1012,13],"largepic":""},{"wealthrank":27,"username":"依诺♔小蛮腰大长腿","pic":"https://vi1.6rooms.com/live/2017/06/17/20/1010v1497703693554248689_s.jpg","rid":"191111","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":5547,"honor":"10401,10801","tagid":7,"uid":"63213382","sex":0,"goldAnchor":1,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1462866480","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v63213382-118603109","secflvtitle":"v63213382-118603109_500","mgid":3,"pospic":"https://vi1.6rooms.com/live/2017/06/17/20/1010v1497703693554248689_s.jpg","tala":0,"talc":0,"province":7,"realstarttime":1506475061,"tagname":"颜值","tagnames":"舞秀,颜值","tagids":[1012,13],"largepic":""},{"wealthrank":19,"username":"果果❤️感恩有你","pic":"https://vi3.6rooms.com/live/2017/09/18/17/1010v1505726161872047872_s.jpg","rid":"7509","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":4855,"honor":"","tagid":7,"uid":"77230521","sex":0,"goldAnchor":1,"zy":0,"score":"8.50","isSproutingAnchor":0,"recscore":0,"anchorTm":"1486624233","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v77230521-118600055","secflvtitle":"v77230521-118600055_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/09/18/17/1010v1505726161872047872_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506471870,"tagname":"舞秀","tagnames":"舞秀","tagids":["1012"],"largepic":""},{"wealthrank":27,"username":"代理温唇-充值币即返","pic":"https://vi3.6rooms.com/live/2017/01/13/23/1010v1484322603368635529_s.jpg","rid":"9998","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":4829,"honor":"","tagid":7,"uid":"53915232","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1432467477","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v53915232-118606265","secflvtitle":"v53915232-118606265_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/01/13/23/1010v1484322603368635529_s.jpg","tala":0,"talc":0,"province":7,"realstarttime":1506477985,"tagname":"舞秀","tagnames":"舞秀","tagids":[1012],"largepic":""},{"wealthrank":16,"username":"你好，娜妹","pic":"https://vi2.6rooms.com/live/2016/10/16/22/1010v1476629980569524424_s.jpg","rid":"849185","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":3326,"honor":"","tagid":"","uid":"63864345","sex":0,"goldAnchor":0,"zy":0,"score":"10.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1464855007","ltype":"1","sound":0,"alevel":"r5","isvideo":0,"videotype":"1","recordtype":1,"flvtitle":"v63864345-118606301","secflvtitle":"v63864345-118606301_500","mgid":0,"pospic":"https://vi2.6rooms.com/live/2016/10/16/22/1010v1476629980569524424_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506478083,"tagids":[],"largepic":""},{"wealthrank":18,"username":"总有刁民想害~君宝","pic":"https://vi1.6rooms.com/live/2017/08/29/18/1010v1504002959274933598_s.jpg","rid":"521010","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":3061,"honor":"","tagid":"","uid":"62185489","sex":0,"goldAnchor":1,"zy":0,"score":"7.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1468398759","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v62185489-118604855","secflvtitle":"v62185489-118604855_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/08/29/18/1010v1504002959274933598_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506476719,"tagids":[],"largepic":""}],"u2":[{"wealthrank":40,"username":"纪小纪，带你们吃西瓜","pic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478017696798397_s.jpg","rid":"6399","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":12750,"honor":"","tagid":7,"uid":"20018775","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1312868685","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v20018775-118605413","secflvtitle":"v20018775-118605413_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2016/09/08/10/1010v1473302955040871003_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506477234,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":35,"username":"话社★小东北★","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506483284714059213_s.jpg","rid":"6807","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":9811,"honor":"","tagid":1014,"uid":"52600834","sex":1,"goldAnchor":0,"zy":0,"score":"9.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1421499639","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v52600834-118611449","secflvtitle":"v52600834-118611449_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2015/11/17/21/1010v1447768755981978820_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506483280,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":22,"username":"蕾胖子VS欠铁锤","pic":"https://vi2.6rooms.com/live/2017/09/27/10/1007v1506478352884690323_s.jpg","rid":"91218","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":3657,"honor":"","tagid":9,"uid":"63110290","sex":0,"goldAnchor":0,"zy":0,"score":"7.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1449651650","ltype":"1","sound":0,"alevel":"r10","isvideo":0,"videotype":"1","recordtype":1,"flvtitle":"v63110290-118606535","secflvtitle":"v63110290-118606535_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/03/24/17/1010v1490347375279584474_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506478341,"tagname":"组合","tagnames":"组合","tagids":[9],"largepic":""},{"wealthrank":20,"username":"Mc维克多正在@你","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506482664405638891_s.jpg","rid":"52345","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":3582,"honor":"10301,10401","tagid":7,"uid":"22385461","sex":"1","goldAnchor":0,"zy":0,"score":"8.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1320224587","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v22385461-118610849","secflvtitle":"v22385461-118610849_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/07/29/18/1010v1501323903202578461_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506482658,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":18,"username":"师弟小vs师妹","pic":"https://vi1.6rooms.com/live/2017/09/27/10/1007v1506479934628984146_s.jpg","rid":"764054","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":2758,"honor":"","tagid":"9","uid":"66499504","sex":0,"goldAnchor":0,"zy":0,"score":"6.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1483268020","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v66499504-118607471","secflvtitle":"v66499504-118607471_500","mgid":0,"pospic":"https://vi2.6rooms.com/live/2017/08/19/12/1010v1503117608667862754_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506479261,"tagname":"组合","tagnames":"组合","tagids":["9"],"largepic":""},{"wealthrank":17,"username":"车友_搞笑黄老邪","pic":"https://vi3.6rooms.com/live/2017/09/27/07/1007v1506470329105426319_s.jpg","rid":"747250","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":2500,"honor":"","tagid":"","uid":"60906709","sex":1,"goldAnchor":0,"zy":0,"score":"3.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1474002258","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v60906709-118598789","secflvtitle":"v60906709-118598789_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/01/31/11/1010v1485833010135337907_s.jpg","tala":0,"talc":0,"province":7,"realstarttime":1506470314,"tagids":[],"largepic":""}],"u3":[{"wealthrank":36,"username":"奕露西ぁ代理","pic":"https://vi1.6rooms.com/live/2017/09/27/09/1007v1506474091590188255_s.jpg","rid":"199500","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":5656,"honor":"","tagid":13,"uid":"35591044","sex":"0","goldAnchor":0,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1367588597","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v35591044-118602071","secflvtitle":"v35591044-118602071_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/02/21/16/1010v1487665078392978481_s.jpg","tala":0,"talc":0,"province":24,"realstarttime":1506474077,"tagname":"颜值","tagnames":"颜值","tagids":[13],"largepic":""},{"wealthrank":18,"username":"又又唱歌给你听","pic":"https://vi0.6rooms.com/live/2017/09/27/11/1007v1506482265226345399_s.jpg","rid":"116821","h264":"true","isRecommend":1,"ut":1,"rtype":"r5","count":5282,"honor":"10202","tagid":7,"uid":"78282409","sex":0,"goldAnchor":0,"zy":0,"score":"10.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1491918145","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v78282409-118610585","secflvtitle":"v78282409-118610585_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/05/31/16/1010v1496217904467434871_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506482261,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":18,"username":"♩♪小雨♫早上8点","pic":"https://vi0.6rooms.com/live/2017/09/27/07/1007v1506470356643257672_s.jpg","rid":"86333","h264":"true","isRecommend":1,"ut":1,"rtype":"r5","count":4924,"honor":"10202","tagid":7,"uid":"73616364","sex":0,"goldAnchor":0,"zy":0,"score":"6.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1502594559","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v73616364-118598825","secflvtitle":"v73616364-118598825_500","mgid":4,"pospic":"https://vi1.6rooms.com/live/2017/08/15/19/1010v1502796005983885431_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506470348,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":22,"username":"晴缘求人气票","pic":"https://vi3.6rooms.com/live/2017/09/27/09/1007v1506476929765087797_s.jpg","rid":"222299","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":4858,"honor":"10202","tagid":"","uid":"18269148","sex":0,"goldAnchor":1,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":0,"anchorTm":"1303213902","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v18269148-118605083","secflvtitle":"v18269148-118605083_500","mgid":0,"pospic":"https://vi3.6rooms.com/live/2017/03/30/15/1010v1490860674197030995_s.jpg","tala":0,"talc":0,"province":10,"realstarttime":1506476926,"tagids":[],"largepic":""},{"wealthrank":28,"username":"元气贺勇哥荣升亲王","pic":"https://vi3.6rooms.com/live/2017/09/27/07/1007v1506469095689598243_s.jpg","rid":"868789","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":4745,"honor":"","tagid":7,"uid":"40612337","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1388505746","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v40612337-118598141","secflvtitle":"v40612337-118598141_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2017/06/19/06/1010v1497823776677388298_s.jpg","tala":0,"talc":0,"province":17,"realstarttime":1506469086,"tagname":"","tagnames":"","tagids":[],"largepic":""},{"wealthrank":31,"username":"︶❀一妃❥゛很温柔","pic":"https://vi1.6rooms.com/live/2017/09/27/06/1007v1506466438437378665_s.jpg","rid":"6612","h264":"true","isRecommend":0,"ut":1,"rtype":"r10","count":4420,"honor":"","tagid":7,"uid":"55092577","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1423062714","ltype":1,"sound":0,"alevel":"r10","isvideo":2,"videotype":1,"recordtype":1,"flvtitle":"v55092577-118597127","secflvtitle":"v55092577-118597127_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/01/06/12/1010v1483677964388466598_s.jpg","tala":0,"talc":0,"province":3,"realstarttime":1506466429,"tagname":"","tagnames":"","tagids":[],"largepic":""}],"special":[{"wealthrank":10,"username":"黑瞎岛打鱼大叔.","pic":"https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_s.jpg","rid":"852531","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":13337,"honor":"","tagid":10,"uid":"73257411","sex":0,"goldAnchor":0,"zy":0,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":"1504956872","ltype":"1","sound":0,"alevel":"r1","isvideo":0,"videotype":"6","recordtype":2,"flvtitle":"v73257411-118598753","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/09/22/05/1010v1506028380976797437_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470257,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":"https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_l.jpg"},{"wealthrank":40,"username":"纪小纪，带你们吃西瓜","pic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478017696798397_s.jpg","rid":"6399","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":12750,"honor":"","tagid":7,"uid":"20018775","sex":"0","goldAnchor":0,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1312868685","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v20018775-118605413","secflvtitle":"v20018775-118605413_500","mgid":3,"pospic":"https://vi3.6rooms.com/live/2016/09/08/10/1010v1473302955040871003_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506477234,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":20,"username":"跟跟北京也钓鱼","pic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_s.jpg","rid":"739234","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":11878,"honor":"","tagid":10,"uid":"63394131","sex":1,"goldAnchor":0,"zy":0,"score":"4.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1469607446","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v63394131-118599095","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/05/22/07/1010v1495409708739271982_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470625,"tagname":"户外","tagnames":"户外","tagids":[2],"largepic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_l.jpg"},{"wealthrank":35,"username":"话社★小东北★","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506483284714059213_s.jpg","rid":"6807","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":9811,"honor":"","tagid":1014,"uid":"52600834","sex":1,"goldAnchor":0,"zy":0,"score":"9.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1421499639","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v52600834-118611449","secflvtitle":"v52600834-118611449_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2015/11/17/21/1010v1447768755981978820_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506483280,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":24,"username":"wuli黄豆豆啊~","pic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","rid":"740650","h264":"true","isRecommend":1,"ut":1,"rtype":"u1","count":8535,"honor":"10401,10801","tagid":7,"uid":"68616191","sex":0,"goldAnchor":1,"zy":0,"score":"11.00","isSproutingAnchor":0,"recscore":1,"anchorTm":"1470298394","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v68616191-118600691","secflvtitle":"v68616191-118600691_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg","tala":0,"talc":0,"province":12,"realstarttime":1506472580,"tagname":"颜值","tagnames":"舞秀,颜值","tagids":[1012,13],"largepic":""},{"wealthrank":36,"username":"奕露西ぁ代理","pic":"https://vi1.6rooms.com/live/2017/09/27/09/1007v1506474091590188255_s.jpg","rid":"199500","h264":"true","isRecommend":1,"ut":1,"rtype":"r10","count":5656,"honor":"","tagid":13,"uid":"35591044","sex":"0","goldAnchor":0,"zy":0,"score":"9.50","isSproutingAnchor":0,"recscore":1,"anchorTm":"1367588597","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v35591044-118602071","secflvtitle":"v35591044-118602071_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/02/21/16/1010v1487665078392978481_s.jpg","tala":0,"talc":0,"province":24,"realstarttime":1506474077,"tagname":"颜值","tagnames":"颜值","tagids":[13],"largepic":""}],"mlive":[{"wealthrank":10,"username":"黑瞎岛打鱼大叔.","pic":"https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_s.jpg","rid":"852531","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":13337,"honor":"","tagid":10,"uid":"73257411","sex":0,"goldAnchor":0,"zy":0,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":"1504956872","ltype":"1","sound":0,"alevel":"r1","isvideo":0,"videotype":"6","recordtype":2,"flvtitle":"v73257411-118598753","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/09/22/05/1010v1506028380976797437_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470257,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":"https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_l.jpg"},{"wealthrank":20,"username":"跟跟北京也钓鱼","pic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_s.jpg","rid":"739234","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":11878,"honor":"","tagid":10,"uid":"63394131","sex":1,"goldAnchor":0,"zy":0,"score":"4.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1469607446","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v63394131-118599095","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/05/22/07/1010v1495409708739271982_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470625,"tagname":"户外","tagnames":"户外","tagids":[2],"largepic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_l.jpg"},{"wealthrank":11,"username":"翠妹儿缅甸翡翠","pic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478928040070863_s.jpg","rid":"745750","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":3622,"honor":"","tagid":10,"uid":"64098027","sex":0,"goldAnchor":0,"zy":0,"score":"0.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1478068478","ltype":1,"sound":0,"alevel":"r4","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v64098027-118607147","secflvtitle":"","mgid":0,"pospic":"https://vi2.6rooms.com/live/2016/11/02/14/1010v1478068082034239622_s.jpg","tala":0,"talc":0,"province":25,"realstarttime":1506478913,"tagname":"有好货","tagnames":"有好货","tagids":[1007],"largepic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478928040070863_l.jpg"},{"wealthrank":10,"username":"小霞翡翠","pic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506477366898254778_s.jpg","rid":"758664","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":3286,"honor":"","tagid":10,"uid":"67708645","sex":0,"goldAnchor":0,"zy":0,"score":"0.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1480406050","ltype":"1","sound":0,"alevel":"r1","isvideo":0,"videotype":"6","recordtype":2,"flvtitle":"v67708645-118605545","secflvtitle":"","mgid":0,"tala":0,"talc":0,"province":25,"realstarttime":1506477359,"tagname":"有好货","tagnames":"有好货","tagids":[1007],"largepic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506477366898254778_l.jpg","pospic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506477366898254778_s.jpg"},{"wealthrank":17,"username":"独醉白雪，魔女","pic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506476007287745502_s.jpg","rid":"842479","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":3086,"honor":"","tagid":10,"uid":"68883589","sex":0,"goldAnchor":0,"zy":0,"score":"1.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1460980087","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":5,"recordtype":2,"flvtitle":"v68883589-118604123","secflvtitle":"","mgid":0,"pospic":"https://vi2.6rooms.com/live/2017/08/19/10/1010v1503110870928925512_s.jpg","tala":0,"talc":0,"province":22,"realstarttime":1506476001,"tagname":"","tagnames":"","tagids":[],"largepic":"https://vi2.6rooms.com/live/2017/09/27/09/1007v1506476007287745502_l.jpg"},{"wealthrank":5,"username":"阿玲翡翠","pic":"https://vi2.6rooms.com/live/2017/09/27/10/1007v1506479701615034739_s.jpg","rid":"756807","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":2952,"honor":"","tagid":10,"uid":"64768043","sex":0,"goldAnchor":0,"zy":0,"score":"0.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1479442323","ltype":1,"sound":0,"alevel":"r2","isvideo":0,"videotype":5,"recordtype":2,"flvtitle":"v64768043-118608005","secflvtitle":"","mgid":0,"tala":0,"talc":0,"province":25,"realstarttime":1506479691,"tagname":"有好货","tagnames":"有好货","tagids":[1007],"largepic":"https://vi2.6rooms.com/live/2017/09/27/10/1007v1506479701615034739_l.jpg","pospic":"https://vi2.6rooms.com/live/2017/09/27/10/1007v1506479701615034739_s.jpg"}],"male":[{"wealthrank":20,"username":"跟跟北京也钓鱼","pic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_s.jpg","rid":"739234","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":11878,"honor":"","tagid":10,"uid":"63394131","sex":1,"goldAnchor":0,"zy":0,"score":"4.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1469607446","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v63394131-118599095","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/05/22/07/1010v1495409708739271982_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506470625,"tagname":"户外","tagnames":"户外","tagids":[2],"largepic":"https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_l.jpg"},{"wealthrank":35,"username":"话社★小东北★","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506483284714059213_s.jpg","rid":"6807","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":9811,"honor":"","tagid":1014,"uid":"52600834","sex":1,"goldAnchor":0,"zy":0,"score":"9.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1421499639","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v52600834-118611449","secflvtitle":"v52600834-118611449_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2015/11/17/21/1010v1447768755981978820_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506483280,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":18,"username":"老三vs大脸vs细狗","pic":"https://vi3.6rooms.com/live/2017/09/27/11/1007v1506483669995484105_s.jpg","rid":"782561","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":4130,"honor":"","tagid":"2","uid":"75911449","sex":1,"goldAnchor":1,"zy":0,"score":"6.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1489389900","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v75911449-118611857","secflvtitle":"v75911449-118611857_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/07/19/17/1010v1500457432951816218_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506483658,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":""},{"wealthrank":22,"username":"海陆空主播云飛舞","pic":"https://vi3.6rooms.com/live/2017/09/27/10/1007v1506479361238157240_s.jpg","rid":"68568","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":3691,"honor":"","tagid":"2","uid":"58069298","sex":1,"goldAnchor":0,"zy":0,"score":"6.50","isSproutingAnchor":0,"recscore":0,"anchorTm":"1462774666","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v58069298-118607573","secflvtitle":"v58069298-118607573_500","mgid":0,"pospic":"https://vi1.6rooms.com/live/2017/08/14/14/1010v1502691081141456546_s.jpg","tala":0,"talc":0,"province":15,"realstarttime":1506479358,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":""},{"wealthrank":20,"username":"Mc维克多正在@你","pic":"https://vi1.6rooms.com/live/2017/09/27/11/1007v1506482664405638891_s.jpg","rid":"52345","h264":"true","isRecommend":1,"ut":1,"rtype":"u2","count":3582,"honor":"10301,10401","tagid":7,"uid":"22385461","sex":"1","goldAnchor":0,"zy":0,"score":"8.00","isSproutingAnchor":0,"recscore":0,"anchorTm":"1320224587","ltype":1,"sound":0,"alevel":"r10","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v22385461-118610849","secflvtitle":"v22385461-118610849_500","mgid":3,"pospic":"https://vi2.6rooms.com/live/2017/07/29/18/1010v1501323903202578461_s.jpg","tala":0,"talc":0,"province":8,"realstarttime":1506482658,"tagname":"名嘴","tagnames":"名嘴","tagids":[1014],"largepic":""},{"wealthrank":17,"username":"文哥恭喜好运荣升子爵","pic":"https://vi0.6rooms.com/live/2017/09/27/10/1007v1506479995743514805_s.jpg","rid":"818943","h264":"true","isRecommend":1,"ut":1,"rtype":"u3","count":2504,"honor":"","tagid":"2","uid":"53834223","sex":1,"goldAnchor":0,"zy":0,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":"1450442383","ltype":1,"sound":0,"alevel":"r5","isvideo":0,"videotype":1,"recordtype":1,"flvtitle":"v53834223-118608347","secflvtitle":"v53834223-118608347_500","mgid":0,"pospic":"https://vi2.6rooms.com/live/2016/06/27/16/1010v1467015566328647440_s.jpg","tala":0,"talc":0,"province":6,"realstarttime":1506479987,"tagname":"户外","tagnames":"户外","tagids":["2"],"largepic":""}]}
         * roomListRec : [{"wealthrank":0,"username":"犯二课堂","pic":"https://vi0.6rooms.com/live/2017/02/22/14/1010v1487744918814581153_s.jpg","rid":"217745641","h264":"true","isRecommend":0,"ut":1,"rtype":"zy","count":5858,"honor":"","tagid":"","uid":"61098736","picuser":"https://vi1.6rooms.com/live/2017/02/22/11/1003v1487735721098643553.jpg","sex":0,"goldAnchor":0,"zy":1,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":0,"ltype":1,"sound":0,"alevel":"r2","isvideo":4,"videotype":1,"recordtype":1,"flvtitle":"v61098736-118607663","secflvtitle":"v61098736-118607663_500","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/02/22/14/1010v1487744918814581153_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506479415,"tagids":[],"largepic":"","banpic":"https://vi0.6rooms.com/live/2017/02/22/11/1013v1487735108260620273.jpg","nbanpic":"https://vi0.6rooms.com/live/2017/02/22/11/1013v1487735129701861082.jpg","viewPicNormal":""},{"wealthrank":5,"username":"圆圆脸吃播","pic":"https://vi0.6rooms.com/live/2017/09/11/10/1010v1505096748338038225_s.jpg","rid":"226213455","h264":"true","isRecommend":0,"ut":1,"rtype":"zy","count":856,"honor":"","tagid":10,"uid":"75277624","picuser":"https://vi1.6rooms.com/live/2017/09/05/15/1003v1504597228635595023.jpg","sex":0,"goldAnchor":0,"zy":1,"score":0,"isSproutingAnchor":0,"recscore":0,"anchorTm":0,"ltype":1,"sound":0,"alevel":"r2","isvideo":0,"videotype":6,"recordtype":2,"flvtitle":"v75277624-118612757","secflvtitle":"","mgid":0,"pospic":"https://vi0.6rooms.com/live/2017/09/11/10/1010v1505096748338038225_s.jpg","tala":0,"talc":0,"province":"","realstarttime":1506484717,"tagname":"","tagnames":"","tagids":[],"largepic":"","banpic":"","nbanpic":"https://vi1.6rooms.com/live/2017/09/06/10/1013v1504664066152391888.jpg","viewPicNormal":""}]
         * roomListCount : {"u0":312,"u1":64,"u2":96,"u3":473,"r10":60,"r5":106,"r4":69,"r2":18,"r1":59,"video":0,"mlive":331,"lianmai":19,"male":59,"special":96,"allCount":970,"zy":3,"":3,"other":19}
         */

        private RoomListBean roomList;
        private RoomListCountBean roomListCount;
        private List<RoomListRecBean> roomListRec;

        public RoomListBean getRoomList() {
            return roomList;
        }

        public void setRoomList(RoomListBean roomList) {
            this.roomList = roomList;
        }

        public RoomListCountBean getRoomListCount() {
            return roomListCount;
        }

        public void setRoomListCount(RoomListCountBean roomListCount) {
            this.roomListCount = roomListCount;
        }

        public List<RoomListRecBean> getRoomListRec() {
            return roomListRec;
        }

        public void setRoomListRec(List<RoomListRecBean> roomListRec) {
            this.roomListRec = roomListRec;
        }

        public static class RoomListBean {
            private List<HeadlineBean> headline;
            private List<VrecomBean> vrecom;
            private List<U0Bean> u0;
            private List<U1Bean> u1;
            private List<U2Bean> u2;
            private List<U3Bean> u3;
            private List<SpecialBean> special;
            private List<MliveBean> mlive;
            private List<MaleBean> male;

            public List<HeadlineBean> getHeadline() {
                return headline;
            }

            public void setHeadline(List<HeadlineBean> headline) {
                this.headline = headline;
            }

            public List<VrecomBean> getVrecom() {
                return vrecom;
            }

            public void setVrecom(List<VrecomBean> vrecom) {
                this.vrecom = vrecom;
            }

            public List<U0Bean> getU0() {
                return u0;
            }

            public void setU0(List<U0Bean> u0) {
                this.u0 = u0;
            }

            public List<U1Bean> getU1() {
                return u1;
            }

            public void setU1(List<U1Bean> u1) {
                this.u1 = u1;
            }

            public List<U2Bean> getU2() {
                return u2;
            }

            public void setU2(List<U2Bean> u2) {
                this.u2 = u2;
            }

            public List<U3Bean> getU3() {
                return u3;
            }

            public void setU3(List<U3Bean> u3) {
                this.u3 = u3;
            }

            public List<SpecialBean> getSpecial() {
                return special;
            }

            public void setSpecial(List<SpecialBean> special) {
                this.special = special;
            }

            public List<MliveBean> getMlive() {
                return mlive;
            }

            public void setMlive(List<MliveBean> mlive) {
                this.mlive = mlive;
            }

            public List<MaleBean> getMale() {
                return male;
            }

            public void setMale(List<MaleBean> male) {
                this.male = male;
            }

            public static class HeadlineBean {
                /**
                 * wealthrank : 20
                 * username : 静心，嫦娥
                 * pic : https://vi1.6rooms.com/live/2017/09/27/10/1007v1506478271279853598_s.jpg
                 * rid : 759268
                 * h264 : true
                 * isRecommend : 1
                 * ut : 1
                 * rtype : r10
                 * count : 3138
                 * honor :
                 * tagid : 7
                 * uid : 61048909
                 * sex : 0
                 * goldAnchor : 1
                 * zy : 0
                 * score : 8.00
                 * isSproutingAnchor : 0
                 * recscore : 0
                 * anchorTm : 1480671051
                 * ltype : 1
                 * sound : 0
                 * alevel : r10
                 * isvideo : 0
                 * videotype : 1
                 * recordtype : 1
                 * flvtitle : v61048909-118606481
                 * secflvtitle : v61048909-118606481_500
                 * mgid : 3
                 * pospic : https://vi3.6rooms.com/live/2017/07/29/01/1010v1501261379138037740_s.jpg
                 * tala : 0
                 * talc : 0
                 * province : 5
                 * realstarttime : 1506478266
                 * tagname :
                 * tagnames :
                 * tagids : []
                 * largepic :
                 * daren : 1
                 */

                private int wealthrank;
                private String username;
                private String pic;
                private String rid;
                private String h264;
                private int isRecommend;
                private int ut;
                private String rtype;
                private int count;
                private String honor;
                private int tagid;
                private String uid;
                private int sex;
                private int goldAnchor;
                private int zy;
                private String score;
                private int isSproutingAnchor;
                private int recscore;
                private String anchorTm;
                private int ltype;
                private int sound;
                private String alevel;
                private int isvideo;
                private int videotype;
                private int recordtype;
                private String flvtitle;
                private String secflvtitle;
                private int mgid;
                private String pospic;
                private int tala;
                private int talc;
                private int province;
                private int realstarttime;
                private String tagname;
                private String tagnames;
                private String largepic;
                private int daren;
                private List<?> tagids;

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public String getH264() {
                    return h264;
                }

                public void setH264(String h264) {
                    this.h264 = h264;
                }

                public int getIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(int isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public int getUt() {
                    return ut;
                }

                public void setUt(int ut) {
                    this.ut = ut;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getHonor() {
                    return honor;
                }

                public void setHonor(String honor) {
                    this.honor = honor;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public int getGoldAnchor() {
                    return goldAnchor;
                }

                public void setGoldAnchor(int goldAnchor) {
                    this.goldAnchor = goldAnchor;
                }

                public int getZy() {
                    return zy;
                }

                public void setZy(int zy) {
                    this.zy = zy;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getIsSproutingAnchor() {
                    return isSproutingAnchor;
                }

                public void setIsSproutingAnchor(int isSproutingAnchor) {
                    this.isSproutingAnchor = isSproutingAnchor;
                }

                public int getRecscore() {
                    return recscore;
                }

                public void setRecscore(int recscore) {
                    this.recscore = recscore;
                }

                public String getAnchorTm() {
                    return anchorTm;
                }

                public void setAnchorTm(String anchorTm) {
                    this.anchorTm = anchorTm;
                }

                public int getLtype() {
                    return ltype;
                }

                public void setLtype(int ltype) {
                    this.ltype = ltype;
                }

                public int getSound() {
                    return sound;
                }

                public void setSound(int sound) {
                    this.sound = sound;
                }

                public String getAlevel() {
                    return alevel;
                }

                public void setAlevel(String alevel) {
                    this.alevel = alevel;
                }

                public int getIsvideo() {
                    return isvideo;
                }

                public void setIsvideo(int isvideo) {
                    this.isvideo = isvideo;
                }

                public int getVideotype() {
                    return videotype;
                }

                public void setVideotype(int videotype) {
                    this.videotype = videotype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public String getFlvtitle() {
                    return flvtitle;
                }

                public void setFlvtitle(String flvtitle) {
                    this.flvtitle = flvtitle;
                }

                public String getSecflvtitle() {
                    return secflvtitle;
                }

                public void setSecflvtitle(String secflvtitle) {
                    this.secflvtitle = secflvtitle;
                }

                public int getMgid() {
                    return mgid;
                }

                public void setMgid(int mgid) {
                    this.mgid = mgid;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public int getTala() {
                    return tala;
                }

                public void setTala(int tala) {
                    this.tala = tala;
                }

                public int getTalc() {
                    return talc;
                }

                public void setTalc(int talc) {
                    this.talc = talc;
                }

                public int getProvince() {
                    return province;
                }

                public void setProvince(int province) {
                    this.province = province;
                }

                public int getRealstarttime() {
                    return realstarttime;
                }

                public void setRealstarttime(int realstarttime) {
                    this.realstarttime = realstarttime;
                }

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public String getTagnames() {
                    return tagnames;
                }

                public void setTagnames(String tagnames) {
                    this.tagnames = tagnames;
                }

                public String getLargepic() {
                    return largepic;
                }

                public void setLargepic(String largepic) {
                    this.largepic = largepic;
                }

                public int getDaren() {
                    return daren;
                }

                public void setDaren(int daren) {
                    this.daren = daren;
                }

                public List<?> getTagids() {
                    return tagids;
                }

                public void setTagids(List<?> tagids) {
                    this.tagids = tagids;
                }
            }

            public static class VrecomBean {
                /**
                 * uid : 56381807
                 * alias : 你敢进来吗？
                 * rid : 57089
                 * count : 2711
                 * wealthrank : 30
                 * starttime : 46分前
                 * pospic : https://vi3.6rooms.com/live/2015/08/03/18/1010v1438596827595251365_s.jpg
                 * picuser : https://vi1.6rooms.com/live/2017/01/13/00/1003v1484237328735417855.jpg
                 * pic : https://vi0.6rooms.com/live/2017/09/27/11/1007v1506482332517778115_s.jpg
                 * rtype : r10
                 * recordtype : 1
                 * videotype : 1
                 */

                private String uid;
                private String alias;
                private String rid;
                private int count;
                private int wealthrank;
                private String starttime;
                private String pospic;
                private String picuser;
                private String pic;
                private String rtype;
                private int recordtype;
                private int videotype;

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getAlias() {
                    return alias;
                }

                public void setAlias(String alias) {
                    this.alias = alias;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getStarttime() {
                    return starttime;
                }

                public void setStarttime(String starttime) {
                    this.starttime = starttime;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public String getPicuser() {
                    return picuser;
                }

                public void setPicuser(String picuser) {
                    this.picuser = picuser;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public int getVideotype() {
                    return videotype;
                }

                public void setVideotype(int videotype) {
                    this.videotype = videotype;
                }
            }

            public static class U0Bean {
                /**
                 * wealthrank : 43
                 * username : 夏目&七
                 * pic : https://vi3.6rooms.com/live/2017/09/27/07/1007v1506470111614651294_s.jpg
                 * rid : 777
                 * h264 : true
                 * isRecommend : 1
                 * ut : 1
                 * rtype : r10
                 * count : 13453
                 * honor :
                 * tagid : 7
                 * uid : 45435986
                 * sex : 0
                 * goldAnchor : 0
                 * zy : 0
                 * score : 9.50
                 * isSproutingAnchor : 0
                 * recscore : 1
                 * anchorTm : 1400927960
                 * ltype : 1
                 * sound : 0
                 * alevel : r10
                 * isvideo : 0
                 * videotype : 1
                 * recordtype : 1
                 * flvtitle : v45435986-118598645
                 * secflvtitle : v45435986-118598645_500
                 * mgid : 3
                 * pospic : https://vi2.6rooms.com/live/2015/05/21/15/1010v1432194019277429787_s.jpg
                 * tala : 0
                 * talc : 0
                 * province : 2
                 * realstarttime : 1506470107
                 * tagname :
                 * tagnames :
                 * tagids : []
                 * largepic :
                 */

                private int wealthrank;
                private String username;
                private String pic;
                private String rid;
                private String h264;
                private int isRecommend;
                private int ut;
                private String rtype;
                private int count;
                private String honor;
                private int tagid;
                private String uid;
                private String sex;
                private int goldAnchor;
                private int zy;
                private String score;
                private int isSproutingAnchor;
                private int recscore;
                private String anchorTm;
                private int ltype;
                private int sound;
                private String alevel;
                private int isvideo;
                private int videotype;
                private int recordtype;
                private String flvtitle;
                private String secflvtitle;
                private int mgid;
                private String pospic;
                private int tala;
                private int talc;
                private int province;
                private int realstarttime;
                private String tagname;
                private String tagnames;
                private String largepic;
                private List<?> tagids;

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public String getH264() {
                    return h264;
                }

                public void setH264(String h264) {
                    this.h264 = h264;
                }

                public int getIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(int isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public int getUt() {
                    return ut;
                }

                public void setUt(int ut) {
                    this.ut = ut;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getHonor() {
                    return honor;
                }

                public void setHonor(String honor) {
                    this.honor = honor;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public int getGoldAnchor() {
                    return goldAnchor;
                }

                public void setGoldAnchor(int goldAnchor) {
                    this.goldAnchor = goldAnchor;
                }

                public int getZy() {
                    return zy;
                }

                public void setZy(int zy) {
                    this.zy = zy;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getIsSproutingAnchor() {
                    return isSproutingAnchor;
                }

                public void setIsSproutingAnchor(int isSproutingAnchor) {
                    this.isSproutingAnchor = isSproutingAnchor;
                }

                public int getRecscore() {
                    return recscore;
                }

                public void setRecscore(int recscore) {
                    this.recscore = recscore;
                }

                public String getAnchorTm() {
                    return anchorTm;
                }

                public void setAnchorTm(String anchorTm) {
                    this.anchorTm = anchorTm;
                }

                public int getLtype() {
                    return ltype;
                }

                public void setLtype(int ltype) {
                    this.ltype = ltype;
                }

                public int getSound() {
                    return sound;
                }

                public void setSound(int sound) {
                    this.sound = sound;
                }

                public String getAlevel() {
                    return alevel;
                }

                public void setAlevel(String alevel) {
                    this.alevel = alevel;
                }

                public int getIsvideo() {
                    return isvideo;
                }

                public void setIsvideo(int isvideo) {
                    this.isvideo = isvideo;
                }

                public int getVideotype() {
                    return videotype;
                }

                public void setVideotype(int videotype) {
                    this.videotype = videotype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public String getFlvtitle() {
                    return flvtitle;
                }

                public void setFlvtitle(String flvtitle) {
                    this.flvtitle = flvtitle;
                }

                public String getSecflvtitle() {
                    return secflvtitle;
                }

                public void setSecflvtitle(String secflvtitle) {
                    this.secflvtitle = secflvtitle;
                }

                public int getMgid() {
                    return mgid;
                }

                public void setMgid(int mgid) {
                    this.mgid = mgid;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public int getTala() {
                    return tala;
                }

                public void setTala(int tala) {
                    this.tala = tala;
                }

                public int getTalc() {
                    return talc;
                }

                public void setTalc(int talc) {
                    this.talc = talc;
                }

                public int getProvince() {
                    return province;
                }

                public void setProvince(int province) {
                    this.province = province;
                }

                public int getRealstarttime() {
                    return realstarttime;
                }

                public void setRealstarttime(int realstarttime) {
                    this.realstarttime = realstarttime;
                }

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public String getTagnames() {
                    return tagnames;
                }

                public void setTagnames(String tagnames) {
                    this.tagnames = tagnames;
                }

                public String getLargepic() {
                    return largepic;
                }

                public void setLargepic(String largepic) {
                    this.largepic = largepic;
                }

                public List<?> getTagids() {
                    return tagids;
                }

                public void setTagids(List<?> tagids) {
                    this.tagids = tagids;
                }
            }

            public static class U1Bean {
                /**
                 * wealthrank : 24
                 * username : wuli黄豆豆啊~
                 * pic : https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg
                 * rid : 740650
                 * h264 : true
                 * isRecommend : 1
                 * ut : 1
                 * rtype : u1
                 * count : 8535
                 * honor : 10401,10801
                 * tagid : 7
                 * uid : 68616191
                 * sex : 0
                 * goldAnchor : 1
                 * zy : 0
                 * score : 11.00
                 * isSproutingAnchor : 0
                 * recscore : 1
                 * anchorTm : 1470298394
                 * ltype : 1
                 * sound : 0
                 * alevel : r10
                 * isvideo : 0
                 * videotype : 1
                 * recordtype : 1
                 * flvtitle : v68616191-118600691
                 * secflvtitle : v68616191-118600691_500
                 * mgid : 3
                 * pospic : https://vi2.6rooms.com/live/2017/09/22/17/1010v1506072996732143246_s.jpg
                 * tala : 0
                 * talc : 0
                 * province : 12
                 * realstarttime : 1506472580
                 * tagname : 颜值
                 * tagnames : 舞秀,颜值
                 * tagids : [1012,13]
                 * largepic :
                 */

                private int wealthrank;
                private String username;
                private String pic;
                private String rid;
                private String h264;
                private int isRecommend;
                private int ut;
                private String rtype;
                private int count;
                private String honor;
                private int tagid;
                private String uid;
                private int sex;
                private int goldAnchor;
                private int zy;
                private String score;
                private int isSproutingAnchor;
                private int recscore;
                private String anchorTm;
                private int ltype;
                private int sound;
                private String alevel;
                private int isvideo;
                private int videotype;
                private int recordtype;
                private String flvtitle;
                private String secflvtitle;
                private int mgid;
                private String pospic;
                private int tala;
                private int talc;
                private int province;
                private int realstarttime;
                private String tagname;
                private String tagnames;
                private String largepic;
                private List<Integer> tagids;

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public String getH264() {
                    return h264;
                }

                public void setH264(String h264) {
                    this.h264 = h264;
                }

                public int getIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(int isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public int getUt() {
                    return ut;
                }

                public void setUt(int ut) {
                    this.ut = ut;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getHonor() {
                    return honor;
                }

                public void setHonor(String honor) {
                    this.honor = honor;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public int getGoldAnchor() {
                    return goldAnchor;
                }

                public void setGoldAnchor(int goldAnchor) {
                    this.goldAnchor = goldAnchor;
                }

                public int getZy() {
                    return zy;
                }

                public void setZy(int zy) {
                    this.zy = zy;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getIsSproutingAnchor() {
                    return isSproutingAnchor;
                }

                public void setIsSproutingAnchor(int isSproutingAnchor) {
                    this.isSproutingAnchor = isSproutingAnchor;
                }

                public int getRecscore() {
                    return recscore;
                }

                public void setRecscore(int recscore) {
                    this.recscore = recscore;
                }

                public String getAnchorTm() {
                    return anchorTm;
                }

                public void setAnchorTm(String anchorTm) {
                    this.anchorTm = anchorTm;
                }

                public int getLtype() {
                    return ltype;
                }

                public void setLtype(int ltype) {
                    this.ltype = ltype;
                }

                public int getSound() {
                    return sound;
                }

                public void setSound(int sound) {
                    this.sound = sound;
                }

                public String getAlevel() {
                    return alevel;
                }

                public void setAlevel(String alevel) {
                    this.alevel = alevel;
                }

                public int getIsvideo() {
                    return isvideo;
                }

                public void setIsvideo(int isvideo) {
                    this.isvideo = isvideo;
                }

                public int getVideotype() {
                    return videotype;
                }

                public void setVideotype(int videotype) {
                    this.videotype = videotype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public String getFlvtitle() {
                    return flvtitle;
                }

                public void setFlvtitle(String flvtitle) {
                    this.flvtitle = flvtitle;
                }

                public String getSecflvtitle() {
                    return secflvtitle;
                }

                public void setSecflvtitle(String secflvtitle) {
                    this.secflvtitle = secflvtitle;
                }

                public int getMgid() {
                    return mgid;
                }

                public void setMgid(int mgid) {
                    this.mgid = mgid;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public int getTala() {
                    return tala;
                }

                public void setTala(int tala) {
                    this.tala = tala;
                }

                public int getTalc() {
                    return talc;
                }

                public void setTalc(int talc) {
                    this.talc = talc;
                }

                public int getProvince() {
                    return province;
                }

                public void setProvince(int province) {
                    this.province = province;
                }

                public int getRealstarttime() {
                    return realstarttime;
                }

                public void setRealstarttime(int realstarttime) {
                    this.realstarttime = realstarttime;
                }

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public String getTagnames() {
                    return tagnames;
                }

                public void setTagnames(String tagnames) {
                    this.tagnames = tagnames;
                }

                public String getLargepic() {
                    return largepic;
                }

                public void setLargepic(String largepic) {
                    this.largepic = largepic;
                }

                public List<Integer> getTagids() {
                    return tagids;
                }

                public void setTagids(List<Integer> tagids) {
                    this.tagids = tagids;
                }
            }

            public static class U2Bean {
                /**
                 * wealthrank : 40
                 * username : 纪小纪，带你们吃西瓜
                 * pic : https://vi0.6rooms.com/live/2017/09/27/10/1007v1506478017696798397_s.jpg
                 * rid : 6399
                 * h264 : true
                 * isRecommend : 1
                 * ut : 1
                 * rtype : u2
                 * count : 12750
                 * honor :
                 * tagid : 7
                 * uid : 20018775
                 * sex : 0
                 * goldAnchor : 0
                 * zy : 0
                 * score : 11.00
                 * isSproutingAnchor : 0
                 * recscore : 0
                 * anchorTm : 1312868685
                 * ltype : 1
                 * sound : 0
                 * alevel : r10
                 * isvideo : 0
                 * videotype : 1
                 * recordtype : 1
                 * flvtitle : v20018775-118605413
                 * secflvtitle : v20018775-118605413_500
                 * mgid : 3
                 * pospic : https://vi3.6rooms.com/live/2016/09/08/10/1010v1473302955040871003_s.jpg
                 * tala : 0
                 * talc : 0
                 * province :
                 * realstarttime : 1506477234
                 * tagname : 名嘴
                 * tagnames : 名嘴
                 * tagids : [1014]
                 * largepic :
                 */

                private int wealthrank;
                private String username;
                private String pic;
                private String rid;
                private String h264;
                private int isRecommend;
                private int ut;
                private String rtype;
                private int count;
                private String honor;
                private int tagid;
                private String uid;
                private String sex;
                private int goldAnchor;
                private int zy;
                private String score;
                private int isSproutingAnchor;
                private int recscore;
                private String anchorTm;
                private int ltype;
                private int sound;
                private String alevel;
                private int isvideo;
                private int videotype;
                private int recordtype;
                private String flvtitle;
                private String secflvtitle;
                private int mgid;
                private String pospic;
                private int tala;
                private int talc;
                private String province;
                private int realstarttime;
                private String tagname;
                private String tagnames;
                private String largepic;
                private List<Integer> tagids;

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public String getH264() {
                    return h264;
                }

                public void setH264(String h264) {
                    this.h264 = h264;
                }

                public int getIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(int isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public int getUt() {
                    return ut;
                }

                public void setUt(int ut) {
                    this.ut = ut;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getHonor() {
                    return honor;
                }

                public void setHonor(String honor) {
                    this.honor = honor;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public int getGoldAnchor() {
                    return goldAnchor;
                }

                public void setGoldAnchor(int goldAnchor) {
                    this.goldAnchor = goldAnchor;
                }

                public int getZy() {
                    return zy;
                }

                public void setZy(int zy) {
                    this.zy = zy;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getIsSproutingAnchor() {
                    return isSproutingAnchor;
                }

                public void setIsSproutingAnchor(int isSproutingAnchor) {
                    this.isSproutingAnchor = isSproutingAnchor;
                }

                public int getRecscore() {
                    return recscore;
                }

                public void setRecscore(int recscore) {
                    this.recscore = recscore;
                }

                public String getAnchorTm() {
                    return anchorTm;
                }

                public void setAnchorTm(String anchorTm) {
                    this.anchorTm = anchorTm;
                }

                public int getLtype() {
                    return ltype;
                }

                public void setLtype(int ltype) {
                    this.ltype = ltype;
                }

                public int getSound() {
                    return sound;
                }

                public void setSound(int sound) {
                    this.sound = sound;
                }

                public String getAlevel() {
                    return alevel;
                }

                public void setAlevel(String alevel) {
                    this.alevel = alevel;
                }

                public int getIsvideo() {
                    return isvideo;
                }

                public void setIsvideo(int isvideo) {
                    this.isvideo = isvideo;
                }

                public int getVideotype() {
                    return videotype;
                }

                public void setVideotype(int videotype) {
                    this.videotype = videotype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public String getFlvtitle() {
                    return flvtitle;
                }

                public void setFlvtitle(String flvtitle) {
                    this.flvtitle = flvtitle;
                }

                public String getSecflvtitle() {
                    return secflvtitle;
                }

                public void setSecflvtitle(String secflvtitle) {
                    this.secflvtitle = secflvtitle;
                }

                public int getMgid() {
                    return mgid;
                }

                public void setMgid(int mgid) {
                    this.mgid = mgid;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public int getTala() {
                    return tala;
                }

                public void setTala(int tala) {
                    this.tala = tala;
                }

                public int getTalc() {
                    return talc;
                }

                public void setTalc(int talc) {
                    this.talc = talc;
                }

                public String getProvince() {
                    return province;
                }

                public void setProvince(String province) {
                    this.province = province;
                }

                public int getRealstarttime() {
                    return realstarttime;
                }

                public void setRealstarttime(int realstarttime) {
                    this.realstarttime = realstarttime;
                }

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public String getTagnames() {
                    return tagnames;
                }

                public void setTagnames(String tagnames) {
                    this.tagnames = tagnames;
                }

                public String getLargepic() {
                    return largepic;
                }

                public void setLargepic(String largepic) {
                    this.largepic = largepic;
                }

                public List<Integer> getTagids() {
                    return tagids;
                }

                public void setTagids(List<Integer> tagids) {
                    this.tagids = tagids;
                }
            }

            public static class U3Bean {
                /**
                 * wealthrank : 36
                 * username : 奕露西ぁ代理
                 * pic : https://vi1.6rooms.com/live/2017/09/27/09/1007v1506474091590188255_s.jpg
                 * rid : 199500
                 * h264 : true
                 * isRecommend : 1
                 * ut : 1
                 * rtype : r10
                 * count : 5656
                 * honor :
                 * tagid : 13
                 * uid : 35591044
                 * sex : 0
                 * goldAnchor : 0
                 * zy : 0
                 * score : 9.50
                 * isSproutingAnchor : 0
                 * recscore : 1
                 * anchorTm : 1367588597
                 * ltype : 1
                 * sound : 0
                 * alevel : r10
                 * isvideo : 0
                 * videotype : 1
                 * recordtype : 1
                 * flvtitle : v35591044-118602071
                 * secflvtitle : v35591044-118602071_500
                 * mgid : 0
                 * pospic : https://vi1.6rooms.com/live/2017/02/21/16/1010v1487665078392978481_s.jpg
                 * tala : 0
                 * talc : 0
                 * province : 24
                 * realstarttime : 1506474077
                 * tagname : 颜值
                 * tagnames : 颜值
                 * tagids : [13]
                 * largepic :
                 */

                private int wealthrank;
                private String username;
                private String pic;
                private String rid;
                private String h264;
                private int isRecommend;
                private int ut;
                private String rtype;
                private int count;
                private String honor;
                private int tagid;
                private String uid;
                private String sex;
                private int goldAnchor;
                private int zy;
                private String score;
                private int isSproutingAnchor;
                private int recscore;
                private String anchorTm;
                private int ltype;
                private int sound;
                private String alevel;
                private int isvideo;
                private int videotype;
                private int recordtype;
                private String flvtitle;
                private String secflvtitle;
                private int mgid;
                private String pospic;
                private int tala;
                private int talc;
                private int province;
                private int realstarttime;
                private String tagname;
                private String tagnames;
                private String largepic;
                private List<Integer> tagids;

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public String getH264() {
                    return h264;
                }

                public void setH264(String h264) {
                    this.h264 = h264;
                }

                public int getIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(int isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public int getUt() {
                    return ut;
                }

                public void setUt(int ut) {
                    this.ut = ut;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getHonor() {
                    return honor;
                }

                public void setHonor(String honor) {
                    this.honor = honor;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public String getSex() {
                    return sex;
                }

                public void setSex(String sex) {
                    this.sex = sex;
                }

                public int getGoldAnchor() {
                    return goldAnchor;
                }

                public void setGoldAnchor(int goldAnchor) {
                    this.goldAnchor = goldAnchor;
                }

                public int getZy() {
                    return zy;
                }

                public void setZy(int zy) {
                    this.zy = zy;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getIsSproutingAnchor() {
                    return isSproutingAnchor;
                }

                public void setIsSproutingAnchor(int isSproutingAnchor) {
                    this.isSproutingAnchor = isSproutingAnchor;
                }

                public int getRecscore() {
                    return recscore;
                }

                public void setRecscore(int recscore) {
                    this.recscore = recscore;
                }

                public String getAnchorTm() {
                    return anchorTm;
                }

                public void setAnchorTm(String anchorTm) {
                    this.anchorTm = anchorTm;
                }

                public int getLtype() {
                    return ltype;
                }

                public void setLtype(int ltype) {
                    this.ltype = ltype;
                }

                public int getSound() {
                    return sound;
                }

                public void setSound(int sound) {
                    this.sound = sound;
                }

                public String getAlevel() {
                    return alevel;
                }

                public void setAlevel(String alevel) {
                    this.alevel = alevel;
                }

                public int getIsvideo() {
                    return isvideo;
                }

                public void setIsvideo(int isvideo) {
                    this.isvideo = isvideo;
                }

                public int getVideotype() {
                    return videotype;
                }

                public void setVideotype(int videotype) {
                    this.videotype = videotype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public String getFlvtitle() {
                    return flvtitle;
                }

                public void setFlvtitle(String flvtitle) {
                    this.flvtitle = flvtitle;
                }

                public String getSecflvtitle() {
                    return secflvtitle;
                }

                public void setSecflvtitle(String secflvtitle) {
                    this.secflvtitle = secflvtitle;
                }

                public int getMgid() {
                    return mgid;
                }

                public void setMgid(int mgid) {
                    this.mgid = mgid;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public int getTala() {
                    return tala;
                }

                public void setTala(int tala) {
                    this.tala = tala;
                }

                public int getTalc() {
                    return talc;
                }

                public void setTalc(int talc) {
                    this.talc = talc;
                }

                public int getProvince() {
                    return province;
                }

                public void setProvince(int province) {
                    this.province = province;
                }

                public int getRealstarttime() {
                    return realstarttime;
                }

                public void setRealstarttime(int realstarttime) {
                    this.realstarttime = realstarttime;
                }

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public String getTagnames() {
                    return tagnames;
                }

                public void setTagnames(String tagnames) {
                    this.tagnames = tagnames;
                }

                public String getLargepic() {
                    return largepic;
                }

                public void setLargepic(String largepic) {
                    this.largepic = largepic;
                }

                public List<Integer> getTagids() {
                    return tagids;
                }

                public void setTagids(List<Integer> tagids) {
                    this.tagids = tagids;
                }
            }

            public static class SpecialBean {
                /**
                 * wealthrank : 10
                 * username : 黑瞎岛打鱼大叔.
                 * pic : https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_s.jpg
                 * rid : 852531
                 * h264 : true
                 * isRecommend : 1
                 * ut : 1
                 * rtype : u3
                 * count : 13337
                 * honor :
                 * tagid : 10
                 * uid : 73257411
                 * sex : 0
                 * goldAnchor : 0
                 * zy : 0
                 * score : 0
                 * isSproutingAnchor : 0
                 * recscore : 0
                 * anchorTm : 1504956872
                 * ltype : 1
                 * sound : 0
                 * alevel : r1
                 * isvideo : 0
                 * videotype : 6
                 * recordtype : 2
                 * flvtitle : v73257411-118598753
                 * secflvtitle :
                 * mgid : 0
                 * pospic : https://vi0.6rooms.com/live/2017/09/22/05/1010v1506028380976797437_s.jpg
                 * tala : 0
                 * talc : 0
                 * province : 8
                 * realstarttime : 1506470257
                 * tagname : 户外
                 * tagnames : 户外
                 * tagids : ["2"]
                 * largepic : https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_l.jpg
                 */

                private int wealthrank;
                private String username;
                private String pic;
                private String rid;
                private String h264;
                private int isRecommend;
                private int ut;
                private String rtype;
                private int count;
                private String honor;
                private int tagid;
                private String uid;
                private int sex;
                private int goldAnchor;
                private int zy;
                private int score;
                private int isSproutingAnchor;
                private int recscore;
                private String anchorTm;
                private String ltype;
                private int sound;
                private String alevel;
                private int isvideo;
                private String videotype;
                private int recordtype;
                private String flvtitle;
                private String secflvtitle;
                private int mgid;
                private String pospic;
                private int tala;
                private int talc;
                private int province;
                private int realstarttime;
                private String tagname;
                private String tagnames;
                private String largepic;
                private List<String> tagids;

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public String getH264() {
                    return h264;
                }

                public void setH264(String h264) {
                    this.h264 = h264;
                }

                public int getIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(int isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public int getUt() {
                    return ut;
                }

                public void setUt(int ut) {
                    this.ut = ut;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getHonor() {
                    return honor;
                }

                public void setHonor(String honor) {
                    this.honor = honor;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public int getGoldAnchor() {
                    return goldAnchor;
                }

                public void setGoldAnchor(int goldAnchor) {
                    this.goldAnchor = goldAnchor;
                }

                public int getZy() {
                    return zy;
                }

                public void setZy(int zy) {
                    this.zy = zy;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public int getIsSproutingAnchor() {
                    return isSproutingAnchor;
                }

                public void setIsSproutingAnchor(int isSproutingAnchor) {
                    this.isSproutingAnchor = isSproutingAnchor;
                }

                public int getRecscore() {
                    return recscore;
                }

                public void setRecscore(int recscore) {
                    this.recscore = recscore;
                }

                public String getAnchorTm() {
                    return anchorTm;
                }

                public void setAnchorTm(String anchorTm) {
                    this.anchorTm = anchorTm;
                }

                public String getLtype() {
                    return ltype;
                }

                public void setLtype(String ltype) {
                    this.ltype = ltype;
                }

                public int getSound() {
                    return sound;
                }

                public void setSound(int sound) {
                    this.sound = sound;
                }

                public String getAlevel() {
                    return alevel;
                }

                public void setAlevel(String alevel) {
                    this.alevel = alevel;
                }

                public int getIsvideo() {
                    return isvideo;
                }

                public void setIsvideo(int isvideo) {
                    this.isvideo = isvideo;
                }

                public String getVideotype() {
                    return videotype;
                }

                public void setVideotype(String videotype) {
                    this.videotype = videotype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public String getFlvtitle() {
                    return flvtitle;
                }

                public void setFlvtitle(String flvtitle) {
                    this.flvtitle = flvtitle;
                }

                public String getSecflvtitle() {
                    return secflvtitle;
                }

                public void setSecflvtitle(String secflvtitle) {
                    this.secflvtitle = secflvtitle;
                }

                public int getMgid() {
                    return mgid;
                }

                public void setMgid(int mgid) {
                    this.mgid = mgid;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public int getTala() {
                    return tala;
                }

                public void setTala(int tala) {
                    this.tala = tala;
                }

                public int getTalc() {
                    return talc;
                }

                public void setTalc(int talc) {
                    this.talc = talc;
                }

                public int getProvince() {
                    return province;
                }

                public void setProvince(int province) {
                    this.province = province;
                }

                public int getRealstarttime() {
                    return realstarttime;
                }

                public void setRealstarttime(int realstarttime) {
                    this.realstarttime = realstarttime;
                }

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public String getTagnames() {
                    return tagnames;
                }

                public void setTagnames(String tagnames) {
                    this.tagnames = tagnames;
                }

                public String getLargepic() {
                    return largepic;
                }

                public void setLargepic(String largepic) {
                    this.largepic = largepic;
                }

                public List<String> getTagids() {
                    return tagids;
                }

                public void setTagids(List<String> tagids) {
                    this.tagids = tagids;
                }
            }

            public static class MliveBean {
                /**
                 * wealthrank : 10
                 * username : 黑瞎岛打鱼大叔.
                 * pic : https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_s.jpg
                 * rid : 852531
                 * h264 : true
                 * isRecommend : 1
                 * ut : 1
                 * rtype : u3
                 * count : 13337
                 * honor :
                 * tagid : 10
                 * uid : 73257411
                 * sex : 0
                 * goldAnchor : 0
                 * zy : 0
                 * score : 0
                 * isSproutingAnchor : 0
                 * recscore : 0
                 * anchorTm : 1504956872
                 * ltype : 1
                 * sound : 0
                 * alevel : r1
                 * isvideo : 0
                 * videotype : 6
                 * recordtype : 2
                 * flvtitle : v73257411-118598753
                 * secflvtitle :
                 * mgid : 0
                 * pospic : https://vi0.6rooms.com/live/2017/09/22/05/1010v1506028380976797437_s.jpg
                 * tala : 0
                 * talc : 0
                 * province : 8
                 * realstarttime : 1506470257
                 * tagname : 户外
                 * tagnames : 户外
                 * tagids : ["2"]
                 * largepic : https://vi2.6rooms.com/live/2017/09/27/07/1007v1506470269496095556_l.jpg
                 */

                private int wealthrank;
                private String username;
                private String pic;
                private String rid;
                private String h264;
                private int isRecommend;
                private int ut;
                private String rtype;
                private int count;
                private String honor;
                private int tagid;
                private String uid;
                private int sex;
                private int goldAnchor;
                private int zy;
                private int score;
                private int isSproutingAnchor;
                private int recscore;
                private String anchorTm;
                private String ltype;
                private int sound;
                private String alevel;
                private int isvideo;
                private String videotype;
                private int recordtype;
                private String flvtitle;
                private String secflvtitle;
                private int mgid;
                private String pospic;
                private int tala;
                private int talc;
                private int province;
                private int realstarttime;
                private String tagname;
                private String tagnames;
                private String largepic;
                private List<String> tagids;

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public String getH264() {
                    return h264;
                }

                public void setH264(String h264) {
                    this.h264 = h264;
                }

                public int getIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(int isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public int getUt() {
                    return ut;
                }

                public void setUt(int ut) {
                    this.ut = ut;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getHonor() {
                    return honor;
                }

                public void setHonor(String honor) {
                    this.honor = honor;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public int getGoldAnchor() {
                    return goldAnchor;
                }

                public void setGoldAnchor(int goldAnchor) {
                    this.goldAnchor = goldAnchor;
                }

                public int getZy() {
                    return zy;
                }

                public void setZy(int zy) {
                    this.zy = zy;
                }

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public int getIsSproutingAnchor() {
                    return isSproutingAnchor;
                }

                public void setIsSproutingAnchor(int isSproutingAnchor) {
                    this.isSproutingAnchor = isSproutingAnchor;
                }

                public int getRecscore() {
                    return recscore;
                }

                public void setRecscore(int recscore) {
                    this.recscore = recscore;
                }

                public String getAnchorTm() {
                    return anchorTm;
                }

                public void setAnchorTm(String anchorTm) {
                    this.anchorTm = anchorTm;
                }

                public String getLtype() {
                    return ltype;
                }

                public void setLtype(String ltype) {
                    this.ltype = ltype;
                }

                public int getSound() {
                    return sound;
                }

                public void setSound(int sound) {
                    this.sound = sound;
                }

                public String getAlevel() {
                    return alevel;
                }

                public void setAlevel(String alevel) {
                    this.alevel = alevel;
                }

                public int getIsvideo() {
                    return isvideo;
                }

                public void setIsvideo(int isvideo) {
                    this.isvideo = isvideo;
                }

                public String getVideotype() {
                    return videotype;
                }

                public void setVideotype(String videotype) {
                    this.videotype = videotype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public String getFlvtitle() {
                    return flvtitle;
                }

                public void setFlvtitle(String flvtitle) {
                    this.flvtitle = flvtitle;
                }

                public String getSecflvtitle() {
                    return secflvtitle;
                }

                public void setSecflvtitle(String secflvtitle) {
                    this.secflvtitle = secflvtitle;
                }

                public int getMgid() {
                    return mgid;
                }

                public void setMgid(int mgid) {
                    this.mgid = mgid;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public int getTala() {
                    return tala;
                }

                public void setTala(int tala) {
                    this.tala = tala;
                }

                public int getTalc() {
                    return talc;
                }

                public void setTalc(int talc) {
                    this.talc = talc;
                }

                public int getProvince() {
                    return province;
                }

                public void setProvince(int province) {
                    this.province = province;
                }

                public int getRealstarttime() {
                    return realstarttime;
                }

                public void setRealstarttime(int realstarttime) {
                    this.realstarttime = realstarttime;
                }

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public String getTagnames() {
                    return tagnames;
                }

                public void setTagnames(String tagnames) {
                    this.tagnames = tagnames;
                }

                public String getLargepic() {
                    return largepic;
                }

                public void setLargepic(String largepic) {
                    this.largepic = largepic;
                }

                public List<String> getTagids() {
                    return tagids;
                }

                public void setTagids(List<String> tagids) {
                    this.tagids = tagids;
                }
            }

            public static class MaleBean {
                /**
                 * wealthrank : 20
                 * username : 跟跟北京也钓鱼
                 * pic : https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_s.jpg
                 * rid : 739234
                 * h264 : true
                 * isRecommend : 1
                 * ut : 1
                 * rtype : u3
                 * count : 11878
                 * honor :
                 * tagid : 10
                 * uid : 63394131
                 * sex : 1
                 * goldAnchor : 0
                 * zy : 0
                 * score : 4.00
                 * isSproutingAnchor : 0
                 * recscore : 0
                 * anchorTm : 1469607446
                 * ltype : 1
                 * sound : 0
                 * alevel : r10
                 * isvideo : 0
                 * videotype : 6
                 * recordtype : 2
                 * flvtitle : v63394131-118599095
                 * secflvtitle :
                 * mgid : 0
                 * pospic : https://vi0.6rooms.com/live/2017/05/22/07/1010v1495409708739271982_s.jpg
                 * tala : 0
                 * talc : 0
                 * province : 8
                 * realstarttime : 1506470625
                 * tagname : 户外
                 * tagnames : 户外
                 * tagids : [2]
                 * largepic : https://vi1.6rooms.com/live/2017/09/27/08/1007v1506470634735071797_l.jpg
                 */

                private int wealthrank;
                private String username;
                private String pic;
                private String rid;
                private String h264;
                private int isRecommend;
                private int ut;
                private String rtype;
                private int count;
                private String honor;
                private int tagid;
                private String uid;
                private int sex;
                private int goldAnchor;
                private int zy;
                private String score;
                private int isSproutingAnchor;
                private int recscore;
                private String anchorTm;
                private int ltype;
                private int sound;
                private String alevel;
                private int isvideo;
                private int videotype;
                private int recordtype;
                private String flvtitle;
                private String secflvtitle;
                private int mgid;
                private String pospic;
                private int tala;
                private int talc;
                private int province;
                private int realstarttime;
                private String tagname;
                private String tagnames;
                private String largepic;
                private List<Integer> tagids;

                public int getWealthrank() {
                    return wealthrank;
                }

                public void setWealthrank(int wealthrank) {
                    this.wealthrank = wealthrank;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getRid() {
                    return rid;
                }

                public void setRid(String rid) {
                    this.rid = rid;
                }

                public String getH264() {
                    return h264;
                }

                public void setH264(String h264) {
                    this.h264 = h264;
                }

                public int getIsRecommend() {
                    return isRecommend;
                }

                public void setIsRecommend(int isRecommend) {
                    this.isRecommend = isRecommend;
                }

                public int getUt() {
                    return ut;
                }

                public void setUt(int ut) {
                    this.ut = ut;
                }

                public String getRtype() {
                    return rtype;
                }

                public void setRtype(String rtype) {
                    this.rtype = rtype;
                }

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getHonor() {
                    return honor;
                }

                public void setHonor(String honor) {
                    this.honor = honor;
                }

                public int getTagid() {
                    return tagid;
                }

                public void setTagid(int tagid) {
                    this.tagid = tagid;
                }

                public String getUid() {
                    return uid;
                }

                public void setUid(String uid) {
                    this.uid = uid;
                }

                public int getSex() {
                    return sex;
                }

                public void setSex(int sex) {
                    this.sex = sex;
                }

                public int getGoldAnchor() {
                    return goldAnchor;
                }

                public void setGoldAnchor(int goldAnchor) {
                    this.goldAnchor = goldAnchor;
                }

                public int getZy() {
                    return zy;
                }

                public void setZy(int zy) {
                    this.zy = zy;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public int getIsSproutingAnchor() {
                    return isSproutingAnchor;
                }

                public void setIsSproutingAnchor(int isSproutingAnchor) {
                    this.isSproutingAnchor = isSproutingAnchor;
                }

                public int getRecscore() {
                    return recscore;
                }

                public void setRecscore(int recscore) {
                    this.recscore = recscore;
                }

                public String getAnchorTm() {
                    return anchorTm;
                }

                public void setAnchorTm(String anchorTm) {
                    this.anchorTm = anchorTm;
                }

                public int getLtype() {
                    return ltype;
                }

                public void setLtype(int ltype) {
                    this.ltype = ltype;
                }

                public int getSound() {
                    return sound;
                }

                public void setSound(int sound) {
                    this.sound = sound;
                }

                public String getAlevel() {
                    return alevel;
                }

                public void setAlevel(String alevel) {
                    this.alevel = alevel;
                }

                public int getIsvideo() {
                    return isvideo;
                }

                public void setIsvideo(int isvideo) {
                    this.isvideo = isvideo;
                }

                public int getVideotype() {
                    return videotype;
                }

                public void setVideotype(int videotype) {
                    this.videotype = videotype;
                }

                public int getRecordtype() {
                    return recordtype;
                }

                public void setRecordtype(int recordtype) {
                    this.recordtype = recordtype;
                }

                public String getFlvtitle() {
                    return flvtitle;
                }

                public void setFlvtitle(String flvtitle) {
                    this.flvtitle = flvtitle;
                }

                public String getSecflvtitle() {
                    return secflvtitle;
                }

                public void setSecflvtitle(String secflvtitle) {
                    this.secflvtitle = secflvtitle;
                }

                public int getMgid() {
                    return mgid;
                }

                public void setMgid(int mgid) {
                    this.mgid = mgid;
                }

                public String getPospic() {
                    return pospic;
                }

                public void setPospic(String pospic) {
                    this.pospic = pospic;
                }

                public int getTala() {
                    return tala;
                }

                public void setTala(int tala) {
                    this.tala = tala;
                }

                public int getTalc() {
                    return talc;
                }

                public void setTalc(int talc) {
                    this.talc = talc;
                }

                public int getProvince() {
                    return province;
                }

                public void setProvince(int province) {
                    this.province = province;
                }

                public int getRealstarttime() {
                    return realstarttime;
                }

                public void setRealstarttime(int realstarttime) {
                    this.realstarttime = realstarttime;
                }

                public String getTagname() {
                    return tagname;
                }

                public void setTagname(String tagname) {
                    this.tagname = tagname;
                }

                public String getTagnames() {
                    return tagnames;
                }

                public void setTagnames(String tagnames) {
                    this.tagnames = tagnames;
                }

                public String getLargepic() {
                    return largepic;
                }

                public void setLargepic(String largepic) {
                    this.largepic = largepic;
                }

                public List<Integer> getTagids() {
                    return tagids;
                }

                public void setTagids(List<Integer> tagids) {
                    this.tagids = tagids;
                }
            }
        }

        public static class RoomListCountBean {
            /**
             * u0 : 312
             * u1 : 64
             * u2 : 96
             * u3 : 473
             * r10 : 60
             * r5 : 106
             * r4 : 69
             * r2 : 18
             * r1 : 59
             * video : 0
             * mlive : 331
             * lianmai : 19
             * male : 59
             * special : 96
             * allCount : 970
             * zy : 3
             *  : 3
             * other : 19
             */

            private int u0;
            private int u1;
            private int u2;
            private int u3;
            private int r10;
            private int r5;
            private int r4;
            private int r2;
            private int r1;
            private int video;
            private int mlive;
            private int lianmai;
            private int male;
            private int special;
            private int allCount;
            private int zy;
            @SerializedName("")
            private int _$215; // FIXME check this code
            private int other;

            public int getU0() {
                return u0;
            }

            public void setU0(int u0) {
                this.u0 = u0;
            }

            public int getU1() {
                return u1;
            }

            public void setU1(int u1) {
                this.u1 = u1;
            }

            public int getU2() {
                return u2;
            }

            public void setU2(int u2) {
                this.u2 = u2;
            }

            public int getU3() {
                return u3;
            }

            public void setU3(int u3) {
                this.u3 = u3;
            }

            public int getR10() {
                return r10;
            }

            public void setR10(int r10) {
                this.r10 = r10;
            }

            public int getR5() {
                return r5;
            }

            public void setR5(int r5) {
                this.r5 = r5;
            }

            public int getR4() {
                return r4;
            }

            public void setR4(int r4) {
                this.r4 = r4;
            }

            public int getR2() {
                return r2;
            }

            public void setR2(int r2) {
                this.r2 = r2;
            }

            public int getR1() {
                return r1;
            }

            public void setR1(int r1) {
                this.r1 = r1;
            }

            public int getVideo() {
                return video;
            }

            public void setVideo(int video) {
                this.video = video;
            }

            public int getMlive() {
                return mlive;
            }

            public void setMlive(int mlive) {
                this.mlive = mlive;
            }

            public int getLianmai() {
                return lianmai;
            }

            public void setLianmai(int lianmai) {
                this.lianmai = lianmai;
            }

            public int getMale() {
                return male;
            }

            public void setMale(int male) {
                this.male = male;
            }

            public int getSpecial() {
                return special;
            }

            public void setSpecial(int special) {
                this.special = special;
            }

            public int getAllCount() {
                return allCount;
            }

            public void setAllCount(int allCount) {
                this.allCount = allCount;
            }

            public int getZy() {
                return zy;
            }

            public void setZy(int zy) {
                this.zy = zy;
            }

            public int get_$215() {
                return _$215;
            }

            public void set_$215(int _$215) {
                this._$215 = _$215;
            }

            public int getOther() {
                return other;
            }

            public void setOther(int other) {
                this.other = other;
            }
        }

        public static class RoomListRecBean {
            /**
             * wealthrank : 0
             * username : 犯二课堂
             * pic : https://vi0.6rooms.com/live/2017/02/22/14/1010v1487744918814581153_s.jpg
             * rid : 217745641
             * h264 : true
             * isRecommend : 0
             * ut : 1
             * rtype : zy
             * count : 5858
             * honor :
             * tagid :
             * uid : 61098736
             * picuser : https://vi1.6rooms.com/live/2017/02/22/11/1003v1487735721098643553.jpg
             * sex : 0
             * goldAnchor : 0
             * zy : 1
             * score : 0
             * isSproutingAnchor : 0
             * recscore : 0
             * anchorTm : 0
             * ltype : 1
             * sound : 0
             * alevel : r2
             * isvideo : 4
             * videotype : 1
             * recordtype : 1
             * flvtitle : v61098736-118607663
             * secflvtitle : v61098736-118607663_500
             * mgid : 0
             * pospic : https://vi0.6rooms.com/live/2017/02/22/14/1010v1487744918814581153_s.jpg
             * tala : 0
             * talc : 0
             * province :
             * realstarttime : 1506479415
             * tagids : []
             * largepic :
             * banpic : https://vi0.6rooms.com/live/2017/02/22/11/1013v1487735108260620273.jpg
             * nbanpic : https://vi0.6rooms.com/live/2017/02/22/11/1013v1487735129701861082.jpg
             * viewPicNormal :
             * tagname :
             * tagnames :
             */

            private int wealthrank;
            private String username;
            private String pic;
            private String rid;
            private String h264;
            private int isRecommend;
            private int ut;
            private String rtype;
            private int count;
            private String honor;
            private String tagid;
            private String uid;
            private String picuser;
            private int sex;
            private int goldAnchor;
            private int zy;
            private int score;
            private int isSproutingAnchor;
            private int recscore;
            private int anchorTm;
            private int ltype;
            private int sound;
            private String alevel;
            private int isvideo;
            private int videotype;
            private int recordtype;
            private String flvtitle;
            private String secflvtitle;
            private int mgid;
            private String pospic;
            private int tala;
            private int talc;
            private String province;
            private int realstarttime;
            private String largepic;
            private String banpic;
            private String nbanpic;
            private String viewPicNormal;
            private String tagname;
            private String tagnames;
            private List<?> tagids;

            public int getWealthrank() {
                return wealthrank;
            }

            public void setWealthrank(int wealthrank) {
                this.wealthrank = wealthrank;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getRid() {
                return rid;
            }

            public void setRid(String rid) {
                this.rid = rid;
            }

            public String getH264() {
                return h264;
            }

            public void setH264(String h264) {
                this.h264 = h264;
            }

            public int getIsRecommend() {
                return isRecommend;
            }

            public void setIsRecommend(int isRecommend) {
                this.isRecommend = isRecommend;
            }

            public int getUt() {
                return ut;
            }

            public void setUt(int ut) {
                this.ut = ut;
            }

            public String getRtype() {
                return rtype;
            }

            public void setRtype(String rtype) {
                this.rtype = rtype;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getHonor() {
                return honor;
            }

            public void setHonor(String honor) {
                this.honor = honor;
            }

            public String getTagid() {
                return tagid;
            }

            public void setTagid(String tagid) {
                this.tagid = tagid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getPicuser() {
                return picuser;
            }

            public void setPicuser(String picuser) {
                this.picuser = picuser;
            }

            public int getSex() {
                return sex;
            }

            public void setSex(int sex) {
                this.sex = sex;
            }

            public int getGoldAnchor() {
                return goldAnchor;
            }

            public void setGoldAnchor(int goldAnchor) {
                this.goldAnchor = goldAnchor;
            }

            public int getZy() {
                return zy;
            }

            public void setZy(int zy) {
                this.zy = zy;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public int getIsSproutingAnchor() {
                return isSproutingAnchor;
            }

            public void setIsSproutingAnchor(int isSproutingAnchor) {
                this.isSproutingAnchor = isSproutingAnchor;
            }

            public int getRecscore() {
                return recscore;
            }

            public void setRecscore(int recscore) {
                this.recscore = recscore;
            }

            public int getAnchorTm() {
                return anchorTm;
            }

            public void setAnchorTm(int anchorTm) {
                this.anchorTm = anchorTm;
            }

            public int getLtype() {
                return ltype;
            }

            public void setLtype(int ltype) {
                this.ltype = ltype;
            }

            public int getSound() {
                return sound;
            }

            public void setSound(int sound) {
                this.sound = sound;
            }

            public String getAlevel() {
                return alevel;
            }

            public void setAlevel(String alevel) {
                this.alevel = alevel;
            }

            public int getIsvideo() {
                return isvideo;
            }

            public void setIsvideo(int isvideo) {
                this.isvideo = isvideo;
            }

            public int getVideotype() {
                return videotype;
            }

            public void setVideotype(int videotype) {
                this.videotype = videotype;
            }

            public int getRecordtype() {
                return recordtype;
            }

            public void setRecordtype(int recordtype) {
                this.recordtype = recordtype;
            }

            public String getFlvtitle() {
                return flvtitle;
            }

            public void setFlvtitle(String flvtitle) {
                this.flvtitle = flvtitle;
            }

            public String getSecflvtitle() {
                return secflvtitle;
            }

            public void setSecflvtitle(String secflvtitle) {
                this.secflvtitle = secflvtitle;
            }

            public int getMgid() {
                return mgid;
            }

            public void setMgid(int mgid) {
                this.mgid = mgid;
            }

            public String getPospic() {
                return pospic;
            }

            public void setPospic(String pospic) {
                this.pospic = pospic;
            }

            public int getTala() {
                return tala;
            }

            public void setTala(int tala) {
                this.tala = tala;
            }

            public int getTalc() {
                return talc;
            }

            public void setTalc(int talc) {
                this.talc = talc;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public int getRealstarttime() {
                return realstarttime;
            }

            public void setRealstarttime(int realstarttime) {
                this.realstarttime = realstarttime;
            }

            public String getLargepic() {
                return largepic;
            }

            public void setLargepic(String largepic) {
                this.largepic = largepic;
            }

            public String getBanpic() {
                return banpic;
            }

            public void setBanpic(String banpic) {
                this.banpic = banpic;
            }

            public String getNbanpic() {
                return nbanpic;
            }

            public void setNbanpic(String nbanpic) {
                this.nbanpic = nbanpic;
            }

            public String getViewPicNormal() {
                return viewPicNormal;
            }

            public void setViewPicNormal(String viewPicNormal) {
                this.viewPicNormal = viewPicNormal;
            }

            public String getTagname() {
                return tagname;
            }

            public void setTagname(String tagname) {
                this.tagname = tagname;
            }

            public String getTagnames() {
                return tagnames;
            }

            public void setTagnames(String tagnames) {
                this.tagnames = tagnames;
            }

            public List<?> getTagids() {
                return tagids;
            }

            public void setTagids(List<?> tagids) {
                this.tagids = tagids;
            }
        }
    }
}
