package com.jinkworld.rxjavasample.retrofit.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Zellerpooh on 16/10/20.
 */

public class DriverDetailModel  implements Serializable{


    /**
     * headImgs : [{"id":202,"itemId":28,"url":"/uploadFiles/uploadImgs/20161019/3706909629536100.jpg","type":11,"backType":10,"status":1,"createDate":"2016-10-19 13:53:46"}]
     * id : 28
     * name : 15267110098
     * type : 10
     * password : 202cb962ac59075b964b07152d234b70
     * status : 2
     * workStatus : 1
     * createDate : 2016-10-19 20:14:37
     * modifyDate : 2016-10-19 20:14:37
     * cid : 330127199411185015
     * realName : 周泽来
     * driverCardNum : 330226199208260067
     * sex : 1
     * isPushMsg : 1
     * driverImages : [{"id":107,"itemId":28,"url":"/uploadFiles/uploadImgs/20161011/4627813080462000.jpg","type":5,"backType":10,"status":1,"createDate":"2016-10-11 17:00:28"}]
     * driverCardRealName : 周泽来
     * driverCar : {"id":26,"driverId":28,"number":"浙A88888","ownerName":"周泽来","brandId":1,"registDate":"2016-10-11 00:00:00","createDate":"2016-10-11 17:00:28","status":2,"brandName":"奥迪A6(进口)","runImages":[{"id":108,"itemId":26,"url":"/uploadFiles/uploadImgs/20161011/8206064764903023.jpg","type":6,"backType":10,"status":1,"createDate":"2016-10-11 17:00:28"}]}
     * cidImages : [{"id":105,"itemId":28,"url":"/uploadFiles/uploadImgs/20161011/12612451187531040.jpg","type":10,"backType":10,"status":1,"createDate":"2016-10-11 17:00:28"},{"id":106,"itemId":28,"url":"/uploadFiles/uploadImgs/20161011/8697631436254956.jpg","type":10,"backType":20,"status":1,"createDate":"2016-10-11 17:00:28"}]
     */

    private int id;
    private String name;
    private int type;
    private String password;
    private int status;
    private int workStatus;
    private String createDate;
    private String modifyDate;
    private String cid;
    private String realName;
    private String driverCardNum;
    private int sex;
    private int isPushMsg;
    private String driverCardRealName;
    /**
     * id : 26
     * driverId : 28
     * number : 浙A88888
     * ownerName : 周泽来
     * brandId : 1
     * registDate : 2016-10-11 00:00:00
     * createDate : 2016-10-11 17:00:28
     * status : 2
     * brandName : 奥迪A6(进口)
     * runImages : [{"id":108,"itemId":26,"url":"/uploadFiles/uploadImgs/20161011/8206064764903023.jpg","type":6,"backType":10,"status":1,"createDate":"2016-10-11 17:00:28"}]
     */

    private DriverCarBean driverCar;
    /**
     * id : 202
     * itemId : 28
     * url : /uploadFiles/uploadImgs/20161019/3706909629536100.jpg
     * type : 11
     * backType : 10
     * status : 1
     * createDate : 2016-10-19 13:53:46
     */

    private List<HeadImgsBean> headImgs;
    /**
     * id : 107
     * itemId : 28
     * url : /uploadFiles/uploadImgs/20161011/4627813080462000.jpg
     * type : 5
     * backType : 10
     * status : 1
     * createDate : 2016-10-11 17:00:28
     */

    private List<DriverImagesBean> driverImages;
    /**
     * id : 105
     * itemId : 28
     * url : /uploadFiles/uploadImgs/20161011/12612451187531040.jpg
     * type : 10
     * backType : 10
     * status : 1
     * createDate : 2016-10-11 17:00:28
     */

    private List<CidImagesBean> cidImages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(int workStatus) {
        this.workStatus = workStatus;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDriverCardNum() {
        return driverCardNum;
    }

    public void setDriverCardNum(String driverCardNum) {
        this.driverCardNum = driverCardNum;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getIsPushMsg() {
        return isPushMsg;
    }

    public void setIsPushMsg(int isPushMsg) {
        this.isPushMsg = isPushMsg;
    }

    public String getDriverCardRealName() {
        return driverCardRealName;
    }

    public void setDriverCardRealName(String driverCardRealName) {
        this.driverCardRealName = driverCardRealName;
    }

    public DriverCarBean getDriverCar() {
        return driverCar;
    }

    public void setDriverCar(DriverCarBean driverCar) {
        this.driverCar = driverCar;
    }

    public List<HeadImgsBean> getHeadImgs() {
        return headImgs;
    }

    public void setHeadImgs(List<HeadImgsBean> headImgs) {
        this.headImgs = headImgs;
    }

    public List<DriverImagesBean> getDriverImages() {
        return driverImages;
    }

    public void setDriverImages(List<DriverImagesBean> driverImages) {
        this.driverImages = driverImages;
    }

    public List<CidImagesBean> getCidImages() {
        return cidImages;
    }

    public void setCidImages(List<CidImagesBean> cidImages) {
        this.cidImages = cidImages;
    }

    public static class DriverCarBean {
        private int id;
        private int driverId;
        private String number;
        private String ownerName;
        private int brandId;
        private String registDate;
        private String createDate;
        private int status;
        private String brandName;
        /**
         * id : 108
         * itemId : 26
         * url : /uploadFiles/uploadImgs/20161011/8206064764903023.jpg
         * type : 6
         * backType : 10
         * status : 1
         * createDate : 2016-10-11 17:00:28
         */

        private List<RunImagesBean> runImages;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getDriverId() {
            return driverId;
        }

        public void setDriverId(int driverId) {
            this.driverId = driverId;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public int getBrandId() {
            return brandId;
        }

        public void setBrandId(int brandId) {
            this.brandId = brandId;
        }

        public String getRegistDate() {
            return registDate;
        }

        public void setRegistDate(String registDate) {
            this.registDate = registDate;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public List<RunImagesBean> getRunImages() {
            return runImages;
        }

        public void setRunImages(List<RunImagesBean> runImages) {
            this.runImages = runImages;
        }

        public static class RunImagesBean {
            private int id;
            private int itemId;
            private String url;
            private int type;
            private int backType;
            private int status;
            private String createDate;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getItemId() {
                return itemId;
            }

            public void setItemId(int itemId) {
                this.itemId = itemId;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getBackType() {
                return backType;
            }

            public void setBackType(int backType) {
                this.backType = backType;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getCreateDate() {
                return createDate;
            }

            public void setCreateDate(String createDate) {
                this.createDate = createDate;
            }
        }
    }

    public static class HeadImgsBean {
        private int id;
        private int itemId;
        private String url;
        private int type;
        private int backType;
        private int status;
        private String createDate;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getBackType() {
            return backType;
        }

        public void setBackType(int backType) {
            this.backType = backType;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }
    }

    public static class DriverImagesBean {
        private int id;
        private int itemId;
        private String url;
        private int type;
        private int backType;
        private int status;
        private String createDate;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getBackType() {
            return backType;
        }

        public void setBackType(int backType) {
            this.backType = backType;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }
    }

    public static class CidImagesBean {
        private int id;
        private int itemId;
        private String url;
        private int type;
        private int backType;
        private int status;
        private String createDate;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getBackType() {
            return backType;
        }

        public void setBackType(int backType) {
            this.backType = backType;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }
    }
}
