package com.yuanshiyang.zhongqi.pojo;

import java.util.List;

/**
 * @Author: yuanshiyang
 * @Date: 2020/9/3 17:32
 * @Description:
 */
public class ResponseData {

    private String state;
    private String message;
    private ReturnData data;

    public static class ReturnData {

        private Integer pageNum;
        private Integer total;
        private Integer realTotal;
        private String scrollId;
        private Integer reqCounter;


        private List<HumanName1> items;

        public static class HumanName1 {
            private String type;
            private String updateFields;
            private HumanName2 data;

            public class HumanName2 {
                private Long id;
                private Long hid;
                private String name;
                private Integer type;
                private Integer deleted;
                private String create_time;
                private String update_time;

                public Long getId() {
                    return id;
                }

                public Long getHid() {
                    return hid;
                }

                public String getName() {
                    return name;
                }

                public Integer getType() {
                    return type;
                }

                public Integer getDeleted() {
                    return deleted;
                }

                public String getCreate_time() {
                    return create_time;
                }

                public String getUpdate_time() {
                    return update_time;
                }
            }


            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUpdateFields() {
                return updateFields;
            }

            public void setUpdateFields(String updateFields) {
                this.updateFields = updateFields;
            }

            public HumanName2 getData() {
                return data;
            }

            public void setData(HumanName2 data) {
                this.data = data;
            }
        }

        public ReturnData() {
        }

        public Integer getPageNum() {
            return pageNum;
        }

        public void setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getRealTotal() {
            return realTotal;
        }

        public void setRealTotal(Integer realTotal) {
            this.realTotal = realTotal;
        }

        public String getScrollId() {
            return scrollId;
        }

        public void setScrollId(String scrollId) {
            this.scrollId = scrollId;
        }

        public Integer getReqCounter() {
            return reqCounter;
        }

        public void setReqCounter(Integer reqCounter) {
            this.reqCounter = reqCounter;
        }

        public List<HumanName1> getItems() {
            return items;
        }

        public void setItems(List<HumanName1> items) {
            this.items = items;
        }
    }

    public ResponseData() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ReturnData getData() {
        return data;
    }

    public void setData(ReturnData data) {
        this.data = data;
    }
}
