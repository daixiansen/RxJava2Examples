package com.example.retrofitsample.bean;

import java.util.List;

/**
 * @Function
 * @Data 2017/9/25
 * @Author daixiansen
 */

public class VoiceBean {

    /**
     * content : {"p":"1","page_count":"22","roomList":[{"asize":"6","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170829/3545db03b6e878c1/ef2e342c8cf5ce7d4310ba3efa2d7e68.flv","avatar":"https://vi2.6rooms.com/live/2017/08/28/14/3002v1503903345614217007.jpg","city":"四川","favorable":"5.0","hours":"10:00-02:00","intro":"正常聊天 偶尔唱歌 心灵鸡汤","lastm":"1506226822","name":"艳可爱💕","orders":"13","price":"30","sex":"0","sid":"55865939","skills":["语音交友","方言教学","游戏陪打"],"t2s":"0","tags":["幽默","可爱","女神"]},{"asize":"20","atype":"0","audio":"http://vi3.6rooms.com/live/voice/20170904/a855b97a18981221/bf7ec217b2021365b9145f5cdecb0080.flv","avatar":"https://vi2.6rooms.com/live/2017/08/28/13/3002v1503898866311476374.jpg","city":"江西","favorable":"0.0","hours":"20:00-04:00","intro":"汪","lastm":"1505368442","name":"之梦一","orders":"0","price":"50","sex":"0","sid":"55865929","skills":["语音交友","情感咨询"],"t2s":"0","tags":["温婉","治愈","呆萌"]},{"asize":"12","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170901/e7f42440a8b124f9/f27965bc9408c1f234183fbd2bfe6186.flv","avatar":"https://vi0.6rooms.com/live/2017/09/15/13/3002v1505451734643455460.jpg","city":"","favorable":"5.0","hours":"01:00-07:00","intro":"爱不需要理由","lastm":"1506308042","name":"@紫葡萄","orders":"17","price":"50","sex":"0","sid":"55876123","skills":["语音交友","情感咨询"],"t2s":"0","tags":["温婉","妩媚","成熟"]},{"asize":"9","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170901/fc17ec3dd798e3c5/a50c638db1f8da045b833d7594af03d5.flv","avatar":"https://vi2.6rooms.com/live/2017/09/01/03/3002v1504209195606421144.jpg","city":"","favorable":"5.0","hours":"00:00-23:00","intro":"来，带我上王者！","lastm":"1506308042","name":"社会你知姐","orders":"3","price":"50","sex":"0","sid":"55874014","skills":["语音交友","情感咨询","王者荣耀"],"t2s":"0","tags":["女神","呆萌","可爱"]},{"asize":"6","atype":"0","audio":"http://vi3.6rooms.com/live/voice/20170829/296f6bb46675eed3/50adbb1d85dbe8c6cdef6362eec3cb76.flv","avatar":"https://vi0.6rooms.com/live/2017/08/29/01/3002v1503942886416929708.jpg","city":"","favorable":"5.0","hours":"00:00-00:00","intro":"😘高薪招优质陪陪，联系q188818425","lastm":"1506256041","name":"小葵🍃","orders":"9","price":"50","sex":"0","sid":"55865934","skills":["语音交友","心理咨询","方言教学"],"t2s":"0","tags":["温婉","治愈","可爱"]},{"asize":"16","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170917/2b7c8dd175748975/7cb1399bf7ac8278ad8a6d12433be4fd.flv","avatar":"https://vi1.6rooms.com/live/2017/09/22/21/3002v1506087401755213494.jpg","city":"浙江","favorable":"5.0","hours":"7:00 - 23:00","intro":"不闲聊，直接下单，聊你想聊的，做你想让我做的。","lastm":"1506307808","name":"y.小十五","orders":"15","price":"50","sex":"0","sid":"55866785","skills":["语音交友","情感咨询","心理咨询"],"t2s":"0","tags":["可爱","女神","娇柔"]},{"asize":"15","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170901/267fc39d3028390e/c12557ea6f9991589b03240b420c14fb.flv","avatar":"https://vi2.6rooms.com/live/2017/09/11/06/3002v1505082487439170362.jpg","city":"","favorable":"5.0","hours":"09:00-00:00","intro":"你是我的心，你是我的肝👄，","lastm":"1506308094","name":"十③😘姨求宠爱","orders":"31","price":"30","sex":"0","sid":"55870689","skills":["语音交友","情感咨询","心理咨询"],"t2s":"0","tags":["成熟","温婉","娇柔"]},{"asize":"9","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170904/06915fad24bc2c18/65a8514ae60c84d7dddf75e28a00c9d1.flv","avatar":"https://vr1.6rooms.com/imges/user/avatar/32.jpg","city":"北京","favorable":"5.0","hours":"0:00 - 23:00","intro":"慵懒的人。心情浅灰。","lastm":"1506308042","name":"【倩倩。迷笑】","orders":"6","price":"30","sex":"0","sid":"55868746","skills":["语音交友"],"t2s":"0","tags":["妩媚","成熟","治愈"]},{"asize":"13","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170831/13b266b827bf90af/71402102baf7d2336d891346db6b5160.flv","avatar":"https://vi1.6rooms.com/live/2017/08/29/23/3002v1504021248669473752.jpg","city":"","favorable":"5.0","hours":"09:00-23:00","intro":"心如止水","lastm":"1506302642","name":"y.晨封","orders":"1","price":"50","sex":"1","sid":"55866965","skills":["语音交友"],"t2s":"0","tags":["治愈","成熟"]},{"asize":"7","atype":"0","audio":"http://vi0.6rooms.com/live/voice/20170907/74e08f983e27a8e6/0f1e577f675e51876be5a5eaf5060302.flv","avatar":"https://vi2.6rooms.com/live/2017/08/30/19/3002v1504094199557261582.jpg","city":"江西","favorable":"5.0","hours":"06:00-00:00","intro":"接多倍单，直接下单不聊天，话题废","lastm":"1506260162","name":"y.愫愫","orders":"1","price":"50","sex":"0","sid":"55869373","skills":["语音交友"],"t2s":"0","tags":["呆萌","温婉","可爱"]},{"asize":"14","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170915/6e31f627f5a54b22/e3e392995fafc33792648037654f043f.flv","avatar":"https://vi0.6rooms.com/live/2017/09/03/16/3002v1504428202228822832.jpg","city":"","favorable":"5.0","hours":"00:00-23:00","intro":"不闲聊，接多倍单!    特殊技能满格，喊着666","lastm":"1506306765","name":"Love**糖糖","orders":"46","price":"30","sex":"0","sid":"55868151","skills":["语音交友","情感咨询","方言教学"],"t2s":"0","tags":["妩媚","女神","娇柔"]},{"asize":"9","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170831/5da1eca9ee33668a/5fb12e63cf74564149b653e8cccbd40b.flv","avatar":"https://vi1.6rooms.com/live/2017/08/30/18/3002v1504087467497764983.jpg","city":"四川","favorable":"5.0","hours":"00:00-23:00","intro":"深情不及久伴  等风也等你","lastm":"1505620802","name":"予你♛","orders":"3","price":"50","sex":"0","sid":"55865940","skills":["语音交友","情感咨询","方言教学"],"t2s":"0","tags":["温婉","治愈","呆萌"]},{"asize":"7","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170924/886762cdbd696ef2/d83b88c7cb1d6a15de67aff9bcfcb129.flv","avatar":"https://vi1.6rooms.com/live/2017/09/24/22/3002v1506261943051351117.jpg","city":"","favorable":"5.0","hours":"11:00-11:00","intro":"我什么都干不好，除了你！                 不闲聊，   秒接！！！","lastm":"1506306869","name":"寳💓兒【聊】羞","orders":"56","price":"50","sex":"0","sid":"55876522","skills":["语音交友","方言教学","王者荣耀"],"t2s":"0","tags":["妩媚","女神","娇柔"]},{"asize":"9","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170920/5d757ccf8e4cedf0/accaf5c83dd7c62c7102adabba7a5ecf.flv","avatar":"https://vi3.6rooms.com/live/2017/09/21/18/3002v1505988445058441781.jpg","city":"","favorable":"0.0","hours":"00:00-00:00","intro":"全能一人，🐾","lastm":"1506308075","name":"御糖。","orders":"0","price":"50","sex":"0","sid":"55901047","skills":["语音交友","情感咨询","心理咨询"],"t2s":"0","tags":["女神","妩媚","成熟"]},{"asize":"8","atype":"0","audio":"http://vi0.6rooms.com/live/voice/20170923/425fff596603f7f7/a0da7e88befc9b399f6ab3345a3b03f0.flv","avatar":"https://vi3.6rooms.com/live/2017/09/23/12/3002v1506142722609319335.jpg","city":"河南","favorable":"5.0","hours":"00:00-23:00","intro":"接多倍单，直接下单不闲聊！诚信接单。担忧勿扰！我是意外也是惊喜。","lastm":"1506308072","name":"y.撕心/接单不闲聊","orders":"94","price":"50","sex":"0","sid":"55868644","skills":["语音交友","情感咨询","王者荣耀"],"t2s":"0","tags":["娇柔","妩媚","女神"]},{"asize":"20","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170903/7cfa135700564134/b60cfd95306f042b6c1951985f83ed86.flv","avatar":"https://vi1.6rooms.com/live/2017/09/21/15/3002v1505977753211855643.jpg","city":"","favorable":"5.0","hours":"00:00-23:00","intro":"抖s。不闲聊，可以直接下单","lastm":"1506300930","name":"苏胡  全能/秒接","orders":"6","price":"50","sex":"0","sid":"55865943","skills":["语音交友","王者荣耀","线上LOL"],"t2s":"0","tags":["呆萌","女神","可爱"]},{"asize":"17","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170905/42ccf0e057febb31/c1065309a7f2fa4706cdce3ffa59daf1.flv","avatar":"https://vi0.6rooms.com/live/2017/09/05/10/3002v1504578935585792986.jpg","city":"内蒙古","favorable":"5.0","hours":"00:00-23:00","intro":"暖心的我希望也暖到您～想聊天直接下单，有短信通知的，不闲扯，接单后聊天，谢谢，看我资料在说话，别找骂","lastm":"1506270602","name":"╭ァ庅丶娜💝秒接中","orders":"26","price":"50","sex":"0","sid":"55869569","skills":["语音交友","情感咨询","王者荣耀"],"t2s":"0","tags":["幽默","女神","温婉"]},{"asize":"11","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170830/1d402805764bd9e4/279b99a80ba889e6e8bd12310ccf95d2.flv","avatar":"https://vi3.6rooms.com/live/2017/08/30/16/3002v1504082928223959369.jpg","city":"","favorable":"5.0","hours":"09:00-12:00","intro":"希望我的声音能带给你快乐！忘掉忧愁","lastm":"1506308042","name":"昵称违规,请修改","orders":"2","price":"50","sex":"0","sid":"55868883","skills":["语音交友"],"t2s":"0","tags":["女神","妩媚","治愈"]},{"asize":"20","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170829/3ee0ec3d23314969/a9acf1af1f92c484575121b27b431683.flv","avatar":"https://vi3.6rooms.com/live/2017/08/29/17/3002v1503998690327357441.jpg","city":"贵州","favorable":"5.0","hours":"8:00 - 22:00","intro":"高薪招优质陪陪，联系q188818425","lastm":"1505731322","name":"艾斯呀","orders":"2","price":"50","sex":"0","sid":"55866121","skills":["语音交友"],"t2s":"0","tags":["呆萌","治愈","娇柔"]},{"asize":"20","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170914/840c9f89978acabf/fb105f17f2bb4e3ff63b1e90b7da9f60.flv","avatar":"https://vi3.6rooms.com/live/2017/09/14/19/3002v1505389811618957734.jpg","city":"重庆","favorable":"5.0","hours":"10:00-23:00","intro":"欢迎下单，下单有短信提示，不墨迹波波","lastm":"1506166922","name":"y.诗曼💋在线秒单","orders":"10","price":"50","sex":"0","sid":"55866061","skills":["语音交友"],"t2s":"0","tags":["温婉","妩媚","女神"]}]}
     * flag : 001
     */

    private List<ContentBean> content;
    private String flag;

//    public ContentBean getContent() {
//        return content;
//    }
//
//    public void setContent(ContentBean content) {
//        this.content = content;
//    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public static class ContentBean {
        /**
         * p : 1
         * page_count : 22
         * roomList : [{"asize":"6","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170829/3545db03b6e878c1/ef2e342c8cf5ce7d4310ba3efa2d7e68.flv","avatar":"https://vi2.6rooms.com/live/2017/08/28/14/3002v1503903345614217007.jpg","city":"四川","favorable":"5.0","hours":"10:00-02:00","intro":"正常聊天 偶尔唱歌 心灵鸡汤","lastm":"1506226822","name":"艳可爱💕","orders":"13","price":"30","sex":"0","sid":"55865939","skills":["语音交友","方言教学","游戏陪打"],"t2s":"0","tags":["幽默","可爱","女神"]},{"asize":"20","atype":"0","audio":"http://vi3.6rooms.com/live/voice/20170904/a855b97a18981221/bf7ec217b2021365b9145f5cdecb0080.flv","avatar":"https://vi2.6rooms.com/live/2017/08/28/13/3002v1503898866311476374.jpg","city":"江西","favorable":"0.0","hours":"20:00-04:00","intro":"汪","lastm":"1505368442","name":"之梦一","orders":"0","price":"50","sex":"0","sid":"55865929","skills":["语音交友","情感咨询"],"t2s":"0","tags":["温婉","治愈","呆萌"]},{"asize":"12","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170901/e7f42440a8b124f9/f27965bc9408c1f234183fbd2bfe6186.flv","avatar":"https://vi0.6rooms.com/live/2017/09/15/13/3002v1505451734643455460.jpg","city":"","favorable":"5.0","hours":"01:00-07:00","intro":"爱不需要理由","lastm":"1506308042","name":"@紫葡萄","orders":"17","price":"50","sex":"0","sid":"55876123","skills":["语音交友","情感咨询"],"t2s":"0","tags":["温婉","妩媚","成熟"]},{"asize":"9","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170901/fc17ec3dd798e3c5/a50c638db1f8da045b833d7594af03d5.flv","avatar":"https://vi2.6rooms.com/live/2017/09/01/03/3002v1504209195606421144.jpg","city":"","favorable":"5.0","hours":"00:00-23:00","intro":"来，带我上王者！","lastm":"1506308042","name":"社会你知姐","orders":"3","price":"50","sex":"0","sid":"55874014","skills":["语音交友","情感咨询","王者荣耀"],"t2s":"0","tags":["女神","呆萌","可爱"]},{"asize":"6","atype":"0","audio":"http://vi3.6rooms.com/live/voice/20170829/296f6bb46675eed3/50adbb1d85dbe8c6cdef6362eec3cb76.flv","avatar":"https://vi0.6rooms.com/live/2017/08/29/01/3002v1503942886416929708.jpg","city":"","favorable":"5.0","hours":"00:00-00:00","intro":"😘高薪招优质陪陪，联系q188818425","lastm":"1506256041","name":"小葵🍃","orders":"9","price":"50","sex":"0","sid":"55865934","skills":["语音交友","心理咨询","方言教学"],"t2s":"0","tags":["温婉","治愈","可爱"]},{"asize":"16","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170917/2b7c8dd175748975/7cb1399bf7ac8278ad8a6d12433be4fd.flv","avatar":"https://vi1.6rooms.com/live/2017/09/22/21/3002v1506087401755213494.jpg","city":"浙江","favorable":"5.0","hours":"7:00 - 23:00","intro":"不闲聊，直接下单，聊你想聊的，做你想让我做的。","lastm":"1506307808","name":"y.小十五","orders":"15","price":"50","sex":"0","sid":"55866785","skills":["语音交友","情感咨询","心理咨询"],"t2s":"0","tags":["可爱","女神","娇柔"]},{"asize":"15","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170901/267fc39d3028390e/c12557ea6f9991589b03240b420c14fb.flv","avatar":"https://vi2.6rooms.com/live/2017/09/11/06/3002v1505082487439170362.jpg","city":"","favorable":"5.0","hours":"09:00-00:00","intro":"你是我的心，你是我的肝👄，","lastm":"1506308094","name":"十③😘姨求宠爱","orders":"31","price":"30","sex":"0","sid":"55870689","skills":["语音交友","情感咨询","心理咨询"],"t2s":"0","tags":["成熟","温婉","娇柔"]},{"asize":"9","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170904/06915fad24bc2c18/65a8514ae60c84d7dddf75e28a00c9d1.flv","avatar":"https://vr1.6rooms.com/imges/user/avatar/32.jpg","city":"北京","favorable":"5.0","hours":"0:00 - 23:00","intro":"慵懒的人。心情浅灰。","lastm":"1506308042","name":"【倩倩。迷笑】","orders":"6","price":"30","sex":"0","sid":"55868746","skills":["语音交友"],"t2s":"0","tags":["妩媚","成熟","治愈"]},{"asize":"13","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170831/13b266b827bf90af/71402102baf7d2336d891346db6b5160.flv","avatar":"https://vi1.6rooms.com/live/2017/08/29/23/3002v1504021248669473752.jpg","city":"","favorable":"5.0","hours":"09:00-23:00","intro":"心如止水","lastm":"1506302642","name":"y.晨封","orders":"1","price":"50","sex":"1","sid":"55866965","skills":["语音交友"],"t2s":"0","tags":["治愈","成熟"]},{"asize":"7","atype":"0","audio":"http://vi0.6rooms.com/live/voice/20170907/74e08f983e27a8e6/0f1e577f675e51876be5a5eaf5060302.flv","avatar":"https://vi2.6rooms.com/live/2017/08/30/19/3002v1504094199557261582.jpg","city":"江西","favorable":"5.0","hours":"06:00-00:00","intro":"接多倍单，直接下单不聊天，话题废","lastm":"1506260162","name":"y.愫愫","orders":"1","price":"50","sex":"0","sid":"55869373","skills":["语音交友"],"t2s":"0","tags":["呆萌","温婉","可爱"]},{"asize":"14","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170915/6e31f627f5a54b22/e3e392995fafc33792648037654f043f.flv","avatar":"https://vi0.6rooms.com/live/2017/09/03/16/3002v1504428202228822832.jpg","city":"","favorable":"5.0","hours":"00:00-23:00","intro":"不闲聊，接多倍单!    特殊技能满格，喊着666","lastm":"1506306765","name":"Love**糖糖","orders":"46","price":"30","sex":"0","sid":"55868151","skills":["语音交友","情感咨询","方言教学"],"t2s":"0","tags":["妩媚","女神","娇柔"]},{"asize":"9","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170831/5da1eca9ee33668a/5fb12e63cf74564149b653e8cccbd40b.flv","avatar":"https://vi1.6rooms.com/live/2017/08/30/18/3002v1504087467497764983.jpg","city":"四川","favorable":"5.0","hours":"00:00-23:00","intro":"深情不及久伴  等风也等你","lastm":"1505620802","name":"予你♛","orders":"3","price":"50","sex":"0","sid":"55865940","skills":["语音交友","情感咨询","方言教学"],"t2s":"0","tags":["温婉","治愈","呆萌"]},{"asize":"7","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170924/886762cdbd696ef2/d83b88c7cb1d6a15de67aff9bcfcb129.flv","avatar":"https://vi1.6rooms.com/live/2017/09/24/22/3002v1506261943051351117.jpg","city":"","favorable":"5.0","hours":"11:00-11:00","intro":"我什么都干不好，除了你！                 不闲聊，   秒接！！！","lastm":"1506306869","name":"寳💓兒【聊】羞","orders":"56","price":"50","sex":"0","sid":"55876522","skills":["语音交友","方言教学","王者荣耀"],"t2s":"0","tags":["妩媚","女神","娇柔"]},{"asize":"9","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170920/5d757ccf8e4cedf0/accaf5c83dd7c62c7102adabba7a5ecf.flv","avatar":"https://vi3.6rooms.com/live/2017/09/21/18/3002v1505988445058441781.jpg","city":"","favorable":"0.0","hours":"00:00-00:00","intro":"全能一人，🐾","lastm":"1506308075","name":"御糖。","orders":"0","price":"50","sex":"0","sid":"55901047","skills":["语音交友","情感咨询","心理咨询"],"t2s":"0","tags":["女神","妩媚","成熟"]},{"asize":"8","atype":"0","audio":"http://vi0.6rooms.com/live/voice/20170923/425fff596603f7f7/a0da7e88befc9b399f6ab3345a3b03f0.flv","avatar":"https://vi3.6rooms.com/live/2017/09/23/12/3002v1506142722609319335.jpg","city":"河南","favorable":"5.0","hours":"00:00-23:00","intro":"接多倍单，直接下单不闲聊！诚信接单。担忧勿扰！我是意外也是惊喜。","lastm":"1506308072","name":"y.撕心/接单不闲聊","orders":"94","price":"50","sex":"0","sid":"55868644","skills":["语音交友","情感咨询","王者荣耀"],"t2s":"0","tags":["娇柔","妩媚","女神"]},{"asize":"20","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170903/7cfa135700564134/b60cfd95306f042b6c1951985f83ed86.flv","avatar":"https://vi1.6rooms.com/live/2017/09/21/15/3002v1505977753211855643.jpg","city":"","favorable":"5.0","hours":"00:00-23:00","intro":"抖s。不闲聊，可以直接下单","lastm":"1506300930","name":"苏胡  全能/秒接","orders":"6","price":"50","sex":"0","sid":"55865943","skills":["语音交友","王者荣耀","线上LOL"],"t2s":"0","tags":["呆萌","女神","可爱"]},{"asize":"17","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170905/42ccf0e057febb31/c1065309a7f2fa4706cdce3ffa59daf1.flv","avatar":"https://vi0.6rooms.com/live/2017/09/05/10/3002v1504578935585792986.jpg","city":"内蒙古","favorable":"5.0","hours":"00:00-23:00","intro":"暖心的我希望也暖到您～想聊天直接下单，有短信通知的，不闲扯，接单后聊天，谢谢，看我资料在说话，别找骂","lastm":"1506270602","name":"╭ァ庅丶娜💝秒接中","orders":"26","price":"50","sex":"0","sid":"55869569","skills":["语音交友","情感咨询","王者荣耀"],"t2s":"0","tags":["幽默","女神","温婉"]},{"asize":"11","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170830/1d402805764bd9e4/279b99a80ba889e6e8bd12310ccf95d2.flv","avatar":"https://vi3.6rooms.com/live/2017/08/30/16/3002v1504082928223959369.jpg","city":"","favorable":"5.0","hours":"09:00-12:00","intro":"希望我的声音能带给你快乐！忘掉忧愁","lastm":"1506308042","name":"昵称违规,请修改","orders":"2","price":"50","sex":"0","sid":"55868883","skills":["语音交友"],"t2s":"0","tags":["女神","妩媚","治愈"]},{"asize":"20","atype":"0","audio":"http://vi2.6rooms.com/live/voice/20170829/3ee0ec3d23314969/a9acf1af1f92c484575121b27b431683.flv","avatar":"https://vi3.6rooms.com/live/2017/08/29/17/3002v1503998690327357441.jpg","city":"贵州","favorable":"5.0","hours":"8:00 - 22:00","intro":"高薪招优质陪陪，联系q188818425","lastm":"1505731322","name":"艾斯呀","orders":"2","price":"50","sex":"0","sid":"55866121","skills":["语音交友"],"t2s":"0","tags":["呆萌","治愈","娇柔"]},{"asize":"20","atype":"0","audio":"http://vi1.6rooms.com/live/voice/20170914/840c9f89978acabf/fb105f17f2bb4e3ff63b1e90b7da9f60.flv","avatar":"https://vi3.6rooms.com/live/2017/09/14/19/3002v1505389811618957734.jpg","city":"重庆","favorable":"5.0","hours":"10:00-23:00","intro":"欢迎下单，下单有短信提示，不墨迹波波","lastm":"1506166922","name":"y.诗曼💋在线秒单","orders":"10","price":"50","sex":"0","sid":"55866061","skills":["语音交友"],"t2s":"0","tags":["温婉","妩媚","女神"]}]
         */

        private String p;
        private String page_count;
        private List<RoomListBean> roomList;

        public String getP() {
            return p;
        }

        public void setP(String p) {
            this.p = p;
        }

        public String getPage_count() {
            return page_count;
        }

        public void setPage_count(String page_count) {
            this.page_count = page_count;
        }

        public List<RoomListBean> getRoomList() {
            return roomList;
        }

        public void setRoomList(List<RoomListBean> roomList) {
            this.roomList = roomList;
        }

        public static class RoomListBean {
            /**
             * asize : 6
             * atype : 0
             * audio : http://vi1.6rooms.com/live/voice/20170829/3545db03b6e878c1/ef2e342c8cf5ce7d4310ba3efa2d7e68.flv
             * avatar : https://vi2.6rooms.com/live/2017/08/28/14/3002v1503903345614217007.jpg
             * city : 四川
             * favorable : 5.0
             * hours : 10:00-02:00
             * intro : 正常聊天 偶尔唱歌 心灵鸡汤
             * lastm : 1506226822
             * name : 艳可爱💕
             * orders : 13
             * price : 30
             * sex : 0
             * sid : 55865939
             * skills : ["语音交友","方言教学","游戏陪打"]
             * t2s : 0
             * tags : ["幽默","可爱","女神"]
             */

            private String asize;
            private String atype;
            private String audio;
            private String avatar;
            private String city;
            private String favorable;
            private String hours;
            private String intro;
            private String lastm;
            private String name;
            private String orders;
            private String price;
            private String sex;
            private String sid;
            private String t2s;
            private List<String> skills;
            private List<String> tags;

            public String getAsize() {
                return asize;
            }

            public void setAsize(String asize) {
                this.asize = asize;
            }

            public String getAtype() {
                return atype;
            }

            public void setAtype(String atype) {
                this.atype = atype;
            }

            public String getAudio() {
                return audio;
            }

            public void setAudio(String audio) {
                this.audio = audio;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getFavorable() {
                return favorable;
            }

            public void setFavorable(String favorable) {
                this.favorable = favorable;
            }

            public String getHours() {
                return hours;
            }

            public void setHours(String hours) {
                this.hours = hours;
            }

            public String getIntro() {
                return intro;
            }

            public void setIntro(String intro) {
                this.intro = intro;
            }

            public String getLastm() {
                return lastm;
            }

            public void setLastm(String lastm) {
                this.lastm = lastm;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOrders() {
                return orders;
            }

            public void setOrders(String orders) {
                this.orders = orders;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String sid) {
                this.sid = sid;
            }

            public String getT2s() {
                return t2s;
            }

            public void setT2s(String t2s) {
                this.t2s = t2s;
            }

            public List<String> getSkills() {
                return skills;
            }

            public void setSkills(List<String> skills) {
                this.skills = skills;
            }

            public List<String> getTags() {
                return tags;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }

            @Override
            public String toString() {
                return "RoomListBean{" +
                        "asize='" + asize + '\'' +
                        ", atype='" + atype + '\'' +
                        ", audio='" + audio + '\'' +
                        ", avatar='" + avatar + '\'' +
                        ", city='" + city + '\'' +
                        ", favorable='" + favorable + '\'' +
                        ", hours='" + hours + '\'' +
                        ", intro='" + intro + '\'' +
                        ", lastm='" + lastm + '\'' +
                        ", name='" + name + '\'' +
                        ", orders='" + orders + '\'' +
                        ", price='" + price + '\'' +
                        ", sex='" + sex + '\'' +
                        ", sid='" + sid + '\'' +
                        ", t2s='" + t2s + '\'' +
                        ", skills=" + skills +
                        ", tags=" + tags +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "ContentBean{" +
                    "p='" + p + '\'' +
                    ", page_count='" + page_count + '\'' +
                    ", roomList=" + roomList +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "VoiceBean{" +
                "content=" + content +
                ", flag='" + flag + '\'' +
                '}';
    }
}
