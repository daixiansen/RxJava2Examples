package com.nanchen.rxjava2examples.module.rxjava2.usecases.flatMap;

import java.util.List;

/**
 * @Function
 * @Data 2017/9/27
 * @Author daixiansen
 */

public class UserInfo {

    @Override
    public String toString() {
        return "UserInfo{" +
                "flag='" + flag + '\'' +
                ", content=" + content +
                ", key='" + key + '\'' +
                '}';
    }

    /**
     * flag : 001
     * content : {"id":"66515829","max":"1","ltime":1504750651,"notice":"","wealth":"270","coin6":85,"utype":"0","backpic":"","acttime":"1468901314","utypetm":"0","status":"1","coin6all":52725,"wealthall":"1542","uoption":{"username":"18511892685","picuser":"https://vi0.6rooms.com/live/2016/12/06/11/1003v1480995231427827924.jpg","isbundmobile":1,"follow_last":1506069631,"propflag":0,"account_score":700,"identity":16},"alias":"p;，。","rid":"214624986","integral":"5","fid":"0","userfrom":"0","coin6late":47275,"wealtlate":3458,"coin6rank":5,"wealthrank":1,"isfollow":"0","ismfollow":"0","follownum":118,"fansnum":"21","isfriend":"0","remark":"","isproxy":0,"isSubscribe":1,"badge":[],"props":"","coinstep":50000,"wealthstep":4000,"family":[{"fid":"46313865","fsname":"无双","fname":"无双時代","spic":"900005224_69080"},{"fid":"58005797","fsname":"紅葉","fname":"紅枫叶","spic":"900008574_12204"}],"profile":{"photoall":"16","weiboall":"32"},"isLive":0,"isGodPic":0,"livetype":0}
     * key : hwAlT-ecjR00sGDD8tpFtzk7cLVdw_z-MC_aurS5_p71BQAzDsWIWeETMEc6cjfYsry2ocGH8MU6siCTZZvgeMBKMhT6SvpCokbIMAiKBx7Uy1dJwlTLMuQCiiTqtWnTs-5OrGdr0lVvaO7thAK-Bg10007
     */

    private String flag;
    private ContentBean content;
    private String key;

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public static class ContentBean {
        /**
         * id : 66515829
         * max : 1
         * ltime : 1504750651
         * notice :
         * wealth : 270
         * coin6 : 85
         * utype : 0
         * backpic :
         * acttime : 1468901314
         * utypetm : 0
         * status : 1
         * coin6all : 52725
         * wealthall : 1542
         * uoption : {"username":"18511892685","picuser":"https://vi0.6rooms.com/live/2016/12/06/11/1003v1480995231427827924.jpg","isbundmobile":1,"follow_last":1506069631,"propflag":0,"account_score":700,"identity":16}
         * alias : p;，。
         * rid : 214624986
         * integral : 5
         * fid : 0
         * userfrom : 0
         * coin6late : 47275
         * wealtlate : 3458
         * coin6rank : 5
         * wealthrank : 1
         * isfollow : 0
         * ismfollow : 0
         * follownum : 118
         * fansnum : 21
         * isfriend : 0
         * remark :
         * isproxy : 0
         * isSubscribe : 1
         * badge : []
         * props :
         * coinstep : 50000
         * wealthstep : 4000
         * family : [{"fid":"46313865","fsname":"无双","fname":"无双時代","spic":"900005224_69080"},{"fid":"58005797","fsname":"紅葉","fname":"紅枫叶","spic":"900008574_12204"}]
         * profile : {"photoall":"16","weiboall":"32"}
         * isLive : 0
         * isGodPic : 0
         * livetype : 0
         */

        private String id;
        private String max;
        private int ltime;
        private String notice;
        private String wealth;
        private int coin6;
        private String utype;
        private String backpic;
        private String acttime;
        private String utypetm;
        private String status;
        private int coin6all;
        private String wealthall;
        private UoptionBean uoption;
        private String alias;
        private String rid;
        private String integral;
        private String fid;
        private String userfrom;
        private int coin6late;
        private int wealtlate;
        private int coin6rank;
        private int wealthrank;
        private String isfollow;
        private String ismfollow;
        private int follownum;
        private String fansnum;
        private String isfriend;
        private String remark;
        private int isproxy;
        private int isSubscribe;
        private String props;
        private int coinstep;
        private int wealthstep;
        private ProfileBean profile;
        private int isLive;
        private int isGodPic;
        private int livetype;
        private List<?> badge;
        private List<FamilyBean> family;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMax() {
            return max;
        }

        public void setMax(String max) {
            this.max = max;
        }

        public int getLtime() {
            return ltime;
        }

        public void setLtime(int ltime) {
            this.ltime = ltime;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }

        public String getWealth() {
            return wealth;
        }

        public void setWealth(String wealth) {
            this.wealth = wealth;
        }

        public int getCoin6() {
            return coin6;
        }

        public void setCoin6(int coin6) {
            this.coin6 = coin6;
        }

        public String getUtype() {
            return utype;
        }

        public void setUtype(String utype) {
            this.utype = utype;
        }

        public String getBackpic() {
            return backpic;
        }

        public void setBackpic(String backpic) {
            this.backpic = backpic;
        }

        public String getActtime() {
            return acttime;
        }

        public void setActtime(String acttime) {
            this.acttime = acttime;
        }

        public String getUtypetm() {
            return utypetm;
        }

        public void setUtypetm(String utypetm) {
            this.utypetm = utypetm;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public int getCoin6all() {
            return coin6all;
        }

        public void setCoin6all(int coin6all) {
            this.coin6all = coin6all;
        }

        public String getWealthall() {
            return wealthall;
        }

        public void setWealthall(String wealthall) {
            this.wealthall = wealthall;
        }

        public UoptionBean getUoption() {
            return uoption;
        }

        public void setUoption(UoptionBean uoption) {
            this.uoption = uoption;
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

        public String getIntegral() {
            return integral;
        }

        public void setIntegral(String integral) {
            this.integral = integral;
        }

        public String getFid() {
            return fid;
        }

        public void setFid(String fid) {
            this.fid = fid;
        }

        public String getUserfrom() {
            return userfrom;
        }

        public void setUserfrom(String userfrom) {
            this.userfrom = userfrom;
        }

        public int getCoin6late() {
            return coin6late;
        }

        public void setCoin6late(int coin6late) {
            this.coin6late = coin6late;
        }

        public int getWealtlate() {
            return wealtlate;
        }

        public void setWealtlate(int wealtlate) {
            this.wealtlate = wealtlate;
        }

        public int getCoin6rank() {
            return coin6rank;
        }

        public void setCoin6rank(int coin6rank) {
            this.coin6rank = coin6rank;
        }

        public int getWealthrank() {
            return wealthrank;
        }

        public void setWealthrank(int wealthrank) {
            this.wealthrank = wealthrank;
        }

        public String getIsfollow() {
            return isfollow;
        }

        public void setIsfollow(String isfollow) {
            this.isfollow = isfollow;
        }

        public String getIsmfollow() {
            return ismfollow;
        }

        public void setIsmfollow(String ismfollow) {
            this.ismfollow = ismfollow;
        }

        public int getFollownum() {
            return follownum;
        }

        public void setFollownum(int follownum) {
            this.follownum = follownum;
        }

        public String getFansnum() {
            return fansnum;
        }

        public void setFansnum(String fansnum) {
            this.fansnum = fansnum;
        }

        public String getIsfriend() {
            return isfriend;
        }

        public void setIsfriend(String isfriend) {
            this.isfriend = isfriend;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public int getIsproxy() {
            return isproxy;
        }

        public void setIsproxy(int isproxy) {
            this.isproxy = isproxy;
        }

        public int getIsSubscribe() {
            return isSubscribe;
        }

        public void setIsSubscribe(int isSubscribe) {
            this.isSubscribe = isSubscribe;
        }

        public String getProps() {
            return props;
        }

        public void setProps(String props) {
            this.props = props;
        }

        public int getCoinstep() {
            return coinstep;
        }

        public void setCoinstep(int coinstep) {
            this.coinstep = coinstep;
        }

        public int getWealthstep() {
            return wealthstep;
        }

        public void setWealthstep(int wealthstep) {
            this.wealthstep = wealthstep;
        }

        public ProfileBean getProfile() {
            return profile;
        }

        public void setProfile(ProfileBean profile) {
            this.profile = profile;
        }

        public int getIsLive() {
            return isLive;
        }

        public void setIsLive(int isLive) {
            this.isLive = isLive;
        }

        public int getIsGodPic() {
            return isGodPic;
        }

        public void setIsGodPic(int isGodPic) {
            this.isGodPic = isGodPic;
        }

        public int getLivetype() {
            return livetype;
        }

        public void setLivetype(int livetype) {
            this.livetype = livetype;
        }

        public List<?> getBadge() {
            return badge;
        }

        public void setBadge(List<?> badge) {
            this.badge = badge;
        }

        public List<FamilyBean> getFamily() {
            return family;
        }

        public void setFamily(List<FamilyBean> family) {
            this.family = family;
        }

        public static class UoptionBean {
            /**
             * username : 18511892685
             * picuser : https://vi0.6rooms.com/live/2016/12/06/11/1003v1480995231427827924.jpg
             * isbundmobile : 1
             * follow_last : 1506069631
             * propflag : 0
             * account_score : 700
             * identity : 16
             */

            private String username;
            private String picuser;
            private int isbundmobile;
            private int follow_last;
            private int propflag;
            private int account_score;
            private int identity;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPicuser() {
                return picuser;
            }

            public void setPicuser(String picuser) {
                this.picuser = picuser;
            }

            public int getIsbundmobile() {
                return isbundmobile;
            }

            public void setIsbundmobile(int isbundmobile) {
                this.isbundmobile = isbundmobile;
            }

            public int getFollow_last() {
                return follow_last;
            }

            public void setFollow_last(int follow_last) {
                this.follow_last = follow_last;
            }

            public int getPropflag() {
                return propflag;
            }

            public void setPropflag(int propflag) {
                this.propflag = propflag;
            }

            public int getAccount_score() {
                return account_score;
            }

            public void setAccount_score(int account_score) {
                this.account_score = account_score;
            }

            public int getIdentity() {
                return identity;
            }

            public void setIdentity(int identity) {
                this.identity = identity;
            }
        }

        public static class ProfileBean {
            /**
             * photoall : 16
             * weiboall : 32
             */

            private String photoall;
            private String weiboall;

            public String getPhotoall() {
                return photoall;
            }

            public void setPhotoall(String photoall) {
                this.photoall = photoall;
            }

            public String getWeiboall() {
                return weiboall;
            }

            public void setWeiboall(String weiboall) {
                this.weiboall = weiboall;
            }
        }

        public static class FamilyBean {
            /**
             * fid : 46313865
             * fsname : 无双
             * fname : 无双時代
             * spic : 900005224_69080
             */

            private String fid;
            private String fsname;
            private String fname;
            private String spic;

            public String getFid() {
                return fid;
            }

            public void setFid(String fid) {
                this.fid = fid;
            }

            public String getFsname() {
                return fsname;
            }

            public void setFsname(String fsname) {
                this.fsname = fsname;
            }

            public String getFname() {
                return fname;
            }

            public void setFname(String fname) {
                this.fname = fname;
            }

            public String getSpic() {
                return spic;
            }

            public void setSpic(String spic) {
                this.spic = spic;
            }
        }
    }
}
